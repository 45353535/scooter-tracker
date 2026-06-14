package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", "billingClientInternalInstance", "", "(Ljava/lang/Object;)V", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, "", "queryProductDetailsParamsBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "productDetailsResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchaseType", "", "purchasesResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/PurchasesResponseListenerProxy;", "querySkuDetailsAsync", "params", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsParamsBridge;", "skuDetailsResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/SkuDetailsResponseListenerProxy;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingClientBridge extends BillingClientBridgeCommon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";

    @NotNull
    public static final String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge$Companion;", "", "()V", "QUERY_PRODUCT_DETAILS_ASYNC_METHOD", "", "QUERY_PURCHASES_ASYNC_METHOD", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
        }

        private Companion() {
        }
    }

    public BillingClientBridge(@Nullable Object obj) {
        super(obj, MapsKt.mapOf(TuplesKt.to(QUERY_PURCHASES_ASYNC_METHOD, new Class[]{QueryPurchasesParamsBridge.INSTANCE.getClassForParams(), PurchasesResponseListenerProxy.getProxyListenerClass()}), TuplesKt.to(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, new Class[]{QueryProductDetailsParamsBridge.INSTANCE.getClassForParams(), ProductDetailsResponseListenerProxy.INSTANCE.getProxyListenerClass()})));
    }

    @NotNull
    public static final BillingClientBuilderBridge newBuilder(@NotNull Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return INSTANCE.newBuilder(context);
    }

    public final void queryProductDetailsAsync(@NotNull QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, @NotNull ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) {
        Intrinsics.checkNotNullParameter(queryProductDetailsParamsBridge, "queryProductDetailsParamsBridge");
        Intrinsics.checkNotNullParameter(productDetailsResponseListenerProxy, "productDetailsResponseListenerProxy");
        callVoidMethod(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        if (purchaseType != null) {
            QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryPurchasesParamsBridge.INSTANCE.newBuilder().setProductType(purchaseType).build();
            Object obj = this._billingClientInternalInstance;
            Object queryProductDetailsParamsInternalInstance = queryProductDetailsParamsBridgeBuild.getQueryProductDetailsParamsInternalInstance();
            Intrinsics.checkNotNull(purchasesResponseListenerProxy);
            callVoidMethod(QUERY_PURCHASES_ASYNC_METHOD, obj, queryProductDetailsParamsInternalInstance, purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(@NotNull SkuDetailsParamsBridge params, @NotNull SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws NoSuchMethodException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(skuDetailsResponseListenerProxy, "skuDetailsResponseListenerProxy");
        throw new NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }
}
