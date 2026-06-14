package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class op1 {
    public static boolean a(np1 np1Var) {
        List list = np1Var.f113997d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((mp1) it.next()).f113581c) {
                return false;
            }
        }
        return true;
    }
}
