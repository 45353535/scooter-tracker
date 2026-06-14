package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final class t3 extends w3 {
    public t3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        if (x3.f23634h) {
            x3.a(obj, j10, b10);
        } else {
            x3.b(obj, j10, b10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return Double.longBitsToDouble(this.f23615a.getLong(obj, j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f23615a.getInt(obj, j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return x3.f23634h ? x3.a(obj, j10) : x3.b(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return x3.f23634h ? x3.a(obj, j10) != 0 : x3.b(obj, j10) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        if (x3.f23634h) {
            x3.a(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            x3.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f23615a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f23615a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        throw new UnsupportedOperationException();
    }
}
