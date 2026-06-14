package com.inmobi.media;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Jl {
    public static final int a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            List listSplit$default = StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER, "."}, false, 4, 2, null);
            int i10 = Integer.parseInt((String) listSplit$default.get(0));
            int i11 = Integer.parseInt((String) listSplit$default.get(1));
            return (((i11 * 60) + (i10 * 3600) + Integer.parseInt((String) listSplit$default.get(2))) * 1000) + (listSplit$default.size() == 4 ? Integer.parseInt((String) listSplit$default.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String trackerType, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(trackerType, "trackerType");
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((C4107ve) obj).f39775b, trackerType)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4107ve) it.next()).f39774a);
        }
        return arrayList3;
    }
}
