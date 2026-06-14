package com.appodeal.ads.services.appsflyer.purchasable;

import android.content.Context;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void a(Context context, ConnectorCallback connectorCallback);

    Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation);
}
