package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.modules.common.internal.Constants;
import eg.q1;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14783a = lf.i.a(new Function0() { // from class: com.appodeal.ads.storage.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a0.j();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14784b = lf.i.a(new Function0() { // from class: com.appodeal.ads.storage.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a0.h(this.f14843b);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14785c = new LinkedHashMap();

    public static final CoroutineScope h(a0 a0Var) {
        return kotlinx.coroutines.i.a(((kotlinx.coroutines.s) a0Var.f14783a.getValue()).plus(new eg.e0("AdpKeyValueStorage")));
    }

    public static final kotlinx.coroutines.s j() {
        return q1.b("shared_prefs");
    }

    @Override // com.appodeal.ads.storage.c
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        return eg.g.g((kotlinx.coroutines.s) this.f14783a.getValue(), new j(this, null), dVar);
    }

    @Override // com.appodeal.ads.storage.c
    public final Triple b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = key + "_timestamp";
        String str2 = key + "_wst";
        d dVar = d.f14788c;
        String string = c(dVar).getString(key, null);
        return new Triple(string != null ? new JSONObject(string) : null, Long.valueOf(c(dVar).getLong(str, 0L)), Integer.valueOf(c(dVar).getInt(str2, Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD)));
    }

    @Override // com.appodeal.ads.storage.c
    public final void c(String userToken) {
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new w(this, userToken, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final Long e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d dVar = d.f14790e;
        if (c(dVar).contains(key)) {
            return Long.valueOf(c(dVar).getLong(key, 0L));
        }
        return null;
    }

    public final void f(com.appodeal.ads.utils.session.b appTimes) {
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        c(d.f14788c).edit().putLong("app_uptime", appTimes.f15053b).putLong("app_uptime_m", appTimes.f15054c).putLong("session_id", appTimes.f15052a).apply();
    }

    public final void g(com.appodeal.ads.utils.session.e session) {
        Intrinsics.checkNotNullParameter(session, "session");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new u(this, session, null), 3, null);
    }

    public final void i(long j10) {
        c(d.f14788c).edit().putLong("first_ad_session_launch_time", j10).putLong("session_id", 0L).putLong("app_uptime", 0L).putLong("app_uptime_m", 0L).apply();
    }

    public final int k() {
        return (int) c(d.f14788c).getLong("session_id", 0L);
    }

    public final void l(String sessionsInfoJsonString) {
        Intrinsics.checkNotNullParameter(sessionsInfoJsonString, "sessionsInfoJsonString");
        c(d.f14788c).edit().putString("sessions_array", sessionsInfoJsonString).apply();
    }

    @Override // com.appodeal.ads.storage.c
    public final void d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new g(this, key, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(long j10) {
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new f(this, j10, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final String c() {
        return c(d.f14788c).getString("appKey", null);
    }

    public final Object e(Continuation continuation) {
        Object objG = eg.g.g((kotlinx.coroutines.s) this.f14783a.getValue(), new k(this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final SharedPreferences c(d dVar) {
        Object obj = this.f14785c.get(dVar);
        if (obj != null) {
            return ((b) obj).a();
        }
        throw new IllegalArgumentException(("Prefs " + dVar + " is not initialized").toString());
    }

    @Override // com.appodeal.ads.storage.c
    public final void d() {
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new l(this, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new h(this, key, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(int i10) {
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new q(this, i10, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final void b(String key, String jsonString, long j10, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new t(this, key, jsonString, key + "_timestamp", j10, key + "_wst", i10, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        eg.i.d((CoroutineScope) this.f14784b.getValue(), null, null, new v(this, key, j10, null), 3, null);
    }

    @Override // com.appodeal.ads.storage.c
    public final String a() {
        return c(d.f14788c).getString("user_token", null);
    }

    @Override // com.appodeal.ads.storage.c
    public final int b() {
        return c(d.f14788c).getInt("success_last_index", 0);
    }
}
