package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Qc {
    public static final List a(Rc rc2) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(rc2, "<this>");
        C3865ll c3865ll = rc2.f37655a;
        if (c3865ll != null) {
            ArrayList arrayList2 = c3865ll.f38994b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (Intrinsics.areEqual(((C4107ve) obj).f39775b, "click")) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4107ve) it.next()).f39774a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
