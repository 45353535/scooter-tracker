package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class jyq {
    public static final String[] lnr = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int qdl = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static int f17875ud = Integer.MIN_VALUE;

    public static String qdl() {
        if (qdl == Integer.MIN_VALUE) {
            qdl = com.bytedance.sdk.openadsdk.core.tvp.mzz();
        }
        if (qdl < 0) {
            qdl = 0;
        }
        String[] strArr = lnr;
        try {
            return strArr[qdl % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    public static synchronized void ud() {
        if (f17875ud == 0) {
            return;
        }
        f17875ud = 0;
        com.bytedance.sdk.openadsdk.core.tvp.ud(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.jyq.qdl + 1;
        com.bytedance.sdk.openadsdk.utils.jyq.qdl = r2;
        com.bytedance.sdk.openadsdk.core.tvp.qdl(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void qdl(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.utils.jyq> r0 = com.bytedance.sdk.openadsdk.utils.jyq.class
            monitor-enter(r0)
            if (r5 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            r1 = 0
            r2 = r1
        L9:
            java.lang.String[] r3 = com.bytedance.sdk.openadsdk.utils.jyq.lnr     // Catch: java.lang.Throwable -> L20
            int r4 = r3.length     // Catch: java.lang.Throwable -> L20
            if (r2 >= r4) goto L28
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L20
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            int r2 = com.bytedance.sdk.openadsdk.utils.jyq.qdl     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + 1
            com.bytedance.sdk.openadsdk.utils.jyq.qdl = r2     // Catch: java.lang.Throwable -> L20
            com.bytedance.sdk.openadsdk.core.tvp.qdl(r2)     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r2 = move-exception
            goto L25
        L22:
            int r2 = r2 + 1
            goto L9
        L25:
            r2.getMessage()     // Catch: java.lang.Throwable -> L39
        L28:
            java.lang.String r2 = "/api/ad/union/sdk/settings/"
            boolean r2 = r5.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L3b
            java.lang.String r2 = "/api/ad/union/sdk/strategies/adn"
            boolean r5 = r5.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L75
            goto L3b
        L39:
            r5 = move-exception
            goto L77
        L3b:
            int r5 = com.bytedance.sdk.openadsdk.utils.jyq.f17875ud     // Catch: java.lang.Throwable -> L39
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r2) goto L47
            int r5 = com.bytedance.sdk.openadsdk.core.tvp.mo()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.utils.jyq.f17875ud = r5     // Catch: java.lang.Throwable -> L39
        L47:
            int r5 = com.bytedance.sdk.openadsdk.utils.jyq.f17875ud     // Catch: java.lang.Throwable -> L39
            int r5 = r5 + 1
            com.bytedance.sdk.openadsdk.utils.jyq.f17875ud = r5     // Catch: java.lang.Throwable -> L39
            r2 = 3
            if (r5 < r2) goto L70
            com.bytedance.sdk.openadsdk.core.settings.rq r5 = com.bytedance.sdk.openadsdk.core.settings.rq.lnr()     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r5.wc()     // Catch: java.lang.Throwable -> L39
            int r2 = com.bytedance.sdk.openadsdk.utils.jyq.f17875ud     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.core.settings.rq r3 = com.bytedance.sdk.openadsdk.core.settings.rq.lnr()     // Catch: java.lang.Throwable -> L39
            r3.xx()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.utils.jyq.f17875ud = r1     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "clear_domain"
            com.bytedance.sdk.openadsdk.utils.jyq$1 r4 = new com.bytedance.sdk.openadsdk.utils.jyq$1     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(r3, r1, r4)     // Catch: java.lang.Throwable -> L39
        L70:
            int r5 = com.bytedance.sdk.openadsdk.utils.jyq.f17875ud     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.core.tvp.ud(r5)     // Catch: java.lang.Throwable -> L39
        L75:
            monitor-exit(r0)
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.jyq.qdl(java.lang.String):void");
    }

    public static void qdl(com.bytedance.sdk.component.tvp.mo moVar, String str) {
        HashMap map = new HashMap();
        map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        moVar.qdl(str, map);
    }
}
