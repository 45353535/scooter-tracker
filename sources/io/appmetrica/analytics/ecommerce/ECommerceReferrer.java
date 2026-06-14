package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f75334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f75335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f75336c;

    @Nullable
    public String getIdentifier() {
        return this.f75335b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f75336c;
    }

    @Nullable
    public String getType() {
        return this.f75334a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f75335b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f75336c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f75334a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f75334a + "', identifier='" + this.f75335b + "', screen=" + this.f75336c + '}';
    }
}
