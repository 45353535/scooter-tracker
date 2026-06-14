package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f78750a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] strArrSplit = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            int i10 = 0;
            while (str2.length() > i10) {
                int length = str2.length();
                int i11 = i10 + 3800;
                int iMin = Math.min(length, i11);
                if (length > i11) {
                    int iA = e.a(this.f78750a.f78755a.matcher(str2), i10, iMin);
                    length = iA == -1 ? iMin : iA + 1;
                }
                arrayList.add(str2.substring(i10, length));
                i10 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f78750a = eVar;
    }
}
