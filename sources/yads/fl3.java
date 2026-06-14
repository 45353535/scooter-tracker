package yads;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u92 f110781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ix2 f110782b = new ix2();

    public fl3(u92 u92Var) {
        this.f110781a = u92Var;
    }

    public final void a(final Map map) {
        ix2 ix2Var = this.f110782b;
        Runnable runnable = new Runnable() { // from class: yads.s6
            @Override // java.lang.Runnable
            public final void run() {
                fl3.a(this.f115707b, map);
            }
        };
        synchronized (ix2Var.f112180a) {
            if (ix2Var.f112181b) {
                return;
            }
            ix2Var.f112181b = true;
            Unit unit = Unit.f93236a;
            runnable.run();
        }
    }

    public static final void a(fl3 fl3Var, Map map) {
        fl3Var.f110781a.setVisibility(0);
        boolean z10 = lb1.f113032a;
        u92 u92Var = fl3Var.f110781a;
        zz0 zz0Var = u92Var.f116578g;
        if (zz0Var != null) {
            zz0Var.a(u92Var, map);
        }
    }
}
