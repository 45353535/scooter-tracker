package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f30831d = 0;
        this.f30829b = null;
        this.f30830c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long j10) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f30829b;
        if (cellArr == null) {
            long j11 = this.f30830c;
            if (g(j11, j11 + j10)) {
                return;
            }
        }
        int[] iArr = (int[]) Striped64.f30823e.get();
        boolean zA = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) >= 1 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j12 = cell.f30834a;
            zA = cell.a(j12, j12 + j10);
            if (zA) {
                return;
            }
        }
        l(j10, iArr, zA);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // com.google.common.hash.Striped64
    final long i(long j10, long j11) {
        return j10 + j11;
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        k(0L);
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
        long j10 = this.f30830c;
        Striped64.Cell[] cellArr = this.f30829b;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j10 += cell.f30834a;
                }
            }
        }
        return j10;
    }

    public long sumThenReset() {
        long j10 = this.f30830c;
        Striped64.Cell[] cellArr = this.f30829b;
        this.f30830c = 0L;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j10 += cell.f30834a;
                    cell.f30834a = 0L;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
