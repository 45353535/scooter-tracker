package com.fyber.inneractive.sdk.protobuf;

import com.amazon.device.ads.DtbConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class c4 extends z3 {
    public static int a(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            z3 z3Var = d4.f23458a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return d4.a(i10, x3.f23629c.b(bArr, x3.f23632f + j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        w3 w3Var = x3.f23629c;
        long j11 = x3.f23632f;
        return d4.a(i10, w3Var.b(bArr, j11 + j10), w3Var.b(bArr, j10 + 1 + j11));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long j10 = x3.f23629c.f23615a.getLong(byteBuffer, x3.f23633g) + ((long) i10);
        long j11 = ((long) i11) + j10;
        char[] cArr = new char[i11];
        int i12 = 0;
        while (j10 < j11) {
            byte bA = x3.f23629c.a(j10);
            if (!y3.a(bA)) {
                break;
            }
            j10++;
            cArr[i12] = (char) bA;
            i12++;
        }
        int i13 = i12;
        while (j10 < j11) {
            long j12 = j10 + 1;
            w3 w3Var = x3.f23629c;
            byte bA2 = w3Var.a(j10);
            if (y3.a(bA2)) {
                cArr[i13] = (char) bA2;
                i13++;
                j10 = j12;
                while (j10 < j11) {
                    byte bA3 = x3.f23629c.a(j10);
                    if (!y3.a(bA3)) {
                        break;
                    }
                    j10++;
                    cArr[i13] = (char) bA3;
                    i13++;
                }
            } else if (bA2 < -32) {
                if (j12 >= j11) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                j10 += 2;
                y3.a(bA2, w3Var.a(j12), cArr, i13);
                i13++;
            } else if (bA2 < -16) {
                if (j12 >= j11 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                long j13 = j10 + 2;
                j10 += 3;
                y3.a(bA2, w3Var.a(j12), w3Var.a(j13), cArr, i13);
                i13++;
            } else {
                if (j12 >= j11 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte bA4 = w3Var.a(j12);
                long j14 = j10 + 3;
                byte bA5 = w3Var.a(j10 + 2);
                j10 += 4;
                y3.a(bA2, bA4, bA5, w3Var.a(j14), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
    
        return r7;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.c4.c(byte[], int, int):int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i10, int i11) throws n1 {
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        int i16 = 1;
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i17 = i10 + i11;
            char[] cArr = new char[i11];
            int i18 = i10;
            int i19 = 0;
            while (i18 < i17) {
                byte b10 = x3.f23629c.b(bArr, x3.f23632f + ((long) i18));
                if (!y3.a(b10)) {
                    break;
                }
                i18++;
                cArr[i19] = (char) b10;
                i19++;
            }
            int i20 = i19;
            while (i18 < i17) {
                int i21 = i18 + 1;
                w3 w3Var = x3.f23629c;
                long j10 = x3.f23632f;
                byte b11 = w3Var.b(bArr, ((long) i18) + j10);
                if (y3.a(b11)) {
                    cArr[i20] = (char) b11;
                    i20++;
                    i18 = i21;
                    while (i18 < i17) {
                        byte b12 = x3.f23629c.b(bArr, x3.f23632f + ((long) i18));
                        if (!y3.a(b12)) {
                            break;
                        }
                        i18 += i16;
                        cArr[i20] = (char) b12;
                        i20++;
                    }
                } else {
                    if (b11 >= -32) {
                        i12 = i15;
                        i13 = i16;
                        if (b11 < -16) {
                            if (i21 < i17 - 1) {
                                int i22 = i18 + 2;
                                i18 += 3;
                                i14 = i20 + 1;
                                y3.a(b11, w3Var.b(bArr, ((long) i21) + j10), w3Var.b(bArr, j10 + ((long) i22)), cArr, i20);
                            } else {
                                throw new n1("Protocol message had invalid UTF-8.");
                            }
                        } else if (i21 < i17 - 2) {
                            byte b13 = w3Var.b(bArr, ((long) i21) + j10);
                            int i23 = i18 + 3;
                            byte b14 = w3Var.b(bArr, ((long) (i18 + 2)) + j10);
                            i18 += 4;
                            y3.a(b11, b13, b14, w3Var.b(bArr, j10 + ((long) i23)), cArr, i20);
                            i20 += 2;
                            i15 = i12;
                            i16 = i13;
                            i17 = i17;
                        } else {
                            throw new n1("Protocol message had invalid UTF-8.");
                        }
                    } else if (i21 < i17) {
                        i18 += i15;
                        i12 = i15;
                        i13 = i16;
                        byte b15 = w3Var.b(bArr, j10 + ((long) i21));
                        i14 = i20 + 1;
                        y3.a(b11, b15, cArr, i20);
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                    i20 = i14;
                    i15 = i12;
                    i16 = i13;
                }
            }
            return new String(cArr, 0, i20);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i12;
        char cCharAt;
        long j14 = i10;
        long j15 = ((long) i11) + j14;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            x3.f23629c.a((Object) bArr, x3.f23632f + j14, (byte) cCharAt);
            i13++;
            j14 = 1 + j14;
        }
        if (i13 == length) {
            return (int) j14;
        }
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 >= 128 || j14 >= j15) {
                j11 = j10;
                if (cCharAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j15;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j12 - 3) {
                        if (j14 <= j12 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char cCharAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    w3 w3Var = x3.f23629c;
                                    long j16 = x3.f23632f;
                                    w3Var.a((Object) bArr, j16 + j14, (byte) ((codePoint >>> 18) | 240));
                                    w3Var.a((Object) bArr, j16 + j14 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j17 = j14 + 3;
                                    w3Var.a((Object) bArr, j16 + j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j14 += 4;
                                    w3Var.a((Object) bArr, j16 + j17, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new b4(i13 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new b4(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                    }
                    byte b10 = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                    w3 w3Var2 = x3.f23629c;
                    long j18 = x3.f23632f;
                    w3Var2.a((Object) bArr, j18 + j14, b10);
                    w3Var2.a((Object) bArr, j18 + j14 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    w3Var2.a((Object) bArr, j18 + j14 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j13 = j14 + 3;
                } else {
                    long j19 = j14 + j11;
                    w3 w3Var3 = x3.f23629c;
                    long j20 = x3.f23632f;
                    j12 = j15;
                    w3Var3.a((Object) bArr, j20 + j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    w3Var3.a((Object) bArr, j20 + j19, (byte) ((cCharAt2 & '?') | 128));
                }
                i13++;
                j10 = j11;
                j15 = j12;
            } else {
                j13 = j14 + j10;
                j11 = j10;
                x3.f23629c.a((Object) bArr, x3.f23632f + j14, (byte) cCharAt2);
                j12 = j15;
            }
            j14 = j13;
            i13++;
            j10 = j11;
            j15 = j12;
        }
        return (int) j14;
    }
}
