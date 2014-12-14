package com.example.sungjin.onething_experience;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import static android.support.v7.app.ActionBar.TabListener;


public class PriorityActivity extends ActionBarActivity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView currentTime = (TextView) findViewById(R.id.current_time);
        this.setCurrentTime(currentTime);

        TabHost tabs = (TabHost)findViewById(R.id.tabhost);
        this.setTabs(tabs);

        ArrayAdapter<String> monthlyListAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1);
        ListView monthlyDo = (ListView) findViewById(R.id.monthly_do);
        monthlyDo.setAdapter(monthlyListAdapter);
        this.initList(monthlyDo, monthlyListAdapter);
    }

    private void initList(ListView monthlyDo, ArrayAdapter<String> adapter) {
        //db query...if null
        adapter.add("보고서");
        adapter.add("출석 email");
        adapter.add("task setting + 날짜, DB 연동");
    }

    private void setCurrentTime(TextView currentTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String ss=sdf.format(new java.util.Date());
        String showingText = "Today : " + ss;
        currentTime.setText(showingText);
    }

    private void setTabs(TabHost tabs) {
        tabs.setup();
        TabHost.TabSpec spec=tabs.newTabSpec("tag1");

        spec.setContent(R.id.tab1);
        spec.setIndicator("Daily");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Weekly");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("Monthly");
        spec.setContent(R.id.monthly_do);
        spec.setIndicator("Monthly");
        tabs.addTab(spec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_priority, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
