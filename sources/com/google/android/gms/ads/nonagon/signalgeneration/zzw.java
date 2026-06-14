package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzw implements zzdjy {
    private final zzdxt zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    @VisibleForTesting
    public zzw(zzdxt zzdxtVar, zzv zzvVar, String str, int i10) {
        this.zza = zzdxtVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable zzbj zzbjVar) {
        String strOptString;
        if (zzbjVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbjVar.zzc)) {
            this.zzb.zza(this.zzc, zzbjVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbjVar.zzc).optString(CommonUrlParts.REQUEST_ID);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zza(strOptString, zzbjVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
    }
}
