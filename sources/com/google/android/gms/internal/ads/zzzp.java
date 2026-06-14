package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(32)
final class zzzp {

    @Nullable
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private final Handler zzc;

    @Nullable
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public zzzp(@Nullable Context context, zzaaa zzaaaVar, @Nullable Boolean bool) {
        AudioManager audioManagerZza = context == null ? null : zzcj.zza(context);
        if (audioManagerZza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = audioManagerZza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        zzzn zzznVar = new zzzn(this, zzaaaVar);
        this.zzd = zzznVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        final Handler handler = new Handler(looperMyLooper);
        this.zzc = handler;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzzo
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzznVar);
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return k2.a(spatializer).isAvailable();
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return k2.a(spatializer).isEnabled();
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        int i10;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i10 = zzvVar.zzG;
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i10 = zzvVar.zzG;
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i10 = zzvVar.zzG;
            if (i10 == 18 || i10 == 21) {
                i10 = 24;
            }
        } else {
            i10 = zzvVar.zzG;
        }
        int iZzB = zzfj.zzB(i10);
        if (iZzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzB);
        int i11 = zzvVar.zzH;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return k2.a(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
