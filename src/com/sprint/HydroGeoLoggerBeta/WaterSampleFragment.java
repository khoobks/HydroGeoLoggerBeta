package com.sprint.HydroGeoLoggerBeta;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class WaterSampleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.water_sample, container);

        Button saveButton = (Button)layout.findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hydro", "Save Button Clicked");
                saveWaterSample();
            }
        });


        return layout;
    }

    private void saveWaterSample() {
        LinearLayout layout = (LinearLayout) getView();
        String name = ((EditText)layout.findViewById(R.id.nameEditText)).getText().toString();
        String station = ((EditText)layout.findViewById(R.id.stationEditText)).getText().toString();

        Log.d("hydro", "Name: "+name);
        Log.d("hydro", "Station: "+station);

        Toast.makeText(getActivity(), R.string.water_sample_saved, Toast.LENGTH_SHORT).show();
    }
}
