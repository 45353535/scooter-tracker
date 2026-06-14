package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbeo extends zzbeg {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbeo(int i10) {
        int i11 = i10 >> 3;
        this.zzc = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i10 = this.zzc;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.zzd & 7;
                if (i11 > 0) {
                    long j10 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i12] & 255);
                    }
                    long j11 = j10 >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
