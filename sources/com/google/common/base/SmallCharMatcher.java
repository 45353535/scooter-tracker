package com.google.common.base;

import androidx.collection.ScatterMapKt;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f28931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28933e;

    private SmallCharMatcher(char[] cArr, long j10, boolean z10, String str) {
        super(str);
        this.f28931c = cArr;
        this.f28933e = j10;
        this.f28932d = z10;
    }

    private boolean i(int i10) {
        return 1 == ((this.f28933e >> i10) & 1);
    }

    static int j(int i10) {
        if (i10 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < i10) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static CharMatcher k(BitSet bitSet, String str) {
        int i10;
        int iCardinality = bitSet.cardinality();
        boolean z10 = bitSet.get(0);
        int iJ = j(iCardinality);
        char[] cArr = new char[iJ];
        int i11 = iJ - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j10 = 0;
        while (iNextSetBit != -1) {
            long j11 = (1 << iNextSetBit) | j10;
            int iL = l(iNextSetBit);
            while (true) {
                i10 = iL & i11;
                if (cArr[i10] == 0) {
                    break;
                }
                iL = i10 + 1;
            }
            cArr[i10] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j10 = j11;
        }
        return new SmallCharMatcher(cArr, j10, z10, str);
    }

    static int l(int i10) {
        return Integer.rotateLeft(i10 * ScatterMapKt.MurmurHashC1, 15) * 461845907;
    }

    @Override // com.google.common.base.CharMatcher
    void g(BitSet bitSet) {
        if (this.f28932d) {
            bitSet.set(0);
        }
        for (char c10 : this.f28931c) {
            if (c10 != 0) {
                bitSet.set(c10);
            }
        }
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c10) {
        if (c10 == 0) {
            return this.f28932d;
        }
        if (!i(c10)) {
            return false;
        }
        int length = this.f28931c.length - 1;
        int iL = l(c10) & length;
        int i10 = iL;
        do {
            char c11 = this.f28931c[i10];
            if (c11 == 0) {
                return false;
            }
            if (c11 == c10) {
                return true;
            }
            i10 = (i10 + 1) & length;
        } while (i10 != iL);
        return false;
    }
}
