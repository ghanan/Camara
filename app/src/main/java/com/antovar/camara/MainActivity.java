package com.antovar.camara;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.view.View;

import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Camera camera = Camera.open();
//        Camera.Parameters parameters = camera.getParameters();
//        List<Camera.Size> tamanos = parameters.getSupportedPictureSizes();
//        //if (tamanos.contains(Camera.Parameters.EFFECT_SEPIA))
//        //parameters.setColorEffect(Camera.Parameters.EFFECT_SEPIA); camera.setParameters(parameters);
//        for (Camera.Size t: tamanos)
//            System.out.println(t.width + "x" + t.height);
//        camera.release();
    }

    public void foto(View view) {
        Camera camera = Camera.open();
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> tamanos = parameters.getSupportedPictureSizes();
        //if (tamanos.contains(Camera.Parameters.EFFECT_SEPIA))
        //parameters.setColorEffect(Camera.Parameters.EFFECT_SEPIA); camera.setParameters(parameters);
        for (Camera.Size t: tamanos) System.out.println(t.width + "x" + t.height);
        //parameters.set("jpeg-quality", 70);
        //parameters.setPictureFormat(PixelFormat.JPEG);
        parameters.setPictureSize(320, 240);
        camera.setParameters(parameters);
        //camera.setDisplayOrientation(90);
        camera.release();
    }

    public void fin(View v) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
