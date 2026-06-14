package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cu extends cz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1549 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1550 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1551 = 354585702;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1552 = 111;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1553 = 1133685387;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f1554;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1555 = {-78, -33, -42, -61, Ascii.DC4, -114, -63, 17, -120, -37, -34, -28, -83, -35, -41, 9, -127, -47, -52, 19, -121, -57, -37, -59, -32, -57, -35, 46, 114, -35, -61, -32, -13, -83, -112, -123, -4, 75, 61, -6, 74, 41, -116, 0, -121, -114, -114, 81, 56, -8, -108, -10, -113, -8, -114, 93, 41, -114, -4, -113, -84};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m6075(cq cqVar, List<Object> list) {
        cq cqVar2;
        List list2 = (List) cz.m6139(list, 0, List.class);
        try {
            ds dsVar = (ds) cz.m6139(list, 1, ds.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                cqVar2 = cqVar;
            } else if (!(!cz.m6138(list, 2, cq.class))) {
                cqVar2 = (cq) cz.m6139(list, 2, cq.class);
                if (list.size() > 3) {
                    int i10 = f1549 + 15;
                    f1550 = i10 % 128;
                    arrayList = i10 % 2 != 0 ? cz.m6141(list, 5) : cz.m6141(list, 3);
                }
            } else {
                arrayList = cz.m6141(list, 2);
                f1550 = (f1549 + 65) % 128;
                cqVar2 = cqVar;
            }
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            while (i11 < list2.size()) {
                arrayList.add(0, list2.get(i11));
                arrayList2.add(dsVar.m6385(cqVar2.m5973(), cqVar2, arrayList).m6377());
                arrayList.remove(0);
                i11++;
                f1549 = (f1550 + 49) % 128;
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m5911(cqVar.m5971(), m6074((ViewConfiguration.getScrollBarSize() >> 8) - 354585702, (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47), KeyEvent.keyCodeFromString("") - 1133685318, (byte) (15 - KeyEvent.keyCodeFromString("")), (-113) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), e10);
            return list2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.cz.m6138(r11, 2, com.ironsource.adqualitysdk.sdk.i.cq.class) != false) goto L15;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6076(com.ironsource.adqualitysdk.sdk.i.cq r10, java.util.List<java.lang.Object> r11) {
        /*
            r9 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r11, r1, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ds> r2 = com.ironsource.adqualitysdk.sdk.i.ds.class
            r3 = 1
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r11, r3, r2)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.ds r2 = (com.ironsource.adqualitysdk.sdk.i.ds) r2     // Catch: java.lang.Exception -> L33
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r4.<init>()     // Catch: java.lang.Exception -> L33
            int r5 = r11.size()     // Catch: java.lang.Exception -> L33
            r6 = 2
            if (r5 <= r6) goto L50
            int r5 = com.ironsource.adqualitysdk.sdk.i.cu.f1549
            int r5 = r5 + 15
            int r7 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cu.f1550 = r7
            int r5 = r5 % r6
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.cq> r7 = com.ironsource.adqualitysdk.sdk.i.cq.class
            r8 = 3
            if (r5 == 0) goto L35
            boolean r5 = com.ironsource.adqualitysdk.sdk.i.cz.m6138(r11, r8, r7)     // Catch: java.lang.Exception -> L33
            if (r5 == 0) goto L4c
            goto L3b
        L33:
            r11 = move-exception
            goto L87
        L35:
            boolean r5 = com.ironsource.adqualitysdk.sdk.i.cz.m6138(r11, r6, r7)     // Catch: java.lang.Exception -> L33
            if (r5 == 0) goto L4c
        L3b:
            java.lang.Object r5 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r11, r6, r7)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.cq r5 = (com.ironsource.adqualitysdk.sdk.i.cq) r5     // Catch: java.lang.Exception -> L33
            int r6 = r11.size()     // Catch: java.lang.Exception -> L33
            if (r6 <= r8) goto L51
            java.util.List r4 = com.ironsource.adqualitysdk.sdk.i.cz.m6141(r11, r8)     // Catch: java.lang.Exception -> L33
            goto L51
        L4c:
            java.util.List r4 = com.ironsource.adqualitysdk.sdk.i.cz.m6141(r11, r6)     // Catch: java.lang.Exception -> L33
        L50:
            r5 = r10
        L51:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r11.<init>()     // Catch: java.lang.Exception -> L33
            r6 = r1
        L57:
            int r7 = r0.size()     // Catch: java.lang.Exception -> L33
            if (r6 >= r7) goto L86
            java.lang.Object r7 = r0.get(r6)     // Catch: java.lang.Exception -> L33
            r4.add(r1, r7)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.du r7 = r5.m5973()     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.dr r7 = r2.m6385(r7, r5, r4)     // Catch: java.lang.Exception -> L33
            boolean r7 = r7.m6379()     // Catch: java.lang.Exception -> L33
            if (r7 == 0) goto L80
            int r7 = com.ironsource.adqualitysdk.sdk.i.cu.f1549
            int r7 = r7 + r3
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.cu.f1550 = r7
            java.lang.Object r7 = r0.get(r6)     // Catch: java.lang.Exception -> L33
            r11.add(r7)     // Catch: java.lang.Exception -> L33
        L80:
            r4.remove(r1)     // Catch: java.lang.Exception -> L33
            int r6 = r6 + 1
            goto L57
        L86:
            return r11
        L87:
            java.lang.String r10 = r10.m5971()
            r2 = -354585669(0xffffffffeadd73bb, float:-1.3385956E26)
            java.lang.String r3 = ""
            int r4 = android.text.TextUtils.getTrimmedLength(r3)
            int r4 = r4 + r2
            int r2 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r2 = r2 >> 8
            int r2 = r2 + (-69)
            short r2 = (short) r2
            r5 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r3, r5)
            r5 = -1133685317(0xffffffffbc6d55bb, float:-0.014485772)
            int r3 = r3 + r5
            int r5 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r5 = r5 >> 16
            int r5 = r5 + 74
            byte r5 = (byte) r5
            int r1 = android.os.Process.getThreadPriority(r1)
            int r1 = r1 + 20
            int r1 = r1 >> 6
            int r1 = (-112) - r1
            java.lang.String r1 = m6074(r4, r2, r3, r5, r1)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.co.m5911(r10, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cu.m6076(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m6077(cq cqVar, List<Object> list) {
        int i10 = f1549 + 117;
        f1550 = i10 % 128;
        if (i10 % 2 == 0) {
            m6075(cqVar, list);
            return null;
        }
        m6075(cqVar, list);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6074(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1552;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1555;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1551 + i10] + i13);
                    } else {
                        i14 = (short) (f1554[f1551 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1551 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1553);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1555;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1554;
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
}
