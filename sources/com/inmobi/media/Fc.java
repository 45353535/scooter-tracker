package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Fc implements ro, InterfaceC3693f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f36844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jc f36845b;

    public Fc(Ec nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f36844a = nativeAdUnitComponent;
        this.f36845b = new Jc(nativeAdUnitComponent);
    }

    public final void a() {
        InterfaceC3636cj interfaceC3636cj = this.f36845b.f37130c;
        C4057te c4057te = interfaceC3636cj instanceof C4057te ? (C4057te) interfaceC3636cj : null;
        if (c4057te != null) {
            InterfaceC3878m9 interfaceC3878m9L = c4057te.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "takeAction");
            }
            ((C3807jd) c4057te.f39594b.f39684p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return qo.a(this.f36844a.f36789a, d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return qo.a(this.f36844a.f36789a, i10, d10);
    }

    @Override // com.inmobi.media.InterfaceC3693f
    public final Object a(Continuation continuation) {
        Object objA = this.f36845b.a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
