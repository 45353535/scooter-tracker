package com.google.android.gms.internal.ads;

import com.amazon.device.ads.DtbConstants;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
final class zzier {
    private static final zzieo zza;

    static {
        if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) {
            if (zziem.zza() && zziem.zzb()) {
                int i10 = zziaa.zza;
            }
        }
        zza = new zziep();
    }

    static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    static boolean zzb(byte[] bArr, int i10, int i11) {
        return zza.zza(bArr, i10, i11);
    }

    static int zzc(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                try {
                    int length2 = str.length();
                    while (i11 < length2) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 < 2048) {
                            i10 += (127 - cCharAt2) >>> 31;
                        } else {
                            i10 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i11) < 65536) {
                                    throw new zzieq(i11, length2);
                                }
                                i11++;
                            }
                        }
                        i11++;
                    }
                    i12 += i10;
                } catch (zzieq unused) {
                    return str.getBytes(zzice.zza).length;
                }
            }
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = ((long) i12) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int zzd(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i13 = i15 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzieo.zzc(str, bArr, i10, i11);
                    }
                    i15++;
                    if (i15 != str.length()) {
                        char cCharAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i17 = i16 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzieo.zzc(str, bArr, i10, i11);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    static String zze(byte[] bArr, int i10, int i11) throws zzicg {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i13 = i10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (i10 < i13) {
            byte b10 = bArr[i10];
            if (!zzien.zza(b10)) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (i10 < i13) {
            int i16 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzien.zza(b11)) {
                cArr[i15] = (char) b11;
                i15++;
                i10 = i16;
                while (i10 < i13) {
                    byte b12 = bArr[i10];
                    if (zzien.zza(b12)) {
                        i10++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i16 >= i13) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    i10 += 2;
                    zzien.zzb(b11, bArr[i16], cArr, i15);
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    int i17 = i10 + 2;
                    i10 += 3;
                    zzien.zzc(b11, bArr[i16], bArr[i17], cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zzicg("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i16];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    zzien.zzd(b11, b13, b14, bArr[i18], cArr, i15);
                    i15 += 2;
                }
                i15 = i12;
            }
        }
        return new String(cArr, 0, i15);
    }

    static /* synthetic */ int zzf(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << Ascii.DLE) ^ ((b12 << 8) ^ b10);
    }
}
