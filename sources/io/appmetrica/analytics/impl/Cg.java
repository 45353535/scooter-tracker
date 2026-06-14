package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* JADX INFO: loaded from: classes12.dex */
public final class Cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5150hj f75622c;

    public Cg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C5150hj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f75620a + "', identifier='" + this.f75621b + "', screen=" + this.f75622c + '}';
    }

    public Cg(String str, String str2, C5150hj c5150hj) {
        this.f75620a = str;
        this.f75621b = str2;
        this.f75622c = c5150hj;
    }
}
