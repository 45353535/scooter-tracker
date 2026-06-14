package com.google.common.util.concurrent;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AtomicLongArray f31344b;

    public AtomicDoubleArray(int i10) {
        this.f31344b = new AtomicLongArray(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i11 = 0; i11 < i10; i11++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f31344b = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i10 = 0; i10 < length; i10++) {
            objectOutputStream.writeDouble(get(i10));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i10, double d10) {
        while (true) {
            long j10 = this.f31344b.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10) + d10;
            int i11 = i10;
            if (this.f31344b.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final boolean compareAndSet(int i10, double d10, double d11) {
        return this.f31344b.compareAndSet(i10, Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    public final double get(int i10) {
        return Double.longBitsToDouble(this.f31344b.get(i10));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i10, double d10) {
        while (true) {
            long j10 = this.f31344b.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10);
            int i11 = i10;
            if (this.f31344b.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble + d10))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final double getAndSet(int i10, double d10) {
        return Double.longBitsToDouble(this.f31344b.getAndSet(i10, Double.doubleToRawLongBits(d10)));
    }

    public final void lazySet(int i10, double d10) {
        this.f31344b.lazySet(i10, Double.doubleToRawLongBits(d10));
    }

    public final int length() {
        return this.f31344b.length();
    }

    public final void set(int i10, double d10) {
        this.f31344b.set(i10, Double.doubleToRawLongBits(d10));
    }

    public String toString() {
        int length = length();
        int i10 = length - 1;
        if (i10 == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length * 19);
        sb2.append('[');
        int i11 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f31344b.get(i11)));
            if (i11 == i10) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(',');
            sb2.append(' ');
            i11++;
        }
    }

    public final boolean weakCompareAndSet(int i10, double d10, double d11) {
        return this.f31344b.weakCompareAndSet(i10, Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = Double.doubleToRawLongBits(dArr[i10]);
        }
        this.f31344b = new AtomicLongArray(jArr);
    }
}
