package com.google.android.gms.internal.play_billing;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzek {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zzej zzejVar) throws zzgc {
        int iZzi = zzi(bArr, i10, zzejVar);
        int i11 = zzejVar.zza;
        if (i11 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzi) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzejVar.zzc = zzev.zza;
            return iZzi;
        }
        zzejVar.zzc = zzev.zzk(bArr, iZzi, i11);
        return iZzi + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzhl zzhlVar, byte[] bArr, int i10, int i11, int i12, zzej zzejVar) throws IOException {
        Object objZze = zzhlVar.zze();
        int iZzm = zzm(objZze, zzhlVar, bArr, i10, i11, i12, zzejVar);
        zzhlVar.zzf(objZze);
        zzejVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzhl zzhlVar, byte[] bArr, int i10, int i11, zzej zzejVar) throws IOException {
        Object objZze = zzhlVar.zze();
        int iZzn = zzn(objZze, zzhlVar, bArr, i10, i11, zzejVar);
        zzhlVar.zzf(objZze);
        zzejVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzhl zzhlVar, int i10, byte[] bArr, int i11, int i12, zzfz zzfzVar, zzej zzejVar) throws IOException {
        int iZzd = zzd(zzhlVar, bArr, i11, i12, zzejVar);
        zzfzVar.add(zzejVar.zzc);
        while (iZzd < i12) {
            int iZzi = zzi(bArr, iZzd, zzejVar);
            if (i10 != zzejVar.zza) {
                break;
            }
            iZzd = zzd(zzhlVar, bArr, iZzi, i12, zzejVar);
            zzfzVar.add(zzejVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzfz zzfzVar, zzej zzejVar) throws IOException {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int iZzi = zzi(bArr, i10, zzejVar);
        int i11 = zzejVar.zza + iZzi;
        while (iZzi < i11) {
            iZzi = zzi(bArr, iZzi, zzejVar);
            zzfvVar.zzg(zzejVar.zza);
        }
        if (iZzi == i11) {
            return iZzi;
        }
        throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i10, zzej zzejVar) throws zzgc {
        int i11;
        int iZzi = zzi(bArr, i10, zzejVar);
        int i12 = zzejVar.zza;
        if (i12 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzejVar.zzc = "";
            return iZzi;
        }
        int i13 = zzin.zza;
        int length = bArr.length;
        if ((((length - iZzi) - i12) | iZzi | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzi), Integer.valueOf(i12)));
        }
        int i14 = iZzi + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iZzi < i14) {
            byte b10 = bArr[iZzi];
            if (!zzij.zzd(b10)) {
                break;
            }
            iZzi++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (iZzi < i14) {
            int i17 = iZzi + 1;
            byte b11 = bArr[iZzi];
            if (zzij.zzd(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                iZzi = i17;
                while (iZzi < i14) {
                    byte b12 = bArr[iZzi];
                    if (zzij.zzd(b12)) {
                        iZzi++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iZzi += 2;
                    zzij.zzc(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iZzi + 2;
                    iZzi += 3;
                    zzij.zzb(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = iZzi + 3;
                    byte b14 = bArr[iZzi + 2];
                    iZzi += 4;
                    zzij.zza(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        zzejVar.zzc = new String(cArr, 0, i16);
        return i14;
    }

    static int zzh(int i10, byte[] bArr, int i11, int i12, zzic zzicVar, zzej zzejVar) throws zzgc {
        if ((i10 >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzl = zzl(bArr, i11, zzejVar);
            zzicVar.zzj(i10, Long.valueOf(zzejVar.zzb));
            return iZzl;
        }
        if (i13 == 1) {
            zzicVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzi = zzi(bArr, i11, zzejVar);
            int i14 = zzejVar.zza;
            if (i14 < 0) {
                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzi) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzicVar.zzj(i10, zzev.zza);
            } else {
                zzicVar.zzj(i10, zzev.zzk(bArr, iZzi, i14));
            }
            return iZzi + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzgc("Protocol message contained an invalid tag (zero).");
            }
            zzicVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzic zzicVarZzf = zzic.zzf();
        int i16 = zzejVar.zze + 1;
        zzejVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzi2 = zzi(bArr, i11, zzejVar);
            int i18 = zzejVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZzi2;
                break;
            }
            i11 = zzh(i18, bArr, iZzi2, i12, zzicVarZzf, zzejVar);
            i17 = i18;
        }
        zzejVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzgc("Failed to parse the message.");
        }
        zzicVar.zzj(i10, zzicVarZzf);
        return i11;
    }

    static int zzi(byte[] bArr, int i10, zzej zzejVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzejVar);
        }
        zzejVar.zza = b10;
        return i11;
    }

    static int zzj(int i10, byte[] bArr, int i11, zzej zzejVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzejVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Ascii.DEL) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzejVar.zza = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzejVar.zza = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzejVar.zza = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzejVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zzk(int i10, byte[] bArr, int i11, int i12, zzfz zzfzVar, zzej zzejVar) {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int iZzi = zzi(bArr, i11, zzejVar);
        zzfvVar.zzg(zzejVar.zza);
        while (iZzi < i12) {
            int iZzi2 = zzi(bArr, iZzi, zzejVar);
            if (i10 != zzejVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzejVar);
            zzfvVar.zzg(zzejVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i10, zzej zzejVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzejVar.zzb = j10;
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
        zzejVar.zzb = j11;
        return i12;
    }

    static int zzm(Object obj, zzhl zzhlVar, byte[] bArr, int i10, int i11, int i12, zzej zzejVar) throws IOException {
        int i13 = zzejVar.zze + 1;
        zzejVar.zze = i13;
        zzq(i13);
        int iZzc = ((zzhe) zzhlVar).zzc(obj, bArr, i10, i11, i12, zzejVar);
        zzejVar.zze--;
        zzejVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzhl zzhlVar, byte[] bArr, int i10, int i11, zzej zzejVar) throws IOException {
        int iZzj = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzj = zzj(i12, bArr, iZzj, zzejVar);
            i12 = zzejVar.zza;
        }
        int i13 = iZzj;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzejVar.zze + 1;
        zzejVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zzhlVar.zzh(obj, bArr, i13, i15, zzejVar);
        zzejVar.zze--;
        zzejVar.zzc = obj;
        return i15;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzej zzejVar) throws zzgc {
        if ((i10 >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzl(bArr, i11, zzejVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzi(bArr, i11, zzejVar) + zzejVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzi(bArr, i11, zzejVar);
            i15 = zzejVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzo(i15, bArr, i11, i12, zzejVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzgc("Failed to parse the message.");
        }
        return i11;
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzq(int i10) throws zzgc {
        if (i10 >= zzb) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
