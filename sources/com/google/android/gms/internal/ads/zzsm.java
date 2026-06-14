package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsm {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i10;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || (i10 = zzvVar.zzH) == -1) {
            return zzpz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || i11 < zzfj.zzC(iZzg)) {
            return zzpz.zza;
        }
        int iZzB = zzfj.zzB(zzvVar.zzG);
        if (iZzB == 0) {
            return zzpz.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(iZzB).setEncoding(iZzg).build();
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzpz.zza;
                }
                zzpy zzpyVar = new zzpy();
                zzpyVar.zza(true);
                zzpyVar.zzc(zBooleanValue);
                return zzpyVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpz.zza;
            }
            zzpy zzpyVar2 = new zzpy();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z10 = true;
            }
            zzpyVar2.zza(true);
            zzpyVar2.zzb(z10);
            zzpyVar2.zzc(zBooleanValue);
            return zzpyVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpz.zza;
        }
    }

    public zzsm(@Nullable Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
