package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zzc {
    private final String zza;
    private final String zzb;

    @Nullable
    private final String zzc;

    /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString(C4240b4.i.f42638m);
        String strOptString = jSONObject.optString("offerToken");
        this.zzc = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.zza.equals(zzcVar.zza) && this.zzb.equals(zzcVar.zzb) && Objects.equals(this.zzc, zzcVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
    }
}
