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
@zzw
public final class UserChoiceDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson;
    private final List<Product> mProducts;

    UserChoiceDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        JSONObject jSONObject = new JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    private static List<Product> toProductList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String strOptString = this.mParsedJson.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.mProducts;
    }

    @zzw
    public static class Product {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f7489id;

        @Nullable
        private final String offerToken;
        private final String type;

        Product(String str, String str2, @Nullable String str3) {
            this.f7489id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f7489id.equals(product.getId()) && this.type.equals(product.getType()) && Objects.equals(this.offerToken, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f7489id;
        }

        @Nullable
        public String getOfferToken() {
            return this.offerToken;
        }

        @NonNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.f7489id, this.type, this.offerToken);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f7489id, this.type, this.offerToken);
        }

        private Product(JSONObject jSONObject) {
            this.f7489id = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.type = jSONObject.optString(C4240b4.i.f42638m);
            String strOptString = jSONObject.optString("offerToken");
            this.offerToken = true == strOptString.isEmpty() ? null : strOptString;
        }
    }
}
