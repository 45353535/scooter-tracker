package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Rm {
    public static final boolean a(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z10 || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            return w3.i4.a(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 audioFocusManager) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        Intrinsics.checkNotNullParameter(audioFocusManager, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(audioFocusManager.f37568d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
