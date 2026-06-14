package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public abstract class be1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        uw.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(ec1.b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
