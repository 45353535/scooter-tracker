package com.startapp.simple.bloomfilter.algo;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class OpenBitSet implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PAGE_COUNT_LIMIT = 100;
    public static final int PAGE_SIZE = 4096;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    public OpenBitSet(long j10) {
        int iBits2words = bits2words(j10);
        this.wlen = iBits2words;
        int i10 = iBits2words % 4096;
        int i11 = iBits2words / 4096;
        int i12 = (i10 == 0 ? 0 : 1) + i11;
        this.pageCount = i12;
        if (i12 > 100) {
            throw new RuntimeException("HighPageCountException pageCount = " + i12);
        }
        this.bits = new long[i12][];
        for (int i13 = 0; i13 < i11; i13++) {
            this.bits[i13] = new long[4096];
        }
        if (i10 != 0) {
            long[][] jArr = this.bits;
            jArr[jArr.length - 1] = new long[i10];
        }
    }

    private int bits2words(long j10) {
        return (int) (((j10 - 1) >>> 6) + 1);
    }

    private void ensureCapacity(long j10) {
        ensureCapacityWords(bits2words(j10));
    }

    private void ensureCapacityWords(int i10) {
    }

    private int expandingWordNum(long j10) {
        int i10 = (int) (j10 >> 6);
        if (i10 >= this.wlen) {
            ensureCapacity(j10 + 1);
            this.wlen = i10 + 1;
        }
        return i10;
    }

    public int getNumWords() {
        return this.wlen;
    }

    public long[] getPage(int i10) {
        return this.bits[i10];
    }

    public int getPageCount() {
        return this.pageCount;
    }

    boolean indexInBits(long j10) {
        int i10 = (int) (j10 >> 6);
        return i10 < this.wlen && ((1 << (((int) j10) & 63)) & this.bits[i10 / 4096][i10 % 4096]) != 0;
    }

    void set(long j10) {
        int iExpandingWordNum = expandingWordNum(j10);
        long[] jArr = this.bits[iExpandingWordNum / 4096];
        int i10 = iExpandingWordNum % 4096;
        jArr[i10] = (1 << (((int) j10) & 63)) | jArr[i10];
    }

    long size() {
        return ((long) this.wlen) << 6;
    }
}
