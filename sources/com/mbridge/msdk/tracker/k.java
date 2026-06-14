package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f51830o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f51832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f51833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f51834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f51835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f51836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f51837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f51838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f51839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f51840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f51841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile s f51842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f51843m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f51844n;

    k(String str, m mVar) {
        this.f51831a = str;
        this.f51832b = mVar;
    }

    void a(Context context) {
        this.f51833c = context;
    }

    x b() {
        x xVar = this.f51834d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f51834d = xVarA;
        return xVarA;
    }

    Context c() {
        return this.f51833c;
    }

    c d() {
        if (y.b(this.f51838h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f51838h)) {
                        String strT = t();
                        this.f51838h = new c(new b(c(), e(), strT), strT);
                    }
                } finally {
                }
            }
        }
        return this.f51838h;
    }

    String e() {
        return TextUtils.isEmpty(v()) ? String.format("track_manager_%s.db", "default") : String.format("track_manager_%s.db", v());
    }

    d f() {
        if (y.b(this.f51840j)) {
            this.f51840j = b().f52048h;
        }
        return this.f51840j;
    }

    l g() {
        if (y.b(this.f51839i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f51839i)) {
                        this.f51839i = new q(new g(d(), p()));
                    }
                } finally {
                }
            }
        }
        return this.f51839i;
    }

    j h() {
        if (y.b(this.f51841k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f51841k)) {
                        this.f51841k = new j();
                    }
                } finally {
                }
            }
        }
        return this.f51841k;
    }

    int i() {
        if (b().f52041a < 0) {
            return 50;
        }
        return b().f52041a;
    }

    int j() {
        return Math.max(b().f52045e, 0);
    }

    int k() {
        if (b().f52044d <= 0) {
            return 2;
        }
        return b().f52044d;
    }

    int l() {
        return Math.max(b().f52042b, 0);
    }

    o m() {
        if (y.b(this.f51844n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f51844n)) {
                        this.f51844n = new o(k(), n(), r(), q());
                    }
                } finally {
                }
            }
        }
        return this.f51844n;
    }

    p n() {
        return b().f52047g;
    }

    JSONObject o() {
        JSONObject jSONObject = this.f51835e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f51835e = jSONObject2;
        return jSONObject2;
    }

    s p() {
        if (y.b(this.f51842l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f51842l)) {
                        this.f51842l = new s(this);
                    }
                } finally {
                }
            }
        }
        return this.f51842l;
    }

    int q() {
        return b().f52043c;
    }

    w r() {
        return b().f52049i;
    }

    String s() {
        if (!TextUtils.isEmpty(f51830o)) {
            return f51830o;
        }
        String string = UUID.randomUUID().toString();
        f51830o = string;
        return string;
    }

    String t() {
        return "event_table";
    }

    m u() {
        return this.f51832b;
    }

    String v() {
        return this.f51831a;
    }

    boolean w() {
        return this.f51843m;
    }

    String x() {
        if (!y.b(this.f51833c) && !y.b(this.f51834d)) {
            try {
                p().j();
                this.f51843m = false;
                if (TextUtils.isEmpty(f51830o)) {
                    f51830o = UUID.randomUUID().toString();
                }
                return f51830o;
            } catch (Exception e10) {
                if (a.f51797a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f51843m = true;
            }
        }
        return "";
    }

    void a(x xVar) {
        this.f51834d = xVar;
    }

    void a(JSONObject jSONObject) {
        this.f51835e = jSONObject;
    }

    boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f52050j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f51797a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if (this.f51837g != null) {
            try {
                return !r0.contains(strG);
            } catch (Exception e11) {
                if (a.f51797a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list = this.f51836f;
        if (list != null) {
            try {
                return list.contains(strG);
            } catch (Exception e12) {
                if (a.f51797a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    boolean a() throws IllegalStateException {
        if (!y.b(b())) {
            if (!y.b(f())) {
                if (!y.b(r())) {
                    if (!y.b(n()) && !y.b(n().b())) {
                        if (TextUtils.isEmpty(n().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
