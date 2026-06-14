package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.b.h;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.landing.WebViewActivityImpl;

/* JADX INFO: loaded from: classes4.dex */
public class d extends WebViewActivityImpl implements h {
    private final ValueCallback<Boolean> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f103773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f103774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f103775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f103776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f103777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f103778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f103779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.controller.landing.a f103780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f103781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f103782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<h.a> f103783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f103784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    private int f103785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f103786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f103787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private WebHistoryItem f103788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f103789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.c<?, ?> f103790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.api.core.b f103791t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f103792u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f103793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f103794w;

    static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103798b;

        private a(int i10, long j10) {
            this.f103797a = i10;
            this.f103798b = System.currentTimeMillis() - j10;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f103797a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f103798b;
        }

        /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x008f. Please report as an issue. */
    public d(@NonNull Activity activity) {
        int intExtra;
        int i10;
        super(activity);
        this.f103772a = 300;
        this.f103774c = -1L;
        this.f103775d = 0;
        this.f103777f = false;
        this.f103783l = new ArrayList();
        this.f103784m = 0;
        this.f103785n = 0;
        this.f103786o = 0;
        this.f103794w = false;
        this.F = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.controller.landing.d.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                Boolean bool2 = bool;
                if (d.this.f104357z != null) {
                    if (bool2 == null || !bool2.booleanValue()) {
                        ViewParent parent = d.this.f104357z.getParent();
                        if (parent instanceof ViewGroup) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.addTransition(new Fade(1));
                            transitionSet.setDuration(300L);
                            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                        }
                    }
                    d.this.f104357z.setEnabled(true);
                    d.this.f104357z.setVisibility(0);
                }
            }
        };
        Intent intent = this.L.getIntent();
        int i11 = -1;
        if (intent != null) {
            int intExtra2 = intent.getIntExtra("ad_identifier", -1);
            this.f103782k = intent.getIntExtra("land_way", -1);
            intExtra = intent.getIntExtra("webview_force_time", -1);
            i11 = intExtra2;
        } else {
            this.f103782k = -1;
            intExtra = -1;
        }
        sg.bigo.ads.ad.c<?, ?> cVarB = e.b(i11);
        this.f103790s = cVarB;
        if (cVarB != null) {
            this.f103791t = cVarB.f();
            this.f103778g = this.f103790s.s();
            this.f103779h = this.f103790s.t();
            this.f103780i = this.f103790s.f100346m;
            this.f103773b = this.f103791t.N().e();
            this.f103776e = this.f103791t.d().f();
        } else {
            this.f103778g = 0;
            this.f103779h = System.currentTimeMillis();
        }
        switch (intExtra) {
            case -1:
                this.f103789r = false;
                this.f103792u = false;
                this.f103793v = 0;
                break;
            case 0:
            default:
                this.f103789r = true;
                this.f103792u = false;
                this.f103793v = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                this.f103789r = false;
                this.f103792u = true;
                i10 = intExtra + 1;
                this.f103793v = i10;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.f103789r = true;
                this.f103792u = false;
                i10 = intExtra - 3;
                this.f103793v = i10;
                break;
        }
        this.f103787p = a(activity);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        sg.bigo.ads.controller.landing.a aVar = this.f103780i;
        if (aVar != null) {
            aVar.f103731d = false;
            this.f103780i = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        this.f103774c = SystemClock.elapsedRealtime();
        c(1);
        super.T();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void ah() {
        super.ah();
        if (this.f103790s != null) {
            e.a();
            this.f103790s = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z10) {
        if (z10) {
            aF();
        }
    }

    public int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return this.f103784m;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return this.f103786o;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f103785n;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f103780i;
        return aVar != null && aVar.f103731d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f103778g;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return this.f103782k;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        return null;
    }

    protected final void q() {
        ImageView imageView = this.f104357z;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.f104357z.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    @Nullable
    public final WebView r() {
        sg.bigo.ads.core.h.e eVar;
        sg.bigo.ads.controller.landing.a aVar = this.f103780i;
        sg.bigo.ads.core.h.e eVar2 = null;
        if (aVar != null && aVar.b() && (eVar = aVar.f103733f) != null) {
            u.b(eVar);
            sg.bigo.ads.core.h.e eVar3 = aVar.f103733f;
            aVar.f103733f = null;
            eVar2 = eVar3;
        }
        if (eVar2 == null) {
            return super.r();
        }
        this.f103781j = true;
        return eVar2;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void s() {
        c(2);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void t() {
        if (this.B == null) {
            return;
        }
        sg.bigo.ads.controller.landing.a aVar = this.f103780i;
        if (aVar != null) {
            if (aVar.f103730c == 2 && !q.a((CharSequence) aVar.f103732e)) {
                this.B.loadDataWithBaseURL(this.C, this.f103780i.f103732e, "text/html", "UTF-8", null);
                c(3);
                return;
            }
            int i10 = this.f103780i.f103730c;
            if (i10 == 3 && this.f103781j) {
                this.D = SystemClock.elapsedRealtime();
                b(this.B.getTitle());
                if (this.f103780i.f103731d) {
                    ProgressBar progressBar = this.f104356y;
                    if (progressBar != null) {
                        progressBar.setAlpha(0.0f);
                    }
                    a(this.C);
                    return;
                }
                return;
            }
            if (i10 == 4 && this.f103781j) {
                this.f103788q = this.B.copyBackForwardList().getCurrentItem();
            }
        }
        sg.bigo.ads.api.core.b bVar = this.f103791t;
        if (bVar != null) {
            this.C = sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f103791t.N().i(), this.C);
        }
        super.t();
        c(3);
    }

    public final boolean u() {
        int i10;
        if (this.f103789r || this.f103792u) {
            ImageView imageView = this.f104357z;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (!this.f103777f && (i10 = this.f103776e) > 0 && i10 <= 10000) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f103774c;
            if (jElapsedRealtime > 0 && jElapsedRealtime < i10) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean v() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        if (this.f103788q != null) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (currentIndex <= 0) {
                return super.v();
            }
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.f103788q.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.f103788q.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.v();
    }

    protected final void w() {
        if (this.f103793v <= 0) {
            this.F.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.B;
        if (webView != null) {
            webView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.F != null) {
                        d.this.F.onReceiveValue(Boolean.FALSE);
                    }
                }
            }, r.f102828a.a(this.f103793v));
        }
    }

    private static String a(Activity activity) {
        String packageName;
        String str;
        try {
            packageName = activity.getPackageName();
            str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (TextUtils.equals(packageName, str)) {
            return null;
        }
        return str;
    }

    private void c(int i10) {
        a aVar = new a(i10, this.f103779h, (byte) 0);
        this.f103783l.add(0, aVar);
        sg.bigo.ads.api.core.b bVar = this.f103791t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this, aVar, bVar, this.f103790s, this.f103787p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        if (this.f103789r || this.f103792u) {
            q();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final String d(String str) {
        sg.bigo.ads.api.core.b bVar = this.f103791t;
        return bVar != null ? sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f103791t.N().i(), str) : super.d(str);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e(int i10) {
        super.e(i10);
        String str = this.f103773b;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(str), this.L);
            aVar.f102749l = sg.bigo.ads.common.u.a.e.a();
            g.a(aVar, null);
        }
        if (this.f103791t != null) {
            sg.bigo.ads.core.d.b.a(this, this.f103783l.isEmpty() ? null : this.f103783l.get(0), System.currentTimeMillis() - this.f103779h, this.f103775d, this.f103791t, this.f103790s, this.f103787p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(int i10) {
        super.a(i10);
        this.f103785n = Math.max(this.f103785n, i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(String str) {
        super.c(str);
        this.f103786o++;
        this.f103784m = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void d() {
        super.d();
        if (this.f103789r) {
            w();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i10, String str, String str2) {
        super.a(i10, str, str2);
        if (this.f103777f) {
            return;
        }
        c(6);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(int i10) {
        if (u()) {
            return;
        }
        super.d(i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (!this.f103777f) {
            this.f103785n = 100;
            c(5);
            if (this.f103792u) {
                w();
            }
        }
        this.f103777f = true;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z10) {
        super.a(str, z10);
        if (z10) {
            c(4);
        }
        int i10 = this.f103775d;
        if (i10 == 0) {
            this.C = str;
        }
        this.f103775d = i10 + 1;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(@NonNull sg.bigo.ads.api.core.d dVar) {
        sg.bigo.ads.ad.c<?, ?> cVar;
        int i10;
        sg.bigo.ads.api.core.b bVar = this.f103791t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(bVar, 2, dVar, this.f103790s);
            sg.bigo.ads.api.core.d dVar2 = this.E;
            if (dVar2 == null || (cVar = this.f103790s) == null || (i10 = dVar2.f102160d) < 0) {
                return;
            }
            if (!dVar2.f102162f && i10 == 1) {
                dVar2.f102160d = 4;
                cVar.a(new c(4, dVar2.f102161e));
            }
            if ((i10 == 1 || i10 == 4) && !this.E.f102162f) {
                return;
            }
            if (i10 == 1) {
                this.E.f102160d = 4;
            }
            sg.bigo.ads.api.core.b bVarF = this.f103790s.f();
            sg.bigo.ads.api.core.d dVar3 = this.E;
            sg.bigo.ads.core.d.b.b(bVarF, dVar3.f102160d, 2, dVar3.f102161e);
        }
    }
}
