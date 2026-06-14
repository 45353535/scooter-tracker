package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class dr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1861 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1862 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1863 = {17};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1864;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1865;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f1866;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1867;

    public dr(Object obj) {
        this.f1866 = obj;
    }

    public final String toString() {
        int i10 = f1861 + 41;
        f1862 = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z10 = this.f1866 instanceof String;
            throw null;
        }
        if (this.f1866 instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6373(new int[]{0, 1, 0, 1}, "\u0000", true).intern());
            sb2.append(this.f1866);
            sb2.append(m6373(new int[]{0, 1, 0, 1}, "\u0000", true).intern());
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f1866);
        String string = sb3.toString();
        int i11 = f1862 + 55;
        f1861 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 46 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6374() {
        int i10 = (f1862 + 87) % 128;
        f1861 = i10;
        boolean z10 = this.f1867;
        f1862 = (i10 + 41) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final dr m6375() {
        int i10 = f1862 + 17;
        f1861 = i10 % 128;
        this.f1867 = i10 % 2 == 0;
        return this;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dr m6376() {
        int i10 = f1862 + 73;
        int i11 = i10 % 128;
        f1861 = i11;
        this.f1865 = i10 % 2 == 0;
        int i12 = i11 + 85;
        f1862 = i12 % 128;
        if (i12 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m6377() {
        int i10 = f1862;
        Object obj = this.f1866;
        f1861 = (i10 + 93) % 128;
        return obj;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Number m6378() {
        Object obj = this.f1866;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            f1861 = (f1862 + 39) % 128;
            return num;
        }
        if (obj instanceof Long) {
            f1862 = (f1861 + 103) % 128;
            return (Long) obj;
        }
        if (obj instanceof Double) {
            f1862 = (f1861 + 9) % 128;
            return (Double) obj;
        }
        int i10 = f1862 + 33;
        f1861 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6379() {
        Object obj = this.f1866;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 0) {
                return true;
            }
            f1862 = (f1861 + 35) % 128;
            return false;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            f1861 = (f1862 + 3) % 128;
            return true;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        f1862 = (f1861 + 97) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6381() {
        int i10 = f1861;
        boolean z10 = this.f1864;
        int i11 = i10 + 43;
        f1862 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6382() {
        int i10 = f1861;
        boolean z10 = this.f1865;
        f1862 = (i10 + 35) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr m6380(boolean z10) {
        int i10 = f1862;
        int i11 = i10 + 115;
        f1861 = i11 % 128;
        if (i11 % 2 != 0) {
            this.f1864 = z10;
            throw null;
        }
        this.f1864 = z10;
        int i12 = i10 + 89;
        f1861 = i12 % 128;
        if (i12 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6373(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1863, i10, cArr, 0, i11);
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
}
