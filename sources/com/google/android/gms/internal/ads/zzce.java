package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzce {

    @Nullable
    private AudioManager.OnAudioFocusChangeListener zza;

    @Nullable
    private Handler zzb;
    private zzd zzc = zzd.zza;

    public zzce(int i10) {
    }

    public final zzce zza(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final zzce zzb(zzd zzdVar) {
        this.zzc = zzdVar;
        return this;
    }

    public final zzch zzc() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.zzb;
        handler.getClass();
        return new zzch(1, onAudioFocusChangeListener, handler, this.zzc, false);
    }
}
