package com.appodeal.ads.adapters.level_play.mediation;

import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.SDKUtilities;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.ext.LogExtKt;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f12448a = lf.i.a(new Function0() { // from class: com.appodeal.ads.adapters.level_play.mediation.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(k.h());
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0069 -> B:51:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:51:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f8 -> B:50:0x00fb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.ArrayList r13, com.appodeal.ads.adapters.level_play.mediation.a r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.level_play.mediation.k.a(java.util.ArrayList, com.appodeal.ads.adapters.level_play.mediation.a, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.ArrayList r4, com.unity3d.mediation.LevelPlayAdSize r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.ads.adapters.level_play.mediation.g
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.adapters.level_play.mediation.g r0 = (com.appodeal.ads.adapters.level_play.mediation.g) r0
            int r1 = r0.f12441u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12441u = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.level_play.mediation.g r0 = new com.appodeal.ads.adapters.level_play.mediation.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12440t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12441u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r4 = r0.f12439s
            java.lang.String r5 = r0.f12438r
            kotlin.d.b(r6)
            goto L64
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.d.b(r6)
            com.unity3d.mediation.LevelPlayAdSize r6 = com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r6 == 0) goto L43
            com.appodeal.ads.adapters.level_play.mediation.a r5 = com.appodeal.ads.adapters.level_play.mediation.a.f12416f
            goto L50
        L43:
            com.unity3d.mediation.LevelPlayAdSize r6 = com.unity3d.mediation.LevelPlayAdSize.LARGE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L4e
            com.appodeal.ads.adapters.level_play.mediation.a r5 = com.appodeal.ads.adapters.level_play.mediation.a.f12415e
            goto L50
        L4e:
            com.appodeal.ads.adapters.level_play.mediation.a r5 = com.appodeal.ads.adapters.level_play.mediation.a.f12414d
        L50:
            java.lang.String r6 = "LevelPlayBannerAdView"
            r0.f12438r = r6
            java.lang.String r2 = "BANNER"
            r0.f12439s = r2
            r0.f12441u = r3
            java.lang.Object r4 = a(r4, r5, r0)
            if (r4 != r1) goto L61
            return r1
        L61:
            r5 = r6
            r6 = r4
            r4 = r2
        L64:
            java.util.List r6 = (java.util.List) r6
            g(r5, r4, r6)
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.level_play.mediation.k.b(java.util.ArrayList, com.unity3d.mediation.LevelPlayAdSize, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.util.ArrayList r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.ads.adapters.level_play.mediation.e
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.adapters.level_play.mediation.e r0 = (com.appodeal.ads.adapters.level_play.mediation.e) r0
            int r1 = r0.f12433u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12433u = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.level_play.mediation.e r0 = new com.appodeal.ads.adapters.level_play.mediation.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12432t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12433u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f12431s
            java.lang.String r0 = r0.f12430r
            kotlin.d.b(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            com.appodeal.ads.adapters.level_play.mediation.a r6 = com.appodeal.ads.adapters.level_play.mediation.a.f12412b
            java.lang.String r2 = "LevelPlayInterstitialAd"
            r0.f12430r = r2
            java.lang.String r4 = "INTERSTITIAL"
            r0.f12431s = r4
            r0.f12433u = r3
            java.lang.Object r6 = a(r5, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r2
            r5 = r4
        L4d:
            java.util.List r6 = (java.util.List) r6
            g(r0, r5, r6)
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.level_play.mediation.k.c(java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final Unit d(DTBAdResponse dTBAdResponse, String str, String str2, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("bidInfo", SDKUtilities.getBidInfo(dTBAdResponse));
        jsonObject.hasValue("pricePointEncoded", SDKUtilities.getPricePoint(dTBAdResponse));
        jsonObject.hasValue(CommonUrlParts.UUID, str);
        if (Intrinsics.areEqual(str2, "BANNER")) {
            jsonObject.hasValue("width", Integer.valueOf(dTBAdResponse.getDTBAds().get(0).getWidth()));
            jsonObject.hasValue("height", Integer.valueOf(dTBAdResponse.getDTBAds().get(0).getHeight()));
        }
        return Unit.f93236a;
    }

    public static final Unit e(final String str, final DTBAdResponse dTBAdResponse, final String str2, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject(str, JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.level_play.mediation.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.d(dTBAdResponse, str2, str, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final void f(final String str, final String str2, final DTBAdResponse dTBAdResponse) {
        LevelPlay.setNetworkData(ApsConstants.UNITYLEVELPLAY_NETWORK_DATA_KEY, JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.level_play.mediation.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.e(str, dTBAdResponse, str2, (JsonObjectBuilder) obj);
            }
        }));
    }

    public static final void g(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str3 = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 instanceof DTBAdResponse) {
                f(str2, str3, (DTBAdResponse) objComponent2);
            } else if (objComponent2 instanceof AdError) {
                LogExtKt.logInternal$default(str, "Fail to load Amazon ad. Skip mediation config", null, 4, null);
            } else {
                LogExtKt.logInternal$default(str, "Unspecified error due Amazon ad loading", null, 4, null);
            }
        }
    }

    public static final boolean h() {
        try {
            int i10 = DTBAdRequest.f7404a;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(java.util.ArrayList r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.ads.adapters.level_play.mediation.f
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.adapters.level_play.mediation.f r0 = (com.appodeal.ads.adapters.level_play.mediation.f) r0
            int r1 = r0.f12437u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12437u = r1
            goto L18
        L13:
            com.appodeal.ads.adapters.level_play.mediation.f r0 = new com.appodeal.ads.adapters.level_play.mediation.f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12436t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f12437u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f12435s
            java.lang.String r0 = r0.f12434r
            kotlin.d.b(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            com.appodeal.ads.adapters.level_play.mediation.a r6 = com.appodeal.ads.adapters.level_play.mediation.a.f12413c
            java.lang.String r2 = "LevelPlayRewardedAd"
            r0.f12434r = r2
            java.lang.String r4 = "REWARDED_VIDEO"
            r0.f12435s = r4
            r0.f12437u = r3
            java.lang.Object r6 = a(r5, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r2
            r5 = r4
        L4d:
            java.util.List r6 = (java.util.List) r6
            g(r0, r5, r6)
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.level_play.mediation.k.i(java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
