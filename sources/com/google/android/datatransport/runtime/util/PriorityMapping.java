package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class PriorityMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f24617a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f24618b;

    static {
        HashMap map = new HashMap();
        f24618b = map;
        map.put(Priority.DEFAULT, 0);
        f24618b.put(Priority.VERY_LOW, 1);
        f24618b.put(Priority.HIGHEST, 2);
        for (Priority priority : f24618b.keySet()) {
            f24617a.append(((Integer) f24618b.get(priority)).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = (Integer) f24618b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority valueOf(int i10) {
        Priority priority = (Priority) f24617a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
