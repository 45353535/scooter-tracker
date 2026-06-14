package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zzga {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = zzey.zza;
        try {
            new zzew(bArr, 0, 0, false, null).zza(0);
        } catch (zzgc e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
