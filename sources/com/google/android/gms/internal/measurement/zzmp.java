package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmp {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = zzlj.zza;
        try {
            new zzli(bArr, 0, 0, false, null).zza(0);
        } catch (zzmr e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int zzb(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzc(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static boolean zzd(zznm zznmVar) {
        if (zznmVar instanceof zzkt) {
            throw null;
        }
        return false;
    }
}
