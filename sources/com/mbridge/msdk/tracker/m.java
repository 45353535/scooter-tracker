package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f51845b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f51846a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f51846a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f51848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f51849b;

        b(e eVar, JSONObject jSONObject) {
            this.f51848a = eVar;
            this.f51849b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f51846a.g().a(this.f51848a);
                JSONObject jSONObject = this.f51849b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f51849b.put("track_time", jArrE[0]);
                    this.f51849b.put("track_count", jArrE[1]);
                    this.f51848a.a(this.f51849b);
                }
                this.f51848a.b(m.this.f51846a.b().f52046f);
                m.this.f51846a.g().b(this.f51848a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f51846a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m b(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f51845b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public JSONObject c() {
        return this.f51846a.o();
    }

    public String d() {
        return this.f51846a.s();
    }

    public long[] e() {
        return this.f51846a.g().a();
    }

    public String f() {
        return this.f51846a.v();
    }

    public boolean g() {
        return !this.f51846a.w();
    }

    public String h() {
        if (!g()) {
            return this.f51846a.x();
        }
        if (com.mbridge.msdk.tracker.a.f51797a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f51845b;
        m mVar = concurrentHashMap.get(str);
        if (y.b(mVar)) {
            concurrentHashMap.put(str, new m(str, context, xVar));
        } else {
            mVar.f51846a.a(xVar);
        }
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f51846a.w()) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has("ts")) {
                try {
                    jSONObjectI.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f51846a.h().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f51845b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public void a() {
        try {
            this.f51846a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f51846a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f51846a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
