package com.appodeal.ads;

import com.appodeal.advertising.AdvertisingInfo;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.RemoteConfigFeature;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f15144e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f15146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashSet f15147h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4 f15140a = new v4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f15141b = lf.i.a(new Function0() { // from class: com.appodeal.ads.s4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v4.l();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f15142c = lf.i.a(new Function0() { // from class: com.appodeal.ads.t4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v4.k();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f15143d = lf.i.a(new Function0() { // from class: com.appodeal.ads.u4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v4.e();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static AdvertisingInfo.AdvertisingProfile f15145f = AdvertisingInfo.DefaultAdvertisingProfile.INSTANCE;

    static {
        Set of2 = SetsKt.setOf((Object[]) new String[]{"lt", N6.f41419s, "lon", "user_settings", "inapps"});
        f15146g = of2;
        f15147h = new HashSet(of2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r4, kotlin.coroutines.jvm.internal.d r5) {
        /*
            boolean r0 = r5 instanceof com.appodeal.ads.e4
            if (r0 == 0) goto L13
            r0 = r5
            com.appodeal.ads.e4 r0 = (com.appodeal.ads.e4) r0
            int r1 = r0.f13269s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13269s = r1
            goto L18
        L13:
            com.appodeal.ads.e4 r0 = new com.appodeal.ads.e4
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13268r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13269s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            com.appodeal.advertising.AppSetIdReceiver r5 = com.appodeal.advertising.AppSetIdReceiver.INSTANCE
            r0.f13269s = r3
            java.lang.Object r5 = r5.getAppSetId(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appId: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "AppSetId"
            r1 = 4
            r2 = 0
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r0, r4, r2, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.v4.a(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final JSONObject c() {
        JSONObject jSONObject = f15144e;
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = ((com.appodeal.ads.storage.c) f15142c.getValue()).a();
        if (strA != null) {
            return new JSONObject(strA);
        }
        return null;
    }

    public static void d(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("do_not_collect")) {
            f15147h.addAll(f15146g);
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("do_not_collect");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10, null);
                if (strOptString != null) {
                    f15147h.add(strOptString);
                }
            }
        }
    }

    public static final com.appodeal.ads.networking.cache.c e() {
        return new com.appodeal.ads.networking.cache.c((com.appodeal.ads.storage.c) f15142c.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(android.content.Context r4, kotlin.coroutines.jvm.internal.d r5) {
        /*
            boolean r0 = r5 instanceof com.appodeal.ads.i4
            if (r0 == 0) goto L13
            r0 = r5
            com.appodeal.ads.i4 r0 = (com.appodeal.ads.i4) r0
            int r1 = r0.f13413s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13413s = r1
            goto L18
        L13:
            com.appodeal.ads.i4 r0 = new com.appodeal.ads.i4
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13412r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13413s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            com.appodeal.advertising.AppSetIdReceiver r5 = com.appodeal.advertising.AppSetIdReceiver.INSTANCE
            r0.f13413s = r3
            java.lang.Object r5 = r5.getAppSetIdScope(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appSetIdScope: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "AppSetId"
            r1 = 4
            r2 = 0
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r0, r4, r2, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.v4.f(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final void g(JSONObject jSONObject) {
        if (!j() || jSONObject == null) {
            return;
        }
        Iterator it = f15147h.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }

    public static final void h(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jObject");
        com.appodeal.ads.regulator.b0 b0Var = (com.appodeal.ads.regulator.b0) f15141b.getValue();
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        b0Var.f14349d = jsonObject.has("gdpr");
        b0Var.f14350e = jsonObject.has(RemoteConfigFeature.UserConsent.CCPA);
        b0Var.f14348c = jsonObject.optBoolean(C4240b4.j.f42669b0, true);
        f15147h.clear();
        if (jsonObject.has("gdpr")) {
            d(jsonObject.optJSONObject("gdpr"));
        }
        if (jsonObject.has(RemoteConfigFeature.UserConsent.CCPA)) {
            d(jsonObject.optJSONObject(RemoteConfigFeature.UserConsent.CCPA));
        }
    }

    public static final boolean i() {
        return f15145f.getIsAdvertisingIdWasGenerated();
    }

    public static final boolean j() {
        Lazy lazy = f15141b;
        return (((com.appodeal.ads.regulator.b0) lazy.getValue()).f14349d || ((com.appodeal.ads.regulator.b0) lazy.getValue()).f14350e) && !((com.appodeal.ads.regulator.b0) lazy.getValue()).f14348c;
    }

    public static final com.appodeal.ads.storage.e0 k() {
        return com.appodeal.ads.storage.e0.f14799b;
    }

    public static final com.appodeal.ads.regulator.b0 l() {
        return new com.appodeal.ads.regulator.b0(com.appodeal.ads.context.o.f13205b);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.o4
            if (r0 == 0) goto L14
            r0 = r9
            com.appodeal.ads.o4 r0 = (com.appodeal.ads.o4) r0
            int r1 = r0.f14240u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14240u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.appodeal.ads.o4 r0 = new com.appodeal.ads.o4
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f14238s
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f14240u
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.appodeal.ads.v4 r8 = r6.f14237r
            kotlin.d.b(r9)
            goto L58
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.d.b(r9)
            kotlin.Lazy r9 = com.appodeal.ads.v4.f15141b
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            com.appodeal.ads.regulator.b0 r1 = (com.appodeal.ads.regulator.b0) r1
            boolean r3 = com.appodeal.ads.y3.a()
            java.lang.String r5 = com.appodeal.ads.Appodeal.getVersion()
            r6.f14237r = r7
            r6.f14240u = r2
            java.lang.String r4 = "appodeal"
            r2 = r8
            java.lang.Object r8 = r1.b(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L57
            return r0
        L57:
            r8 = r7
        L58:
            r8.getClass()
            kotlin.Lazy r8 = com.appodeal.ads.v4.f15143d
            java.lang.Object r8 = r8.getValue()
            com.appodeal.ads.networking.cache.c r8 = (com.appodeal.ads.networking.cache.c) r8
            org.json.JSONObject r8 = r8.a()
            if (r8 == 0) goto L6c
            h(r8)
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.v4.b(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
