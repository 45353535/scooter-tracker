package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
final class IntArrayQueue {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int wrapAroundMask;
    private int headIndex = 0;
    private int tailIndex = -1;
    private int size = 0;
    private int[] data = new int[16];

    public IntArrayQueue() {
        this.wrapAroundMask = r0.length - 1;
    }

    private void doubleArraySize() {
        int[] iArr = this.data;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.headIndex;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.data, 0, iArr2, i11, i10);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = iArr2;
        this.wrapAroundMask = iArr2.length - 1;
    }

    public void add(int i10) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i11 = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i11;
        this.data[i11] = i10;
        this.size++;
    }

    public int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int remove() {
        int i10 = this.size;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.data;
        int i11 = this.headIndex;
        int i12 = iArr[i11];
        this.headIndex = (i11 + 1) & this.wrapAroundMask;
        this.size = i10 - 1;
        return i12;
    }

    public int size() {
        return this.size;
    }
}
