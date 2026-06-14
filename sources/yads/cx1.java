package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j53 f109640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z12 f109641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ey2 f109642c;

    public /* synthetic */ cx1(es2 es2Var) {
        this(new j53(), new z12(es2Var), new ey2(es2Var));
    }

    public final i12 a(Context context, dx1 dx1Var, hg2 hg2Var, jy1 jy1Var, rx1 rx1Var) {
        x12 x12Var;
        dx1 dx1Var2 = dx1Var;
        uv0 uv0Var = new uv0();
        z12 z12Var = this.f109641b;
        z12Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<rw1> list = dx1Var2.f110104a.f115232a;
        jy1 jy1Var2 = jy1Var;
        x52 x52Var = jy1Var2.f112510c;
        for (rw1 rw1Var : list) {
            w52 w52VarA = x52Var.a(rw1Var);
            fz1 fz1Var = new fz1(context, rw1Var, hg2Var, w52VarA);
            bb bbVar = z12Var.f118510b;
            j53 j53Var = bbVar.f108956a;
            List list2 = rw1Var.f115632j;
            j53Var.getClass();
            ArrayList arrayListA = j53.a(list2, null);
            j53 j53Var2 = bbVar.f108956a;
            List list3 = rw1Var.f115631i;
            j53Var2.getClass();
            ArrayList arrayListA2 = j53.a(list3, null);
            List list4 = rw1Var.f115624b;
            y52 y52Var = new y52(list4, arrayListA, arrayListA2, rw1Var.f115625c, rw1Var.f115628f);
            bx1 bx1Var = z12Var.f118511c;
            ta taVar = ta.f116139d;
            bx1Var.getClass();
            Object obj = u02.f116430a;
            u02 u02VarA = t02.a();
            ArrayList arrayList2 = arrayList;
            zw1 zw1Var = new zw1(list4, u02VarA);
            x52 x52Var2 = x52Var;
            mp mpVar = new mp(dx1Var2, new xz1(zw1Var, dx1Var2.f110105b), y52Var, w52VarA, jy1Var2, new z5(uv0Var), new g02(context, zw1Var, u02VarA), bx1Var.f109135a, rw1Var, taVar);
            dx1 dx1Var3 = dx1Var2;
            y12 y12Var = z12Var.f118509a;
            xn2 xn2Var = rw1Var.f115623a;
            y12Var.getClass();
            int iOrdinal = xn2Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                x12Var = y12Var.f118060a;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new lf.m();
                }
                x12Var = y12Var.f118060a;
            } else {
                x12Var = y12Var.f118061b;
            }
            if (x12Var != null) {
                arrayList2.add(x12Var.a(context, rw1Var, fz1Var, hg2Var, mpVar, rx1Var));
                jy1Var2 = jy1Var;
                dx1Var2 = dx1Var3;
                arrayList = arrayList2;
                x52Var = x52Var2;
            } else {
                jy1Var2 = jy1Var;
                dx1Var2 = dx1Var3;
                x52Var = x52Var2;
                arrayList = arrayList2;
            }
        }
        dx1 dx1Var4 = dx1Var2;
        h12 h12Var = new h12(arrayList);
        ey2 ey2Var = this.f109642c;
        kb kbVar = ey2Var.f110527b;
        kbVar.getClass();
        qz1 qz1Var = dx1Var4.f110104a;
        List list5 = qz1Var.f115233b;
        j53 j53Var3 = kbVar.f112669a;
        List list6 = qz1Var.f115238g;
        j53Var3.getClass();
        ArrayList arrayListA3 = j53.a(null, list6);
        j53 j53Var4 = kbVar.f112669a;
        List list7 = qz1Var.f115234c;
        j53Var4.getClass();
        y52 y52Var2 = new y52(list5, arrayListA3, j53.a(null, list7), AdRevenueScheme.AD_UNIT, qz1Var.f115235d);
        Object obj2 = u02.f116430a;
        u02 u02VarA2 = t02.a();
        zw1 zw1Var2 = new zw1(list5, u02VarA2);
        Object obj3 = vt2.f117186j;
        return new i12(context, h12Var, hg2Var, new mp(dx1Var, new hy2(h12Var, zw1Var2, ut2.a(), dx1Var4.f110105b), y52Var2, new iy2(list5), jy1Var, new jb(uv0Var), new g02(context, zw1Var2, u02VarA2), ey2Var.f110526a, null, ta.f116138c), rx1Var);
    }

    public cx1(j53 j53Var, z12 z12Var, ey2 ey2Var) {
        this.f109640a = j53Var;
        this.f109641b = z12Var;
        this.f109642c = ey2Var;
    }
}
