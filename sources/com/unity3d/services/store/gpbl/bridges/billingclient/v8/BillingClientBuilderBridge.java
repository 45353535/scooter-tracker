package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.taurusx.tax.f.y;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBuilderBridgeCommon;", "billingClientBuilderInternalInstance", "", "(Ljava/lang/Object;)V", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", "enablePendingPurchases", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/IBillingClientBuilderBridge;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {

    @NotNull
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    public BillingClientBuilderBridge(@Nullable Object obj) {
        super(obj, MapsKt.hashMapOf(TuplesKt.to("enablePendingPurchases", new Class[]{PendingPurchasesParamsBridge.INSTANCE.getClassForParams()})));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @NotNull
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, PendingPurchasesParamsBridge.INSTANCE.newBuilder().enableOneTimeProducts().build().getPendingPurchasesParamsInternalInstance());
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @NotNull
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
