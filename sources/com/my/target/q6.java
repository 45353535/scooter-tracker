package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C4240b4;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.f1;
import com.my.target.k;
import com.my.target.n6;
import com.my.target.wa;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class q6 implements wa, k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f60589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f60590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6 f60591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.a f60592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f60593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n6.a f60594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n6 f60595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f60596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f60597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n6 f60598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s6 f60599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public wa.a f60600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f60601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public na f60602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f60603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f1 f60604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f60605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f60606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f60607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s6 f60608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Uri f60609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f60610v;

    public final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n6 f60611a;

        public a(n6 n6Var) {
            this.f60611a = n6Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            q6 q6Var = q6.this;
            q6Var.f60607s = null;
            q6Var.b();
            this.f60611a.a(q6.this.f60591c);
        }
    }

    public final class b implements f1.a {
        public b() {
        }

        @Override // com.my.target.f1.a
        public void b() {
            k kVar = q6.this.f60605q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }
    }

    public interface c {
        void a();

        void a(float f10, float f11, na naVar, Context context);

        void a(IAdLoadingError iAdLoadingError);

        void a(String str, na naVar, Context context);

        void b();

        void d();
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n6 f60614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final na f60615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f60616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k f60617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri f60618e;

        public d(na naVar, k kVar, Uri uri, n6 n6Var, Context context) {
            this.f60615b = naVar;
            this.f60616c = context.getApplicationContext();
            this.f60617d = kVar;
            this.f60618e = uri;
            this.f60614a = n6Var;
        }

        public final /* synthetic */ void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f60614a.f(str);
            } else {
                this.f60614a.a("expand", "Failed to handling mraid");
                this.f60617d.dismiss();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final String strA = g1.a(this.f60615b.L(), (String) k2.a().a(this.f60618e.toString(), null, this.f60616c).c());
            f0.f(new Runnable() { // from class: k5.u1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86147b.a(strA);
                }
            });
        }
    }

    public final class e implements n6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n6 f60619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60620b;

        public e(n6 n6Var, String str) {
            this.f60619a = n6Var;
            this.f60620b = str;
        }

        @Override // com.my.target.n6.a
        public void a() {
        }

        @Override // com.my.target.n6.a
        public void b() {
            k kVar = q6.this.f60605q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }

        @Override // com.my.target.n6.a
        public void c() {
            q6.this.f60603o = true;
        }

        @Override // com.my.target.n6.a
        public boolean d() {
            s6 s6Var;
            if (!q6.this.f60597i.equals("default")) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - wrong state for resize - " + q6.this.f60597i);
                this.f60619a.a("resize", "wrong state for resize " + q6.this.f60597i);
                return false;
            }
            q6 q6Var = q6.this;
            f fVar = q6Var.f60607s;
            if (fVar == null) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - resize properties not set");
                this.f60619a.a("resize", "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = q6Var.f60606r;
            if (viewGroup == null || (s6Var = q6Var.f60599k) == null) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not initialized");
                this.f60619a.a("resize", "views not initialized");
                return false;
            }
            if (!fVar.a(viewGroup, s6Var)) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not visible");
                this.f60619a.a("resize", "views not visible");
                return false;
            }
            q6.this.f60604p = new f1(q6.this.f60590b);
            q6 q6Var2 = q6.this;
            q6Var2.f60607s.a(q6Var2.f60604p);
            q6 q6Var3 = q6.this;
            if (!q6Var3.f60607s.b(q6Var3.f60604p)) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - close button is out of visible range");
                this.f60619a.a("resize", "close button is out of visible range");
                q6.this.f60604p = null;
                return false;
            }
            ViewGroup viewGroup2 = (ViewGroup) q6.this.f60599k.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(q6.this.f60599k);
            }
            q6 q6Var4 = q6.this;
            q6Var4.f60604p.addView(q6Var4.f60599k, new FrameLayout.LayoutParams(-1, -1));
            q6.this.f60604p.setOnCloseListener(new f1.a() { // from class: k5.v1
                @Override // com.my.target.f1.a
                public final void b() {
                    this.f86151a.e();
                }
            });
            q6 q6Var5 = q6.this;
            q6Var5.f60606r.addView(q6Var5.f60604p);
            q6.this.a("resized");
            c cVar = q6.this.f60601m;
            if (cVar == null) {
                return true;
            }
            cVar.b();
            return true;
        }

        public void e() {
            q6 q6Var = q6.this;
            f1 f1Var = q6Var.f60604p;
            if (f1Var == null || q6Var.f60599k == null) {
                return;
            }
            if (f1Var.getParent() != null) {
                ((ViewGroup) q6.this.f60604p.getParent()).removeView(q6.this.f60604p);
                q6.this.f60604p.removeAllViews();
                q6.this.f60604p.setOnCloseListener(null);
                q6 q6Var2 = q6.this;
                q6Var2.f60604p = null;
                q6Var2.a(q6Var2.f60599k);
                q6.this.a("default");
            }
            c cVar = q6.this.f60601m;
            if (cVar != null) {
                cVar.d();
            }
        }

        @Override // com.my.target.n6.a
        public void a(n6 n6Var, WebView webView) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MraidPresenter$MyMraidBridgeListener: onPageLoaded callback from ");
            sb2.append(n6Var == q6.this.f60598j ? " second " : " primary ");
            sb2.append(C4240b4.i.K);
            gb.a(sb2.toString());
            ArrayList arrayList = new ArrayList();
            if (q6.this.a()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            n6Var.a(arrayList);
            n6Var.d(this.f60620b);
            n6Var.a(n6Var.c());
            k kVar = q6.this.f60605q;
            if (kVar == null || !kVar.isShowing()) {
                q6.this.a("default");
            } else {
                q6.this.a("expanded");
            }
            n6Var.d();
            q6 q6Var = q6.this;
            if (n6Var != q6Var.f60598j) {
                c cVar = q6Var.f60601m;
                if (cVar != null) {
                    cVar.a();
                }
                wa.a aVar = q6.this.f60600l;
                if (aVar != null) {
                    aVar.a(webView);
                }
            }
        }

        @Override // com.my.target.n6.a
        public boolean b(Uri uri) {
            return q6.this.a(uri);
        }

        @Override // com.my.target.n6.a
        public void a(boolean z10) {
            if (!z10 || q6.this.f60605q == null) {
                this.f60619a.a(z10);
            }
        }

        @Override // com.my.target.n6.a
        public boolean a(String str, JsResult jsResult) {
            gb.a("MraidPresenter$MyMraidBridgeListener: JS Alert - " + str);
            jsResult.confirm();
            return true;
        }

        @Override // com.my.target.n6.a
        public boolean a(ConsoleMessage consoleMessage, n6 n6Var) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MraidPresenter$MyMraidBridgeListener: Console message: from ");
            sb2.append(n6Var == q6.this.f60598j ? " second " : " primary ");
            sb2.append("webview: ");
            sb2.append(consoleMessage.message());
            gb.a(sb2.toString());
            return true;
        }

        @Override // com.my.target.n6.a
        public boolean a(boolean z10, p6 p6Var) {
            gb.a("MraidPresenter$MyMraidBridgeListener: Orientation properties isn't supported in standard banners");
            return false;
        }

        @Override // com.my.target.n6.a
        public void a(Uri uri) {
            na naVar;
            q6 q6Var = q6.this;
            wa.a aVar = q6Var.f60600l;
            if (aVar == null || (naVar = q6Var.f60602n) == null) {
                return;
            }
            aVar.a(naVar, uri.toString());
        }

        @Override // com.my.target.n6.a
        public boolean a(String str) {
            na naVar;
            q6 q6Var = q6.this;
            if (!q6Var.f60603o) {
                this.f60619a.a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            c cVar = q6Var.f60601m;
            if (cVar == null || (naVar = q6Var.f60602n) == null) {
                return true;
            }
            cVar.a(str, naVar, q6Var.f60590b);
            return true;
        }

        @Override // com.my.target.n6.a
        public boolean a(float f10, float f11) {
            c cVar;
            na naVar;
            q6 q6Var = q6.this;
            if (!q6Var.f60603o) {
                this.f60619a.a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            if (f10 < 0.0f || f11 < 0.0f || (cVar = q6Var.f60601m) == null || (naVar = q6Var.f60602n) == null) {
                return true;
            }
            cVar.a(f10, f11, naVar, q6Var.f60590b);
            return true;
        }

        @Override // com.my.target.n6.a
        public boolean a(int i10, int i11, int i12, int i13, boolean z10, int i14) {
            q6.this.f60607s = new f();
            q6 q6Var = q6.this;
            if (q6Var.f60606r == null) {
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: container view for resize is not defined");
                this.f60619a.a("setResizeProperties", "container view for resize is not defined");
                q6.this.f60607s = null;
                return false;
            }
            if (i10 >= 50 && i11 >= 50) {
                kb kbVarE = kb.e(q6Var.f60590b);
                q6.this.f60607s.a(z10);
                q6.this.f60607s.a(kbVarE.b(i10), kbVarE.b(i11), kbVarE.b(i12), kbVarE.b(i13), i14);
                if (z10) {
                    return true;
                }
                Rect rect = new Rect();
                q6.this.f60606r.getGlobalVisibleRect(rect);
                if (q6.this.f60607s.a(rect)) {
                    return true;
                }
                gb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + StringUtils.COMMA + rect.height() + ") resize properties: (" + q6.this.f60607s.b() + StringUtils.COMMA + q6.this.f60607s.a() + ")");
                this.f60619a.a("setResizeProperties", "resize properties with allowOffscreen false out of viewport");
                q6.this.f60607s = null;
                return false;
            }
            gb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: properties cannot be less than closeable container");
            this.f60619a.a("setResizeProperties", "properties cannot be less than closeable container");
            q6.this.f60607s = null;
            return false;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f60622a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f60626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f60627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f60628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f60629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f60630i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Rect f60631j;

        public int a() {
            return this.f60626e;
        }

        public int b() {
            return this.f60625d;
        }

        public void a(boolean z10) {
            this.f60622a = z10;
        }

        public boolean b(f1 f1Var) {
            if (this.f60630i == null) {
                return false;
            }
            int i10 = this.f60629h;
            int i11 = this.f60628g;
            Rect rect = this.f60630i;
            Rect rect2 = new Rect(i10, i11, rect.right, rect.bottom);
            int i12 = this.f60629h;
            int i13 = this.f60628g;
            Rect rect3 = new Rect(i12, i13, this.f60625d + i12, this.f60626e + i13);
            Rect rect4 = new Rect();
            f1Var.b(this.f60627f, rect3, rect4);
            return rect2.contains(rect4);
        }

        public void a(int i10, int i11, int i12, int i13, int i14) {
            this.f60625d = i10;
            this.f60626e = i11;
            this.f60623b = i12;
            this.f60624c = i13;
            this.f60627f = i14;
        }

        public boolean a(Rect rect) {
            return this.f60625d <= rect.width() && this.f60626e <= rect.height();
        }

        public void a(f1 f1Var) {
            Rect rect;
            Rect rect2 = this.f60631j;
            if (rect2 != null && (rect = this.f60630i) != null) {
                int i10 = (rect2.top - rect.top) + this.f60624c;
                this.f60628g = i10;
                this.f60629h = (rect2.left - rect.left) + this.f60623b;
                if (!this.f60622a) {
                    if (i10 + this.f60626e > rect.height()) {
                        gb.a("MraidPresenter$ResizeHelper: Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                        this.f60628g = this.f60630i.height() - this.f60626e;
                    }
                    if (this.f60629h + this.f60625d > this.f60630i.width()) {
                        gb.a("MraidPresenter$ResizeHelper: Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                        this.f60629h = this.f60630i.width() - this.f60625d;
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f60625d, this.f60626e);
                layoutParams.topMargin = this.f60628g;
                layoutParams.leftMargin = this.f60629h;
                f1Var.setLayoutParams(layoutParams);
                f1Var.setCloseGravity(this.f60627f);
                return;
            }
            gb.a("MraidPresenter$ResizeHelper: Setup views before resizing");
        }

        public boolean a(ViewGroup viewGroup, s6 s6Var) {
            this.f60630i = new Rect();
            this.f60631j = new Rect();
            return viewGroup.getGlobalVisibleRect(this.f60630i) && s6Var.getGlobalVisibleRect(this.f60631j);
        }
    }

    public q6(n6 n6Var, s6 s6Var, m1 m1Var, ViewGroup viewGroup) {
        this.f60592d = new b();
        this.f60595g = n6Var;
        this.f60599k = s6Var;
        this.f60589a = m1Var;
        Context context = viewGroup.getContext();
        this.f60590b = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f60596h = new WeakReference(activity);
            this.f60606r = (ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content);
        } else {
            this.f60596h = new WeakReference(null);
            View rootView = viewGroup.getRootView();
            if (rootView != null) {
                ViewGroup viewGroup2 = (ViewGroup) rootView.findViewById(android.R.id.content);
                this.f60606r = viewGroup2;
                if (viewGroup2 == null) {
                    this.f60606r = (ViewGroup) rootView;
                }
            }
        }
        this.f60597i = "loading";
        this.f60591c = r6.e();
        e eVar = new e(n6Var, "inline");
        this.f60594f = eVar;
        n6Var.a(eVar);
        a aVar = new a(n6Var);
        this.f60593e = aVar;
        this.f60599k.addOnLayoutChangeListener(aVar);
        a(s6Var);
    }

    public static q6 a(ViewGroup viewGroup) {
        return new q6(viewGroup);
    }

    @Override // com.my.target.k.a
    public void b(boolean z10) {
        n6 n6Var = this.f60598j;
        if (n6Var != null) {
            n6Var.a(z10);
        } else {
            this.f60595g.a(z10);
        }
        s6 s6Var = this.f60608t;
        if (s6Var == null) {
            return;
        }
        if (z10) {
            s6Var.e();
        } else {
            s6Var.a(false);
        }
    }

    @Override // com.my.target.wa
    public m1 getView() {
        return this.f60589a;
    }

    @Override // com.my.target.wa
    public void pause() {
        s6 s6Var;
        if ((this.f60605q == null || this.f60598j != null) && (s6Var = this.f60599k) != null) {
            s6Var.a(false);
        }
    }

    @Override // com.my.target.k.a
    public void r() {
        this.f60589a.setVisibility(0);
        if (this.f60609u != null) {
            this.f60609u = null;
            n6 n6Var = this.f60598j;
            if (n6Var != null) {
                n6Var.a(false);
                this.f60598j.e("hidden");
                this.f60598j.a();
                this.f60598j = null;
                this.f60595g.a(true);
            }
            s6 s6Var = this.f60608t;
            if (s6Var != null) {
                s6Var.a(true);
                if (this.f60608t.getParent() != null) {
                    ((ViewGroup) this.f60608t.getParent()).removeView(this.f60608t);
                }
                this.f60608t.a(0);
                this.f60608t = null;
            }
        } else {
            s6 s6Var2 = this.f60599k;
            if (s6Var2 != null) {
                if (s6Var2.getParent() != null) {
                    ((ViewGroup) this.f60599k.getParent()).removeView(this.f60599k);
                }
                a(this.f60599k);
            }
        }
        f1 f1Var = this.f60604p;
        if (f1Var != null && f1Var.getParent() != null) {
            ((ViewGroup) this.f60604p.getParent()).removeView(this.f60604p);
        }
        this.f60604p = null;
        a("default");
        c cVar = this.f60601m;
        if (cVar != null) {
            cVar.d();
        }
        b();
        this.f60595g.a(this.f60591c);
        s6 s6Var3 = this.f60599k;
        if (s6Var3 != null) {
            s6Var3.e();
        }
    }

    @Override // com.my.target.wa
    public void resume() {
        s6 s6Var;
        if ((this.f60605q == null || this.f60598j != null) && (s6Var = this.f60599k) != null) {
            s6Var.e();
        }
    }

    @Override // com.my.target.wa
    public void start() {
        na naVar;
        wa.a aVar = this.f60600l;
        if (aVar == null || (naVar = this.f60602n) == null) {
            return;
        }
        aVar.a(naVar);
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        this.f60605q = kVar;
        f1 f1Var = this.f60604p;
        if (f1Var != null && f1Var.getParent() != null) {
            ((ViewGroup) this.f60604p.getParent()).removeView(this.f60604p);
        }
        f1 f1Var2 = new f1(this.f60590b);
        this.f60604p = f1Var2;
        a(f1Var2, frameLayout);
    }

    @Override // com.my.target.wa
    public void a(na naVar) {
        s6 s6Var;
        this.f60602n = naVar;
        String strM = naVar.M();
        if (strM != null && (s6Var = this.f60599k) != null) {
            this.f60595g.a(s6Var);
            this.f60595g.f(strM);
        } else {
            a(m.f60112q);
        }
    }

    public void b() {
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.f60590b.getResources().getDisplayMetrics();
        this.f60591c.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.f60606r;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            r6 r6Var = this.f60591c;
            int i10 = iArr[0];
            r6Var.c(i10, iArr[1], this.f60606r.getMeasuredWidth() + i10, iArr[1] + this.f60606r.getMeasuredHeight());
        }
        if (!this.f60597i.equals("expanded") && !this.f60597i.equals("resized")) {
            this.f60589a.getLocationOnScreen(iArr);
            r6 r6Var2 = this.f60591c;
            int i11 = iArr[0];
            r6Var2.b(i11, iArr[1], this.f60589a.getMeasuredWidth() + i11, iArr[1] + this.f60589a.getMeasuredHeight());
        }
        s6 s6Var = this.f60608t;
        if (s6Var != null) {
            s6Var.getLocationOnScreen(iArr);
            r6 r6Var3 = this.f60591c;
            int i12 = iArr[0];
            r6Var3.a(i12, iArr[1], this.f60608t.getMeasuredWidth() + i12, iArr[1] + this.f60608t.getMeasuredHeight());
            return;
        }
        s6 s6Var2 = this.f60599k;
        if (s6Var2 != null) {
            s6Var2.getLocationOnScreen(iArr);
            r6 r6Var4 = this.f60591c;
            int i13 = iArr[0];
            r6Var4.a(i13, iArr[1], this.f60599k.getMeasuredWidth() + i13, iArr[1] + this.f60599k.getMeasuredHeight());
        }
    }

    @Override // com.my.target.wa
    public void a(wa.a aVar) {
        this.f60600l = aVar;
    }

    @Override // com.my.target.wa
    public void a(boolean z10) {
        s6 s6Var;
        if ((this.f60605q == null || this.f60598j != null) && (s6Var = this.f60599k) != null) {
            s6Var.a(z10);
        }
    }

    @Override // com.my.target.wa
    public void a(int i10) {
        a("hidden");
        a((c) null);
        a((wa.a) null);
        this.f60595g.a();
        f1 f1Var = this.f60604p;
        if (f1Var != null) {
            f1Var.removeAllViews();
            this.f60604p.setOnCloseListener(null);
            ViewParent parent = this.f60604p.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f60604p);
            }
            this.f60604p = null;
        }
        s6 s6Var = this.f60599k;
        if (s6Var != null) {
            if (i10 <= 0) {
                s6Var.a(true);
            }
            if (this.f60599k.getParent() != null) {
                ((ViewGroup) this.f60599k.getParent()).removeView(this.f60599k);
            }
            this.f60599k.a(i10);
            this.f60599k = null;
        }
        n6 n6Var = this.f60598j;
        if (n6Var != null) {
            n6Var.a();
            this.f60598j = null;
        }
        s6 s6Var2 = this.f60608t;
        if (s6Var2 != null) {
            s6Var2.a(true);
            if (this.f60608t.getParent() != null) {
                ((ViewGroup) this.f60608t.getParent()).removeView(this.f60608t);
            }
            this.f60608t.a(0);
            this.f60608t = null;
        }
    }

    public q6(ViewGroup viewGroup) {
        this(n6.b("inline"), new s6(viewGroup.getContext()), new m1(viewGroup.getContext()), viewGroup);
    }

    public void a(c cVar) {
        this.f60601m = cVar;
    }

    public void a(f1 f1Var, FrameLayout frameLayout) {
        this.f60589a.setVisibility(8);
        frameLayout.addView(f1Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.f60609u != null) {
            this.f60598j = n6.b("inline");
            s6 s6Var = new s6(this.f60590b);
            this.f60608t = s6Var;
            a(this.f60598j, s6Var, f1Var);
        } else {
            s6 s6Var2 = this.f60599k;
            if (s6Var2 != null && s6Var2.getParent() != null) {
                ((ViewGroup) this.f60599k.getParent()).removeView(this.f60599k);
                f1Var.addView(this.f60599k, new ViewGroup.LayoutParams(-1, -1));
                a("expanded");
            }
        }
        f1Var.setCloseVisible(true);
        f1Var.setOnCloseListener(this.f60592d);
        c cVar = this.f60601m;
        if (cVar != null && this.f60609u == null) {
            cVar.b();
        }
        gb.a("MraidPresenter: MRAID dialog create");
    }

    public void a(n6 n6Var, s6 s6Var, f1 f1Var) {
        Uri uri;
        e eVar = new e(n6Var, "inline");
        this.f60610v = eVar;
        n6Var.a(eVar);
        f1Var.addView(s6Var, new ViewGroup.LayoutParams(-1, -1));
        n6Var.a(s6Var);
        k kVar = this.f60605q;
        if (kVar == null) {
            return;
        }
        na naVar = this.f60602n;
        if (naVar != null && (uri = this.f60609u) != null) {
            f0.b(new d(naVar, kVar, uri, n6Var, this.f60590b));
        } else {
            kVar.dismiss();
        }
    }

    public void a(s6 s6Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.f60589a.addView(s6Var, 0);
        s6Var.setLayoutParams(layoutParams);
    }

    public boolean a() {
        s6 s6Var;
        Activity activity = (Activity) this.f60596h.get();
        if (activity == null || (s6Var = this.f60599k) == null) {
            return false;
        }
        return kb.a(activity, s6Var);
    }

    public void a(String str) {
        gb.a("MraidPresenter: MRAID state set to " + str);
        this.f60597i = str;
        this.f60595g.e(str);
        n6 n6Var = this.f60598j;
        if (n6Var != null) {
            n6Var.e(str);
        }
        if ("hidden".equals(str)) {
            gb.a("MraidPresenter: Mraid on close");
        }
    }

    public boolean a(Uri uri) {
        if (this.f60599k == null) {
            gb.a("MraidPresenter: Cannot expand - webview destroyed");
            return false;
        }
        if (!this.f60597i.equals("default") && !this.f60597i.equals("resized")) {
            return false;
        }
        this.f60609u = uri;
        k.a(this, this.f60590b).show();
        return true;
    }

    public final void a(IAdLoadingError iAdLoadingError) {
        c cVar = this.f60601m;
        if (cVar != null) {
            cVar.a(iAdLoadingError);
        }
    }
}
