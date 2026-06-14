package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2961 = {'\n', 57064, 17315, 58414, 1695, 43826, 52734, 28276, 37059, 13634, 22068, 63713, 7472, 49029, 8256, 17140, 59216, 2509, 43704, 53045, 29064, 37467, 13489};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2962 = -7004983622510535312L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2963 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2964;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m7096(String str, String str2) {
        f2963 = (f2964 + 77) % 128;
        m7100(str, str, str2);
        int i10 = f2964 + 57;
        f2963 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m7097(String str, String str2) {
        f2964 = (f2963 + 121) % 128;
        m7110(str, str2, (Object) null);
        f2963 = (f2964 + 101) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7098(String str, String str2) {
        f2963 = (f2964 + 87) % 128;
        m7118(str, str2, null);
        f2964 = (f2963 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m7105() {
        f2963 = (f2964 + 21) % 128;
        boolean zM7267 = s.m7239().m7267();
        int i10 = f2963 + 121;
        f2964 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM7267;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m7106() {
        int i10 = f2963 + 25;
        f2964 = i10 % 128;
        if (i10 % 2 == 0) {
            return s.m7239().m7268();
        }
        s.m7239().m7268();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7116(String str, String str2, boolean z10) {
        f2964 = (f2963 + 17) % 128;
        m7103(str, str, str2, z10);
        f2964 = (f2963 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m7118(String str, String str2, Throwable th2) {
        f2963 = (f2964 + 101) % 128;
        m7101(str, str, str2, th2, false);
        int i10 = f2964 + 43;
        f2963 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r6 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (m7106().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.f2963 = (com.ironsource.adqualitysdk.sdk.i.k.f2964 + 67) % 128;
        android.util.Log.e(m7108(r3), r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.k.f2964 + 13;
        com.ironsource.adqualitysdk.sdk.i.k.f2963 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m7105() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m7105() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.util.Log.e(m7108(r2), r4, r5);
     */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m7101(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, boolean r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2963
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2964 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = m7105()
            r1 = 65
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1d
        L17:
            boolean r0 = m7105()
            if (r0 == 0) goto L25
        L1d:
            java.lang.String r2 = m7108(r2)
            android.util.Log.e(r2, r4, r5)
            return
        L25:
            if (r6 == 0) goto L42
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r2 = m7106()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r6 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR
            boolean r2 = r2.shouldPrintLog(r6)
            if (r2 == 0) goto L42
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2964
            int r2 = r2 + 67
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2963 = r2
            java.lang.String r2 = m7108(r3)
            android.util.Log.e(r2, r4, r5)
        L42:
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2964
            int r2 = r2 + 13
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2963 = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L4f
            return
        L4f:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m7101(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7102(String str, String str2) {
        int i10 = f2964 + 91;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        m7104(str, str2, null);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7112(String str, String str2, Throwable th2, boolean z10) {
        f2963 = (f2964 + 79) % 128;
        m7101(str, str, str2, th2, z10);
        f2964 = (f2963 + 53) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7115(String str, String str2, String str3, boolean z10) {
        if (!(!m7105())) {
            int i10 = f2963 + 21;
            f2964 = i10 % 128;
            if (i10 % 2 == 0) {
                Log.i(m7108(str), str3);
                return;
            } else {
                Log.i(m7108(str), str3);
                throw null;
            }
        }
        if (z10 && m7106().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            f2963 = (f2964 + 41) % 128;
            Log.i(m7108(str2), str3);
        }
        int i11 = f2963 + 9;
        f2964 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m7117(String str, String str2) {
        f2963 = (f2964 + 3) % 128;
        m7115(str, str, str2, false);
        f2964 = (f2963 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7104(String str, String str2, Throwable th2) {
        f2963 = (f2964 + 41) % 128;
        m7101(str, str, str2, th2, true);
        int i10 = f2964 + 103;
        f2963 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7109(String str, String str2) {
        f2964 = (f2963 + 59) % 128;
        m7115(str, str, str2, true);
        int i10 = f2963 + 125;
        f2964 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7103(String str, String str2, String str3, boolean z10) {
        int i10 = f2964 + 85;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        m7101(str, str2, str3, null, z10);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7110(String str, String str2, Object obj) {
        f2964 = (f2963 + 111) % 128;
        m7111(str, str, str2, obj, false);
        f2964 = (f2963 + 73) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7111(String str, String str2, String str3, Object obj, boolean z10) {
        f2963 = (f2964 + 33) % 128;
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m7107((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            sb2.append(obj.toString());
            str3 = sb2.toString();
        }
        if (m7105()) {
            Log.d(m7108(str), str3);
            return;
        }
        if (z10) {
            f2963 = (f2964 + 47) % 128;
            if (m7106().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m7108(str2), str3);
                f2963 = (f2964 + 91) % 128;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7099(String str, String str2, Object obj) {
        int i10 = f2964 + 7;
        f2963 = i10 % 128;
        int i11 = i10 % 2;
        m7114(str, str, str2, obj);
        if (i11 == 0) {
            throw null;
        }
        f2963 = (f2964 + 113) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (m7106().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.f2964 = (com.ironsource.adqualitysdk.sdk.i.k.f2963 + 87) % 128;
        android.util.Log.v(m7108(r3), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m7105() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m7105() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.util.Log.v(m7108(r2), r4);
        com.ironsource.adqualitysdk.sdk.i.k.f2964 = (com.ironsource.adqualitysdk.sdk.i.k.f2963 + 117) % 128;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m7100(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2964
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2963 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = m7105()
            r1 = 15
            int r1 = r1 / 0
            if (r0 == 0) goto L2d
            goto L1d
        L17:
            boolean r0 = m7105()
            if (r0 == 0) goto L2d
        L1d:
            java.lang.String r2 = m7108(r2)
            android.util.Log.v(r2, r4)
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2963
            int r2 = r2 + 117
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2964 = r2
            return
        L2d:
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r2 = m7106()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r0 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE
            boolean r2 = r2.shouldPrintLog(r0)
            if (r2 == 0) goto L48
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2963
            int r2 = r2 + 87
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2964 = r2
            java.lang.String r2 = m7108(r3)
            android.util.Log.v(r2, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m7100(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7113(String str, String str2) {
        f2963 = (f2964 + 123) % 128;
        m7114(str, str, str2, (Object) null);
        f2964 = (f2963 + 109) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7114(String str, String str2, String str3, Object obj) {
        int i10 = f2964 + 81;
        f2963 = i10 % 128;
        m7111(str, str2, str3, obj, i10 % 2 != 0);
        f2963 = (f2964 + 47) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m7108(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7107((char) (56993 - View.resolveSize(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 22 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb2.append(str);
        String string = sb2.toString();
        f2963 = (f2964 + 101) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m7107(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2961[i10 + i12]) ^ (((long) i12) * f2962)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
