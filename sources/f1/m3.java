package f1;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import f1.b6;
import f1.nd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m3 implements d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4 f70461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6 f70462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p6 f70463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nd f70464d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70465a;

        static {
            int[] iArr = new int[o7.values().length];
            try {
                iArr[o7.f70725b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o7.f70726c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o7.f70727d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70465a = iArr;
        }
    }

    public m3(r4 openMeasurementManager, b6 openMeasurementSessionBuilder) {
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(openMeasurementSessionBuilder, "openMeasurementSessionBuilder");
        this.f70461a = openMeasurementManager;
        this.f70462b = openMeasurementSessionBuilder;
    }

    @Override // f1.d4
    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.e(view);
        }
    }

    @Override // f1.d4
    public void b(PlayerState state) {
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.f(state);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyStateChanged missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void c() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.o();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoSkipped missing om tracker", null, 2, null);
        }
    }

    public final void d(Context context, View trackedView, View rootView, nd.b visibilityTrackerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(visibilityTrackerListener, "visibilityTrackerListener");
        g();
        n1 n1VarF = this.f70461a.f();
        nd ndVar = new nd(context, trackedView, rootView, n1VarF.a(), n1VarF.b(), n1VarF.f(), n1VarF.c(), false, 128, null);
        ndVar.d(visibilityTrackerListener);
        ndVar.w();
        this.f70464d = ndVar;
    }

    @Override // f1.d4
    public void e() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.n();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoResumed missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void f() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.s();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionDestroyWebview missing om tracker", null, 2, null);
        }
        this.f70463c = null;
    }

    public final void g() {
        nd ndVar = this.f70464d;
        if (ndVar != null) {
            ndVar.h();
        }
        this.f70464d = null;
    }

    public final boolean h() {
        return this.f70461a.k();
    }

    public final void i() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.b();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("signalImpressionEvent missing om tracker", null, 2, null);
        }
    }

    public final void j() {
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.s();
        }
        this.f70463c = null;
    }

    @Override // f1.d4
    public void a(boolean z10) {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            if (z10) {
                p6Var.i();
            } else {
                p6Var.h();
            }
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoBuffer missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void c(a6 mtype, l4 webview, Integer num, List verificationScriptResourcesList) {
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        try {
            f(mtype, webview, num, verificationScriptResourcesList);
        } catch (Exception e10) {
            eg.d("OMSDK Session error", e10);
        }
    }

    public final void e(Integer num) {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.r();
            p6Var.g(num);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("startAndLoadSession missing tracker", null, 2, null);
        }
    }

    public final void f(a6 a6Var, l4 l4Var, Integer num, List list) {
        this.f70461a.i();
        j();
        b6.a aVarF = this.f70462b.f(l4Var, a6Var, this.f70461a.g(), this.f70461a.b(), list, this.f70461a.l(), this.f70461a.h());
        if (aVarF != null) {
            this.f70463c = new p6(aVarF, this.f70461a.k());
        }
        e(num);
    }

    @Override // f1.d4
    public void b() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.q();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyClick missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void a() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.m();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoPaused missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void a(o7 quartile) {
        Unit unit;
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            int i10 = a.f70465a[quartile.ordinal()];
            if (i10 == 1) {
                p6Var.k();
            } else if (i10 == 2) {
                p6Var.l();
            } else if (i10 == 3) {
                p6Var.p();
            }
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoProgress missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void d() {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.j();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoComplete missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void a(float f10, float f11) {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.d(f10, f11);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVideoStarted missing om tracker", null, 2, null);
        }
    }

    @Override // f1.d4
    public void a(float f10) {
        Unit unit;
        p6 p6Var = this.f70463c;
        if (p6Var != null) {
            p6Var.c(f10);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("onImpressionNotifyVolumeChanged missing om tracker", null, 2, null);
        }
    }
}
