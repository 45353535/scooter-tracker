package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzieo {
    zzieo() {
    }

    protected static final int zzc(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(zzice.zza);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }

    final boolean zza(byte[] bArr, int i10, int i11) {
        return zzb(0, bArr, i10, i11) == 0;
    }

    protected abstract int zzb(int i10, byte[] bArr, int i11, int i12);
}
