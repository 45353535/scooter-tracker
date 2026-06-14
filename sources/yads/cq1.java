package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cq1 {
    public static final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eq1 eq1Var = (eq1) it.next();
            int iOrdinal = eq1Var.f110436b.ordinal();
            if (iOrdinal == 0) {
                wa1.b(eq1Var.f110435a, new Object[0]);
            } else if (iOrdinal == 1) {
                wa1.a(eq1Var.f110435a, new Object[0]);
            }
        }
    }
}
