package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uo {
    public static am2 a(vo voVar) {
        qz qzVar;
        am2 am2Var = new am2((Map) null, 3);
        am2Var.a((voVar == null || (qzVar = voVar.f117135a) == null) ? null : qzVar.f115230b, "ad_type");
        am2Var.a(voVar != null ? voVar.f117137c : null, "parameters");
        mx2 mx2Var = voVar != null ? voVar.f117136b : null;
        if (mx2Var != null) {
            am2Var.b(mx2Var.a().f113267b, "size_type");
            am2Var.b(Integer.valueOf(mx2Var.getWidth()), "width");
            am2Var.b(Integer.valueOf(mx2Var.getHeight()), "height");
        }
        return am2Var;
    }
}
