package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientBuilderBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;)V", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "getAdapterVersion", "", MobileAdsBridgeBase.initializeMethodName, "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "isReady", "", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, C4240b4.i.f42638m, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;

    @NotNull
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(@NotNull BillingClientBuilderBridge billingClientBuilderBridge) {
        Intrinsics.checkNotNullParameter(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    @NotNull
    public String getAdapterVersion() {
        return "8";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(@NotNull BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon billingClientBridgeCommonBuild = this.billingClientBuilderBridge.build();
        Intrinsics.checkNotNull(billingClientBridgeCommonBuild, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (BillingClientBridge) billingClientBridgeCommonBuild;
        startConnection(billingInitializationListener);
        get_isInitialized().setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    @Nullable
    public BillingResultResponseCode isFeatureSupported(@Nullable String purchaseType) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(purchaseType);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(@NotNull String productId, @NotNull String productType, @NotNull final ProductDetailsListener listener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryProductDetailsParamsBridge.INSTANCE.newBuilder().setProductList(CollectionsKt.listOf(ProductBridge.INSTANCE.newBuilder().setProductId(productId).setProductType(productType).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(@NotNull BillingResultBridge billingResult, @NotNull QueryProductDetailsResultsBridge queryProductDetailsResults) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(queryProductDetailsResults, "queryProductDetailsResults");
                List<ProductDetailsBridge> productDetailsList = queryProductDetailsResults.getProductDetailsList();
                if (productDetailsList.isEmpty()) {
                    listener.onProductDetailsResponse(billingResult, null);
                } else {
                    JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                    listener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
                }
            }
        });
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(queryProductDetailsParamsBridgeBuild, productDetailsResponseListenerProxy);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListener purchasesResponseListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(purchaseType, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(@Nullable BillingClientStateListener billingClientStateListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }
}
