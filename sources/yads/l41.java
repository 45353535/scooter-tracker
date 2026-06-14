package yads;

import android.content.Context;
import com.ironsource.N6;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t9 f112958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f112959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5 f112960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm2 f112961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hr2 f112962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cx f112963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pe f112964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v02 f112965h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l41(Context context, t9 t9Var, c4 c4Var, es2 es2Var, i5 i5Var) {
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        mr1 mr1VarA = ve.a(context, pr3Var.b());
        Object obj = vt2.f117186j;
        this(t9Var, c4Var, i5Var, mr1VarA, ut2.a().a(context), new cx(), new pe(context));
    }

    public final am2 a(e93 e93Var) {
        am2 am2VarA = a();
        am2VarA.b(e93Var.f110267a.f109853b, "reason");
        String str = e93Var.f110268b;
        if (str != null && str.length() > 0) {
            am2VarA.b(str, "asset_name");
        }
        String str2 = e93Var.f110269c;
        if (str2 != null && str2.length() > 0) {
            am2VarA.b(str2, "description");
        }
        return am2VarA;
    }

    public l41(t9 t9Var, c4 c4Var, i5 i5Var, dm2 dm2Var, hr2 hr2Var, cx cxVar, pe peVar) {
        this.f112958a = t9Var;
        this.f112959b = c4Var;
        this.f112960c = i5Var;
        this.f112961d = dm2Var;
        this.f112962e = hr2Var;
        this.f112963f = cxVar;
        this.f112964g = peVar;
    }

    public final am2 a() {
        am2 am2VarA = this.f112963f.a(this.f112958a, this.f112959b);
        am2VarA.b(wl2.f117511a, N6.G1);
        mx2 mx2Var = this.f112959b.f109197d.f114071a;
        if (mx2Var != null) {
            am2VarA.b(mx2Var.a().f113267b, "size_type");
            am2VarA.b(Integer.valueOf(mx2Var.getWidth()), "width");
            am2VarA.b(Integer.valueOf(mx2Var.getHeight()), "height");
        }
        hr2 hr2Var = this.f112962e;
        if (hr2Var != null) {
            am2VarA.b(hr2Var.O, "banner_size_calculation_type");
        }
        v02 v02Var = this.f112965h;
        return v02Var != null ? bm2.a(am2VarA, v02Var.a()) : am2VarA;
    }

    public final void a(xl2 xl2Var, am2 am2Var) {
        Map map = am2Var.f108722a;
        c cVar = am2Var.f108723b;
        String str = xl2Var.f117890b;
        Map mutableMap = MapsKt.toMutableMap(map);
        this.f112961d.a(new zl2(str, mutableMap, cVar));
        this.f112964g.a(xl2Var, mutableMap, wl2.f117511a, this.f112960c);
    }
}
