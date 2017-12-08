package com.fencer.taglayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fencer.taglibrary.TagCloudLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Tagadapter tagadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TagCloudLayout container= (TagCloudLayout) findViewById(R.id.container);
        List<String > mlist=new ArrayList<>();
        mlist.add("标签内容1");
        mlist.add("标签内容2");
        mlist.add("标签内容3");
        mlist.add("标签内容4");
        mlist.add("标签7");
        mlist.add("标签6");
        tagadapter=new Tagadapter(this,mlist);
        container.setAdapter(tagadapter);
    }
}
