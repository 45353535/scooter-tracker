package io.sentry.util;

import io.sentry.w6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static boolean a(List list, w6 w6Var) {
        if (w6Var != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.m mVarU0 = w6Var.u0();
            if (mVarU0 != null) {
                String strE = mVarU0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = mVarU0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = w6Var.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.g0) it.next()).a())) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.g0 g0Var = (io.sentry.g0) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (g0Var.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
