package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class kk2 {
    public static Object a(Class cls, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = objArrCopyOf.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return jk2.a(null, cls, str, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(objArr, objArr.length));
            }
            Object obj = objArrCopyOf[i10];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
    }
}
