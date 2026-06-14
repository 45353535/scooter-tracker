package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5203jl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C5150hj f77538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5139h8 f77539b;

    public C5203jl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C5150hj(eCommerceScreen), new C5229kl());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5139h8 a() {
        return this.f77539b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f77539b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f77538a + ", converter=" + this.f77539b + '}';
    }

    @VisibleForTesting
    public C5203jl(@NonNull C5150hj c5150hj, @NonNull InterfaceC5139h8 interfaceC5139h8) {
        this.f77538a = c5150hj;
        this.f77539b = interfaceC5139h8;
    }
}
