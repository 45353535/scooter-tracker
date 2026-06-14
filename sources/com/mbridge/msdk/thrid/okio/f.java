package com.mbridge.msdk.thrid.okio;

import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class f implements Serializable, Comparable<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char[] f51735d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f51736e = a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f51737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f51738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient String f51739c;

    f(byte[] bArr) {
        this.f51737a = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private f b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f51737a));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static f c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(u.f51780a));
        fVar.f51739c = str;
        return fVar;
    }

    public String d() {
        return b.a(this.f51737a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int iJ = fVar.j();
            byte[] bArr = this.f51737a;
            if (iJ == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        byte[] bArr = this.f51737a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f51735d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public f h() {
        return b(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public int hashCode() {
        int i10 = this.f51738b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f51737a);
        this.f51738b = iHashCode;
        return iHashCode;
    }

    public f i() {
        return b("SHA-256");
    }

    public int j() {
        return this.f51737a.length;
    }

    public f k() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f51737a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
            i10++;
        }
    }

    public byte[] l() {
        return (byte[]) this.f51737a.clone();
    }

    public String m() {
        String str = this.f51739c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f51737a, u.f51780a);
        this.f51739c = str2;
        return str2;
    }

    public String toString() {
        if (this.f51737a.length == 0) {
            return "[size=0]";
        }
        String strM = m();
        int iA = a(strM, 64);
        if (iA == -1) {
            if (this.f51737a.length <= 64) {
                return "[hex=" + g() + C4240b4.j.f42674e;
            }
            return "[size=" + this.f51737a.length + " hex=" + a(0, 64).g() + "…]";
        }
        String strReplace = strM.substring(0, iA).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
        if (iA >= strM.length()) {
            return "[text=" + strReplace + C4240b4.j.f42674e;
        }
        return "[size=" + this.f51737a.length + " text=" + strReplace + "…]";
    }

    public static f a(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((a(str.charAt(i11)) << 4) + a(str.charAt(i11 + 1)));
                }
                return a(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    public final boolean b(f fVar) {
        return a(0, fVar, 0, fVar.j());
    }

    private static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public f a(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f51737a;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f51737a.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte a(int i10) {
        return this.f51737a[i10];
    }

    void a(c cVar) {
        byte[] bArr = this.f51737a;
        cVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i10, f fVar, int i11, int i12) {
        return fVar.a(i11, this.f51737a, i10, i12);
    }

    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f51737a;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && u.a(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iJ = j();
        int iJ2 = fVar.j();
        int iMin = Math.min(iJ, iJ2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iA = a(i10) & 255;
            int iA2 = fVar.a(i10) & 255;
            if (iA != iA2) {
                return iA < iA2 ? -1 : 1;
            }
        }
        if (iJ == iJ2) {
            return 0;
        }
        return iJ < iJ2 ? -1 : 1;
    }

    static int a(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
