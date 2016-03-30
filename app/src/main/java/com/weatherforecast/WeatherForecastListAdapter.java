package com.weatherforecast;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by nagarjuna on 30/3/16.
 */
public class WeatherForecastListAdapter extends BaseAdapter {

    private final Activity context;

    public WeatherForecastListAdapter(Activity activity) {
        this.context = activity;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = context.getLayoutInflater().inflate(R.layout.list_item_for_forecast,parent,false);
        return convertView;
    }
}
