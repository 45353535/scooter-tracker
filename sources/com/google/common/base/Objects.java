package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Objects extends ExtraObjectsMethodsForWeb {
    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
