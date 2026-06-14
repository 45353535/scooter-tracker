package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f75325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f75326b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f75325a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f75325a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f75326b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f75326b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f75325a + ", internalComponents=" + this.f75326b + '}';
    }
}
