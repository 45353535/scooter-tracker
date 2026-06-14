package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xj1 f118719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq f118720b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zj1(Context context) {
        xj1 xj1VarA = new ik2(context).a();
        this(xj1VarA, new aq(xj1VarA));
    }

    public final wj1 a(List list) {
        Iterator it = list.iterator();
        double d10 = -1.0d;
        wj1 wj1Var = null;
        while (it.hasNext()) {
            wj1 wj1Var2 = (wj1) it.next();
            double d11 = Intrinsics.areEqual("video/mp4", wj1Var2.f117486d) ? 1.5d : 1.0d;
            aq aqVar = this.f118720b;
            aqVar.getClass();
            int i10 = wj1Var2.f117491i;
            if (i10 == 0) {
                int i11 = wj1Var2.f117490h * wj1Var2.f117489g;
                xj1 xj1Var = aqVar.f108748a;
                i10 = (int) ((i11 / (xj1Var.f117836a * xj1Var.f117837b)) * xj1Var.f117838c);
            }
            int i12 = this.f118719a.f117838c;
            double dAbs = d11 / ((((int) Math.max(0.0d, i10)) < 100 ? 10.0d : ((double) ((int) Math.abs(i12 - r9))) / ((double) i12)) + 1.0d);
            if (dAbs > d10) {
                wj1Var = wj1Var2;
                d10 = dAbs;
            }
        }
        return wj1Var;
    }

    public zj1(xj1 xj1Var, aq aqVar) {
        this.f118719a = xj1Var;
        this.f118720b = aqVar;
    }
}
