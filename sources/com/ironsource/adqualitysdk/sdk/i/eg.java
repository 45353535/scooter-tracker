package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class eg extends ed {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1970 = 9682;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1971 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1972 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1973 = 28183;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1974 = 60028;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1975 = 42206;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1976;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f1977;

    public eg(ed edVar, ed edVar2, dm dmVar) {
        super(dmVar);
        this.f1977 = edVar;
        this.f1976 = edVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6442(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1975)) ^ ((c11 >>> 5) + f1970)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1974) ^ ((c12 + i12) ^ ((c12 << 4) + f1973))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5.f1977 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L45
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L45
        L12:
            com.ironsource.adqualitysdk.sdk.i.eg r5 = (com.ironsource.adqualitysdk.sdk.i.eg) r5
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1977
            if (r2 == 0) goto L29
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r5.f1977
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            int r5 = com.ironsource.adqualitysdk.sdk.i.eg.f1971
            int r5 = r5 + 67
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1972 = r5
            goto L2d
        L29:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f1977
            if (r2 == 0) goto L2e
        L2d:
            return r1
        L2e:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1976
            com.ironsource.adqualitysdk.sdk.i.ed r5 = r5.f1976
            if (r2 == 0) goto L41
            boolean r5 = r2.equals(r5)
            int r0 = com.ironsource.adqualitysdk.sdk.i.eg.f1972
            int r0 = r0 + 119
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1971 = r0
            return r5
        L41:
            if (r5 != 0) goto L44
            return r0
        L44:
            return r1
        L45:
            int r5 = com.ironsource.adqualitysdk.sdk.i.eg.f1971
            int r5 = r5 + 5
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f1972 = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eg.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        ed edVar = this.f1977;
        int iHashCode2 = 0;
        if (edVar != null) {
            f1971 = (f1972 + 27) % 128;
            iHashCode = edVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        ed edVar2 = this.f1976;
        if (edVar2 != null) {
            iHashCode2 = edVar2.hashCode();
            f1972 = (f1971 + 59) % 128;
        }
        return i10 + iHashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1977);
        sb2.append(m6442("㴾\ue1e1", -TextUtils.lastIndexOf("", '0', 0)).intern());
        sb2.append(mo6443());
        sb2.append(m6442("㴾\ue1e1", -ExpandableListView.getPackedPositionChild(0L)).intern());
        sb2.append(this.f1976);
        String string = sb2.toString();
        f1971 = (f1972 + 109) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo6443();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ed m6444() {
        int i10 = (f1972 + 23) % 128;
        f1971 = i10;
        ed edVar = this.f1977;
        f1972 = (i10 + 43) % 128;
        return edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ed m6445() {
        int i10 = f1971 + 41;
        f1972 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1976;
        }
        throw null;
    }
}
