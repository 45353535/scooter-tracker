package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class it2 implements mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm f112121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i32 f112122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vm f112123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q02 f112124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uq2 f112125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z02 f112126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f112127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vt2 f112128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final em f112129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vy1 f112130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wy f112131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f112132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t9 f112133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jz1 f112134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f112135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public um f112136p;

    public it2(cm cmVar, i32 i32Var, vm vmVar, q02 q02Var, uq2 uq2Var, z02 z02Var, Handler handler, vt2 vt2Var, em emVar, vy1 vy1Var, wy wyVar) {
        this.f112121a = cmVar;
        this.f112122b = i32Var;
        this.f112123c = vmVar;
        this.f112124d = q02Var;
        this.f112125e = uq2Var;
        this.f112126f = z02Var;
        this.f112127g = handler;
        this.f112128h = vt2Var;
        this.f112129i = emVar;
        this.f112130j = vy1Var;
        this.f112131k = wyVar;
        this.f112132l = new ViewTreeObserver.OnPreDrawListener() { // from class: yads.s8
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return it2.a(this.f115718b);
            }
        };
    }

    public static final void a(cm cmVar) {
        cmVar.d();
    }

    @Override // yads.mm
    public final List b() {
        vy1 vy1Var = this.f112130j;
        jz1 jz1Var = this.f112134n;
        vy1Var.getClass();
        return vy1.b(jz1Var);
    }

    @Override // yads.mm
    public final String getAdInfo() {
        return this.f112130j.c(this.f112134n);
    }

    public static final void b(it2 it2Var) {
        sh3.a(it2Var.f112121a.C, false);
    }

    @Override // yads.mm
    public final List a() {
        vy1 vy1Var = this.f112130j;
        jz1 jz1Var = this.f112134n;
        vy1Var.getClass();
        return vy1.a(jz1Var);
    }

    @Override // yads.mm
    public final void a(Context context) {
        um umVar = this.f112136p;
        if (umVar != null) {
            sm smVar = umVar.f116711a.f116300e;
            gk2 gk2Var = smVar.f115874c;
            KProperty kProperty = sm.f115871d[0];
            ViewGroup viewGroup = (ViewGroup) gk2Var.f111244a.get();
            if (viewGroup != null) {
                th3.a(viewGroup);
            }
            hf0 hf0Var = smVar.f115873b;
            if (hf0Var != null) {
                hf0Var.c();
            }
        }
        this.f112122b.f111851b.a();
        this.f112133m = null;
        this.f112134n = null;
        this.f112135o = true;
    }

    public /* synthetic */ it2(final cm cmVar, es2 es2Var) {
        i32 i32Var = new i32(cmVar.g(), es2Var, cmVar.e(), cmVar.f());
        vm vmVar = new vm(cmVar.e(), cmVar.h());
        q02 q02Var = new q02(cmVar.e());
        uq2 uq2Var = new uq2(cmVar.e(), cmVar.h());
        z02 z02Var = new z02(cmVar);
        Handler handler = new Handler(Looper.getMainLooper());
        Object obj = vt2.f117186j;
        this(cmVar, i32Var, vmVar, q02Var, uq2Var, z02Var, handler, ut2.a(), new em(), new vy1(), new wy() { // from class: yads.q8
            @Override // yads.wy
            public final void e() {
                it2.a(cmVar);
            }
        });
    }

    @Override // yads.mm
    public final void a(Context context, t9 t9Var) {
        this.f112121a.f115506b.a(u5.f116499c, null);
        hr2 hr2VarA = this.f112128h.a(context);
        if (hr2VarA != null && hr2VarA.C) {
            if (this.f112135o) {
                return;
            }
            mx2 mx2Var = this.f112121a.f115507c.f109197d.f114071a;
            zt0 zt0VarC = t9Var.c();
            this.f112133m = t9Var;
            if (mx2Var != null && ox2.a(context, t9Var, zt0VarC, this.f112129i, mx2Var)) {
                this.f112122b.a(t9Var, new gt2(this), new ft2(this, context, t9Var));
                return;
            }
            k4 k4VarA = f9.a(mx2Var != null ? mx2Var.c(context) : 0, mx2Var != null ? mx2Var.a(context) : 0, zt0VarC.f118813b, zt0VarC.f118814c, qi3.d(context), qi3.b(context));
            wa1.a(k4VarA.f112580c, new Object[0]);
            this.f112121a.b(k4VarA);
            return;
        }
        this.f112121a.b(f9.f110640a);
    }

    public static final boolean a(final it2 it2Var) {
        it2Var.f112127g.postDelayed(new Runnable() { // from class: yads.t8
            @Override // java.lang.Runnable
            public final void run() {
                it2.b(this.f116106b);
            }
        }, 50L);
        return true;
    }
}
