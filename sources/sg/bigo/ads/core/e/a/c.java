package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.core.e.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Map<String, String> f104073a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected q f104078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected f f104079g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f104088p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f104080h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f104081i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f104082j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f104083k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104074b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104075c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104076d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104077e = new CopyOnWriteArrayList<>();

    public c(q qVar) {
        this.f104078f = qVar;
        HashMap map = new HashMap();
        this.f104073a = map;
        this.f104079g = new f(this.f104078f, map);
    }

    public final void a(int i10) {
        this.f104088p = i10;
        f fVar = this.f104079g;
        if (fVar != null) {
            fVar.f104143r = i10;
        }
    }

    protected final void b(final Context context, boolean z10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f104078f.f102217a;
        Iterator<e> it = this.f104077e.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z11) {
            this.f104083k = jCurrentTimeMillis;
            this.f104087o = new CopyOnWriteArrayList<>();
            for (e eVar : this.f104077e) {
                if (!z10 || eVar.a()) {
                    if (eVar.c()) {
                        this.f104087o.add(eVar);
                    }
                }
            }
            if (this.f104087o.size() > 0) {
                f fVar = this.f104079g;
                fVar.f104147v = this.f104087o;
                fVar.f104141p = jCurrentTimeMillis;
                fVar.f104140o = 0;
                d.a().a(this.f104079g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdLUrl not need retry");
        }
        for (final e eVar2 : this.f104077e) {
            if (!z10 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "lurl_track", eVar2, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "lurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        h hVarA = h.a(this.f104073a, this.f104078f, this.f104088p, str, str2, str3);
        hVarA.a(context, hVarA.f104153a);
    }

    public final void b(@NonNull String str, @NonNull String str2) {
        for (e eVar : this.f104074b) {
            if (eVar.c()) {
                eVar.a(str, str2);
            }
        }
        for (e eVar2 : this.f104075c) {
            if (eVar2.c()) {
                eVar2.a(str, str2);
            }
        }
        for (e eVar3 : this.f104076d) {
            if (eVar3.c()) {
                eVar3.a(str, str2);
            }
        }
        for (e eVar4 : this.f104077e) {
            if (eVar4.c()) {
                eVar4.a(str, str2);
            }
        }
    }

    private void a(Context context, final String str, final e eVar, final boolean z10) {
        String str2 = eVar.f104122b;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i10 = eVar.f104123c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i10, str, aVarD, str2, this.f104088p, this.f104073a, new b.a() { // from class: sg.bigo.ads.core.e.a.c.5
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                e eVar2 = eVar;
                if (eVar2.f104124d == 1) {
                    c.a(c.this, str, eVar2, true);
                }
                d.a().b(c.this.f104079g);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                c.a(c.this, str, eVar, z10);
                d.a().b(c.this.f104079g);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i11) {
                return c.this.f104078f.a(i11);
            }
        });
    }

    protected final void a(final Context context, boolean z10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f104078f.f102217a;
        Iterator<e> it = this.f104076d.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z11) {
            this.f104082j = jCurrentTimeMillis;
            this.f104086n = new CopyOnWriteArrayList<>();
            for (e eVar : this.f104076d) {
                if (!z10 || eVar.a()) {
                    if (eVar.c()) {
                        this.f104086n.add(eVar);
                    }
                }
            }
            if (this.f104086n.size() > 0) {
                f fVar = this.f104079g;
                fVar.f104146u = this.f104086n;
                fVar.f104139n = jCurrentTimeMillis;
                fVar.f104138m = 0;
                d.a().a(this.f104079g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdNUrl not need retry");
        }
        for (final e eVar2 : this.f104076d) {
            if (!z10 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "nurl_track", eVar2, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "nurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    protected final void a(final Context context, boolean z10, int i10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f104078f.f102217a;
        for (e eVar : this.f104074b) {
            if (i10 > 0) {
                eVar.a("ad_imp_indx", String.valueOf(i10));
            }
            eVar.e();
        }
        if (z11) {
            this.f104080h = jCurrentTimeMillis;
            this.f104084l = new CopyOnWriteArrayList<>();
            for (e eVar2 : this.f104074b) {
                if (!z10 || eVar2.a()) {
                    if (eVar2.c()) {
                        this.f104084l.add(eVar2);
                    }
                }
            }
            if (this.f104084l.size() > 0) {
                f fVar = this.f104079g;
                fVar.f104144s = this.f104084l;
                fVar.f104135j = jCurrentTimeMillis;
                fVar.f104134i = 0;
                d.a().a(this.f104079g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdImpression not need retry");
        }
        for (final e eVar3 : this.f104074b) {
            if (!z10 || eVar3.a()) {
                if (eVar3.c()) {
                    a(context, "impl_track", eVar3, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "impl_track", eVar3);
                        }
                    });
                }
            }
        }
    }

    protected final void a(final Context context, boolean z10, int i10, int i11) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f104078f.f102217a;
        for (e eVar : this.f104075c) {
            if (i10 > 0) {
                eVar.a("ad_click_indx", String.valueOf(i10));
            }
            if (i11 > 0) {
                eVar.a("ad_imp_indx", String.valueOf(i11));
            }
            eVar.e();
        }
        if (z11) {
            this.f104081i = jCurrentTimeMillis;
            this.f104085m = new CopyOnWriteArrayList<>();
            for (e eVar2 : this.f104075c) {
                if (!z10 || eVar2.a()) {
                    if (eVar2.c()) {
                        this.f104085m.add(eVar2);
                    }
                }
            }
            if (this.f104085m.size() > 0) {
                f fVar = this.f104079g;
                fVar.f104145t = this.f104085m;
                fVar.f104137l = jCurrentTimeMillis;
                fVar.f104136k = 0;
                d.a().a(this.f104079g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdClick not need retry");
        }
        for (final e eVar3 : this.f104075c) {
            if (!z10 || eVar3.a()) {
                if (eVar3.c()) {
                    a(context, "click_track", eVar3, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "click_track", eVar3);
                        }
                    });
                }
            }
        }
    }

    protected final void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f104073a.put(str, str2);
    }

    final void a(String str, String str2, sg.bigo.ads.common.u.a aVar, String str3) {
        HashMap map = new HashMap(this.f104073a);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        map.put("action", str);
        map.put("track_url", aVar.a());
        map.put("domain_front", aVar.e() ? aVar.d() : "");
        map.put("track_name", str3);
        map.put("states", str2);
        map.put("retry", "0");
        map.put("out_ad", String.valueOf(this.f104088p));
        if ("impl_track".equals(str)) {
            sg.bigo.ads.core.d.b.a(map);
        } else if ("click_track".equals(str)) {
            sg.bigo.ads.core.d.b.b(map);
        }
    }

    static /* synthetic */ void a(c cVar, Context context, final String str, e eVar) {
        String strA = eVar.d().a();
        final String str2 = eVar.f104122b;
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            strA = strA.replaceAll("\\?", "%3f");
        }
        cVar.a(str, "start", new sg.bigo.ads.common.u.b.d(strA), str2);
        final sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        if (eVarA != null) {
            eVarA.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.core.e.a.c.6
                @Override // sg.bigo.ads.core.h.d
                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    eVarA.destroy();
                }

                @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    c.this.a(str, "success", new sg.bigo.ads.common.u.b.d(str3), str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                int i10 = eVar.f104121a;
                if (i10 == 1) {
                    eVarA.loadUrl(strA);
                } else if (i10 == 2) {
                    eVarA.loadData(strA, "text/html", "UTF-8");
                }
            } catch (Exception e10) {
                sg.bigo.ads.core.d.b.a(3002, 10106, e10.getMessage());
            }
        }
    }

    static /* synthetic */ void a(c cVar, String str, e eVar, boolean z10) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        CopyOnWriteArrayList<e> copyOnWriteArrayList2;
        CopyOnWriteArrayList<e> copyOnWriteArrayList3;
        CopyOnWriteArrayList<e> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList4 = cVar.f104084l) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(eVar);
            return;
        }
        if ("click_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList3 = cVar.f104085m) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(eVar);
            return;
        }
        if ("nurl_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList2 = cVar.f104086n) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(eVar);
            return;
        }
        if ("lurl_track".equals(str) && z10 && (copyOnWriteArrayList = cVar.f104087o) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }
}
