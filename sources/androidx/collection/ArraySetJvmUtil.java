package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    static <T> T[] resizeForToArray(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
