package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5613g f78989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f78990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f78991c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(@NotNull W w10) {
        Q q10 = new Q();
        C5611e c5611e = w10.f78983a;
        q10.f78976a = c5611e != null ? this.f78989a.fromModel(c5611e) : null;
        a0 a0Var = w10.f78984b;
        q10.f78977b = a0Var != null ? this.f78990b.fromModel(a0Var) : null;
        C5622p c5622p = w10.f78985c;
        q10.f78978c = c5622p != null ? this.f78991c.fromModel(c5622p) : null;
        return q10;
    }

    public Y(@NotNull C5613g c5613g, @NotNull c0 c0Var, @NotNull r rVar) {
        this.f78989a = c5613g;
        this.f78990b = c0Var;
        this.f78991c = rVar;
    }

    public /* synthetic */ Y(C5613g c5613g, c0 c0Var, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5613g() : c5613g, (i10 & 2) != 0 ? new c0() : c0Var, (i10 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(@NotNull Q q10) {
        C5611e c5611e;
        a0 a0Var;
        N n10 = q10.f78976a;
        if (n10 != null) {
            this.f78989a.getClass();
            c5611e = new C5611e(n10.f78967a);
        } else {
            c5611e = null;
        }
        P p10 = q10.f78977b;
        if (p10 != null) {
            this.f78990b.getClass();
            a0Var = new a0(p10.f78973a, p10.f78974b);
        } else {
            a0Var = null;
        }
        O o10 = q10.f78978c;
        return new W(c5611e, a0Var, o10 != null ? this.f78991c.toModel(o10) : null);
    }
}
