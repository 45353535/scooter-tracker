package com.taurusx.tax.g;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66113a = "__HEIGHT__";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66114c = "__UP_Y__";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66115o = "__CLK_TIME__";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66116s = "__WIDTH__";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66117w = "__DOWN_Y__";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66118y = "__UP_X__";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66119z = "__DOWN_X__";

    public static ArrayList z(ArrayList<String> arrayList, com.taurusx.tax.w.s.z zVar) {
        if (arrayList == null || zVar == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (zVar.w() != null) {
                next = next.replace(f66119z, zVar.w());
            }
            if (zVar.y() != null) {
                next = next.replace(f66117w, zVar.y());
            }
            if (zVar.o() != null) {
                next = next.replace(f66118y, zVar.o());
            }
            if (zVar.s() != null) {
                next = next.replace(f66114c, zVar.s());
            }
            if (zVar.z() != null) {
                next = next.replace(f66115o, zVar.z());
            }
            if (zVar.a() != null) {
                next = next.replace(f66116s, zVar.a());
            }
            if (zVar.c() != null) {
                next = next.replace(f66113a, zVar.c());
            }
            arrayList2.add(next);
        }
        return arrayList2;
    }
}
