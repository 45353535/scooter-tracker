package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5194jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vg f77512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5567y9 f77513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5487v4 f77514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4991bf f77515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U4 f77516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Cc f77517f = new Cc();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f77518g = lf.i.a(new C5169ic(this));

    public C5194jc(@NotNull S6 s62, @NotNull Vg vg2, @NotNull InterfaceC5567y9 interfaceC5567y9, @NotNull C5487v4 c5487v4, @NotNull C4991bf c4991bf) {
        this.f77512a = vg2;
        this.f77513b = interfaceC5567y9;
        this.f77514c = c5487v4;
        this.f77515d = c4991bf;
        this.f77516e = new U4(s62, vg2);
    }

    @NotNull
    public final List<K8> a() {
        return this.f77516e.a();
    }

    @NotNull
    public final List<K8> b() {
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f77516e.f76555c), (Iterable) CollectionsKt.listOf((K8) this.f77518g.getValue()));
    }
}
