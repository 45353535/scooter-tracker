package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcx implements zzfav {
    private final List zza;

    public zzfcx(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put(TelemetryCategory.EID, TextUtils.join(StringUtils.COMMA, this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
