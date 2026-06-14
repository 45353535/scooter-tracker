package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r5 implements e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9 f115317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f115318b;

    public r5(x9 x9Var, WeakReference weakReference) {
        this.f115317a = x9Var;
        this.f115318b = weakReference;
        x9Var.a(this);
    }

    @Override // yads.e4
    public final void a(int i10, Bundle bundle) {
        gy1 gy1Var = (gy1) this.f115318b.get();
        if (gy1Var != null) {
            if (i10 == 19) {
                gy1Var.f111398a.b();
                gy1Var.f111399b.f110577f.f110150b.b(h1.f111432e);
                return;
            }
            if (i10 == 20) {
                gy1Var.f111399b.f110577f.f110150b.a(h1.f111432e);
                return;
            }
            switch (i10) {
                case 6:
                    gy1Var.f111398a.b();
                    gy1Var.f111399b.f110577f.f110150b.b(h1.f111431d);
                    break;
                case 7:
                    gy1Var.f111398a.b();
                    gy1Var.f111399b.f110577f.c();
                    break;
                case 8:
                    gy1Var.f111399b.f110577f.f110150b.a(h1.f111431d);
                    break;
                case 9:
                    boolean z10 = lb1.f113032a;
                    gy1Var.f111399b.f110577f.a();
                    break;
            }
        }
    }

    public /* synthetic */ r5(gy1 gy1Var) {
        this(new x9(), new WeakReference(gy1Var));
    }
}
