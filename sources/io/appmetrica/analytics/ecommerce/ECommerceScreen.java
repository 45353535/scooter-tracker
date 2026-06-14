package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f75337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f75338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f75339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f75340d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f75338b;
    }

    @Nullable
    public String getName() {
        return this.f75337a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f75340d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f75339c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f75338b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f75337a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f75340d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f75339c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f75337a + "', categoriesPath=" + this.f75338b + ", searchQuery='" + this.f75339c + "', payload=" + this.f75340d + '}';
    }
}
