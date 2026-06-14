package com.appodeal.ads.services;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.SdkAnalytics;
import com.appodeal.ads.inapp.AppodealPurchaseListener;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import hg.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkAnalytics f14723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.analytics.breadcrumbs.f f14724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f14725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow f14726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppodealPurchaseListener f14727e;

    public r() {
        AppodealAnalytics sdkAnalytics = AppodealAnalytics.INSTANCE;
        com.appodeal.ads.analytics.breadcrumbs.n crashReporter = com.appodeal.ads.analytics.breadcrumbs.n.f12678b;
        Intrinsics.checkNotNullParameter(sdkAnalytics, "sdkAnalytics");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f14723a = sdkAnalytics;
        this.f14724b = crashReporter;
        this.f14725c = l0.a(SetsKt.emptySet());
        this.f14726d = l0.a(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.appodeal.ads.inapp.InAppPurchase r14, com.appodeal.ads.inapp.InAppPurchaseValidateCallback r15, kotlin.jvm.functions.Function0 r16, kotlin.coroutines.jvm.internal.d r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.appodeal.ads.services.n
            if (r1 == 0) goto L15
            r1 = r0
            com.appodeal.ads.services.n r1 = (com.appodeal.ads.services.n) r1
            int r2 = r1.f14711x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f14711x = r2
            goto L1a
        L15:
            com.appodeal.ads.services.n r1 = new com.appodeal.ads.services.n
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f14709v
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f14711x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L53
            if (r3 == r5) goto L3f
            if (r3 != r4) goto L37
            java.lang.Object r14 = r1.f14706s
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r14 = (com.appodeal.ads.inapp.InAppPurchaseValidateCallback) r14
            java.lang.Object r15 = r1.f14705r
            com.appodeal.ads.inapp.InAppPurchase r15 = (com.appodeal.ads.inapp.InAppPurchase) r15
            kotlin.d.b(r0)
            goto L97
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            kotlin.jvm.functions.Function0 r14 = r1.f14708u
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r15 = r1.f14707t
            java.lang.Object r3 = r1.f14706s
            com.appodeal.ads.inapp.InAppPurchase r3 = (com.appodeal.ads.inapp.InAppPurchase) r3
            java.lang.Object r5 = r1.f14705r
            com.appodeal.ads.services.r r5 = (com.appodeal.ads.services.r) r5
            kotlin.d.b(r0)
            r11 = r14
            r10 = r3
            r8 = r5
        L51:
            r9 = r15
            goto L74
        L53:
            kotlin.d.b(r0)
            kotlinx.coroutines.flow.MutableStateFlow r0 = r13.f14726d
            com.appodeal.ads.services.o r3 = new com.appodeal.ads.services.o
            r3.<init>(r6)
            r1.f14705r = r13
            r1.f14706s = r14
            r1.f14707t = r15
            r7 = r16
            r1.f14708u = r7
            r1.f14711x = r5
            java.lang.Object r0 = hg.i.y(r0, r3, r1)
            if (r0 != r2) goto L70
            goto L94
        L70:
            r8 = r13
            r10 = r14
            r11 = r7
            goto L51
        L74:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            if (r14 == 0) goto La8
            com.appodeal.ads.services.q r7 = new com.appodeal.ads.services.q
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r1.f14705r = r10
            r1.f14706s = r9
            r1.f14707t = r6
            r1.f14708u = r6
            r1.f14711x = r4
            r14 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = eg.x1.e(r14, r7, r1)
            if (r0 != r2) goto L95
        L94:
            return r2
        L95:
            r14 = r9
            r15 = r10
        L97:
            kotlin.Unit r0 = (kotlin.Unit) r0
            if (r0 != 0) goto La8
            if (r14 == 0) goto La8
            com.appodeal.ads.service.ServiceError$IAPValidationTimeout r0 = com.appodeal.ads.service.ServiceError.IAPValidationTimeout.INSTANCE
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r14.onInAppPurchaseValidateFail(r15, r0)
            kotlin.Unit r14 = kotlin.Unit.f93236a
        La8:
            kotlin.Unit r14 = kotlin.Unit.f93236a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.r.a(com.appodeal.ads.inapp.InAppPurchase, com.appodeal.ads.inapp.InAppPurchaseValidateCallback, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.appodeal.ads.revenue.RevenueInfo r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.services.j
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.ads.services.j r0 = (com.appodeal.ads.services.j) r0
            int r1 = r0.f14699v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14699v = r1
            goto L18
        L13:
            com.appodeal.ads.services.j r0 = new com.appodeal.ads.services.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f14697t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14699v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.appodeal.ads.revenue.RevenueInfo r7 = r0.f14696s
            com.appodeal.ads.services.r r2 = r0.f14695r
            kotlin.d.b(r8)
            goto L55
        L3d:
            kotlin.d.b(r8)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.f14726d
            com.appodeal.ads.services.k r2 = new com.appodeal.ads.services.k
            r2.<init>(r5)
            r0.f14695r = r6
            r0.f14696s = r7
            r0.f14699v = r4
            java.lang.Object r8 = hg.i.y(r8, r2, r0)
            if (r8 != r1) goto L54
            goto L70
        L54:
            r2 = r6
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L72
            com.appodeal.ads.services.m r8 = new com.appodeal.ads.services.m
            r8.<init>(r2, r7, r5)
            r0.f14695r = r5
            r0.f14696s = r5
            r0.f14699v = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = eg.x1.e(r2, r8, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            return r7
        L72:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.r.b(com.appodeal.ads.revenue.RevenueInfo, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r14, java.lang.String r15, java.util.Map r16, kotlin.coroutines.jvm.internal.d r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.appodeal.ads.services.f
            if (r1 == 0) goto L15
            r1 = r0
            com.appodeal.ads.services.f r1 = (com.appodeal.ads.services.f) r1
            int r2 = r1.f14652x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f14652x = r2
            goto L1a
        L15:
            com.appodeal.ads.services.f r1 = new com.appodeal.ads.services.f
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f14650v
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f14652x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L47
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            kotlin.d.b(r0)
            return r0
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            java.util.Map r14 = r1.f14649u
            java.lang.String r15 = r1.f14648t
            java.lang.String r3 = r1.f14647s
            com.appodeal.ads.services.r r5 = r1.f14646r
            kotlin.d.b(r0)
            r11 = r14
            r9 = r3
            r8 = r5
        L45:
            r10 = r15
            goto L68
        L47:
            kotlin.d.b(r0)
            kotlinx.coroutines.flow.MutableStateFlow r0 = r13.f14726d
            com.appodeal.ads.services.g r3 = new com.appodeal.ads.services.g
            r3.<init>(r6)
            r1.f14646r = r13
            r1.f14647s = r14
            r1.f14648t = r15
            r7 = r16
            r1.f14649u = r7
            r1.f14652x = r5
            java.lang.Object r0 = hg.i.y(r0, r3, r1)
            if (r0 != r2) goto L64
            goto L88
        L64:
            r8 = r13
            r9 = r14
            r11 = r7
            goto L45
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            if (r14 == 0) goto L8a
            com.appodeal.ads.services.i r7 = new com.appodeal.ads.services.i
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r1.f14646r = r6
            r1.f14647s = r6
            r1.f14648t = r6
            r1.f14649u = r6
            r1.f14652x = r4
            r14 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r14 = eg.x1.e(r14, r7, r1)
            if (r14 != r2) goto L89
        L88:
            return r2
        L89:
            return r14
        L8a:
            kotlin.Unit r14 = kotlin.Unit.f93236a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.r.c(java.lang.String, java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final ArrayList d() {
        List listFilterIsInstance = CollectionsKt.filterIsInstance((Iterable) this.f14725c.getValue(), ServiceDataProvider.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = listFilterIsInstance.iterator();
        while (it.hasNext()) {
            ServiceData serviceData = ((ServiceDataProvider) it.next()).getServiceData();
            if (serviceData != null) {
                arrayList.add(serviceData);
            }
        }
        return arrayList;
    }

    public final AppodealPurchaseListener f() {
        return this.f14727e;
    }
}
