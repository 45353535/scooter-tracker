package yads;

import android.app.Activity;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f113292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f113293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f113294c;

    public m2(Activity activity, x1 x1Var, q1 q1Var) {
        this.f113292a = activity;
        this.f113293b = x1Var;
        this.f113294c = q1Var;
    }

    @Override // yads.h2
    public final void a() {
    }

    @Override // yads.h2
    public final void b() {
    }

    @Override // yads.h2
    public final void c() {
        Object objB;
        q1 q1Var = this.f113294c;
        Activity activity = this.f113292a;
        x1 x1Var = this.f113293b;
        q1Var.getClass();
        ze0 ze0Var = x1Var.f117676g;
        if (ze0Var == null) {
            return;
        }
        try {
            Result.Companion companion = Result.f93230c;
            activity.startActivityForResult(ze0Var.f118637a, 0);
            Unit unit = Unit.f93236a;
            r1 r1Var = q1Var.f114845a;
            am2 am2VarA = r1Var.f115261b.a(x1Var.f117670a, x1Var.f117671b);
            xl2 xl2Var = xl2.G;
            Map map = am2VarA.f108722a;
            r1Var.f115260a.a(new zl2(xl2Var.a(), MapsKt.toMutableMap(map), am2VarA.f108723b));
            ze0Var.f118638b.invoke();
            activity.finish();
            objB = Result.b(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            activity.finish();
            q1Var.f114845a.f115260a.reportError("Failed to register ActivityResult", thG);
            ze0Var.f118639c.invoke(thG);
        }
    }

    @Override // yads.h2
    public final boolean d() {
        return true;
    }

    @Override // yads.h2
    public final void f() {
    }

    @Override // yads.h2
    public final void g() {
    }

    @Override // yads.h2
    public final void onAdClosed() {
    }
}
