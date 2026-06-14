package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.purchase.ADJPConstants;
import com.facebook.GraphRequest;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f19898a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19899b = v0.b(h.class).getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f19900c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f19901d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f19902e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Long f19903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a3.b f19904g;

    public interface a {
        void onCompleted();
    }

    private h() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString(ADJPConstants.KEY_SDK_VERSION, com.facebook.s.z());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.c cVar = GraphRequest.f19547n;
        a1 a1Var = a1.f93282a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        GraphRequest graphRequestX = cVar.x(null, str2, null);
        graphRequestX.G(bundle);
        JSONObject jSONObjectD = graphRequestX.k().d();
        return jSONObjectD == null ? new JSONObject() : jSONObjectD;
    }

    public static final boolean d(String name, String str, boolean z10) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map mapE = f19898a.e(str);
        return (mapE.containsKey(name) && (bool = (Boolean) mapE.get(name)) != null) ? bool.booleanValue() : z10;
    }

    private final boolean f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    public static final synchronized void h(a aVar) {
        if (aVar != null) {
            try {
                f19901d.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final String strN = com.facebook.s.n();
        h hVar = f19898a;
        if (hVar.f(f19903f) && f19902e.containsKey(strN)) {
            hVar.k();
            return;
        }
        final Context contextM = com.facebook.s.m();
        a1 a1Var = a1.f93282a;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        if (contextM == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextM.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!z.W(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                z.Z("FacebookSDK", e10);
            }
            if (jSONObject != null) {
                j(strN, jSONObject);
            }
        }
        Executor executorT = com.facebook.s.t();
        if (executorT == null) {
            return;
        }
        if (f19900c.compareAndSet(false, true)) {
            executorT.execute(new Runnable() { // from class: com.facebook.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.i(strN, contextM, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        h hVar = f19898a;
        JSONObject jSONObjectC = hVar.c(applicationId);
        if (jSONObjectC.length() != 0) {
            j(applicationId, jSONObjectC);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, jSONObjectC.toString()).apply();
            f19903f = Long.valueOf(System.currentTimeMillis());
        }
        hVar.k();
        f19900c.set(false);
    }

    public static final synchronized JSONObject j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject2 = (JSONObject) f19902e.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject3.getString(C4240b4.i.W), jSONObject3.getBoolean("value"));
                } catch (JSONException e10) {
                    z.Z("FacebookSDK", e10);
                }
            }
            f19902e.put(applicationId, jSONObject2);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f19901d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVar = (a) concurrentLinkedQueue.poll();
            if (aVar != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.l(aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.onCompleted();
    }

    public static final JSONObject m(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map map = f19902e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = (JSONObject) map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectC = f19898a.c(applicationId);
        Context contextM = com.facebook.s.m();
        a1 a1Var = a1.f93282a;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        contextM.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectC.toString()).apply();
        return j(applicationId, jSONObjectC);
    }

    public final Map e(String str) {
        g();
        if (str != null) {
            Map map = f19902e;
            if (map.containsKey(str)) {
                a3.b bVar = f19904g;
                List<a3.a> listA = bVar != null ? bVar.a(str) : null;
                if (listA != null) {
                    HashMap map2 = new HashMap();
                    for (a3.a aVar : listA) {
                        map2.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map3.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                a3.b bVar2 = f19904g;
                if (bVar2 == null) {
                    bVar2 = new a3.b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new a3.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f19904g = bVar2;
                return map3;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h(null);
    }
}
