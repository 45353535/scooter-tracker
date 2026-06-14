package com.bytedance.sdk.component.ud.qdl.ud;

import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements Serializable, Comparable<mml> {
    final byte[] mml;
    transient String mo;
    transient int mzz;
    static final char[] qdl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final Charset f16710ud = Charset.forName("UTF-8");
    public static final mml lnr = qdl(new byte[0]);

    mml(byte[] bArr) {
        this.mml = bArr;
    }

    public static mml qdl(byte... bArr) {
        if (bArr != null) {
            return new mml((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mml) {
            mml mmlVar = (mml) obj;
            int iLnr = mmlVar.lnr();
            byte[] bArr = this.mml;
            if (iLnr == bArr.length && mmlVar.qdl(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.mzz;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.mml);
        this.mzz = iHashCode;
        return iHashCode;
    }

    public int lnr() {
        return this.mml.length;
    }

    public byte[] mml() {
        return (byte[]) this.mml.clone();
    }

    public String toString() {
        if (this.mml.length == 0) {
            return "[size=0]";
        }
        String strQdl = qdl();
        int iQdl = qdl(strQdl, 64);
        if (iQdl == -1) {
            if (this.mml.length <= 64) {
                return "[hex=" + ud() + C4240b4.j.f42674e;
            }
            return "[size=" + this.mml.length + " hex=" + qdl(0, 64).ud() + "…]";
        }
        String strReplace = strQdl.substring(0, iQdl).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
        if (iQdl >= strQdl.length()) {
            return "[text=" + strReplace + C4240b4.j.f42674e;
        }
        return "[size=" + this.mml.length + " text=" + strReplace + "…]";
    }

    public String ud() {
        byte[] bArr = this.mml;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = qdl;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public String qdl() {
        String str = this.mo;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.mml, f16710ud);
        this.mo = str2;
        return str2;
    }

    public mml qdl(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.mml;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.mml.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new mml(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte qdl(int i10) {
        return this.mml[i10];
    }

    public boolean qdl(int i10, mml mmlVar, int i11, int i12) {
        return mmlVar.qdl(i11, this.mml, i10, i12);
    }

    public boolean qdl(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.mml;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && tvp.qdl(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(mml mmlVar) {
        int iLnr = lnr();
        int iLnr2 = mmlVar.lnr();
        int iMin = Math.min(iLnr, iLnr2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iQdl = qdl(i10) & 255;
            int iQdl2 = mmlVar.qdl(i10) & 255;
            if (iQdl != iQdl2) {
                return iQdl < iQdl2 ? -1 : 1;
            }
        }
        if (iLnr == iLnr2) {
            return 0;
        }
        return iLnr < iLnr2 ? -1 : 1;
    }

    static int qdl(String str, int i10) {
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
