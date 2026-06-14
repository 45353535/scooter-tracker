package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFe1bSDK extends AFe1hSDK {
    public AFe1bSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.PURCHASE_VALIDATE, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, map, purchaseValidationCallback);
        this.getRevenue.add(AFe1mSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    @Nullable
    public final AFd1jSDK<String> getMediationNetwork(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFe1eSDK) this).component1.getRevenue(map, str, str2);
    }
}
