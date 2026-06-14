package com.appodeal.ads.networking.usecases;

import com.adjust.sdk.purchase.ADJPConstants;
import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.k7;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.networking.f;
import com.appodeal.ads.networking.g;
import com.appodeal.ads.networking.h;
import com.appodeal.ads.networking.i;
import com.appodeal.ads.networking.j;
import com.appodeal.ads.networking.k;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.C4240b4;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7 f14181a;

    public b() {
        k7 appodealNetworkRequestApi = k7.f13545a;
        Intrinsics.checkNotNullParameter(appodealNetworkRequestApi, "appodealNetworkRequestApi");
        this.f14181a = appodealNetworkRequestApi;
    }

    public static k a(JSONObject jSONObject) {
        g gVar;
        f fVar;
        g gVar2;
        h hVar;
        i iVar;
        j jVar;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("appsflyer");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("dev_key");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = jSONObjectOptJSONObject.optString("app_id");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            String strOptString3 = jSONObjectOptJSONObject.optString("ad_id");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            List listAsList = JsonExtKt.asList(jSONObjectOptJSONObject.optJSONArray("conversion_keys"));
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("event_tracking", false);
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ad_revenue_tracking", false);
            long jOptLong = jSONObjectOptJSONObject.optLong("tmax", 15000L);
            String strOptString4 = jSONObjectOptJSONObject.optString(C4240b4.a.f42515t);
            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("internal_event_tracking", false);
            String strOptString5 = jSONObjectOptJSONObject.optString("tracking_mode", "legacy");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            gVar = new g(strOptString, strOptString2, strOptString3, listAsList, zOptBoolean, zOptBoolean2, zOptBoolean3, strOptString5, jOptLong, strOptString4);
        } else {
            gVar = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adjust");
        if (jSONObjectOptJSONObject2 != null) {
            String strOptString6 = jSONObjectOptJSONObject2.optString("app_token");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            Map map = JsonExtKt.toMap(jSONObjectOptJSONObject2.optJSONObject("events"));
            String strOptString7 = jSONObjectOptJSONObject2.optString(ADJPConstants.KEY_ENVIRONMENT);
            Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(...)");
            fVar = new f(strOptString6, strOptString7, map, jSONObjectOptJSONObject2.optBoolean("event_tracking", false), jSONObjectOptJSONObject2.optBoolean("ad_revenue_tracking", false), jSONObjectOptJSONObject2.optLong("tmax", 15000L), jSONObjectOptJSONObject2.optString(C4240b4.a.f42515t));
        } else {
            fVar = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("facebook_analytics");
        if (jSONObjectOptJSONObject3 != null) {
            gVar2 = gVar;
            hVar = new h(jSONObjectOptJSONObject3.optBoolean("event_tracking", false), jSONObjectOptJSONObject3.optBoolean("ad_revenue_tracking", false), jSONObjectOptJSONObject3.optLong("tmax", 15000L));
        } else {
            gVar2 = gVar;
            hVar = null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(RemoteConfigComponent.DEFAULT_NAMESPACE);
        if (jSONObjectOptJSONObject4 != null) {
            List listAsList2 = JsonExtKt.asList(jSONObjectOptJSONObject4.optJSONArray("config_keys"));
            long jOptLong2 = jSONObjectOptJSONObject4.optLong("expiration_duration");
            Long lValueOf = jOptLong2 != 0 ? Long.valueOf(jOptLong2) : null;
            boolean zOptBoolean4 = jSONObjectOptJSONObject4.optBoolean("event_tracking", false);
            boolean zOptBoolean5 = jSONObjectOptJSONObject4.optBoolean("ad_revenue_tracking", false);
            String strOptString8 = jSONObjectOptJSONObject4.optString("ad_revenue_key", ServiceOptions.Firebase.DefaultAdRevenueKey);
            Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(...)");
            iVar = new i(listAsList2, lValueOf, zOptBoolean4, zOptBoolean5, jSONObjectOptJSONObject4.optBoolean("internal_event_tracking", false), strOptString8, jSONObjectOptJSONObject4.optLong("tmax", 15000L), jSONObjectOptJSONObject4.optString(C4240b4.a.f42515t));
        } else {
            iVar = null;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("sentry_analytics");
        if (jSONObjectOptJSONObject5 != null) {
            String strOptString9 = jSONObjectOptJSONObject5.optString("sentry_dsn");
            Intrinsics.checkNotNullExpressionValue(strOptString9, "optString(...)");
            String strOptString10 = jSONObjectOptJSONObject5.optString("sentry_environment", "production");
            Intrinsics.checkNotNullExpressionValue(strOptString10, "optString(...)");
            boolean zOptBoolean6 = jSONObjectOptJSONObject5.optBoolean("sentry_collect_threads", false);
            boolean zOptBoolean7 = jSONObjectOptJSONObject5.optBoolean("sentry_event_tracking", false);
            boolean zOptBoolean8 = jSONObjectOptJSONObject5.optBoolean("attach_view_hierarchy", false);
            String strOptString11 = jSONObjectOptJSONObject5.optString("breadcrumbs", "off");
            Intrinsics.checkNotNullExpressionValue(strOptString11, "optString(...)");
            jVar = new j(strOptString9, strOptString10, zOptBoolean6, zOptBoolean7, zOptBoolean8, strOptString11, jSONObjectOptJSONObject5.optInt("max_breadcrumbs", 100), jSONObjectOptJSONObject5.optBoolean("internal_event_tracking", false), jSONObjectOptJSONObject5.optLong("tmax", 15000L));
        } else {
            jVar = null;
        }
        return new k(gVar2, fVar, hVar, iVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.appodeal.ads.networking.usecases.a
            if (r0 == 0) goto L13
            r0 = r5
            com.appodeal.ads.networking.usecases.a r0 = (com.appodeal.ads.networking.usecases.a) r0
            int r1 = r0.f14180u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14180u = r1
            goto L18
        L13:
            com.appodeal.ads.networking.usecases.a r0 = new com.appodeal.ads.networking.usecases.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14178s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14180u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.appodeal.ads.networking.usecases.b r0 = r0.f14177r
            kotlin.d.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.l()
            goto L4a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.d.b(r5)
            com.appodeal.ads.k7 r5 = r4.f14181a
            r0.f14177r = r4
            r0.f14180u = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            boolean r1 = kotlin.Result.j(r5)
            if (r1 == 0) goto L83
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "Required value was null."
            if (r5 == 0) goto L72
            java.lang.String r2 = "services"
            org.json.JSONObject r5 = r5.optJSONObject(r2)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6a
            com.appodeal.ads.networking.k r5 = a(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L6a
            return r5
        L6a:
            r5 = move-exception
            goto L78
        L6c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            throw r5     // Catch: java.lang.Throwable -> L6a
        L72:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            throw r5     // Catch: java.lang.Throwable -> L6a
        L78:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r5 = kotlin.d.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        L83:
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.usecases.b.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
