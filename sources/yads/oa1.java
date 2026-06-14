package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class oa1 extends ho {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f114248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tm2 f114249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f114250y;

    public oa1(Context context, String str, tm2 tm2Var, Map map, l51 l51Var) {
        super(context, str, l51Var);
        this.f114248w = context;
        this.f114249x = tm2Var;
        this.f114250y = map;
    }

    @Override // yads.ho, yads.km2
    public final oj3 a(oj3 oj3Var) {
        boolean z10 = lb1.f113032a;
        return oj3Var;
    }

    @Override // yads.km2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f114248w;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && hr2VarA.f111765z) {
            f01 f01Var = f01.f110544c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f114250y);
        return map;
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        if (200 != r62Var.f115340a) {
            return new qn2(new g4(l4.f112945e, r62Var));
        }
        w70 w70Var = (w70) this.f114249x.a(r62Var);
        return w70Var != null ? new qn2(w70Var, g01.a(r62Var)) : new qn2(new g4(l4.f112943c, r62Var));
    }
}
