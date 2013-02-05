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
        String date = ((EditText)layout.findViewById(R.id.dateEditText)).getText().toString();
        String codeHoleType = ((EditText)layout.findViewById(R.id.codeEditText1)).getText().toString();
        String codeHoleLining = ((EditText)layout.findViewById(R.id.codeEditText2)).getText().toString();
        String codeHoleOpenClosed = ((EditText)layout.findViewById(R.id.codeEditText3)).getText().toString();
        String codePipesInHole = ((EditText)layout.findViewById(R.id.codeEditText4)).getText().toString();
        String codeHoleAngle = ((EditText)layout.findViewById(R.id.codeEditText5)).getText().toString();
        String codeTankOutflow = ((EditText)layout.findViewById(R.id.codeEditText6)).getText().toString();
        String codeSamplingIssues = ((EditText)layout.findViewById(R.id.codeEditText6)).getText().toString();
        String masl = ((EditText)layout.findViewById(R.id.maslEditText)).getText().toString();
        String waterTable = ((EditText)layout.findViewById(R.id.waterTableEditText)).getText().toString();

        Double latitude, longitude;
        try {
            latitude = Double.parseDouble(((EditText)layout.findViewById(R.id.latitudeEditText)).getText().toString());
            longitude = Double.parseDouble(((EditText)layout.findViewById(R.id.longitudeEditText)).getText().toString());
        } catch (NumberFormatException ex) {
            latitude = null;
            longitude = null;
            Log.e("hydro", "Error parsing lat/lon: " + ex.getMessage());
        }
        
        Log.d("hydro", "Name: "+name);
        Log.d("hydro", "Station: "+station);
        Log.d("hydro", "codeHoleType: "+codeHoleType);
        Log.d("hydro", "codeHoleLining: "+codeHoleLining);
        Log.d("hydro", "codeHoleOpenClosed: "+codeHoleOpenClosed);
        Log.d("hydro", "codePipesInHole: "+codePipesInHole);
        Log.d("hydro", "codeHoleAngle: "+codeHoleAngle);
        Log.d("hydro", "codeTankOutflow: "+codeTankOutflow);
        Log.d("hydro", "codeSamplingIssues: "+codeSamplingIssues);
        Log.d("hydro", "latitude: "+latitude);
        Log.d("hydro", "longitude: "+longitude);
        Log.d("hydro", "longitude: "+masl);
        Log.d("hydro", "longitude: "+waterTable);
        
        Toast.makeText(getActivity(), R.string.water_sample_saved, Toast.LENGTH_SHORT).show();
    }
}
