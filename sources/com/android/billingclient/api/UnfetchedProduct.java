package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@zzv
public final class UnfetchedProduct {
    private final String jsonString;
    private final String productId;
    private final String productType;

    @Nullable
    private final String serializedDocid;
    private final int statusCode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzv
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzv
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzv
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzv
        public static final int UNKNOWN = 0;
    }

    UnfetchedProduct(String str) throws JSONException {
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.productId = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String strOptString = jSONObject.optString("type");
        this.productType = strOptString;
        this.statusCode = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.serializedDocid = jSONObject.optString("serializedDocid");
    }

    @NonNull
    @VisibleForTesting
    public static UnfetchedProduct fromJson(@NonNull String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfetchedProduct) {
            return TextUtils.equals(this.jsonString, ((UnfetchedProduct) obj).jsonString);
        }
        return false;
    }

    @NonNull
    @zzv
    public String getProductId() {
        return this.productId;
    }

    @NonNull
    @zzv
    public String getProductType() {
        return this.productType;
    }

    @Nullable
    public String getSerializedDocid() {
        return this.serializedDocid;
    }

    @zzv
    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.jsonString.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.productId + "', productType='" + this.productType + "', statusCode=" + this.statusCode + "}";
    }
}
