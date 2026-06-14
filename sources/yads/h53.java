package yads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h53 extends qz0 implements h41, g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f111488d;

    public h53(Context context, t9 t9Var, es2 es2Var, c4 c4Var) {
        super(context, t9Var);
        this.f111488d = new e1(context, c4Var, es2Var, t9Var, this, null);
    }

    public void a(int i10, Bundle bundle) {
        boolean z10 = lb1.f113032a;
        switch (i10) {
            case 6:
                ((cx0) this).g();
                this.f111488d.e();
                break;
            case 7:
                ((cx0) this).g();
                this.f111488d.c();
                break;
            case 8:
                this.f111488d.d();
                break;
            case 9:
                this.f111488d.a();
                break;
        }
    }
}
