package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.inapp.InAppPurchase;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/Purchasable;", "", "validatePurchase", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult;", FirebaseAnalytics.Event.PURCHASE, "Lcom/appodeal/ads/inapp/InAppPurchase;", "(Lcom/appodeal/ads/inapp/InAppPurchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Purchasable {
    Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation);
}
