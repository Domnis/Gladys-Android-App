package com.gladysinc.gladys.voice_recognition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by sylvain.roux
 * on 23/11/2017.
 */

public class AssistProxyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        Intent intent = new Intent(this, MainInteractionService.class);
        intent.setAction(Intent.ACTION_ASSIST);
        startService(intent);
    }
}
