package io.sentry.util;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {
    public static long a() {
        byte[] bArr = new byte[8];
        b0.a().g(bArr);
        byte b10 = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | SignedBytes.MAX_POWER_OF_TWO);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return j10;
    }

    public static UUID b() {
        byte[] bArr = new byte[16];
        b0.a().g(bArr);
        byte b10 = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | SignedBytes.MAX_POWER_OF_TWO);
        byte b11 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | UnsignedBytes.MAX_POWER_OF_TWO);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | ((long) (bArr[i10] & 255));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return new UUID(j11, j10);
    }
}
