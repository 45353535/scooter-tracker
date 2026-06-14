package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5152hl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Mf f77324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Cg f77325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5139h8 f77326c;

    public C5152hl(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new Mf(eCommerceProduct), eCommerceReferrer == null ? null : new Cg(eCommerceReferrer), new C5177il());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5139h8 a() {
        return this.f77326c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f77326c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f77324a + ", referrer=" + this.f77325b + ", converter=" + this.f77326c + '}';
    }

    @VisibleForTesting
    public C5152hl(@NonNull Mf mf2, @Nullable Cg cg2, @NonNull InterfaceC5139h8 interfaceC5139h8) {
        this.f77324a = mf2;
        this.f77325b = cg2;
        this.f77326c = interfaceC5139h8;
    }
}
