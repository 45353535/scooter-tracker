package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vr2 extends ho {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f117159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tm2 f117160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f117161y;

    public vr2(Context context, String str, wr2 wr2Var, Map map, xr2 xr2Var, xr2 xr2Var2) {
        super(context, 0, str, xr2Var2, xr2Var);
        this.f117159w = context;
        this.f117160x = wr2Var;
        this.f117161y = map;
        l();
        m();
    }

    @Override // yads.ho, yads.km2
    public final oj3 a(oj3 oj3Var) {
        l4 l4Var;
        boolean z10 = lb1.f113032a;
        int i10 = g4.f111053d;
        r62 r62Var = oj3Var.f114340b;
        Integer numValueOf = r62Var != null ? Integer.valueOf(r62Var.f115340a) : null;
        if (numValueOf == null) {
            l4Var = oj3Var instanceof o72 ? l4.f112951k : oj3Var instanceof i43 ? l4.f112952l : oj3Var instanceof hl ? l4.f112953m : oj3Var instanceof yu ? l4.f112954n : oj3Var instanceof z92 ? l4.f112955o : l4.f112956p;
        } else {
            int iIntValue = numValueOf.intValue();
            l4Var = (500 > iIntValue || iIntValue > 599) ? l4.f112945e : l4.f112946f;
        }
        return new g4(l4Var, r62Var);
    }

    @Override // yads.km2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f117159w;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && hr2VarA.f111765z) {
            f01 f01Var = f01.f110544c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f117161y);
        return map;
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        l4 l4Var;
        if (200 == r62Var.f115340a) {
            hr2 hr2Var = (hr2) this.f117160x.a(r62Var);
            if (hr2Var != null) {
                Map mapEmptyMap = r62Var.f115342c;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                String strC = ez0.c(mapEmptyMap, f01.R);
                if (strC != null) {
                    gv2 gv2Var = hv2.f111787a;
                    Context context = this.f111641s;
                    gv2Var.getClass();
                    ((ff1) ((iv2) gv2.a(context)).f112161b).a("ServerSideClientIP", strC);
                }
                return new qn2(hr2Var, g01.a(r62Var));
            }
            l4Var = l4.f112943c;
        } else {
            l4Var = l4.f112945e;
        }
        return new qn2(new g4(l4Var, r62Var));
    }
}
