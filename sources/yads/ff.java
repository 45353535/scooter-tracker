package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f110699a;

    public ff(Set set) {
        this.f110699a = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(java.util.ArrayList r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r6.next()
            yads.ef r1 = (yads.ef) r1
            kotlin.Lazy r2 = yads.lf.f113080a     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r1.f110355c     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap r2 = yads.lf.a(r2)     // Catch: java.lang.Throwable -> L43
            java.util.Set r3 = r2.keySet()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Thread r3 = (java.lang.Thread) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L2a
            goto L43
        L2a:
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L33
            goto L43
        L33:
            java.util.Set r4 = yads.t03.f116008a     // Catch: java.lang.Throwable -> L43
            java.util.Set r4 = r5.f110699a     // Catch: java.lang.Throwable -> L43
            boolean r3 = yads.t03.a(r3, r4)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L43
            yads.aa2 r3 = new yads.aa2     // Catch: java.lang.Throwable -> L43
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L9
            r0.add(r3)
            goto L9
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ff.a(java.util.ArrayList):java.util.ArrayList");
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = kotlin.sequences.k.Z(StringsKt.E0(((ef) obj).f110355c), 50).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (StringsKt.a0(StringsKt.v1(str).toString(), "at ", false, 2, null)) {
                        Set set = t03.f116008a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.g0(str, (String) it2.next(), false, 2, null)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
