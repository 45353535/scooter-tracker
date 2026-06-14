package com.appodeal.ads;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k6 implements com.appodeal.ads.networking.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f13544a;

    public k6(final xe adRequestParams) {
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        this.f13544a = lf.i.a(new Function0() { // from class: com.appodeal.ads.j6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k6.a(this.f13508b, adRequestParams);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(com.appodeal.ads.k6 r2, com.appodeal.ads.xe r3) {
        /*
            java.lang.String r0 = r3.f15263d
            java.lang.String r1 = "getRequestPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.getClass()
            int r2 = r0.hashCode()
            r1 = -1907025354(0xffffffff8e551a36, float:-2.6266897E-30)
            if (r2 == r1) goto L47
            r1 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r2 == r1) goto L3b
            r1 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r2 == r1) goto L2f
            r1 = -1031406050(0xffffffffc285fe1e, float:-66.99632)
            if (r2 == r1) goto L23
            goto L4f
        L23:
            java.lang.String r2 = "banner_320"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2c
            goto L4f
        L2c:
            java.lang.String r2 = "http://herokuapp.appodeal.com/android_waterfall_banner"
            goto L54
        L2f:
            java.lang.String r2 = "native"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L38
            goto L4f
        L38:
            java.lang.String r2 = "http://herokuapp.appodeal.com/android_waterfall_native"
            goto L54
        L3b:
            java.lang.String r2 = "banner"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L44
            goto L4f
        L44:
            java.lang.String r2 = "http://herokuapp.appodeal.com/android_waterfall_interstitial"
            goto L54
        L47:
            java.lang.String r2 = "banner_mrec"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L52
        L4f:
            java.lang.String r2 = "http://herokuapp.appodeal.com/android_waterfall_rewarded_video"
            goto L54
        L52:
            java.lang.String r2 = "http://herokuapp.appodeal.com/android_waterfall_mrec"
        L54:
            boolean r3 = r3.f15261b
            if (r3 == 0) goto L59
            return r2
        L59:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k6.a(com.appodeal.ads.k6, com.appodeal.ads.xe):java.lang.String");
    }

    @Override // com.appodeal.ads.networking.b
    public final String b() {
        return (String) this.f13544a.getValue();
    }
}
