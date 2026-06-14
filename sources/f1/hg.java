package f1;

import com.chartboost.sdk.view.CBImpressionActivity;
import f1.z2;
import g1.a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hg implements of, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f70050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ag f70051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f70052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f70053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70054f;

    public hg(k1 impressionActivityIntentWrapper, ag eventTracker) {
        Intrinsics.checkNotNullParameter(impressionActivityIntentWrapper, "impressionActivityIntentWrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70050b = impressionActivityIntentWrapper;
        this.f70051c = eventTracker;
    }

    @Override // f1.of
    public void a(int i10, boolean z10) {
        e0 e0Var;
        WeakReference weakReference = this.f70052d;
        if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
            return;
        }
        e0Var.a(i10, z10);
    }

    @Override // f1.of
    public void b() {
        Unit unit;
        h6 h6Var;
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            unit = null;
        } else {
            h6Var.y();
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("Bridge onPause missing callback to renderer", null, 2, null);
        }
    }

    @Override // f1.of
    public void c() {
        Unit unit;
        h6 h6Var;
        f();
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            unit = null;
        } else {
            h6Var.x();
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("Bridge onDestroy missing callback to renderer", null, 2, null);
        }
        WeakReference weakReference2 = this.f70052d;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference weakReference3 = this.f70053e;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
    }

    @Override // f1.of
    public void d(e0 activityInterface, CBImpressionActivity activity) {
        h6 h6Var;
        Intrinsics.checkNotNullParameter(activityInterface, "activityInterface");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f70052d = new WeakReference(activityInterface);
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            return;
        }
        h6Var.i(activity);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70051c.e(y0Var);
    }

    public final void f() {
        if (this.f70054f) {
            return;
        }
        e((y0) new oc(z2.i.f71759o, "dismiss_missing happened due to sdk closure outside expected flow", null, null, null, 28, null));
    }

    @Override // f1.of
    public void finishActivity() {
        e0 e0Var;
        this.f70054f = true;
        WeakReference weakReference = this.f70052d;
        if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
            return;
        }
        e0Var.finishActivity();
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70051c.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70051c.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70051c.n(uVar);
    }

    @Override // f1.of
    public void onResume() {
        Unit unit;
        h6 h6Var;
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            unit = null;
        } else {
            h6Var.r();
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("Bridge onResume missing callback to renderer", null, 2, null);
        }
    }

    @Override // f1.of
    public void onStart() {
        Unit unit;
        h6 h6Var;
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            unit = null;
        } else {
            h6Var.p();
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("Bridge onStart missing callback to renderer", null, 2, null);
        }
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70051c.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70051c.u(y0Var);
    }

    @Override // f1.of
    public void a(a.b error) {
        h6 h6Var;
        Intrinsics.checkNotNullParameter(error, "error");
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            return;
        }
        h6Var.a(error);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70051c.mo4436e(event);
    }

    @Override // f1.of
    public void b(v4 viewBase) {
        Unit unit;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        WeakReference weakReference = this.f70052d;
        if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
            unit = null;
        } else {
            e0Var.b(viewBase);
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("activityInterface is null", null, 2, null);
        }
    }

    @Override // f1.of
    public void e() {
        h6 h6Var;
        WeakReference weakReference = this.f70053e;
        if (weakReference == null || (h6Var = (h6) weakReference.get()) == null) {
            return;
        }
        h6Var.e();
    }

    @Override // f1.of
    public void a() {
        e0 e0Var;
        WeakReference weakReference = this.f70052d;
        if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
            return;
        }
        e0Var.a();
    }

    @Override // f1.of
    public void c(h6 adUnitRendererActivityInterface) {
        Intrinsics.checkNotNullParameter(adUnitRendererActivityInterface, "adUnitRendererActivityInterface");
        this.f70053e = new WeakReference(adUnitRendererActivityInterface);
        try {
            k1 k1Var = this.f70050b;
            k1Var.b(k1Var.a());
        } catch (Exception e10) {
            eg.i("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions", e10);
            a(a.b.f72136x);
        }
    }
}
