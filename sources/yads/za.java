package yads;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class za {
    public static String a(ya yaVar) {
        ArrayList arrayList = new ArrayList();
        if (!StringsKt.y0(yaVar.a())) {
            arrayList.add(yaVar.a());
        }
        if (!StringsKt.y0(yaVar.b())) {
            arrayList.add("erid: " + yaVar.b());
        }
        return CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
