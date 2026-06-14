package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zziab zziabVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzb(b10, bArr, i11, zziabVar);
        }
        zziabVar.zza = b10;
        return i11;
    }

    static int zzb(int i10, byte[] bArr, int i11, zziab zziabVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zziabVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Ascii.DEL) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zziabVar.zza = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zziabVar.zza = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zziabVar.zza = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zziabVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zzc(byte[] bArr, int i10, zziab zziabVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zziabVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Ascii.DEL)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Ascii.DEL)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zziabVar.zzb = j11;
        return i12;
    }

    static int zzd(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long zze(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    static int zzf(byte[] bArr, int i10, zziab zziabVar) throws zzicg {
        int iZza = zza(bArr, i10, zziabVar);
        int i11 = zziabVar.zza;
        if (i11 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zziabVar.zzc = "";
            return iZza;
        }
        zziabVar.zzc = zzier.zze(bArr, iZza, i11);
        return iZza + i11;
    }

    static int zzg(byte[] bArr, int i10, zziab zziabVar) throws zzicg {
        int iZza = zza(bArr, i10, zziabVar);
        int i11 = zziabVar.zza;
        if (i11 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZza) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zziabVar.zzc = zzian.zza;
            return iZza;
        }
        zziabVar.zzc = zzian.zzs(bArr, iZza, i11);
        return iZza + i11;
    }

    static int zzh(zzidu zziduVar, byte[] bArr, int i10, int i11, zziab zziabVar) throws IOException {
        Object objZza = zziduVar.zza();
        int iZzj = zzj(objZza, zziduVar, bArr, i10, i11, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zzidu zziduVar, byte[] bArr, int i10, int i11, int i12, zziab zziabVar) throws IOException {
        Object objZza = zziduVar.zza();
        int iZzk = zzk(objZza, zziduVar, bArr, i10, i11, i12, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzk;
    }

    static int zzj(Object obj, zzidu zziduVar, byte[] bArr, int i10, int i11, zziab zziabVar) throws IOException {
        int iZzb = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzb = zzb(i12, bArr, iZzb, zziabVar);
            i12 = zziabVar.zza;
        }
        int i13 = iZzb;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zziabVar.zze + 1;
        zziabVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zziduVar.zzj(obj, bArr, i13, i15, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return i15;
    }

    static int zzk(Object obj, zzidu zziduVar, byte[] bArr, int i10, int i11, int i12, zziab zziabVar) throws IOException {
        int i13 = zziabVar.zze + 1;
        zziabVar.zze = i13;
        zzq(i13);
        int iZzi = ((zzidf) zziduVar).zzi(obj, bArr, i10, i11, i12, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return iZzi;
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i11, zziabVar);
        zzibsVar.zzi(zziabVar.zza);
        while (iZza < i12) {
            int iZza2 = zza(bArr, iZza, zziabVar);
            if (i10 != zziabVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i10, zzicd zzicdVar, zziab zziabVar) throws IOException {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i10, zziabVar);
        int i11 = zziabVar.zza + iZza;
        while (iZza < i11) {
            iZza = zza(bArr, iZza, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        if (iZza == i11) {
            return iZza;
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzidu zziduVar, int i10, byte[] bArr, int i11, int i12, zzicd zzicdVar, zziab zziabVar) throws IOException {
        int iZzh = zzh(zziduVar, bArr, i11, i12, zziabVar);
        zzicdVar.add(zziabVar.zzc);
        while (iZzh < i12) {
            int iZza = zza(bArr, iZzh, zziabVar);
            if (i10 != zziabVar.zza) {
                break;
            }
            iZzh = zzh(zziduVar, bArr, iZza, i12, zziabVar);
            zzicdVar.add(zziabVar.zzc);
        }
        return iZzh;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzieg zziegVar, zziab zziabVar) throws zzicg {
        if ((i10 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzc = zzc(bArr, i11, zziabVar);
            zziegVar.zzk(i10, Long.valueOf(zziabVar.zzb));
            return iZzc;
        }
        if (i13 == 1) {
            zziegVar.zzk(i10, Long.valueOf(zze(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZza = zza(bArr, i11, zziabVar);
            int i14 = zziabVar.zza;
            if (i14 < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZza) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zziegVar.zzk(i10, zzian.zza);
            } else {
                zziegVar.zzk(i10, zzian.zzs(bArr, iZza, i14));
            }
            return iZza + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzicg("Protocol message contained an invalid tag (zero).");
            }
            zziegVar.zzk(i10, Integer.valueOf(zzd(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzieg zziegVarZzb = zzieg.zzb();
        int i16 = zziabVar.zze + 1;
        zziabVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZza2 = zza(bArr, i11, zziabVar);
            int i18 = zziabVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZza2;
                break;
            }
            i11 = zzo(i18, bArr, iZza2, i12, zziegVarZzb, zziabVar);
            i17 = i18;
        }
        zziabVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzicg("Failed to parse the message.");
        }
        zziegVar.zzk(i10, zziegVarZzb);
        return i11;
    }

    static int zzp(int i10, byte[] bArr, int i11, int i12, zziab zziabVar) throws zzicg {
        if ((i10 >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzc(bArr, i11, zziabVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zza(bArr, i11, zziabVar) + zziabVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zza(bArr, i11, zziabVar);
            i15 = zziabVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zziabVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzicg("Failed to parse the message.");
        }
        return i11;
    }

    private static void zzq(int i10) throws zzicg {
        if (i10 >= zzb) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
