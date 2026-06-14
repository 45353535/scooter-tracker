package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Vn {
    public static final Sn a(Throwable th2, V v10, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        In inA = th2 != null ? Jn.a(th2, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Hl((StackTraceElement) it.next()));
            }
        }
        return new Sn(inA, v10, arrayList, null, null, null, str, bool);
    }
}
