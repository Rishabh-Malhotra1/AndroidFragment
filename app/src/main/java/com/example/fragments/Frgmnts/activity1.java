  package com.example.fragments.Frgmnts;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragments.R;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class activity1 extends Fragment {

    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;

    public activity1() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_activity1, container, false);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(date.toString());
        return view;
    }
}