package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f76745a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f76745a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Yc) it.next()).a());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return CollectionsKt.distinct(arrayList);
    }

    public final synchronized void a(Yc... ycArr) {
        CollectionsKt.addAll(this.f76745a, ycArr);
    }
}
