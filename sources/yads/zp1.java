package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq1 f118755a;

    public zp1(aq1 aq1Var) {
        this.f118755a = aq1Var;
    }

    public final ArrayList a(List list) {
        tp1 tp1Var;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t70 t70Var = (t70) it.next();
            List<String> list2 = t70Var.f116099e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str : list2) {
                List listX0 = StringsKt.X0(str, new char[]{'.'}, false, 0, 6, null);
                String str2 = (String) CollectionsKt.getOrNull(listX0, CollectionsKt.getLastIndex(listX0) - 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new ap1(str2, str));
            }
            String str3 = t70Var.f116096b;
            String str4 = t70Var.f116095a;
            if (str4 != null) {
                tp1.f116316c.getClass();
                tp1Var = (tp1) tp1.f116317d.get(str4);
                if (tp1Var == null) {
                    tp1Var = tp1.f116337x;
                }
            } else {
                tp1Var = tp1.f116337x;
            }
            arrayList.add(new bp1(str3, tp1Var, arrayList2));
        }
        return this.f118755a.a(arrayList);
    }
}
