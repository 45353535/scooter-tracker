package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes10.dex */
public final class ej extends ef {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1988 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1989 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f1990 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1991 = 49469135;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1992 = 120;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f1993 = {-78, -77, 118, Ascii.US, 111, 37, 39, 114, 35, 125, Ascii.DC2, -32, -55, 118, 32, -43, -55, 33, Ascii.RS, 110, 38, 117, Ascii.DC4, -120, 35, -46, -68, 124, 32, 112, Ascii.DC2, -119, 44, 42, -118, Ascii.DC4, -32, -57, 34, 120, 37, 72, -79, 84, 7, 38, 33, -16, 41, -75, 100, 37, 39, -6, -7, 37, -8, 33, -6, -5, Ascii.US, -53, 106, 37, -75, 57, -6, -31, 97, 42, 38, -53, 103, 33, -52, 95, Ascii.US, -5, 40, -3, 38, -52, Ascii.RS, -117, 119, -71};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1994 = 1759777244;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1995;

    public ej(ed edVar, ed edVar2, ed edVar3, dm dmVar) {
        super(edVar, edVar2, dmVar);
        this.f1995 = edVar3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6448(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1992;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1993;
                    i14 = bArr != null ? (byte) (bArr[f1991 + i10] + i13) : (short) (f1990[f1991 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1991 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1994);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1993;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1990;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i10 = f1988 + 77;
            f1989 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (ej.class == obj.getClass()) {
                if (!super.equals(obj)) {
                    int i11 = f1988 + 57;
                    f1989 = i11 % 128;
                    return i11 % 2 == 0;
                }
                ed edVar = this.f1995;
                ed edVar2 = ((ej) obj).f1995;
                if (edVar != null) {
                    return edVar.equals(edVar2);
                }
                if (edVar2 != null) {
                    return false;
                }
                f1988 = (f1989 + 43) % 128;
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final int hashCode() {
        int iHashCode;
        f1989 = (f1988 + 29) % 128;
        int iHashCode2 = super.hashCode() * 31;
        ed edVar = this.f1995;
        if (edVar != null) {
            int i10 = f1989 + 17;
            f1988 = i10 % 128;
            if (i10 % 2 != 0) {
                edVar.hashCode();
                throw null;
            }
            iHashCode = edVar.hashCode();
        } else {
            f1989 = (f1988 + 75) % 128;
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(m6448((-49469052) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (KeyEvent.keyCodeFromString("") + 104), TextUtils.getOffsetAfter("", 0) - 1759777212, (byte) (60 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0') - 120).intern());
        sb2.append(m6449().toString());
        String string = sb2.toString();
        f1988 = (f1989 + 125) % 128;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if ((r13 instanceof org.json.JSONObject) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f1988 = (com.ironsource.adqualitysdk.sdk.i.ej.f1989 + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        ((org.json.JSONObject) r13).put((java.lang.String) r1.m6377(), r4.m6377());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f1988 = (com.ironsource.adqualitysdk.sdk.i.ej.f1989 + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if ((r13 instanceof org.json.JSONArray) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        ((org.json.JSONArray) r13).put(r1.m6378().intValue(), r4.m6377());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if ((r13 instanceof java.util.Map) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        ((java.util.Map) r13).put(r1.m6377(), r4.m6377());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if ((r13 instanceof java.util.List) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f1989 = (com.ironsource.adqualitysdk.sdk.i.ej.f1988 + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        ((java.util.List) r13).set(r1.m6378().intValue(), r4.m6377());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        if (r13.getClass().isArray() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        ((java.lang.Object[]) r13)[r1.m6378().intValue()] = r4.m6377();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        r1 = r14.m5971();
        r5 = new java.lang.StringBuilder();
        r5.append(m6448(android.text.TextUtils.lastIndexOf("", '0') - 49469134, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79), (-1759777175) - android.graphics.Color.red(0), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) - 41), android.text.TextUtils.lastIndexOf("", '0', 0) - 120).intern());
        r5.append(r12);
        r5.append(m6435());
        r5.append(m6448(android.graphics.Color.blue(0) - 49469093, (short) (113 - android.view.View.combineMeasuredStates(0, 0)), android.text.TextUtils.getTrimmedLength("") - 1759777186, (byte) (105 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (-122) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern());
        r5.append(r13);
        com.ironsource.adqualitysdk.sdk.i.co.m5911(r1, r5.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ej.f1988 = (com.ironsource.adqualitysdk.sdk.i.ej.f1989 + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0164, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if ((r13 instanceof org.json.JSONObject) != false) goto L17;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01b8: RETURN (r4 I:com.ironsource.adqualitysdk.sdk.i.dr), block:B:42:0x01b8 */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.dr mo6401(com.ironsource.adqualitysdk.sdk.i.du r13, com.ironsource.adqualitysdk.sdk.i.cq r14) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ej.mo6401(com.ironsource.adqualitysdk.sdk.i.du, com.ironsource.adqualitysdk.sdk.i.cq):com.ironsource.adqualitysdk.sdk.i.dr");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6449() {
        int i10 = f1988 + 57;
        f1989 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1995;
        }
        throw null;
    }
}
