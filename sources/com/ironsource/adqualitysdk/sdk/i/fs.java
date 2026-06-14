package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class fs extends fr {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2105 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f2106 = {-2, 8, -82, 3, 9, -5, -27, -5, -9};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2107 = -1076127021;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2108 = null;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2109 = 7;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2110 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2111 = 1196812186;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f2112;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed f2113;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f2114;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr f2115;

    public fs(ed edVar, ed edVar2, ed edVar3, fr frVar) {
        this.f2113 = edVar;
        this.f2112 = edVar2;
        this.f2114 = edVar3;
        this.f2115 = frVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6483(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2109;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2106;
                    i14 = bArr != null ? (byte) (bArr[f2111 + i10] + i13) : (short) (f2108[f2111 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2111 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2107);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2106;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2108;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.fs.class == r5.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.fs) r5;
        r0 = r4.f2113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0.equals(r5.f2113) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r5.f2113 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        r0 = r4.f2112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fs.f2105 = (com.ironsource.adqualitysdk.sdk.i.fs.f2110 + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r0.equals(r5.f2112) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r5.f2112 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r0 = r4.f2114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r0.equals(r5.f2114) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fs.f2105 = (com.ironsource.adqualitysdk.sdk.i.fs.f2110 + 101) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r5.f2114 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        r0 = r4.f2115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fs.f2110 = (com.ironsource.adqualitysdk.sdk.i.fs.f2105 + 49) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        return r0.equals(r5.f2115);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r5.f2115 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fs.f2105
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2110 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            r0 = 34
            int r0 = r0 / r2
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r1
        L17:
            if (r5 == 0) goto L82
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fs> r3 = com.ironsource.adqualitysdk.sdk.i.fs.class
            if (r3 == r0) goto L22
            goto L82
        L22:
            com.ironsource.adqualitysdk.sdk.i.fs r5 = (com.ironsource.adqualitysdk.sdk.i.fs) r5
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2113
            if (r0 == 0) goto L31
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r5.f2113
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L36
            goto L35
        L31:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2113
            if (r0 == 0) goto L36
        L35:
            return r2
        L36:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2112
            if (r0 == 0) goto L4b
            int r3 = com.ironsource.adqualitysdk.sdk.i.fs.f2110
            int r3 = r3 + 11
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2105 = r3
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r5.f2112
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L50
            goto L4f
        L4b:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2112
            if (r0 == 0) goto L50
        L4f:
            return r2
        L50:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2114
            if (r0 == 0) goto L65
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r5.f2114
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L6a
            int r5 = com.ironsource.adqualitysdk.sdk.i.fs.f2110
            int r5 = r5 + 101
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2105 = r5
            goto L69
        L65:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r5.f2114
            if (r0 == 0) goto L6a
        L69:
            return r2
        L6a:
            com.ironsource.adqualitysdk.sdk.i.fr r0 = r4.f2115
            if (r0 == 0) goto L7d
            int r1 = com.ironsource.adqualitysdk.sdk.i.fs.f2105
            int r1 = r1 + 49
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2110 = r1
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2115
            boolean r5 = r0.equals(r5)
            return r5
        L7d:
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2115
            if (r5 != 0) goto L82
            return r1
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f2113;
        int iHashCode2 = 0;
        if (edVar != null) {
            f2110 = (f2105 + 5) % 128;
            iHashCode = edVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        ed edVar2 = this.f2112;
        int iHashCode3 = (i10 + (edVar2 != null ? edVar2.hashCode() : 0)) * 31;
        ed edVar3 = this.f2114;
        int iHashCode4 = (iHashCode3 + (edVar3 != null ? edVar3.hashCode() : 0)) * 31;
        fr frVar = this.f2115;
        if (frVar != null) {
            int i11 = f2105 + 31;
            f2110 = i11 % 128;
            if (i11 % 2 != 0) {
                frVar.hashCode();
                throw null;
            }
            iHashCode2 = frVar.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6483((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1196812185, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1076127123 - (ViewConfiguration.getTouchSlop() >> 8), (byte) TextUtils.indexOf("", "", 0), (-8) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        ed edVar = this.f2113;
        if (edVar != null) {
            sb2.append(edVar);
        }
        sb2.append(m6483(View.resolveSize(0, 0) - 1196812181, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 1076127080, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 9).intern());
        sb2.append(this.f2112);
        sb2.append(m6483((-1196812181) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) View.combineMeasuredStates(0, 0), 1076127080 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 7).intern());
        ed edVar2 = this.f2114;
        if (edVar2 != null) {
            f2110 = (f2105 + 105) % 128;
            sb2.append(edVar2);
        }
        sb2.append(m6483(TextUtils.indexOf("", "", 0, 0) - 1196812179, (short) Color.blue(0), 1076127062 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), ImageFormat.getBitsPerPixel(0) - 7).intern());
        sb2.append(this.f2115);
        String string = sb2.toString();
        f2105 = (f2110 + 17) % 128;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.dr mo6475(com.ironsource.adqualitysdk.sdk.i.du r5, com.ironsource.adqualitysdk.sdk.i.cq r6) {
        /*
            r4 = this;
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2113
            m6484(r0, r5, r6)
        L5:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2112
            com.ironsource.adqualitysdk.sdk.i.dr r0 = r0.m6434(r5, r6)
            boolean r0 = r0.m6379()
            r1 = 0
            if (r0 == 0) goto L58
            int r0 = com.ironsource.adqualitysdk.sdk.i.fs.f2110
            int r0 = r0 + 53
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2105 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L2f
            com.ironsource.adqualitysdk.sdk.i.fr r0 = r4.f2115
            com.ironsource.adqualitysdk.sdk.i.dr r0 = r0.mo6475(r5, r6)
            boolean r2 = r0.m6382()
            r3 = 77
            int r3 = r3 / 0
            if (r2 != 0) goto L58
            goto L3b
        L2f:
            com.ironsource.adqualitysdk.sdk.i.fr r0 = r4.f2115
            com.ironsource.adqualitysdk.sdk.i.dr r0 = r0.mo6475(r5, r6)
            boolean r2 = r0.m6382()
            if (r2 != 0) goto L58
        L3b:
            int r2 = com.ironsource.adqualitysdk.sdk.i.fs.f2105
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fs.f2110 = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L54
            boolean r1 = r0.m6381()
            if (r1 == 0) goto L4e
            return r0
        L4e:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r4.f2114
            m6484(r0, r5, r6)
            goto L5
        L54:
            r0.m6381()
            throw r1
        L58:
            com.ironsource.adqualitysdk.sdk.i.dr r5 = new com.ironsource.adqualitysdk.sdk.i.dr
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fs.mo6475(com.ironsource.adqualitysdk.sdk.i.du, com.ironsource.adqualitysdk.sdk.i.cq):com.ironsource.adqualitysdk.sdk.i.dr");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static dr m6484(ed edVar, du duVar, cq cqVar) {
        if (edVar != null) {
            f2110 = (f2105 + 35) % 128;
            return edVar.m6434(duVar, cqVar);
        }
        dr drVar = new dr(null);
        f2105 = (f2110 + 63) % 128;
        return drVar;
    }
}
