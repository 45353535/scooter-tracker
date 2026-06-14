package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ac extends AbstractC3744h implements InterfaceC4010rh, Ck, ro, Sl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3636cj f36566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(C3920o1 adManagerComponent, Hc nativeCallbacks) {
        super(adManagerComponent.f39147e);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        this.f36566c = new Tc(adManagerComponent, nativeCallbacks, this);
    }

    @Override // com.inmobi.media.AbstractC3713fj
    public final InterfaceC3636cj a() {
        return this.f36566c;
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Sl sl = interfaceC3636cj instanceof Sl ? (Sl) interfaceC3636cj : null;
        if (sl != null) {
            sl.b();
        }
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Ck ck = interfaceC3636cj instanceof Ck ? (Ck) interfaceC3636cj : null;
        if (ck != null) {
            ck.d();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Sl sl = interfaceC3636cj instanceof Sl ? (Sl) interfaceC3636cj : null;
        if (sl != null) {
            sl.f();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Sl sl = interfaceC3636cj instanceof Sl ? (Sl) interfaceC3636cj : null;
        if (sl != null) {
            sl.h();
        }
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Sl sl = interfaceC3636cj instanceof Sl ? (Sl) interfaceC3636cj : null;
        if (sl != null) {
            sl.i();
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        String strA;
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Fc fc2 = interfaceC3636cj instanceof Cd ? ((Cd) interfaceC3636cj).f36675j : interfaceC3636cj instanceof C3957pd ? ((C3957pd) interfaceC3636cj).f39279h : interfaceC3636cj instanceof C4032se ? ((C4032se) interfaceC3636cj).f39527f : interfaceC3636cj instanceof C4157xe ? ((C4157xe) interfaceC3636cj).f39926a : null;
        return (fc2 == null || (strA = fc2.a(i10, d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        Fc fc2;
        String strA;
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        if (interfaceC3636cj instanceof Cd) {
            fc2 = ((Cd) interfaceC3636cj).f36675j;
        } else if (interfaceC3636cj instanceof C3957pd) {
            fc2 = ((C3957pd) interfaceC3636cj).f39279h;
        } else if (interfaceC3636cj instanceof C4032se) {
            fc2 = ((C4032se) interfaceC3636cj).f39527f;
        } else {
            fc2 = interfaceC3636cj instanceof C4157xe ? ((C4157xe) interfaceC3636cj).f39926a : null;
        }
        return (fc2 == null || (strA = fc2.a(d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        Sl sl = interfaceC3636cj instanceof Sl ? (Sl) interfaceC3636cj : null;
        if (sl != null) {
            sl.a(z10);
        }
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3636cj interfaceC3636cj = this.f36566c;
        InterfaceC4010rh interfaceC4010rh = interfaceC3636cj instanceof InterfaceC4010rh ? (InterfaceC4010rh) interfaceC3636cj : null;
        if (interfaceC4010rh != null) {
            interfaceC4010rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3713fj
    public final void a(InterfaceC3636cj interfaceC3636cj) {
        Intrinsics.checkNotNullParameter(interfaceC3636cj, "<set-?>");
        this.f36566c = interfaceC3636cj;
    }
}
