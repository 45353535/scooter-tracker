package sg.bigo.ads.ad.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.b.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.b;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c<T extends Ad> implements b.InterfaceC1211b {
    private AdSize A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebView f100255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f100256b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b f100258d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Runnable f100262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    sg.bigo.ads.core.c.b f100263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    h f100264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Context f100265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final T f100266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final sg.bigo.ads.api.core.h f100267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f100268n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference<Activity> f100270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f100271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f100272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    AdOptionsView f100273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    LinearLayout f100274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f100275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.view.c f100276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.e f100277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private final n f100278x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BannerAdRequest f100280z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100257c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f100259e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f100260f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f100261g = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f100279y = false;
    private final View.OnAttachStateChangeListener B = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.banner.c.1
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            sg.bigo.ads.ad.banner.b.e(c.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            sg.bigo.ads.ad.banner.b.f(c.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final AtomicBoolean f100269o = new AtomicBoolean(false);

    public interface a {
        void a(int i10, int i11);
    }

    static class b implements a.InterfaceC1252a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a.InterfaceC1252a f100307c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f100306b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Handler f100305a = new Handler();

        b(a.InterfaceC1252a interfaceC1252a) {
            this.f100307c = interfaceC1252a;
        }

        private boolean c() {
            if (this.f100306b) {
                return true;
            }
            this.f100305a.removeCallbacks(null);
            this.f100306b = true;
            return false;
        }

        final void a() {
            a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error because of destroying before loaded"));
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC1252a
        public final void b() {
            a.InterfaceC1252a interfaceC1252a;
            if (c() || (interfaceC1252a = this.f100307c) == null) {
                return;
            }
            interfaceC1252a.b();
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC1252a
        public final void a(sg.bigo.ads.api.core.c cVar) {
            a.InterfaceC1252a interfaceC1252a;
            if (c() || (interfaceC1252a = this.f100307c) == null) {
                return;
            }
            interfaceC1252a.a(cVar);
        }
    }

    public c(Context context, sg.bigo.ads.api.core.f fVar, T t10, sg.bigo.ads.api.core.h hVar, @NonNull n nVar, h hVar2, boolean z10) {
        this.f100265k = context;
        this.f100266l = t10;
        this.f100267m = hVar;
        this.f100278x = nVar;
        this.f100264j = hVar2;
        this.f100268n = z10;
        if (fVar != null) {
            sg.bigo.ads.api.b bVar = fVar.f102176c;
            if (bVar instanceof BannerAdRequest) {
                this.f100280z = (BannerAdRequest) bVar;
            }
        }
        if (fVar == null || !q.b((CharSequence) fVar.f102176c.f102123g)) {
            return;
        }
        this.f100276v = new sg.bigo.ads.common.view.c(context, fVar.f102176c.f102123g);
    }

    static /* synthetic */ View a(c cVar, View view) {
        LinearLayout linearLayout = new LinearLayout(cVar.f100265k);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (view != null) {
            linearLayout.addView(view);
        }
        if (cVar.f100273s == null) {
            cVar.f100273s = new AdOptionsView(cVar.f100265k);
        }
        AdOptionsView adOptionsView = cVar.f100273s;
        sg.bigo.ads.api.core.h hVar = cVar.f100267m;
        adOptionsView.a(hVar, hVar.l());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(cVar.f100265k, 16), sg.bigo.ads.common.utils.e.a(cVar.f100265k, 16), 8388659);
        layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(cVar.f100265k, 10);
        cVar.f100273s.setLayoutParams(layoutParams);
        linearLayout.addView(cVar.f100273s);
        return linearLayout;
    }

    final void b() {
        try {
            sg.bigo.ads.ad.banner.b.h(this);
            sg.bigo.ads.core.c.b bVar = this.f100263i;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f100258d;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.f100262h != null) {
                this.f100262h = null;
            }
            sg.bigo.ads.core.mraid.e eVar = this.f100277w;
            if (eVar != null) {
                eVar.e();
                this.f100277w = null;
            }
            View view = this.f100256b;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.B);
                this.f100256b = null;
            }
            WebView webView = this.f100255a;
            if (webView != null) {
                u.b(webView);
                this.f100255a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public final View c() {
        if (this.f100256b == null) {
            sg.bigo.ads.common.t.a.a(2, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.f100256b = new FrameLayout(this.f100265k);
        }
        sg.bigo.ads.ad.banner.b.d(this);
        this.f100256b.addOnAttachStateChangeListener(this.B);
        return this.f100256b;
    }

    public final String d() {
        sg.bigo.ads.api.core.h hVar = this.f100267m;
        return hVar != null ? hVar.z() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[PHI: r0 r1
  0x0053: PHI (r0v11 android.app.Activity) = (r0v6 android.app.Activity), (r0v13 android.app.Activity) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r1v3 T extends sg.bigo.ads.api.Ad) = (r1v1 T extends sg.bigo.ads.api.Ad), (r1v6 T extends sg.bigo.ads.api.Ad) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.content.Context e() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r8.f100270p
            r1 = 3
            r2 = 0
            java.lang.String r3 = "BannerAd"
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L22
            java.lang.String r4 = "Interstitial/Reward Video banner ad get activity context from show(Activity activity)."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r4 = r8.f100266l
            boolean r5 = r4 instanceof sg.bigo.ads.ad.c
            if (r5 == 0) goto L23
            sg.bigo.ads.ad.c r4 = (sg.bigo.ads.ad.c) r4
            r5 = 1
            r4.b(r5)
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L97
            sg.bigo.ads.api.a.h r4 = sg.bigo.ads.api.a.i.f102116a
            sg.bigo.ads.core.mraid.n r5 = r8.f100278x
            sg.bigo.ads.core.mraid.n r6 = sg.bigo.ads.core.mraid.n.INTERSTITIAL
            r7 = 2
            if (r5 != r6) goto L59
            if (r4 == 0) goto L97
            sg.bigo.ads.api.a.j r4 = r4.n()
            r5 = 16
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L97
            android.app.Activity r0 = sg.bigo.ads.common.f.b.b()
            if (r0 != 0) goto L48
            java.lang.String r1 = "Interstitial/Reward Video banner ad failed to get activity context."
        L44:
            sg.bigo.ads.common.t.a.a(r2, r3, r1)
            goto L97
        L48:
            java.lang.String r4 = "Interstitial/Reward Video banner ad get activity context from current activity."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r1 = r8.f100266l
            boolean r2 = r1 instanceof sg.bigo.ads.ad.c
            if (r2 == 0) goto L97
        L53:
            sg.bigo.ads.ad.c r1 = (sg.bigo.ads.ad.c) r1
            r1.b(r7)
            goto L97
        L59:
            if (r4 == 0) goto L97
            sg.bigo.ads.api.a.j r4 = r4.n()
            r5 = 17
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L97
            android.view.View r4 = r8.f100256b     // Catch: java.lang.Exception -> L80
            android.app.Activity r4 = sg.bigo.ads.common.utils.c.a(r4)     // Catch: java.lang.Exception -> L80
            if (r4 == 0) goto L80
            java.lang.String r0 = "Banner ad get activity context from view."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r0)     // Catch: java.lang.Exception -> L7f
            T extends sg.bigo.ads.api.Ad r0 = r8.f100266l     // Catch: java.lang.Exception -> L7f
            boolean r5 = r0 instanceof sg.bigo.ads.ad.c     // Catch: java.lang.Exception -> L7f
            if (r5 == 0) goto L7f
            sg.bigo.ads.ad.c r0 = (sg.bigo.ads.ad.c) r0     // Catch: java.lang.Exception -> L7f
            r0.b(r1)     // Catch: java.lang.Exception -> L7f
        L7f:
            r0 = r4
        L80:
            if (r0 != 0) goto L97
            android.app.Activity r0 = sg.bigo.ads.common.f.b.b()
            if (r0 != 0) goto L8b
            java.lang.String r1 = "Banner ad failed to get activity context."
            goto L44
        L8b:
            java.lang.String r4 = "Banner ad get activity context from current activity."
            sg.bigo.ads.common.t.a.a(r2, r1, r3, r4)
            T extends sg.bigo.ads.api.Ad r1 = r8.f100266l
            boolean r2 = r1 instanceof sg.bigo.ads.ad.c
            if (r2 == 0) goto L97
            goto L53
        L97:
            if (r0 != 0) goto L9b
            android.content.Context r0 = r8.f100265k
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.e():android.content.Context");
    }

    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "performImpression");
        sg.bigo.ads.ad.banner.b.g(this);
        T t10 = this.f100266l;
        if (t10 instanceof e) {
            ((e) t10).a(sg.bigo.ads.ad.banner.b.i(this));
        }
        if (this.f100259e) {
            return;
        }
        this.f100259e = true;
        if (this.f100260f) {
            h();
            g();
            sg.bigo.ads.core.c.b bVar = this.f100263i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    final void g() {
        if (this.f100255a != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "javascript:onViewImpression()");
            this.f100255a.loadUrl("javascript:onViewImpression()");
        }
    }

    final void h() {
        final WebView webView = this.f100255a;
        if (this.f100279y || !(webView instanceof sg.bigo.ads.core.h.b)) {
            return;
        }
        this.f100279y = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.2
            @Override // java.lang.Runnable
            public final void run() {
                b.C1293b c1293b;
                long j10;
                long jA;
                long j11;
                long jA2;
                long j12;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Notify webView performance stat.");
                sg.bigo.ads.core.h.b bVar = (sg.bigo.ads.core.h.b) webView;
                if (sg.bigo.ads.api.a.i.f102116a.n().a(0) || sg.bigo.ads.api.a.i.f102116a.n().a(1)) {
                    b.C1293b c1293b2 = bVar.f104328h;
                    sg.bigo.ads.core.h.b.a(c1293b2);
                    if (sg.bigo.ads.api.a.i.f102116a.n().a(1)) {
                        if (bVar.f104329i == null) {
                            bVar.f104329i = new b.c(bVar, (byte) 0);
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c1293b2.f104335d = bVar.f104329i.a();
                        c1293b2.f104338g = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        c1293b2.f104337f = SystemClock.elapsedRealtime();
                    }
                    c1293b = c1293b2;
                } else {
                    c1293b = null;
                }
                if (c1293b != null) {
                    Boolean bool = c1293b.f104334c;
                    if (bool == null && c1293b.f104335d == null) {
                        return;
                    }
                    Boolean bool2 = c1293b.f104335d;
                    if (bool != null) {
                        long j13 = bool.booleanValue() ? 1L : 0L;
                        jA = sg.bigo.ads.ad.banner.b.a(c.this, c1293b.f104336e);
                        j10 = j13;
                    } else {
                        j10 = -1;
                        jA = -1;
                    }
                    if (bool2 != null) {
                        long j14 = bool2.booleanValue() ? 1L : 0L;
                        long j15 = c1293b.f104338g;
                        jA2 = sg.bigo.ads.ad.banner.b.a(c.this, c1293b.f104337f);
                        j11 = j14;
                        j12 = j15;
                    } else {
                        j11 = -1;
                        jA2 = -1;
                        j12 = -1;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Stat check blank resutl.");
                    sg.bigo.ads.core.d.b.a(c.this.f100267m, j10, jA, j11, jA2, j12);
                }
            }
        });
    }

    final AdSize i() {
        List<AdSize> list;
        if (this.A == null) {
            BannerAdRequest bannerAdRequest = this.f100280z;
            if (bannerAdRequest != null && (list = bannerAdRequest.f102082i) != null) {
                Iterator<AdSize> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AdSize next = it.next();
                    if (!next.f102081a.equals(AdSize.ADAPTIVE)) {
                        this.A = next;
                        break;
                    }
                }
            }
            if (this.A == null) {
                Context context = this.f100265k;
                this.A = sg.bigo.ads.common.utils.e.c(context, context.getResources().getDisplayMetrics().widthPixels) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.A;
    }

    static /* synthetic */ TextView a(Context context, boolean z10) {
        if (!z10) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(q.b("#B2FFFFFF", -1));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: sg.bigo.ads.core.h.a.1.<init>(sg.bigo.ads.core.h.a, android.content.Context):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.UiThread
    private boolean c(@androidx.annotation.Nullable final sg.bigo.ads.api.b.a.InterfaceC1252a r14) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.c(sg.bigo.ads.api.b.a$a):boolean");
    }

    @UiThread
    public final boolean b(@Nullable a.InterfaceC1252a interfaceC1252a) {
        if (this.f100275u) {
            return true;
        }
        boolean zC = c(interfaceC1252a);
        this.f100275u = zC;
        return zC;
    }

    static /* synthetic */ TextView a(Context context, boolean z10, String str) {
        if (!z10 || q.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(sg.bigo.ads.common.utils.e.a(context, 240));
        textView.setBackgroundColor(q.b("#FFD6D9DB", -7829368));
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    public final void a() {
        if (sg.bigo.ads.common.n.d.b()) {
            b();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b();
                }
            });
        }
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i10, int i11) {
        layoutParams.width = i10;
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        this.f100256b.setMinimumHeight(i11);
    }

    public final void a(final a.InterfaceC1252a interfaceC1252a) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.f100257c != 0) {
                    if (cVar.b(interfaceC1252a)) {
                        return;
                    }
                    interfaceC1252a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
                    return;
                }
                b bVar = cVar.f100258d;
                if (bVar != null) {
                    bVar.a();
                }
                c.this.f100258d = new b(interfaceC1252a);
                final b bVar2 = c.this.f100258d;
                bVar2.f100305a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                }, 15000L);
                c cVar2 = c.this;
                if (cVar2.b(cVar2.f100258d)) {
                    return;
                }
                c.this.f100258d.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
            }
        });
    }
}
