package com.gladysinc.gladys.voice_recognition;

/**
 * Created by sylvain.roux
 * on 23/11/2017.
 */

import android.annotation.TargetApi;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
@TargetApi(21)
public class MainInteractionSessionService extends VoiceInteractionSessionService {
    @Override
    public VoiceInteractionSession onNewSession(Bundle args) {
        return new MainInteractionSession(this);
    }
}
