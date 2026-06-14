package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5337p3 extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77956d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77957e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5411s3 f77959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5139h8 f77960c;

    public C5337p3(int i10, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i10, new C5411s3(eCommerceCartItem), new C5362q3());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5139h8 a() {
        return this.f77960c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i10 = this.f77958a;
        return i10 != 4 ? i10 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f77960c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f77958a + ", cartItem=" + this.f77959b + ", converter=" + this.f77960c + '}';
    }

    @VisibleForTesting
    public C5337p3(int i10, @NonNull C5411s3 c5411s3, @NonNull InterfaceC5139h8 interfaceC5139h8) {
        this.f77958a = i10;
        this.f77959b = c5411s3;
        this.f77960c = interfaceC5139h8;
    }
}
