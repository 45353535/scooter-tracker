package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "", ProductDetailsResponseListenerProxy.onProductDetailsResponseMethodName, "", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "queryProductDetailsResults", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(@NotNull BillingResultBridge billingResult, @NotNull QueryProductDetailsResultsBridge queryProductDetailsResults);
}
