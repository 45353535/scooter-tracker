package yads;

import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bm2 {
    public static final am2 a(am2 am2Var, am2 am2Var2) {
        if (am2Var2 == null) {
            return new am2(am2Var.f108722a, am2Var.f108723b);
        }
        c cVar = am2Var.f108723b;
        if (cVar == null) {
            cVar = am2Var2.f108723b;
        }
        return new am2(MapsKt.plus(am2Var.f108722a, am2Var2.f108722a), cVar);
    }
}
