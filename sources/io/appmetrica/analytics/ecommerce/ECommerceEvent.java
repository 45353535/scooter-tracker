package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C5100fl;
import io.appmetrica.analytics.impl.C5152hl;
import io.appmetrica.analytics.impl.C5203jl;
import io.appmetrica.analytics.impl.C5337p3;
import io.appmetrica.analytics.impl.C5472ue;
import io.appmetrica.analytics.impl.Pf;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ECommerceEvent implements Pf {
    protected ECommerceEvent() {
    }

    @NonNull
    public static ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C5337p3(4, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C5472ue(6, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new C5472ue(7, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new C5337p3(5, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new C5100fl(eCommerceProduct, eCommerceScreen);
    }

    @NonNull
    public static ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return new C5152hl(eCommerceProduct, eCommerceReferrer);
    }

    @NonNull
    public static ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new C5203jl(eCommerceScreen);
    }

    @NonNull
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public abstract /* synthetic */ List toProto();
}
