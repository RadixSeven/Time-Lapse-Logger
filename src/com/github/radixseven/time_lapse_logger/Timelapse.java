package com.github.radixseven.time_lapse_logger;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Timelapse extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timelapse);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_timelapse, menu);
        return true;
    }
}
