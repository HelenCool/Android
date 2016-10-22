package com.example.helencool.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> mForecastAdapter;

        String[] forecastArray = {
                "Today - Cloudy - 71/55",
                "Tomorrow - Rain - 50/13",
                "Mon - Rain - 68/45",
                "Tue - Rain - 67/44",
                "Wed - Cloudy - 72/62",
                "Thu - Sunny - 81/65",
                "Fri - Sunny - 83/67"
        };
        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));


        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
