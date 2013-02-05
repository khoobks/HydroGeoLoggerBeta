package com.sprint.HydroGeoLoggerBeta;

import com.j256.ormlite.field.DatabaseField;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple demonstration object we are creating and persisting to the database.
 */

public class WaterSample {

	// id is generated by the database and set on the object automagically
	@DatabaseField(generatedId = true)
	int id;
	@DatabaseField(index = true)
    String string;
	@DatabaseField
	long millis;
	@DatabaseField
    Date date;
	@DatabaseField
	boolean even;
    @DatabaseField
    String name;//			vchar
    @DatabaseField(index = true)
    String station;		//vchar
    @DatabaseField
    String hole_type_code;//hole_type_code	fk
    @DatabaseField
    String hole_lining_code;//	fk
    @DatabaseField
    String pipes_in_hole_code;//	fk
    @DatabaseField
    String hole_angle_code;//	fk
    @DatabaseField
    String outflow_type_code;//	fk
    @DatabaseField
    String sampling_issues_code;//	fk
    @DatabaseField
    boolean open;//			bool	this is for code 3 (open / closed)
    @DatabaseField
    float latitude;
    @DatabaseField
    float longitude;
    @DatabaseField
    float masl;//
    @DatabaseField// 			float	called Elev in the spreadsheet
    float water_table;//		float
    @DatabaseField
    float sample_depth;		//float
    @DatabaseField
    float bottom_of_hole;//	float
    @DatabaseField
    float temperature;	//	float
    @DatabaseField
    float condition;//		float
    @DatabaseField
    String notes;//			varchar
    @DatabaseField
    float tree_sampled_height;//	float
    @DatabaseField
    float tree_sampled_width;//	float
    @DatabaseField
    float tree_sampled_longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEven() {
        return even;
    }

    public void setEven(boolean even) {
        this.even = even;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getHole_type_code() {
        return hole_type_code;
    }

    public void setHole_type_code(String hole_type_code) {
        this.hole_type_code = hole_type_code;
    }

    public String getHole_lining_code() {
        return hole_lining_code;
    }

    public void setHole_lining_code(String hole_lining_code) {
        this.hole_lining_code = hole_lining_code;
    }

    public String getPipes_in_hole_code() {
        return pipes_in_hole_code;
    }

    public void setPipes_in_hole_code(String pipes_in_hole_code) {
        this.pipes_in_hole_code = pipes_in_hole_code;
    }

    public String getHole_angle_code() {
        return hole_angle_code;
    }

    public void setHole_angle_code(String hole_angle_code) {
        this.hole_angle_code = hole_angle_code;
    }

    public String getOutflow_type_code() {
        return outflow_type_code;
    }

    public void setOutflow_type_code(String outflow_type_code) {
        this.outflow_type_code = outflow_type_code;
    }

    public String getSampling_issues_code() {
        return sampling_issues_code;
    }

    public void setSampling_issues_code(String sampling_issues_code) {
        this.sampling_issues_code = sampling_issues_code;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getMasl() {
        return masl;
    }

    public void setMasl(float masl) {
        this.masl = masl;
    }

    public float getWater_table() {
        return water_table;
    }

    public void setWater_table(float water_table) {
        this.water_table = water_table;
    }

    public float getSample_depth() {
        return sample_depth;
    }

    public void setSample_depth(float sample_depth) {
        this.sample_depth = sample_depth;
    }

    public float getBottom_of_hole() {
        return bottom_of_hole;
    }

    public void setBottom_of_hole(float bottom_of_hole) {
        this.bottom_of_hole = bottom_of_hole;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getCondition() {
        return condition;
    }

    public void setCondition(float condition) {
        this.condition = condition;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getTree_sampled_height() {
        return tree_sampled_height;
    }

    public void setTree_sampled_height(float tree_sampled_height) {
        this.tree_sampled_height = tree_sampled_height;
    }

    public float getTree_sampled_width() {
        return tree_sampled_width;
    }

    public void setTree_sampled_width(float tree_sampled_width) {
        this.tree_sampled_width = tree_sampled_width;
    }

    public float getTree_sampled_longitude() {
        return tree_sampled_longitude;
    }

    public void setTree_sampled_longitude(float tree_sampled_longitude) {
        this.tree_sampled_longitude = tree_sampled_longitude;
    }

    public float getTree_sampled_latitude() {
        return tree_sampled_latitude;
    }

    public void setTree_sampled_latitude(float tree_sampled_latitude) {
        this.tree_sampled_latitude = tree_sampled_latitude;
    }

    @DatabaseField
    float tree_sampled_latitude;


    WaterSample() {
		// needed by ormlite
	}

	public WaterSample(long millis) {
		this.date = new Date(millis);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id=").append(id);
		sb.append(", ").append("string=").append(string);
		sb.append(", ").append("millis=").append(millis);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.S");
		sb.append(", ").append("date=").append(dateFormatter.format(date));
		sb.append(", ").append("even=").append(even);
		return sb.toString();
	}

    public JSONObject toJson() throws JSONException {
        JSONObject data =  new JSONObject();

        data.put("id", id);
        data.put("date", date == null ? null : date.getTime());
        data.put("name", name);
        data.put("station", station);
        data.put("hole_type_code", hole_type_code);
        data.put("hole_lining_code", hole_lining_code);
        data.put("pipes_in_hole_code", pipes_in_hole_code);
        data.put("hole_angle_code", hole_angle_code);
        data.put("outflow_type_code", outflow_type_code);
        data.put("sampling_issues_code", sampling_issues_code);
        data.put("open", open);
        data.put("latitude", latitude);
        data.put("longitude", longitude);
        data.put("masl", masl);
        data.put("water_table", water_table);
        data.put("sample_depth", sample_depth);
        data.put("bottom_of_hole", bottom_of_hole);
        data.put("temperature", temperature);
        data.put("condition", condition);
        data.put("notes", notes);
        data.put("tree_sampled_height", tree_sampled_height);
        data.put("tree_sampled_width", tree_sampled_width);
        data.put("tree_sampled_longitude", tree_sampled_longitude);

        return data;
    }
}
