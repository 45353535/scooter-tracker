package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import c9.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        k.b bVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bVar.add(arrayList.get(i10).freeze());
        }
        return bVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        k.b bVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            bVar.add(it.next().freeze());
        }
        return bVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        k.b bVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            bVar.add(e10.freeze());
        }
        return bVar;
    }
}
