package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3314lq {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{90, SignedBytes.MAX_POWER_OF_TWO, 83, 76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A03(@CheckForNull Collection<?> collection, Object object) {
        AbstractC3162jA.A04(collection);
        try {
            return collection.contains(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A04(Collection<?> self, Collection<?> c10) {
        Iterator<?> it = c10.iterator();
        while (it.hasNext()) {
            if (!self.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder A01(int size) {
        AbstractC3309ll.A00(size, A00(0, 4, 3));
        return new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
    }
}
