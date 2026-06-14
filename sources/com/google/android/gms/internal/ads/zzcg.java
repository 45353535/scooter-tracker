package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
final class zzcg implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    zzcg(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzfj.zza;
        this.zza = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        zzfj.zzd(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzcf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i10);
            }
        });
    }

    final /* synthetic */ void zza(int i10) {
        this.zzb.onAudioFocusChange(i10);
    }
}
