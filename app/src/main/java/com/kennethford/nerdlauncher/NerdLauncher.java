package com.kennethford.nerdlauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdLauncher extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NerdLauncherFragment().newInstance();
    }
}
