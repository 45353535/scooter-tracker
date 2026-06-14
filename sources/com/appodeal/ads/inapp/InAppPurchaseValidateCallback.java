package com.appodeal.ads.inapp;

import com.appodeal.ads.service.ServiceError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H'J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchaseValidateCallback;", "", "onInAppPurchaseValidateSuccess", "", FirebaseAnalytics.Event.PURCHASE, "Lcom/appodeal/ads/inapp/InAppPurchase;", "errors", "", "Lcom/appodeal/ads/service/ServiceError;", "onInAppPurchaseValidateFail", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InAppPurchaseValidateCallback {
    void onInAppPurchaseValidateFail(InAppPurchase purchase, List<ServiceError> errors);

    void onInAppPurchaseValidateSuccess(InAppPurchase purchase, List<ServiceError> errors);
}
