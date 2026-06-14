package yads;

import androidx.collection.SieveCacheKt;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ec1 extends fc1 {
    public static int a(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalArgumentException(x13.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(long j10) {
        if (j10 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j10 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof dc1) {
            return ((dc1) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
