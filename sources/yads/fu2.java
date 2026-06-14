package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class fu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y83 f110931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a93 f110932b;

    public /* synthetic */ fu2(Context context) {
        this(new y83(context), new a93(context));
    }

    public final void a() {
        boolean z10;
        a93 a93Var = this.f110932b;
        fb3 fb3Var = a93Var.f108608a;
        Context context = a93Var.f108610c;
        fb3Var.getClass();
        if (sb.a(context)) {
            z83 z83Var = a93Var.f108609b;
            hr2 hr2VarA = z83Var.f118597a.a(a93Var.f108610c);
            if (hr2VarA != null && hr2VarA.f111749r) {
                a93Var.f108611d.getClass();
                b93.b();
            }
        }
        y83 y83Var = this.f110931a;
        fb3 fb3Var2 = y83Var.f118114c;
        Context context2 = y83Var.f118116e;
        fb3Var2.getClass();
        if (sb.a(context2)) {
            vt2 vt2Var = y83Var.f118113b;
            vt2Var.getClass();
            synchronized (vt2.f117186j) {
                z10 = vt2Var.f117193f;
            }
            if (z10) {
                x83 x83Var = y83Var.f118115d;
                hr2 hr2VarA2 = x83Var.f117736a.a(y83Var.f118116e);
                if (hr2VarA2 == null || !hr2VarA2.f111747q) {
                    return;
                }
                y83Var.f118112a.a();
            }
        }
    }

    public fu2(y83 y83Var, a93 a93Var) {
        this.f110931a = y83Var;
        this.f110932b = a93Var;
    }
}
