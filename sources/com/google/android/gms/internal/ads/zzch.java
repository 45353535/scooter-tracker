package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzch {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzd zzd;

    @Nullable
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    zzch(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzd zzdVar, boolean z10) {
        this.zzc = handler;
        this.zzd = zzdVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.zzb = new zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = i11 >= 26 ? androidx.media3.exoplayer.g.a(1).setAudioAttributes(zzdVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        int i10 = zzchVar.zza;
        return Objects.equals(this.zzb, zzchVar.zzb) && Objects.equals(this.zzc, zzchVar.zzc) && Objects.equals(this.zzd, zzchVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    @RequiresApi(26)
    final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return androidx.media.b.a(obj);
    }
}
