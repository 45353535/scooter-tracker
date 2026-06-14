package com.appodeal.ads.services.appsflyer.purchasable.tracker;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.SubscriptionPurchaseLineItem;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import com.appsflyer.internal.models.ValidationFailureData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements PurchaseClient.SubscriptionPurchaseValidationResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f14603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectorCallback f14604b;

    public c(Ref$ObjectRef ref$ObjectRef, ConnectorCallback connectorCallback) {
        this.f14603a = ref$ObjectRef;
        this.f14604b = connectorCallback;
    }

    @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onResponse(Map map) {
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem;
        String expiryTime;
        String startTime;
        String subscriptionState;
        String latestOrderId;
        List<SubscriptionPurchaseLineItem> lineItems;
        Object next;
        if (map != null) {
            Ref$ObjectRef ref$ObjectRef = this.f14603a;
            ConnectorCallback connectorCallback = this.f14604b;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) entry.getValue();
                Iterable iterable = (Iterable) ref$ObjectRef.f93280b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (((SubscriptionPurchaseEvent) obj).getSubscriptionOfferDetails().containsKey(str)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map<String, Object> jsonMap = ((SubscriptionPurchaseEvent) it.next()).toJsonMap();
                    SubscriptionPurchase subscriptionPurchase = subscriptionValidationResult.getSubscriptionPurchase();
                    if (subscriptionPurchase == null || (lineItems = subscriptionPurchase.getLineItems()) == null) {
                        subscriptionPurchaseLineItem = null;
                    } else {
                        Iterator<T> it2 = lineItems.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.areEqual(((SubscriptionPurchaseLineItem) next).getProductId(), str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) next;
                    }
                    if (subscriptionPurchase != null && (latestOrderId = subscriptionPurchase.getLatestOrderId()) != null) {
                        if (latestOrderId.length() <= 0) {
                            latestOrderId = null;
                        }
                        if (latestOrderId != null) {
                            jsonMap.put("latest_order_id", latestOrderId);
                        }
                    }
                    if (subscriptionPurchase != null && (subscriptionState = subscriptionPurchase.getSubscriptionState()) != null) {
                        if (subscriptionState.length() <= 0) {
                            subscriptionState = null;
                        }
                        if (subscriptionState != null) {
                            jsonMap.put("subscription_state", subscriptionState);
                        }
                    }
                    if (subscriptionPurchase != null && (startTime = subscriptionPurchase.getStartTime()) != null) {
                        if (startTime.length() <= 0) {
                            startTime = null;
                        }
                        if (startTime != null) {
                            jsonMap.put("start_time", startTime);
                        }
                    }
                    if (subscriptionPurchaseLineItem != null && (expiryTime = subscriptionPurchaseLineItem.getExpiryTime()) != null) {
                        String str2 = expiryTime.length() > 0 ? expiryTime : null;
                        if (str2 != null) {
                            jsonMap.put("expiry_time", str2);
                        }
                    }
                    arrayList2.add(jsonMap);
                }
                if (subscriptionValidationResult.getSuccess()) {
                    LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", "Subscription with productId " + str + " was validated successfully", null, 4, null);
                    connectorCallback.onInAppReceived(arrayList2);
                } else {
                    ValidationFailureData failureData = subscriptionValidationResult.getFailureData();
                    String str3 = "Subscription with productId " + str + " wasn't validated successfully. Status: " + (failureData != null ? Integer.valueOf(failureData.getStatus()) : null) + ". Description: " + (failureData != null ? failureData.getDescription() : null);
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
        ConnectorCallback.DefaultImpls.onInAppFailed$default(this.f14604b, new Throwable(result, th2), null, 2, null);
    }
}
