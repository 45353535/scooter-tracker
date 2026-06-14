package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f31 f111849a = new f31();

    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gi giVar = (gi) it.next();
            Object obj = giVar.f111215c;
            if (Intrinsics.areEqual(giVar.f111214b, "media") && (obj instanceof am1) && (list2 = ((am1) obj).f108721c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    this.f111849a.getClass();
                    if (f31.a((d31) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
