package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    @GwtIncompatible
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    private static Object[] d(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    static Object[] e(Collection collection) {
        return d(collection, new Object[collection.size()]);
    }

    static Object[] f(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = newArray(objArr, size);
        }
        d(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    static Object[] g(Object[] objArr, int i10, int i11, Object[] objArr2) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, objArr.length);
        if (objArr2.length < i11) {
            objArr2 = newArray(objArr2, i11);
        } else if (objArr2.length > i11) {
            objArr2[i11] = null;
        }
        System.arraycopy(objArr, i10, objArr2, 0, i11);
        return objArr2;
    }

    @GwtIncompatible
    public static <T> T[] newArray(Class<T> cls, int i10) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
    }

    public static <T> T[] newArray(T[] tArr, int i10) {
        return (T[]) Platform.c(tArr, i10);
    }

    public static <T> T[] concat(@ParametricNullness T t10, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t10;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @ParametricNullness T t10) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t10;
        return tArr2;
    }
}
