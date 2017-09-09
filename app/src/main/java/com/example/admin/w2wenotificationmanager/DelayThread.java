package com.example.admin.w2wenotificationmanager;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.content.ContentValues.TAG;


/**
 * Created by Luis Aguirre on 9/6/2017.
 */

public class DelayThread extends Thread {

    MyDialogFragment mMyDialogFragment;
    Handler handler = new Handler(Looper.getMainLooper());

    public DelayThread(MyDialogFragment myDialogFragment) {
        this.mMyDialogFragment= myDialogFragment;
    }

    @Override
    public void run() {
        super.run();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mMyDialogFragment.dismiss();
                }
            }, 3000);
        }
}
