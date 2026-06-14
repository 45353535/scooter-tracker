package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzsa extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsc zza;

    zzsa(zzsc zzscVar) {
        Objects.requireNonNull(zzscVar);
        this.zza = zzscVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrz.zza);
        zzedVarZzs.zze();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrx.zza);
        zzedVarZzs.zze();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzry.zza);
        zzedVarZzs.zze();
    }
}
