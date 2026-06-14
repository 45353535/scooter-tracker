package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@zzl
public final class DeveloperProvidedBillingDetails {
    private final String zza;
    private final JSONObject zzb;
    private final List zzc;

    @zzl
    public static class Product {
        private final String zza;
        private final String zzb;

        @Nullable
        private final String zzc;

        /* synthetic */ Product(JSONObject jSONObject, zzdj zzdjVar) {
            this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.zzb = jSONObject.optString(C4240b4.i.f42638m);
            String strOptString = jSONObject.optString("offerToken");
            this.zzc = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && Objects.equals(this.zzc, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.zza;
        }

        @Nullable
        public String getOfferToken() {
            return this.zzc;
        }

        @NonNull
        public String getType() {
            return this.zzb;
        }

        public int hashCode() {
            return Objects.hash(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
        }
    }

    DeveloperProvidedBillingDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.zzc = arrayList;
    }

    @NonNull
    public String getLinkUri() {
        return this.zzb.optString("linkUri");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String strOptString = this.zzb.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.zzc;
    }
}
