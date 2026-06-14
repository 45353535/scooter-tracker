package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f75327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f75328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f75329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f75330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f75331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f75332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f75333g;

    public ECommerceProduct(@NonNull String str) {
        this.f75327a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f75331e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f75329c;
    }

    @Nullable
    public String getName() {
        return this.f75328b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f75332f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f75330d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f75333g;
    }

    @NonNull
    public String getSku() {
        return this.f75327a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f75331e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f75329c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f75328b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f75332f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f75330d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f75333g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f75327a + "', name='" + this.f75328b + "', categoriesPath=" + this.f75329c + ", payload=" + this.f75330d + ", actualPrice=" + this.f75331e + ", originalPrice=" + this.f75332f + ", promocodes=" + this.f75333g + '}';
    }
}
