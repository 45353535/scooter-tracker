package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfch implements zzfav {

    @Nullable
    @VisibleForTesting
    final String zza;

    @VisibleForTesting
    final int zzb;

    public zzfch(@Nullable String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i10 = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, "pii");
            jSONObjectZzh.put("pvid", str);
            jSONObjectZzh.put("pvid_s", i10);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
