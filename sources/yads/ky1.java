package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ky1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y12 f112895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bx1 f112896b;

    public ky1(y12 y12Var, bx1 bx1Var) {
        this.f112895a = y12Var;
        this.f112896b = bx1Var;
    }

    public final jz1 a(Context context, dx1 dx1Var, hg2 hg2Var, cx1 cx1Var, jy1 jy1Var, rx1 rx1Var, rw1 rw1Var) {
        x12 x12Var;
        if (rw1Var == null) {
            return null;
        }
        y12 y12Var = this.f112895a;
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
        x12 x12Var2 = x12Var;
        w52 w52VarA = jy1Var.f112510c.a(rw1Var);
        uv0 uv0Var = new uv0();
        j53 j53Var = cx1Var.f109640a;
        List list = rw1Var.f115632j;
        List list2 = dx1Var.f110104a.f115238g;
        j53Var.getClass();
        ArrayList arrayListA = j53.a(list, list2);
        j53 j53Var2 = cx1Var.f109640a;
        List list3 = rw1Var.f115631i;
        List list4 = dx1Var.f110104a.f115234c;
        j53Var2.getClass();
        ArrayList arrayListA2 = j53.a(list3, list4);
        List list5 = rw1Var.f115624b;
        y52 y52Var = new y52(list5, arrayListA, arrayListA2, rw1Var.f115625c, rw1Var.f115628f);
        bx1 bx1Var = this.f112896b;
        ta taVar = ta.f116137b;
        bx1Var.getClass();
        Object obj = u02.f116430a;
        u02 u02VarA = t02.a();
        zw1 zw1Var = new zw1(list5, u02VarA);
        return x12Var2.a(context, rw1Var, new fz1(context, rw1Var, hg2Var, w52VarA), hg2Var, new mp(dx1Var, new xz1(zw1Var, dx1Var.f110105b), y52Var, w52VarA, jy1Var, new z5(uv0Var), new g02(context, zw1Var, u02VarA), bx1Var.f109135a, rw1Var, taVar), rx1Var);
    }

    public /* synthetic */ ky1(es2 es2Var) {
        this(new y12(), new bx1(es2Var));
    }
}
