package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5472ue extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78382d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78383e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5522we f78385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5139h8 f78386c;

    public C5472ue(int i10, @NonNull ECommerceOrder eCommerceOrder) {
        this(i10, new C5522we(eCommerceOrder), new C5497ve());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5139h8 a() {
        return this.f78386c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f78386c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f78384a + ", order=" + this.f78385b + ", converter=" + this.f78386c + '}';
    }

    @VisibleForTesting
    public C5472ue(int i10, @NonNull C5522we c5522we, @NonNull InterfaceC5139h8 interfaceC5139h8) {
        this.f78384a = i10;
        this.f78385b = c5522we;
        this.f78386c = interfaceC5139h8;
    }
}
