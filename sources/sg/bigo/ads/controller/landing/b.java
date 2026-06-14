package sg.bigo.ads.controller.landing;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.a.a;
import sg.bigo.ads.api.b.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a.c, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f103750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f103751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f103752c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f103755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f103756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.c<?, ?> f103757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.controller.landing.a f103758i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f103761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f103762m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103754e = "ChromeTabStatSession";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f103759j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f103760k = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f103753d = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<h.a> f103763n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f103764o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f103765p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f103766q = false;

    static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103768b;

        private a(int i10, long j10) {
            this.f103767a = i10;
            this.f103768b = System.currentTimeMillis() - j10;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f103767a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f103768b;
        }

        /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }
    }

    public b(String str, @Nullable sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, @Nullable sg.bigo.ads.controller.landing.a aVar) {
        long jCurrentTimeMillis;
        this.f103755f = str;
        this.f103756g = bVar;
        this.f103757h = cVar;
        this.f103758i = aVar;
        if (cVar != null) {
            this.f103761l = cVar.s();
            jCurrentTimeMillis = cVar.t();
        } else {
            this.f103761l = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f103762m = jCurrentTimeMillis;
    }

    @Override // sg.bigo.ads.a.a.c
    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs shown: " + this.f103755f);
        a(1);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page started: " + this.f103755f);
        this.f103753d = SystemClock.elapsedRealtime();
        this.f103759j = this.f103759j + 1;
        if (this.f103764o.compareAndSet(true, false)) {
            a(4);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void c() {
        this.f103760k = true;
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page aborted: " + this.f103755f);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page failed: " + this.f103755f);
        if (this.f103766q) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page finished: " + this.f103755f);
        this.f103766q = true;
        if (this.f103765p.compareAndSet(true, false)) {
            a(5);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs hidden: " + this.f103755f);
        sg.bigo.ads.core.d.b.a(this, this.f103763n.isEmpty() ? null : this.f103763n.get(0), System.currentTimeMillis() - this.f103762m, this.f103759j, this.f103756g, this.f103757h, (String) null);
    }

    @Override // sg.bigo.ads.api.b.h
    public final int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.f103755f;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f103766q ? 100 : 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f103758i;
        return aVar != null && aVar.f103731d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f103761l;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        if (!this.f103760k && TextUtils.isEmpty(this.f103750a) && TextUtils.isEmpty(this.f103752c) && TextUtils.isEmpty(this.f103751b)) {
            return null;
        }
        HashMap map = new HashMap();
        if (this.f103760k) {
            map.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.f103750a)) {
            map.put("chrome_pkg", this.f103750a);
        }
        if (!TextUtils.isEmpty(this.f103752c)) {
            map.put("is_chrome_def", TextUtils.equals(this.f103750a, this.f103752c) ? "1" : "0");
        }
        if (!TextUtils.isEmpty(this.f103751b)) {
            map.put("chrome_ver", this.f103751b);
        }
        return map;
    }

    private void a(int i10) {
        a aVar = new a(i10, this.f103762m, (byte) 0);
        this.f103763n.add(0, aVar);
        sg.bigo.ads.core.d.b.a(this, aVar, this.f103756g, this.f103757h, (String) null);
    }
}
