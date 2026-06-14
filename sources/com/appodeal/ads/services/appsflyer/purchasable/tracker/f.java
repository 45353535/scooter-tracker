package com.appodeal.ads.services.appsflyer.purchasable.tracker;

import android.content.Context;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult;
import com.appodeal.ads.service.ServiceError;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.Store;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements com.appodeal.ads.services.appsflyer.purchasable.a {
    public static final Map b(Ref$ObjectRef ref$ObjectRef, ConnectorCallback connectorCallback, List purchaseEvents) {
        Intrinsics.checkNotNullParameter(purchaseEvents, "purchaseEvents");
        ref$ObjectRef.f93280b = purchaseEvents;
        return connectorCallback.getPartnerParams().getParamsMap();
    }

    public static final Map c(Ref$ObjectRef ref$ObjectRef, ConnectorCallback connectorCallback, List purchaseEvents) {
        Intrinsics.checkNotNullParameter(purchaseEvents, "purchaseEvents");
        ref$ObjectRef.f93280b = purchaseEvents;
        return connectorCallback.getPartnerParams().getParamsMap();
    }

    @Override // com.appodeal.ads.services.appsflyer.purchasable.a
    public final void a(Context context, final ConnectorCallback connectorCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = CollectionsKt.emptyList();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.f93280b = CollectionsKt.emptyList();
        new PurchaseClient.Builder(context, Store.GOOGLE).logSubscriptions(true).autoLogInApps(true).setInAppPurchaseEventDataSource(new PurchaseClient.InAppPurchaseEventDataSource() { // from class: com.appodeal.ads.services.appsflyer.purchasable.tracker.d
            @Override // com.appsflyer.api.PurchaseClient.PurchaseEventDataSource
            public final Map onNewPurchases(List list) {
                return f.b(ref$ObjectRef, connectorCallback, list);
            }
        }).setSubscriptionPurchaseEventDataSource(new PurchaseClient.SubscriptionPurchaseEventDataSource() { // from class: com.appodeal.ads.services.appsflyer.purchasable.tracker.e
            @Override // com.appsflyer.api.PurchaseClient.PurchaseEventDataSource
            public final Map onNewPurchases(List list) {
                return f.c(ref$ObjectRef2, connectorCallback, list);
            }
        }).setInAppValidationResultListener(new b(ref$ObjectRef, connectorCallback)).setSubscriptionValidationResultListener(new c(ref$ObjectRef2, connectorCallback)).build().startObservingTransactions();
    }

    @Override // com.appodeal.ads.services.appsflyer.purchasable.a
    public final Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation) {
        return new InAppPurchaseValidationResult.Failure(new ServiceError.PurchaseValidationServiceDisabled("Found PurchaseConnector enabled. All purchases will be validated automatically"));
    }
}
