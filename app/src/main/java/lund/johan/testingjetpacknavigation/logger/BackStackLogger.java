package lund.johan.testingjetpacknavigation.logger;

import android.util.Log;

import androidx.fragment.app.FragmentManager;

public class BackStackLogger {
    private FragmentManager fm;
    String TAG;
    public BackStackLogger(String nameOfCallingClass, FragmentManager fm) {
        this.fm = fm;
        TAG = nameOfCallingClass;
    }
    public void log(){
        Log.d(TAG, "backstack count: " + fm.getBackStackEntryCount());
    }
}
