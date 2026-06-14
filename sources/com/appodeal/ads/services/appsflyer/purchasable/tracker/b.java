package com.appodeal.ads.services.appsflyer.purchasable.tracker;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.ProductPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements PurchaseClient.InAppPurchaseValidationResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f14601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectorCallback f14602b;

    public b(Ref$ObjectRef ref$ObjectRef, ConnectorCallback connectorCallback) {
        this.f14601a = ref$ObjectRef;
        this.f14602b = connectorCallback;
    }

    @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onResponse(Map map) {
        String regionCode;
        String orderId;
        if (map != null) {
            Ref$ObjectRef ref$ObjectRef = this.f14601a;
            ConnectorCallback connectorCallback = this.f14602b;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                InAppPurchaseValidationResult inAppPurchaseValidationResult = (InAppPurchaseValidationResult) entry.getValue();
                Iterable iterable = (Iterable) ref$ObjectRef.f93280b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (Intrinsics.areEqual(((InAppPurchaseEvent) obj).getPurchaseToken(), str)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map<String, Object> jsonMap = ((InAppPurchaseEvent) it.next()).toJsonMap();
                    ProductPurchase productPurchase = inAppPurchaseValidationResult.getProductPurchase();
                    if (productPurchase != null && (orderId = productPurchase.getOrderId()) != null) {
                        if (orderId.length() <= 0) {
                            orderId = null;
                        }
                        if (orderId != null) {
                            jsonMap.put("order_id", orderId);
                        }
                    }
                    if (productPurchase != null && (regionCode = productPurchase.getRegionCode()) != null) {
                        String str2 = regionCode.length() > 0 ? regionCode : null;
                        if (str2 != null) {
                            jsonMap.put("region_code", str2);
                        }
                    }
                    arrayList2.add(jsonMap);
                }
                if (inAppPurchaseValidationResult.getSuccess()) {
                    LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", "InApp token " + str + " was validated successfully", null, 4, null);
                    connectorCallback.onInAppReceived(arrayList2);
                } else {
                    ValidationFailureData failureData = inAppPurchaseValidationResult.getFailureData();
                    String str3 = "InApp token " + str + " wasn't validated successfully. Status: " + (failureData != null ? Integer.valueOf(failureData.getStatus()) : null) + ". Description: " + (failureData != null ? failureData.getDescription() : null);
                    LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", str3, null, 4, null);
                    connectorCallback.onInAppFailed(new Throwable(str3), arrayList2);
                }
            }
        }
    }

    @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
    public final void onFailure(String result, Throwable th2) {
        Intrinsics.checkNotNullParameter(result, "result");
        LogExtKt.logInternal("AppsflyerService [PurchaseConnector]", "Validation fail: " + result, th2);
        ConnectorCallback.DefaultImpls.onInAppFailed$default(this.f14602b, new Throwable(result, th2), null, 2, null);
    }
}
