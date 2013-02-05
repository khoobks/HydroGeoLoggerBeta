package com.sprint.HydroGeoLoggerBeta;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.sprint.HydroGeoLoggerBeta.sync.HttpClientRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menuUpload) {
            uploadData();

            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void uploadData() {
        try {
            JSONArray data = new JSONArray();
            JSONObject sample = new JSONObject();
            sample.put("name", "Test Name 1");
            sample.put("station", "Test Station");

            data.put(sample);

            new AsyncTask<JSONArray, Void, Integer>() {
                @Override
                protected Integer doInBackground(JSONArray... params) {
                    try {

                        new HttpClientRequest().makeRequest(getString(R.string.server_url), params[0]);
                        return 0;

                    } catch(Exception e) {
                        Log.e("hydro", e.toString(), e);
                        return 1;
                    }
                }

                @Override
                protected void onPostExecute(Integer result) {
                    if(result == 0) {
                        Toast.makeText(getApplicationContext(),
                                R.string.data_upload_success, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.data_upload_failed) + "Network Error", Toast.LENGTH_LONG).show();
                    }
                }
            }.execute(data);
        } catch (JSONException je) {
            Log.e("hydro", je.toString(), je);
            Toast.makeText(this, getString(R.string.data_upload_failed) + je.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
