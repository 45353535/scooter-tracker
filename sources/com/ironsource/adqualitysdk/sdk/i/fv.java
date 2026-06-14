package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class fv extends fr {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2125 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2126 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2127 = -1968232721142834159L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2128;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2129;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr f2130;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2131;

    public fv(ed edVar, fr frVar) {
        this.f2131 = edVar;
        this.f2130 = frVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6491(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2127) ^ ((long) f2128)) ^ ((long) f2129));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2125 = (f2126 + 31) % 128;
            return true;
        }
        if (obj != null && fv.class == obj.getClass()) {
            fv fvVar = (fv) obj;
            ed edVar = this.f2131;
            if (edVar == null ? fvVar.f2131 != null : !edVar.equals(fvVar.f2131)) {
                return false;
            }
            fr frVar = this.f2130;
            if (frVar != null) {
                f2125 = (f2126 + 49) % 128;
                return frVar.equals(fvVar.f2130);
            }
            if (fvVar.f2130 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f2131;
        int iHashCode2 = 0;
        if (edVar != null) {
            f2125 = (f2126 + 71) % 128;
            iHashCode = edVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        fr frVar = this.f2130;
        if (frVar != null) {
            int i11 = f2126 + 123;
            f2125 = i11 % 128;
            if (i11 % 2 == 0) {
                frVar.hashCode();
                throw null;
            }
            iHashCode2 = frVar.hashCode();
            f2125 = (f2126 + 13) % 128;
        }
        return i10 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6491("ႚ\ue66d訸뻎훳\ue4cc鬤", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ᰑ곻滄\ue4af", TextUtils.lastIndexOf("", '0', 0) + 1246428747, "䩘䫾䭊\uf4de").intern());
        sb2.append(this.f2131);
        sb2.append(m6491("럠ક", (char) (ExpandableListView.getPackedPositionChild(0L) + 49379), "ᰑ곻滄\ue4af", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "짾絘\ue29fꛀ").intern());
        sb2.append(this.f2130);
        String string = sb2.toString();
        int i10 = f2126 + 81;
        f2125 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6475(du duVar, cq cqVar) {
        while (this.f2131.m6434(duVar, cqVar).m6379()) {
            dr drVarMo6475 = this.f2130.mo6475(duVar, cqVar);
            if (drVarMo6475.m6382()) {
                break;
            }
            if (drVarMo6475.m6381()) {
                int i10 = f2126 + 103;
                int i11 = i10 % 128;
                f2125 = i11;
                if (i10 % 2 == 0) {
                    int i12 = 20 / 0;
                }
                int i13 = i11 + 113;
                f2126 = i13 % 128;
                if (i13 % 2 == 0) {
                    return drVarMo6475;
                }
                throw null;
            }
        }
        return new dr(null);
    }
}
