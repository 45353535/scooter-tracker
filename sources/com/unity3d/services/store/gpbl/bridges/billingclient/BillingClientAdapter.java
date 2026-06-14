package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import hg.l0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0013\u001a\u00020\u0005H&J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001c\u0010\u0019\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "", "()V", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isInitialized$unity_ads_defaultRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isInitialized", "()Z", "getAdapterVersion", "", MobileAdsBridgeBase.initializeMethodName, "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "isReady", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, C4240b4.i.f42638m, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BillingClientAdapter {

    @NotNull
    private final MutableStateFlow _isInitialized = l0.a(Boolean.FALSE);

    @NotNull
    public abstract String getAdapterVersion();

    @NotNull
    /* JADX INFO: renamed from: get_isInitialized$unity_ads_defaultRelease, reason: from getter */
    public final MutableStateFlow get_isInitialized() {
        return this._isInitialized;
    }

    public abstract void initialize(@NotNull BillingInitializationListener billingInitializationListener);

    @Nullable
    public abstract BillingResultResponseCode isFeatureSupported(@Nullable String purchaseType);

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(@NotNull String productId, @NotNull String productType, @NotNull ProductDetailsListener listener);

    public abstract void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(@Nullable BillingClientStateListener billingClientStateListener);
}
