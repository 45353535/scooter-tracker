package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ef extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1965 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1966;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1967 = {'-', '.'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f1968;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f1969;

    ef(ed edVar, ed edVar2, dm dmVar) {
        super(dmVar);
        this.f1968 = edVar;
        this.f1969 = edVar2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6439(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1967, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f1965 + 115;
            f1966 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ef efVar = (ef) obj;
            ed edVar = this.f1968;
            if (edVar == null ? efVar.f1968 != null : !edVar.equals(efVar.f1968)) {
                return false;
            }
            ed edVar2 = this.f1969;
            if (edVar2 != null) {
                int i11 = f1965 + 5;
                f1966 = i11 % 128;
                int i12 = i11 % 2;
                boolean zEquals = edVar2.equals(efVar.f1969);
                if (i12 != 0) {
                    int i13 = 67 / 0;
                }
                return zEquals;
            }
            if (efVar.f1969 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = f1966 + 51;
        f1965 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ed edVar = this.f1968;
        int iHashCode = 0;
        int iHashCode2 = (edVar != null ? edVar.hashCode() : 0) * 31;
        ed edVar2 = this.f1969;
        if (edVar2 != null) {
            f1965 = (f1966 + 89) % 128;
            iHashCode = edVar2.hashCode();
        } else {
            f1965 = (f1966 + 107) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6441().toString());
        sb2.append(m6439(new int[]{0, 1, 0, 1}, "\u0001", false).intern());
        sb2.append(m6440().toString());
        sb2.append(m6439(new int[]{1, 1, 0, 1}, "\u0001", true).intern());
        String string = sb2.toString();
        f1965 = (f1966 + 13) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final ed m6440() {
        int i10 = f1965 + 73;
        f1966 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1969;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final ed m6441() {
        int i10 = f1965 + 119;
        f1966 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1968;
        }
        int i11 = 1 / 0;
        return this.f1968;
    }
}
