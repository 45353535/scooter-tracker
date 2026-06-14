package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzful {
    private JSONObject zza;
    private final zzfuu zzb;

    public zzful(zzfuu zzfuuVar) {
        this.zzb = zzfuuVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfux(this, hashSet, jSONObject, j10));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfuw(this, hashSet, jSONObject, j10));
    }

    public final void zzc() {
        this.zzb.zza(new zzfuv(this));
    }

    @VisibleForTesting
    public final JSONObject zzd() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
