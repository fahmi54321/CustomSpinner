package com.android.a2customspinner;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SpinnerAdapter extends BaseAdapter {

    private List<String> listData;
    private Activity activity;
    private LayoutInflater layoutInflater;

    public SpinnerAdapter(List<String> listData, Activity activity) {
        this.listData = listData;
        this.activity = activity;
        this.layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = view;
        if (view == null){
            view1 = layoutInflater.inflate(R.layout.spinner_item,null);
        }
        TextView tv = (TextView) view1.findViewById(R.id.textview);
        tv.setText(listData.get(i));
        return view1;
    }
}
