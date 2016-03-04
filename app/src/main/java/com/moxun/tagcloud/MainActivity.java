package com.moxun.tagcloud;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.moxun.tagcloudlib.view.TagCloudView;

public class MainActivity extends AppCompatActivity {

    private TagCloudView tagCloudView;
    private TextTagsAdapter textTagsAdapter;
    private ViewTagsAdapter viewTagsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tagCloudView = (TagCloudView) findViewById(R.id.tag_cloud);
        tagCloudView.setBackgroundColor(Color.LTGRAY);

        textTagsAdapter = new TextTagsAdapter(new String[20]);
        viewTagsAdapter = new ViewTagsAdapter();

        tagCloudView.setAdapter(textTagsAdapter);

        findViewById(R.id.tag_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tagCloudView.setAdapter(textTagsAdapter);
            }
        });

        findViewById(R.id.tag_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tagCloudView.setAdapter(viewTagsAdapter);
            }
        });
    }
}
