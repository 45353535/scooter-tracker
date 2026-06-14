package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f4 {
    public static g4 a(r62 r62Var) {
        l4 l4Var;
        int i10 = r62Var != null ? r62Var.f115340a : -1;
        boolean z10 = lb1.f113032a;
        if (204 == i10) {
            l4Var = l4.f112944d;
        } else {
            Map map = r62Var != null ? r62Var.f115342c : null;
            Integer numValueOf = r62Var != null ? Integer.valueOf(r62Var.f115340a) : null;
            l4Var = (numValueOf != null && 400 == numValueOf.intValue() && map != null && ez0.b(map, f01.N)) ? l4.f112948h : 403 == i10 ? l4.f112947g : 404 == i10 ? l4.f112942b : (500 > i10 || i10 > 599) ? -1 == i10 ? l4.f112951k : l4.f112945e : l4.f112946f;
        }
        return new g4(l4Var, r62Var);
    }
}
