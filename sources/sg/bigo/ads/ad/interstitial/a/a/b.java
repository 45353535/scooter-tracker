package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.a.b.b;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.c.c;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.mraid.c;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements b.InterfaceC1211b, sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.api.core.b f100591a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f100595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    sg.bigo.ads.core.c.b f100596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f100597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    WebView f100598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f100599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f100600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f100601k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    final b.a f100604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f100605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f100606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a.C1291a f100607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f100608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final p f100609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final Ad f100610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f100611u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f100592b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f100593c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f100594d = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f100602l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final C1220b f100603m = new C1220b(0);

    final class a {
        private a() {
        }

        @JavascriptInterface
        public final void gameEnd(String str) {
            b.a aVar = b.this.f100604n;
            if (aVar != null) {
                aVar.b();
            }
        }

        @JavascriptInterface
        public final void onBGNDomContentLoaded() {
            b bVar = b.this;
            bVar.f100601k = true;
            b.a aVar = bVar.f100604n;
            if (aVar != null) {
                aVar.c(bVar.f100591a, SystemClock.elapsedRealtime() - b.this.f100595e);
            }
        }

        @JavascriptInterface
        public final void onBGNLoaded() {
            b bVar = b.this;
            bVar.f100600j = true;
            b.a aVar = bVar.f100604n;
            if (aVar != null) {
                aVar.b(bVar.f100591a, SystemClock.elapsedRealtime() - b.this.f100595e);
            }
        }

        /* synthetic */ a(b bVar, byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a.b$b, reason: collision with other inner class name */
    static final class C1220b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f100616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f100617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Activity> f100618c;

        private C1220b() {
            this.f100616a = false;
            this.f100617b = -1;
        }

        private void b() {
            if (this.f100616a) {
                int i10 = this.f100617b;
                this.f100617b = -1;
                if (i10 == 0 || i10 == 1) {
                    WeakReference<Activity> weakReference = this.f100618c;
                    Activity activity = weakReference == null ? null : weakReference.get();
                    if (activity == null) {
                        return;
                    }
                    activity.setRequestedOrientation(i10);
                }
            }
        }

        final void a() {
            this.f100616a = true;
            b();
        }

        /* synthetic */ C1220b(byte b10) {
            this();
        }

        public final void a(Activity activity, int i10) {
            this.f100617b = i10;
            this.f100618c = new WeakReference<>(activity);
            b();
        }
    }

    public b(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable a.C1291a c1291a, @Nullable b.a aVar) {
        this.f100607q = c1291a;
        this.f100606p = c1291a == null ? null : c1291a.f104180b;
        this.f100608r = cVar;
        this.f100609s = pVar;
        this.f100610t = ad2;
        this.f100591a = bVar;
        this.f100604n = aVar;
        this.f100605o = !TextUtils.isEmpty(r7);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f100599i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f100605o) {
            return this.f100593c;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "resume");
        e eVar = this.f100611u;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "pause");
        e eVar = this.f100611u;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "release");
        sg.bigo.ads.ad.banner.b.h(this);
        sg.bigo.ads.core.c.b bVar = this.f100596f;
        if (bVar != null) {
            bVar.b();
        }
        e eVar = this.f100611u;
        if (eVar != null) {
            eVar.e();
            this.f100611u = null;
        }
        WebView webView = this.f100598h;
        if (webView != null) {
            u.b(webView);
            this.f100598h = null;
        }
        this.f100597g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        b.a aVar;
        if (this.f100600j || this.f100601k || this.f100602l || (aVar = this.f100604n) == null || this.f100595e <= 0) {
            return;
        }
        aVar.d(this.f100591a, SystemClock.elapsedRealtime() - this.f100595e);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            this.f100603m.a();
            sg.bigo.ads.core.player.c cVar = this.f100608r;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        int i12;
        int i13;
        WebView webView = this.f100598h;
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        a.C1291a c1291a = this.f100607q;
        int i14 = 0;
        if (c1291a != null) {
            i13 = c1291a.f104181c;
            i12 = c1291a.f104182d;
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (sg.bigo.ads.common.utils.e.a(context, i13) <= i10 && sg.bigo.ads.common.utils.e.a(context, i12) <= i11) {
            i14 = i13;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f100598h.getLayoutParams();
        if (i14 <= 0 || i12 <= 0) {
            layoutParams.width = i10;
            layoutParams.height = i11;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = sg.bigo.ads.common.utils.e.a(context, i14);
            layoutParams.height = sg.bigo.ads.common.utils.e.a(context, i12);
        }
    }

    public final void a(Context context, String str, i iVar) {
        d dVarA;
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "handle ad click.");
        Ad ad2 = this.f100610t;
        if (ad2 instanceof f) {
            ((f) ad2).L();
        }
        b.a aVar = this.f100604n;
        String str2 = (aVar == null || !aVar.c()) ? null : str;
        if (this.f100591a.f().c() == 0 || !(this.f100610t instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f100591a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f100599i) : null, this.f100610t, this.f100591a, str2, this.f100609s, this.f100607q, zA);
            dVarA.f102167k = 0;
        } else {
            Context context2 = this.f100599i.getContext();
            Ad ad3 = this.f100610t;
            sg.bigo.ads.controller.landing.e.a(context2, (sg.bigo.ads.ad.c<?, ?>) (ad3 instanceof sg.bigo.ads.ad.b.a.a.c ? (sg.bigo.ads.ad.b.a.a.c) ad3 : ad3 instanceof sg.bigo.ads.ad.b.a.a.d ? (sg.bigo.ads.ad.b.a.a.d) ad3 : ad3 instanceof s ? ((s) ad3).H() : (sg.bigo.ads.ad.c) ad3));
            dVarA = new d();
            dVarA.f102167k = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.f100608r;
        if (cVar != null && !cVar.b(this.f100591a)) {
            this.f100608r.a(this.f100591a);
        }
        h hVar = this.f100597g;
        if (hVar != null) {
            hVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"AddJavascriptInterface"})
    public final boolean a(final Context context) {
        int i10;
        int i11;
        byte b10 = 0;
        if (!this.f100605o) {
            return false;
        }
        if (this.f100611u == null) {
            try {
                this.f100611u = new e(context, n.INTERSTITIAL);
            } catch (NoClassDefFoundError unused) {
                sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "Banner webview is not support");
            }
            e eVar = this.f100611u;
            if (eVar == null) {
                return false;
            }
            eVar.f104423g = new e.b() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.1
                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a() {
                    b bVar = b.this;
                    bVar.f100593c = true;
                    bVar.f100594d = false;
                    bVar.f100596f = c.a.f104007a.a(b.this.f100598h, new View[0]);
                    b bVar2 = b.this;
                    if (bVar2.f100592b) {
                        if (bVar2.f100598h != null) {
                            sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "javascript:onViewImpression()");
                            bVar2.f100598h.loadUrl("javascript:onViewImpression()");
                        }
                        sg.bigo.ads.core.c.b bVar3 = b.this.f100596f;
                        if (bVar3 != null) {
                            bVar3.a();
                        }
                    }
                    sg.bigo.ads.ad.banner.b.b(b.this);
                    b.a aVar = b.this.f100604n;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void b() {
                    b bVar = b.this;
                    bVar.f100594d = false;
                    bVar.f100602l = true;
                    sg.bigo.ads.ad.banner.b.c(bVar);
                    b bVar2 = b.this;
                    b.a aVar = bVar2.f100604n;
                    if (aVar != null) {
                        aVar.a(bVar2.f100591a, SystemClock.elapsedRealtime() - b.this.f100595e);
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void c() {
                    sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "onRenderProcessGone");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void d() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onExpand");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void e() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onResize");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void f() {
                    h hVar = b.this.f100597g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void g() {
                    h hVar = b.this.f100597g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a(@NonNull String str, @Nullable i iVar) {
                    b.this.a(context, str, iVar);
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean b(Activity activity, int i12) {
                    b.this.f100603m.a(activity, i12);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean a(Activity activity, int i12) {
                    b.this.f100603m.a(activity, i12);
                    return true;
                }
            };
            String str = (c.a.f104007a.c(this.f100606p) + "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>") + "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>";
            this.f100595e = SystemClock.elapsedRealtime();
            b.a aVar = this.f100604n;
            if (aVar != null) {
                aVar.a(this.f100591a);
            }
            this.f100611u.a(str, new e.d() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.2
                @Override // sg.bigo.ads.core.mraid.e.d
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onReady");
                }
            });
            this.f100594d = true;
            t.a();
        }
        c.C1296c c1296cB = this.f100611u.b();
        this.f100598h = c1296cB;
        if (c1296cB != null) {
            c1296cB.setOverScrollMode(2);
            this.f100598h.setHorizontalScrollBarEnabled(false);
            this.f100598h.setHorizontalScrollbarOverlay(false);
            this.f100598h.setVerticalScrollBarEnabled(false);
            this.f100598h.setVerticalScrollbarOverlay(false);
            this.f100598h.getSettings().setSupportZoom(false);
            this.f100598h.setBackgroundColor(-1);
            a.C1291a c1291a = this.f100607q;
            if (c1291a != null) {
                i11 = c1291a.f104181c;
                i10 = c1291a.f104182d;
            } else {
                i10 = 0;
                i11 = 0;
            }
            WebView webView = this.f100598h;
            if (webView != null) {
                Object parent = webView.getParent();
                if (parent instanceof FrameLayout) {
                    this.f100599i = (View) parent;
                    sg.bigo.ads.ad.banner.b.a(this);
                    Context context2 = webView.getContext();
                    int i12 = context2.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(context2);
                    if (sg.bigo.ads.common.utils.e.a(context2, i11) > i12 || sg.bigo.ads.common.utils.e.a(context2, i10) > iC) {
                        i11 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                    if (i11 <= 0 || i10 <= 0) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        layoutParams.gravity = 17;
                        layoutParams.width = sg.bigo.ads.common.utils.e.a(context2, i11);
                        layoutParams.height = sg.bigo.ads.common.utils.e.a(context2, i10);
                    }
                }
            }
            this.f100598h.addJavascriptInterface(new a(this, b10), "BGN_PLAYABLE");
        }
        return true;
    }
}
