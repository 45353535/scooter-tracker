package com.unity3d.services.store.gpbl.proxies;

import com.taurusx.tax.f.y;
import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "productDetailsResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "(Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;)V", "getProductDetailsResponseListener", "()Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "getProxyClass", "Ljava/lang/Class;", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "onPurchasesUpdated", "", "billingResult", "productDetailsResult", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";

    @Nullable
    private final ProductDetailsResponseListener productDetailsResponseListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy$Companion;", "", "()V", "onProductDetailsResponseMethodName", "", "getProxyListenerClass", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Class<?> getProxyListenerClass() throws ClassNotFoundException {
            Intrinsics.checkNotNullExpressionValue(com.android.billingclient.api.ProductDetailsResponseListener.class, "forName(\"com.android.bil…DetailsResponseListener\")");
            return com.android.billingclient.api.ProductDetailsResponseListener.class;
        }

        private Companion() {
        }
    }

    public ProductDetailsResponseListenerProxy(@Nullable ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    private final void onPurchasesUpdated(Object billingResult, Object productDetailsResult) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(productDetailsResult);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(billingResult), queryProductDetailsResultsBridge);
        }
    }

    @Nullable
    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    @NotNull
    public Class<?> getProxyClass() {
        return INSTANCE.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
        Object obj;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method.getName(), onProductDetailsResponseMethodName)) {
            return super.invoke(proxy, method, args);
        }
        if (args != null && (obj = args[1]) != null) {
            onPurchasesUpdated(args[0], obj);
        }
        return null;
    }
}
