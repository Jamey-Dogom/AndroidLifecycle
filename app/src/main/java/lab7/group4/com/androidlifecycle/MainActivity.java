package lab7.group4.com.androidlifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    private final String TAG = "TKT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart");
    }

    @Override
    protected void onRestart() {
        super.onStart();
        Log.d(TAG, "OnRestart");
    }

    @Override
    protected void onResume() {
        super.onStart();
        Log.d(TAG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onStart();
        Log.d(TAG, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStart();
        Log.d(TAG, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onStart();
        Log.d(TAG, "OnDestroy");
    }

}
