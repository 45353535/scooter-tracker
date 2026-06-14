package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f110150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f110151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z13 f110152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f110153e;

    public e1(Context context, i1 i1Var, w0 w0Var, z13 z13Var) {
        this.f110149a = context;
        this.f110150b = i1Var;
        this.f110151c = w0Var;
        this.f110152d = z13Var;
        this.f110153e = new d1(this);
    }

    public final void a() {
        ((z0) this.f110151c).a(this.f110149a, (l1) this.f110153e);
        ((z0) this.f110151c).a(this.f110149a, this.f110153e);
    }

    public final void b() {
        this.f110150b.a(h1.f111430c);
        ((z0) this.f110151c).b(this.f110149a, this.f110153e);
        w0 w0Var = this.f110151c;
        Context context = this.f110149a;
        d1 d1Var = this.f110153e;
        z0 z0Var = (z0) w0Var;
        synchronized (z0Var.f118476a) {
            z0Var.f118478c.remove(d1Var);
            z0Var.b(context);
            Unit unit = Unit.f93236a;
        }
        this.f110152d.a(tc1.f116193d, this);
    }

    public final void c() {
        this.f110152d.b(tc1.f116193d, this);
        ((z0) this.f110151c).a(this.f110149a, (l1) this.f110153e);
        ((z0) this.f110151c).a(this.f110149a, this.f110153e);
        this.f110150b.b(h1.f111430c);
    }

    public final void d() {
        this.f110150b.a(h1.f111431d);
    }

    public final void e() {
        this.f110150b.b(h1.f111431d);
    }

    public /* synthetic */ e1(Context context, c4 c4Var, es2 es2Var, t9 t9Var, g1 g1Var, op0 op0Var) {
        Context applicationContext = context.getApplicationContext();
        i1 i1Var = new i1(context, c4Var, es2Var, t9Var, g1Var, op0Var);
        z0 z0VarA = x0.a();
        z13 z13Var = z13.f118512b;
        this(applicationContext, i1Var, z0VarA, y13.a());
    }
}
