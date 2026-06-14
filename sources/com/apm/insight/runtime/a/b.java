package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8027a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8028b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f8029c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8030d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f8031e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f8032f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f8033z;
    private int B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f8034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f8035h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f8043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f8044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f8045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f8046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f8047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f8048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f8049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f8050w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f8036i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f8037j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f8038k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f8039l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f8040m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8051x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f8052y = -1;
    private int A = 50;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f8054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f8055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f8056c;

        a(String str, String str2, long j10) {
            this.f8055b = str2;
            this.f8056c = j10;
            this.f8054a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f8056c)) + " : " + this.f8054a + ' ' + this.f8055b;
        }
    }

    private b(@NonNull Application application) {
        this.f8035h = application;
        this.f8034g = application;
        if (application != null) {
            try {
                this.f8034g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f8041n = activity.getClass().getName();
                        b.this.f8042o = System.currentTimeMillis();
                        boolean unused = b.f8028b = bundle != null;
                        boolean unused2 = b.f8029c = true;
                        b.this.f8036i.add(b.this.f8041n);
                        b.this.f8037j.add(Long.valueOf(b.this.f8042o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f8041n, b.this.f8042o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f8036i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f8036i.size()) {
                            b.this.f8036i.remove(iIndexOf);
                            b.this.f8037j.remove(iIndexOf);
                        }
                        b.this.f8038k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f8039l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f8047t = activity.getClass().getName();
                        b.this.f8048u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f8051x = false;
                            boolean unused = b.f8029c = false;
                            b.this.f8052y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f8051x = false;
                            boolean unused2 = b.f8029c = false;
                            b.this.f8052y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f8047t, b.this.f8048u, C4240b4.i.f42653t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f8045r = activity.getClass().getName();
                        b.this.f8046s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f8051x) {
                            if (b.f8027a) {
                                b.k();
                                int unused = b.f8030d = 1;
                                long unused2 = b.f8032f = b.this.f8046s;
                            }
                            if (!b.this.f8045r.equals(b.this.f8047t)) {
                                return;
                            }
                            if (b.f8029c && !b.f8028b) {
                                int unused3 = b.f8030d = 4;
                                long unused4 = b.f8032f = b.this.f8046s;
                                return;
                            } else if (!b.f8029c) {
                                int unused5 = b.f8030d = 3;
                                long unused6 = b.f8032f = b.this.f8046s;
                                return;
                            }
                        }
                        b.this.f8051x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f8045r, b.this.f8046s, C4240b4.i.f42655u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f8043p = activity.getClass().getName();
                        b.this.f8044q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f8043p, b.this.f8044q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f8049v = activity.getClass().getName();
                        b.this.f8050w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f8049v, b.this.f8050w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    static /* synthetic */ boolean k() {
        f8027a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f8036i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f8036i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f8036i.get(i10), this.f8037j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f8038k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f8038k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f8038k.get(i10), this.f8039l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f8041n, this.f8042o));
                jSONObject.put("last_start_activity", a(this.f8043p, this.f8044q));
                jSONObject.put("last_resume_activity", a(this.f8045r, this.f8046s));
                jSONObject.put("last_pause_activity", a(this.f8047t, this.f8048u));
                jSONObject.put("last_stop_activity", a(this.f8049v, this.f8050w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f8045r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f8040m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f8051x;
    }

    public static long c() {
        return f8032f;
    }

    public static b d() {
        if (f8033z == null) {
            synchronized (b.class) {
                try {
                    if (f8033z == null) {
                        f8033z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f8033z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f8052y;
    }

    public static int b() {
        int i10 = f8030d;
        return i10 == 1 ? f8031e ? 2 : 1 : i10;
    }

    public static void a() {
        f8031e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f8040m.size() >= bVar.A) {
                    aVar = bVar.f8040m.poll();
                    if (aVar != null) {
                        bVar.f8040m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f8040m.add(aVar);
                }
                aVar.f8055b = str2;
                aVar.f8054a = str;
                aVar.f8056c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
