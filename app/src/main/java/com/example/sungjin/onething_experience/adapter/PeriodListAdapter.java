package com.example.sungjin.onething_experience.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class PeriodListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context ctx;
    private String[] categoryArray;
    private int listLayout;
    private int listCount;

    public PeriodListAdapter(Context ctx, int listLayout, String[] tmpArray) {
        this.ctx = ctx;
        this.listLayout = listLayout;
        inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (categoryArray != null) {
            this.listCount = categoryArray.length;
        }
    }

    @Override
    public int getCount() {
        return this.listCount;
    }

    @Override
    public Object getItem(int position) {
        return categoryArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
