package f1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.view.CBImpressionActivity;
import g1.a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class lf implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6 f70419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f70420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5 f70421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u7 f70422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pc f70423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a4 f70424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f70425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f70427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f70429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f70430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70431n;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            eg.j("Cannot display on host because view was not created!", null, 2, null);
            lf.this.a(a.b.f72131s);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public lf(i6 appRequest, u3 viewProtocol, x5 downloader, ViewGroup viewGroup, u7 adUnitRendererImpressionCallback, pc impressionIntermediateCallback, a4 impressionClickCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        this.f70419b = appRequest;
        this.f70420c = viewProtocol;
        this.f70421d = downloader;
        this.f70422e = adUnitRendererImpressionCallback;
        this.f70423f = impressionIntermediateCallback;
        this.f70424g = impressionClickCallback;
        this.f70425h = new WeakReference(viewGroup);
    }

    @Override // f1.p
    public void a(ViewGroup viewGroup) {
        try {
            if (viewGroup == null) {
                eg.j("Cannot display on host because it is null!", null, 2, null);
                a(a.b.f72132t);
                return;
            }
            a.b bVarK = this.f70420c.k(viewGroup);
            if (bVarK != null) {
                eg.j("displayOnHostView tryCreatingViewOnHostView error " + bVarK, null, 2, null);
                a(bVarK);
                return;
            }
            v4 v4VarB0 = this.f70420c.b0();
            if (v4VarB0 == null) {
                new a();
            } else {
                b(viewGroup, v4VarB0);
                Unit unit = Unit.f93236a;
            }
        } catch (Exception e10) {
            eg.i("displayOnHostView e", e10);
            a(a.b.f72131s);
        }
    }

    @Override // f1.p
    public void b() {
        if (this.f70429l) {
            return;
        }
        this.f70429l = true;
        this.f70420c.f0();
    }

    @Override // f1.p
    public void c(boolean z10) {
        this.f70426i = z10;
    }

    public boolean d() {
        return this.f70431n;
    }

    @Override // f1.p
    public boolean e() {
        return this.f70426i;
    }

    @Override // f1.p
    public boolean f() {
        return this.f70428k;
    }

    @Override // f1.p
    public void g() {
        this.f70422e.o();
    }

    @Override // f1.p
    public boolean h() {
        return this.f70427j;
    }

    @Override // f1.p
    public ViewGroup i() {
        return (ViewGroup) this.f70425h.get();
    }

    @Override // f1.p
    public boolean j() {
        return this.f70430m;
    }

    @Override // f1.p
    public void k() {
        if (d()) {
            return;
        }
        f(true);
        if (j()) {
            this.f70423f.c();
        } else {
            a(a.b.f72114b);
        }
        this.f70420c.A(s7.f71060k);
        this.f70423f.g();
        this.f70420c.h();
    }

    @Override // f1.p
    public void l() {
        this.f70422e.o(this.f70419b);
    }

    @Override // f1.p
    public void onResume() {
        this.f70424g.a(false);
        if (this.f70429l) {
            this.f70429l = false;
            this.f70420c.g0();
        }
    }

    @Override // f1.p
    public void onStart() {
        this.f70424g.a(false);
    }

    public final void c(CBImpressionActivity cBImpressionActivity) {
        this.f70423f.d(wd.f71450e);
        try {
            a.b bVarO = this.f70420c.o(cBImpressionActivity);
            if (bVarO != null) {
                a(bVarO);
            } else {
                eg.m("Displaying the impression", null, 2, null);
            }
        } catch (Exception e10) {
            eg.i("Cannot create view in protocol", e10);
            a(a.b.f72131s);
        }
    }

    @Override // f1.p
    public void e(boolean z10) {
        this.f70430m = z10;
    }

    public void f(boolean z10) {
        this.f70431n = z10;
    }

    public final void b(ViewGroup viewGroup, View view) {
        Unit unit;
        Context context;
        this.f70423f.d(wd.f71450e);
        v4 v4VarB0 = this.f70420c.b0();
        if (v4VarB0 == null || (context = v4VarB0.getContext()) == null) {
            unit = null;
        } else {
            this.f70422e.a(context);
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.j("Missing context on onImpressionViewCreated", null, 2, null);
        }
        viewGroup.addView(view);
        this.f70421d.b();
    }

    @Override // f1.p
    public void k(wd state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (state != wd.f71448c) {
            c(activity);
            return;
        }
        eg.e("displayOnActivity invalid state: " + state, null, 2, null);
    }

    @Override // f1.p
    public void b(boolean z10) {
        this.f70427j = z10;
    }

    @Override // f1.p
    public void a(a.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f70430m = true;
        this.f70422e.s(this.f70419b, error);
    }

    @Override // f1.p
    public void a(boolean z10) {
        this.f70428k = z10;
    }
}
