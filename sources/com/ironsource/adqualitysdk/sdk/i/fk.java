package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fk extends fr {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2072 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2073 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2074 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2075 = 5358680608451962287L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2076;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fr[] f2077;

    public fk(List<fr> list) {
        fr[] frVarArr = new fr[list.size()];
        this.f2077 = frVarArr;
        list.toArray(frVarArr);
    }

    public final boolean equals(Object obj) {
        f2076 = (f2072 + 107) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null || fk.class != obj.getClass()) {
            return false;
        }
        fk fkVar = (fk) obj;
        fr[] frVarArr = this.f2077;
        if (frVarArr == null) {
            if (fkVar.f2077 == null) {
                return true;
            }
            int i10 = f2076 + 71;
            f2072 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i11 = f2076 + 57;
        f2072 = i11 % 128;
        int i12 = i11 % 2;
        fr[] frVarArr2 = fkVar.f2077;
        if (i12 != 0) {
            return frVarArr.equals(frVarArr2);
        }
        frVarArr.equals(frVarArr2);
        throw null;
    }

    public final int hashCode() {
        fr[] frVarArr = this.f2077;
        if (frVarArr == null) {
            return 0;
        }
        f2072 = (f2076 + 35) % 128;
        int iHashCode = frVarArr.hashCode();
        f2076 = (f2072 + 55) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6474("壽䀮", (char) (20158 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "ꖯ㎍\udb9f䩝", Color.blue(0), "阷\ud871뾡罎").intern());
        fr[] frVarArr = this.f2077;
        int length = frVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f2072 = (f2076 + 3) % 128;
            fr frVar = frVarArr[i10];
            sb2.append(m6474("质╪\uf8bf爌", (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25278), "ꖯ㎍\udb9f䩝", ViewConfiguration.getEdgeSlop() >> 16, "嘁柕븀⥢").intern());
            sb2.append(frVar.toString());
            sb2.append(m6474("牕", (char) (5652 - (ViewConfiguration.getTouchSlop() >> 8)), "ꖯ㎍\udb9f䩝", 1492044179 - KeyEvent.getDeadChar(0, 0), "鍤\ueec9ᑘ砖").intern());
            i10++;
            f2076 = (f2072 + 113) % 128;
        }
        sb2.append(m6474("ꤏ", (char) (TextUtils.getOffsetAfter("", 0) + 37966), "ꖯ㎍\udb9f䩝", (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1644217965, "鎣Ｙ亝ޔ").intern());
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dr mo6475(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        du duVar2 = new du(duVar);
        for (fr frVar : this.f2077) {
            f2072 = (f2076 + 11) % 128;
            drVar = frVar.mo6475(duVar2, cqVar);
            if (drVar.m6381()) {
                break;
            }
            int i10 = f2076 + 17;
            f2072 = i10 % 128;
            if (i10 % 2 == 0) {
                drVar.m6382();
                throw null;
            }
            if (drVar.m6382() || drVar.m6374()) {
                return drVar;
            }
        }
        return drVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6474(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2075) ^ ((long) f2074)) ^ ((long) f2073));
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
}
