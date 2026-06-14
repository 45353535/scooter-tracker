package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5100fl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Mf f77170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5150hj f77171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5139h8 f77172c;

    public C5100fl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new Mf(eCommerceProduct), new C5150hj(eCommerceScreen), new C5126gl());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5139h8 a() {
        return this.f77172c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f77172c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f77170a + ", screen=" + this.f77171b + ", converter=" + this.f77172c + '}';
    }

    @VisibleForTesting
    public C5100fl(@NonNull Mf mf2, @NonNull C5150hj c5150hj, @NonNull InterfaceC5139h8 interfaceC5139h8) {
        this.f77170a = mf2;
        this.f77171b = c5150hj;
        this.f77172c = interfaceC5139h8;
    }
}
