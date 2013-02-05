package com.sprint.HydroGeoLoggerBeta;

import com.j256.ormlite.field.DatabaseField;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: kehan
 * Date: 5/02/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Observation {
    @DatabaseField(generatedId = true)
    int id;//			PK
    @DatabaseField (foreign = true, canBeNull = false)
    WaterSample water_sample_id;//	FK
    @DatabaseField
    long time;//
    @DatabaseField
    float ph;
    @DatabaseField
    float eh;

    public float getEh_corrected() {
        return eh_corrected;
    }

    public void setEh_corrected(float eh_corrected) {
        this.eh_corrected = eh_corrected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WaterSample getWater_sample_id() {
        return water_sample_id;
    }

    public void setWater_sample_id(WaterSample water_sample_id) {
        this.water_sample_id = water_sample_id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public float getPh() {
        return ph;
    }

    public void setPh(float ph) {
        this.ph = ph;
    }

    public float getEh() {
        return eh;
    }

    public void setEh(float eh) {
        this.eh = eh;
    }

    @DatabaseField
    float eh_corrected;//			not actually on the sheet but they write it in an extra column next to eh

    Observation() {
        // needed by ormlite
    }
    public Observation(WaterSample waterSample){

    }

    public JSONObject toJson() throws JSONException{
        JSONObject data = new JSONObject();
        data.put("id", id);
        data.put("water_sample_id", water_sample_id);
        data.put("ph", ph);
        data.put("eh", eh);
        data.put("eh_corrected", eh_corrected);
        return data;
    }
}
