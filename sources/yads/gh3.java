package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as3 f111211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yx2 f111212b;

    public /* synthetic */ gh3(as3 as3Var) {
        this(as3Var, new yx2());
    }

    public final fh3 a(Context context, xb3 xb3Var, ad3 ad3Var) {
        zr3 zr3Var;
        bh3 bh3Var = new bh3(context);
        af3 af3Var = new af3(context);
        fy fyVar = new fy();
        fyVar.f110973a.add(new v10(xb3Var.f117776a, bh3Var, af3Var));
        fyVar.f110973a.add(new zd3(xb3Var.f117777b, bh3Var));
        ud3 ud3VarA = this.f111212b.a(xb3Var.f117776a);
        List list = xb3Var.f117777b.f111953n;
        if (this.f111211a.f108771a.a(context)) {
            bh3 bh3Var2 = new bh3(context);
            p82 p82Var = new p82();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            wr3 wr3Var = wr3.f117545a;
            zr3Var = new zr3(context, ad3Var, ud3VarA, list, bh3Var2, p82Var, ve.a(applicationContext, new in3()));
        } else {
            zr3Var = null;
        }
        if (zr3Var != null) {
            fyVar.f110973a.add(zr3Var);
        }
        return new fh3(fyVar);
    }

    public gh3(as3 as3Var, yx2 yx2Var) {
        this.f111211a = as3Var;
        this.f111212b = yx2Var;
    }
}
