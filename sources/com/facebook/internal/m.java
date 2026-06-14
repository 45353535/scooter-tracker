package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.internal.c;
import com.facebook.internal.i;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f19942a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19943b = m.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f19944c = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')'});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f19945d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f19946e = new AtomicReference(a.NOT_LOADED);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f19947f = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f19948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static JSONArray f19949h;

    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface b {
        void a(i iVar);

        void onError();
    }

    private m() {
    }

    public static final void d(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f19947f.add(callback);
        h();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f19944c);
        bundle.putString("fields", TextUtils.join(StringUtils.COMMA, arrayList));
        GraphRequest graphRequestX = GraphRequest.f19547n.x(null, "app", null);
        graphRequestX.D(true);
        graphRequestX.G(bundle);
        JSONObject jSONObjectD = graphRequestX.k().d();
        return jSONObjectD == null ? new JSONObject() : jSONObjectD;
    }

    public static final i f(String str) {
        if (str != null) {
            return (i) f19945d.get(str);
        }
        return null;
    }

    public static final Map g() {
        JSONObject jSONObject;
        Context contextM = com.facebook.s.m();
        String strN = com.facebook.s.n();
        a1 a1Var = a1.f93282a;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        String string = contextM.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
        if (!z.W(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                z.Z("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f19942a.p(jSONObject);
            }
        }
        return null;
    }

    public static final void h() {
        final Context contextM = com.facebook.s.m();
        final String strN = com.facebook.s.n();
        if (z.W(strN)) {
            f19946e.set(a.ERROR);
            f19942a.r();
            return;
        }
        if (f19945d.containsKey(strN)) {
            f19946e.set(a.SUCCESS);
            f19942a.r();
            return;
        }
        AtomicReference atomicReference = f19946e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!androidx.compose.animation.core.c.a(atomicReference, aVar, aVar2) && !androidx.compose.animation.core.c.a(atomicReference, a.ERROR, aVar2)) {
            f19942a.r();
            return;
        }
        a1 a1Var = a1.f93282a;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        com.facebook.s.t().execute(new Runnable() { // from class: com.facebook.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                m.i(contextM, str, strN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        i iVarJ = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!z.W(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                z.Z("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                iVarJ = f19942a.j(applicationId, jSONObject);
            }
        }
        m mVar = f19942a;
        JSONObject jSONObjectE = mVar.e(applicationId);
        if (jSONObjectE != null) {
            mVar.j(applicationId, jSONObjectE);
            sharedPreferences.edit().putString(settingsKey, jSONObjectE.toString()).apply();
        }
        if (iVarJ != null) {
            String strR = iVarJ.r();
            if (!f19948g && strR != null && strR.length() > 0) {
                f19948g = true;
                Log.w(f19943b, strR);
            }
        }
        h.m(applicationId, true);
        v2.k.h();
        f19946e.set(f19945d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        mVar.r();
    }

    private final List k(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (Intrinsics.areEqual(jSONObject2.getString(C4240b4.i.W), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (Intrinsics.areEqual(jSONObject3.getString(C4240b4.i.W), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    private final ArrayList l(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList3 = null;
        int i10 = 0;
        while (i10 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String string = jSONObject2.getString(C4240b4.i.W);
            if ((!Intrinsics.areEqual(string, "prod_keys") || !z10) && (!Intrinsics.areEqual(string, "test_keys") || z10)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i11 = 0;
                while (i11 < length2) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string2 = jSONObject3.getString(C4240b4.i.W);
                    if (Intrinsics.areEqual(string2, "_valueToSum") || Intrinsics.areEqual(string2, "fb_currency")) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i12 = 0;
                        while (i12 < length3) {
                            ArrayList arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i12).getString("value"));
                                i12++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(new Pair(string2, arrayList4));
                    }
                    i11++;
                    arrayList2 = arrayList;
                }
            }
            i10++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    static /* synthetic */ ArrayList m(m mVar, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mVar.l(jSONObject, z10);
    }

    private final Long n(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return Long.valueOf(jSONObject.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Map o(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                i.b.a aVar = i.b.f19931e;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                i.b bVarA = aVar.a(jSONObjectOptJSONObject);
                if (bVarA != null) {
                    String strA = bVarA.a();
                    Map map2 = (Map) map.get(strA);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strA, map2);
                    }
                    map2.put(bVarA.b(), bVarA);
                }
            }
        }
        return map;
    }

    private final Map p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                z.Z("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                z.Z("FacebookSDK", e11);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private final JSONArray q(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private final synchronized void r() {
        a aVar = (a) f19946e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            final i iVar = (i) f19945d.get(com.facebook.s.n());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f19947f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVar = (b) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.s(bVar);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f19947f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVar2 = (b) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.t(bVar2, iVar);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(b bVar) {
        bVar.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(b bVar, i iVar) {
        bVar.a(iVar);
    }

    public static final i u(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map map = f19945d;
            if (map.containsKey(applicationId)) {
                return (i) map.get(applicationId);
            }
        }
        m mVar = f19942a;
        i iVarJ = mVar.j(applicationId, mVar.e(applicationId));
        if (Intrinsics.areEqual(applicationId, com.facebook.s.n())) {
            f19946e.set(a.SUCCESS);
            mVar.r();
        }
        return iVarJ;
    }

    public final i j(String applicationId, JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        c.a aVar = c.f19855g;
        c cVarA = aVar.a(jSONArrayOptJSONArray);
        if (cVarA == null) {
            cVarA = aVar.b();
        }
        c cVar = cVarA;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        boolean z13 = (iOptInt & 256) != 0;
        boolean z14 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f19949h = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && o.b()) {
            n2.e.c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject("app_events_config");
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", v2.l.a());
        EnumSet enumSetA = w.f19982c.a(settingsJSON.optLong("seamless_login"));
        Map mapO = o(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        i iVar = new i(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetA, mapO, z10, cVar, strOptString2, strOptString3, z11, z12, jSONArrayOptJSONArray2, strOptString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), p(settingsJSON), q(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), q(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), q(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_schema"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_blocked"), k(jSONObjectOptJSONObject, "fb_currency"), k(jSONObjectOptJSONObject, "_valueToSum"), m(this, jSONObjectOptJSONObject, false, 2, null), l(jSONObjectOptJSONObject, true), n(settingsJSON.optJSONObject("app_events_config")));
        f19945d.put(applicationId, iVar);
        return iVar;
    }
}
