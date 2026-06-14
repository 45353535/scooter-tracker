package f1;

import android.view.ViewGroup;
import com.chartboost.sdk.view.CBImpressionActivity;
import f1.bf;
import g1.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class la implements p4, ca, f5, p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8 f70402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p4 f70403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca f70404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f5 f70405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f70406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wd f70407g;

    public la(u8 impressionDependency, p4 impressionClick, ca impressionDismiss, f5 impressionComplete, p impressionView) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        Intrinsics.checkNotNullParameter(impressionClick, "impressionClick");
        Intrinsics.checkNotNullParameter(impressionDismiss, "impressionDismiss");
        Intrinsics.checkNotNullParameter(impressionComplete, "impressionComplete");
        Intrinsics.checkNotNullParameter(impressionView, "impressionView");
        this.f70402b = impressionDependency;
        this.f70403c = impressionClick;
        this.f70404d = impressionDismiss;
        this.f70405e = impressionComplete;
        this.f70406f = impressionView;
        this.f70407g = wd.f71448c;
    }

    public final void A() {
        try {
            if (this.f70402b.r() instanceof j0) {
                ((j0) this.f70402b.r()).r0();
            } else {
                this.f70402b.r().i();
                this.f70402b.r().A(s7.f71061l);
            }
        } catch (Exception e10) {
            eg.i("Invalid unmute video command", e10);
        }
    }

    public final void B() {
        this.f70402b.r().d0();
    }

    public final void C() {
        this.f70402b.r().M();
    }

    public final void D(float f10) {
        this.f70402b.r().s(f10);
    }

    public final void E(float f10, float f11) {
        this.f70402b.r().t(f10, f11);
    }

    public final void F(s7 vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        this.f70402b.r().A(vastVideoEvent);
    }

    public final void G(ue playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.f70402b.r().B(playerState);
    }

    public final void H(String event) {
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.length() <= 0 || (list = (List) this.f70402b.b().q().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f70402b.r().K((String) it.next());
        }
    }

    public final void I(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        this.f70402b.r().C(verificationScriptResourceList, num);
    }

    public final void J(boolean z10, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        this.f70402b.r().D(z10, forceOrientation);
    }

    public final void K(float f10) {
        this.f70402b.r().H(f10);
    }

    public void L(wd newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f70407g = newState;
    }

    public final void M(a.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (j()) {
            this.f70402b.c().m();
        } else {
            a(error);
        }
    }

    public final void N(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        l(cbUrl.b(), cbUrl.a(), this.f70407g);
    }

    public final void O() {
        d(this.f70407g);
    }

    public final void P() {
        try {
            u3 u3VarR = this.f70402b.r();
            Intrinsics.checkNotNull(u3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((j0) u3VarR).h0();
        } catch (Exception e10) {
            eg.i("Invalid close video command", e10);
        }
    }

    public final String Q() {
        return this.f70402b.b().r();
    }

    public final String R() {
        return this.f70402b.b().y();
    }

    public wd S() {
        return this.f70407g;
    }

    public final String T() {
        return this.f70402b.n();
    }

    public final String U() {
        return this.f70402b.r().P();
    }

    public final String V() {
        return this.f70402b.r().R();
    }

    public final String W() {
        return this.f70402b.r().T();
    }

    public final String X() {
        return this.f70402b.r().V();
    }

    public final String Y() {
        return this.f70402b.r().W();
    }

    public final int Z() {
        if (this.f70402b.r() instanceof j0) {
            return ((j0) this.f70402b.r()).j0();
        }
        return -1;
    }

    @Override // f1.p
    public void a(ViewGroup viewGroup) {
        this.f70406f.a(viewGroup);
    }

    public final v4 a0() {
        return this.f70402b.r().b0();
    }

    @Override // f1.p
    public void b() {
        this.f70406f.b();
    }

    public final void b0() {
        if (this.f70402b.l().a() <= 1) {
            a();
            b8 b8VarL = this.f70402b.l();
            b8VarL.b(b8VarL.a() + 1);
        }
    }

    @Override // f1.p4
    public void c(String str, a.EnumC0885a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f70403c.c(str, error);
    }

    @Override // f1.p4
    public void d() {
        this.f70403c.d();
    }

    @Override // f1.p
    public boolean e() {
        return this.f70406f.e();
    }

    @Override // f1.p
    public boolean f() {
        return this.f70406f.f();
    }

    @Override // f1.p
    public void g() {
        this.f70406f.g();
    }

    @Override // f1.p
    public boolean h() {
        return this.f70406f.h();
    }

    @Override // f1.p
    public ViewGroup i() {
        return this.f70406f.i();
    }

    @Override // f1.p
    public boolean j() {
        return this.f70406f.j();
    }

    @Override // f1.p
    public void k() {
        this.f70406f.k();
    }

    @Override // f1.p
    public void l() {
        this.f70406f.l();
    }

    @Override // f1.p4
    public void m(boolean z10) {
        this.f70403c.m(z10);
    }

    public final void n() {
        if (j() && Intrinsics.areEqual(this.f70402b.a(), bf.c.f69485g)) {
            b0();
        }
    }

    public final void o() {
        if (this.f70402b.l().c() <= 1) {
            x();
            b8 b8VarL = this.f70402b.l();
            b8VarL.d(b8VarL.c() + 1);
        }
    }

    @Override // f1.p
    public void onResume() {
        this.f70406f.onResume();
    }

    @Override // f1.p
    public void onStart() {
        this.f70406f.onStart();
    }

    public final boolean p() {
        if (this.f70402b.r().b0() == null) {
            return true;
        }
        v4 v4VarB0 = this.f70402b.r().b0();
        return (v4VarB0 != null ? v4VarB0.getRootView() : null) == null;
    }

    public final void q() {
        try {
            if (this.f70402b.r() instanceof j0) {
                ((j0) this.f70402b.r()).l0();
            } else {
                this.f70402b.r().c0();
                this.f70402b.r().A(s7.f71061l);
            }
        } catch (Exception e10) {
            eg.i("Invalid mute video command", e10);
        }
    }

    public final void r() {
        j(this.f70402b.n(), Float.valueOf(this.f70402b.r().a0()), Float.valueOf(this.f70402b.r().Z()));
        d();
    }

    public final void s() {
        if (this.f70402b.l().e() <= 1) {
            o();
            b8 b8VarL = this.f70402b.l();
            b8VarL.f(b8VarL.e() + 1);
        }
    }

    public final void t() {
        if (this.f70407g != wd.f71450e || j()) {
            return;
        }
        l();
        e(true);
    }

    public final void u() {
        try {
            u3 u3VarR = this.f70402b.r();
            Intrinsics.checkNotNull(u3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((j0) u3VarR).o0();
        } catch (Exception e10) {
            eg.i("Invalid pause video command", e10);
        }
    }

    public final void v() {
        try {
            u3 u3VarR = this.f70402b.r();
            Intrinsics.checkNotNull(u3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((j0) u3VarR).p0();
        } catch (Exception e10) {
            eg.i("Invalid play video command", e10);
        }
    }

    public final void w() {
        this.f70407g = wd.f71448c;
        a.b bVarF = this.f70402b.r().f();
        if (bVarF == null) {
            g();
        } else {
            M(bVarF);
        }
    }

    public final void x() {
        b(this.f70402b.n(), Float.valueOf(this.f70402b.r().a0()), Float.valueOf(this.f70402b.r().Z()));
    }

    public final boolean y() {
        return this.f70402b.a().c();
    }

    public final void z() {
        if (this.f70402b.l().g() <= 1) {
            b0();
            o();
            b8 b8VarL = this.f70402b.l();
            b8VarL.h(b8VarL.g() + 1);
        }
    }

    @Override // f1.f5
    public void a() {
        this.f70405e.a();
    }

    @Override // f1.p
    public void b(boolean z10) {
        this.f70406f.b(z10);
    }

    @Override // f1.ca
    public void c() {
        this.f70404d.c();
    }

    @Override // f1.ca
    public void d(wd state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f70404d.d(state);
    }

    @Override // f1.p
    public void e(boolean z10) {
        this.f70406f.e(z10);
    }

    @Override // f1.p4
    public void f(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f70403c.f(cbUrl);
    }

    @Override // f1.p4
    public void g(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f70403c.g(cbUrl);
    }

    @Override // f1.p4
    public void h(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f70403c.h(cbUrl);
    }

    @Override // f1.ca
    public void i(boolean z10) {
        this.f70404d.i(z10);
    }

    @Override // f1.p4
    public void j(String location, Float f10, Float f11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70403c.j(location, f10, f11);
    }

    @Override // f1.p
    public void k(wd state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f70406f.k(state, activity);
    }

    @Override // f1.p4
    public boolean l(String urlFromCreative, Boolean bool, wd impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return this.f70403c.l(urlFromCreative, bool, impressionState);
    }

    @Override // f1.p
    public void a(a.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f70406f.a(error);
    }

    @Override // f1.f5
    public void b(String location, Float f10, Float f11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70405e.b(location, f10, f11);
    }

    @Override // f1.p
    public void c(boolean z10) {
        this.f70406f.c(z10);
    }

    @Override // f1.p
    public void a(boolean z10) {
        this.f70406f.a(z10);
    }
}
