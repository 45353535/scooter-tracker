package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by1 f116418a;

    public /* synthetic */ tz1() {
        this(new by1());
    }

    public static ArrayList b(qz1 qz1Var) {
        List list = qz1Var.f115232a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((rw1) it.next()).f115625c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(qz1 qz1Var) {
        List<rw1> list = qz1Var.f115232a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (rw1 rw1Var : list) {
            cj cjVar = this.f116418a.f109144a;
            List list2 = rw1Var.f115624b;
            cjVar.getClass();
            Set setA = cj.a(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String str = ((d31) it.next()).f109734d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList.add(CollectionsKt.toList(arrayList3));
        }
        return CollectionsKt.flatten(arrayList);
    }

    public tz1(by1 by1Var) {
        this.f116418a = by1Var;
    }
}
