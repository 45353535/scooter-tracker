package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f75322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f75323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f75324c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f75322a = str;
        this.f75323b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f75323b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f75322a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f75324c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f75324c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f75322a + "', cartItems=" + this.f75323b + ", payload=" + this.f75324c + '}';
    }
}
