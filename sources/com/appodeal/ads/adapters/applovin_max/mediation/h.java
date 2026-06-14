package com.appodeal.ads.adapters.applovin_max.mediation;

import com.amazon.device.ads.DTBAdRequest;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f12050a = i.a(new Function0() { // from class: com.appodeal.ads.adapters.applovin_max.mediation.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(h.e());
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.applovin.mediation.ads.MaxAdView r4, java.util.ArrayList r5, com.applovin.mediation.MaxAdFormat r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            boolean r0 = r7 instanceof com.appodeal.ads.adapters.applovin_max.mediation.f
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.ads.adapters.applovin_max.mediation.f r0 = (com.appodeal.ads.adapters.applovin_max.mediation.f) r0
            int r1 = r0.f12049t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12049t = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.applovin_max.mediation.f r0 = new com.appodeal.ads.adapters.applovin_max.mediation.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12048s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12049t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.applovin.mediation.ads.MaxAdView r4 = r0.f12047r
            kotlin.d.b(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.d.b(r7)
            r0.f12047r = r4
            r0.f12049t = r3
            java.lang.Object r7 = d(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r5 = r7.iterator()
        L47:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.component1()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.component2()
            r4.setLocalExtraParameter(r7, r6)
            goto L47
        L61:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.mediation.h.a(com.applovin.mediation.ads.MaxAdView, java.util.ArrayList, com.applovin.mediation.MaxAdFormat, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.applovin.mediation.ads.MaxInterstitialAd r4, java.util.ArrayList r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.ads.adapters.applovin_max.mediation.d
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.adapters.applovin_max.mediation.d r0 = (com.appodeal.ads.adapters.applovin_max.mediation.d) r0
            int r1 = r0.f12043t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12043t = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.applovin_max.mediation.d r0 = new com.appodeal.ads.adapters.applovin_max.mediation.d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12042s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12043t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.applovin.mediation.ads.MaxInterstitialAd r4 = r0.f12041r
            kotlin.d.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.d.b(r6)
            com.applovin.mediation.MaxAdFormat r6 = com.applovin.mediation.MaxAdFormat.INTERSTITIAL
            java.lang.String r2 = "INTERSTITIAL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f12041r = r4
            r0.f12043t = r3
            java.lang.Object r6 = d(r5, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L4e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r0 = r6.component1()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.component2()
            r4.setLocalExtraParameter(r0, r6)
            goto L4e
        L68:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.mediation.h.b(com.applovin.mediation.ads.MaxInterstitialAd, java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.applovin.mediation.ads.MaxRewardedAd r4, java.util.ArrayList r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.ads.adapters.applovin_max.mediation.e
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.adapters.applovin_max.mediation.e r0 = (com.appodeal.ads.adapters.applovin_max.mediation.e) r0
            int r1 = r0.f12046t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12046t = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.applovin_max.mediation.e r0 = new com.appodeal.ads.adapters.applovin_max.mediation.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12045s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12046t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.applovin.mediation.ads.MaxRewardedAd r4 = r0.f12044r
            kotlin.d.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.d.b(r6)
            com.applovin.mediation.MaxAdFormat r6 = com.applovin.mediation.MaxAdFormat.REWARDED
            java.lang.String r2 = "REWARDED"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f12044r = r4
            r0.f12046t = r3
            java.lang.Object r6 = d(r5, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L4e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r0 = r6.component1()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.component2()
            r4.setLocalExtraParameter(r0, r6)
            goto L4e
        L68:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.mediation.h.c(com.applovin.mediation.ads.MaxRewardedAd, java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010c -> B:78:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b3 -> B:77:0x01b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.util.ArrayList r17, com.applovin.mediation.MaxAdFormat r18, kotlin.coroutines.jvm.internal.d r19) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.mediation.h.d(java.util.ArrayList, com.applovin.mediation.MaxAdFormat, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final boolean e() {
        try {
            int i10 = DTBAdRequest.f7404a;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
