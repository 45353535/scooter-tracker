package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mp2 implements jf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip2 f113582a;

    public mp2(ip2 ip2Var) {
        this.f113582a = ip2Var;
    }

    @Override // yads.jf0
    public final List a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, b2 b2Var, m30 m30Var, y3 y3Var, dp2 dp2Var, w33 w33Var, xg0 xg0Var, oh0 oh0Var, h7 h7Var) {
        sh0 sh0Var;
        ArrayList arrayList = new ArrayList();
        ip2 ip2Var = this.f113582a;
        ip2Var.getClass();
        try {
            ip2Var.f112081e.getClass();
        } catch (Throwable unused) {
        }
        if (!wh0.a(context) || oh0Var == null) {
            sh0Var = null;
        } else {
            sh0Var = new sh0(oh0Var.f114321e, ip2Var.f112077a, ip2Var.f112078b, ip2.a(t9Var, jz1Var, b2Var, y3Var, dp2Var, w33Var, oh0Var, h7Var), ip2Var.f112079c, xg0Var, ip2Var.f112080d);
        }
        if (sh0Var != null) {
            arrayList.add(sh0Var);
        }
        return arrayList;
    }
}
