package ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 {
    private static final void b(ze.x xVar, ze.x xVar2) {
        for (String str : xVar2.names()) {
            List listA = xVar2.a(str);
            if (listA == null) {
                listA = CollectionsKt.emptyList();
            }
            String strK = f.k(str, 0, 0, false, null, 15, null);
            List list = listA;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            xVar.c(strK, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ze.x xVar, ze.w wVar) {
        for (String str : wVar.names()) {
            List listA = wVar.a(str);
            if (listA == null) {
                listA = CollectionsKt.emptyList();
            }
            String strM = f.m(str, false, 1, null);
            List list = listA;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.o((String) it.next()));
            }
            xVar.c(strM, arrayList);
        }
    }

    public static final g0 d(ze.x parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        h0 h0VarB = k0.b(0, 1, null);
        b(h0VarB, parameters);
        return h0VarB.build();
    }

    public static final h0 e(ze.w parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        h0 h0VarB = k0.b(0, 1, null);
        c(h0VarB, parameters);
        return h0VarB;
    }
}
