package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f55735a;

    public z(Context context) {
        AudioManager audioManager;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            audioManager = (AudioManager) ContextCompat.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e10, false, 8, null);
            audioManager = null;
        }
        this.f55735a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.y
    public j0 a() {
        AudioManager audioManager = this.f55735a;
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? j0.f55696b : (numValueOf != null && numValueOf.intValue() == 1) ? j0.f55697c : (numValueOf != null && numValueOf.intValue() == 2) ? j0.f55698d : j0.f55698d;
    }

    @Override // com.moloco.sdk.internal.services.y
    public int b() {
        AudioManager audioManager = this.f55735a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }
}
