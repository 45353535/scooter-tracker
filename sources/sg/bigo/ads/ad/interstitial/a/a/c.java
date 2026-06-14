package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.b.a.a.d;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements sg.bigo.ads.ad.interstitial.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.api.core.b f100619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final c.b f100620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f100621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WebView f100622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f100623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a f100624f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f100626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f100627i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    a.C1291a f100629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f100630l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f100632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final p f100633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final Ad f100634p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f100625g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f100628j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final List<a.C1291a> f100631m = new ArrayList();

    class a extends FrameLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f100645b;

        public a(Context context) {
            super(context);
            this.f100645b = new i();
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f100645b.f102538b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f100645b.f102537a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a.C1291a f100646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewConfiguration f100647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f100648c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f100650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f100651f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f100649d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        i f100652g = new i();

        public b(Context context, a.C1291a c1291a) {
            this.f100646a = c1291a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f100647b = viewConfiguration;
            this.f100648c = viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.f100649d = true;
                this.f100650e = motionEvent.getX();
                this.f100651f = motionEvent.getY();
                this.f100652g.f102537a = new Point((int) this.f100650e, (int) this.f100651f);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.f100649d) {
                    this.f100649d = false;
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    this.f100652g.f102538b = new Point((int) x10, (int) y10);
                    if (Math.abs(this.f100650e - x10) < this.f100648c && Math.abs(this.f100651f - y10) < this.f100648c) {
                        c cVar = c.this;
                        cVar.a(cVar.g().f100335b.f102178e, this.f100652g);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.f100649d = false;
            }
            return true;
        }
    }

    public c(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable c.b bVar2) {
        this.f100632n = cVar;
        this.f100633o = pVar;
        this.f100634p = ad2;
        this.f100619a = bVar;
        this.f100620b = bVar2;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
            while (it.hasNext()) {
                List<a.C1291a> list = it.next().f104178b;
                if (list != null) {
                    for (a.C1291a c1291a : list) {
                        if (c1291a.a() && c1291a.b()) {
                            this.f100631m.add(c1291a);
                        }
                    }
                    for (a.C1291a c1291a2 : list) {
                        if (c1291a2.a() && c1291a2.c()) {
                            this.f100631m.add(c1291a2);
                        }
                    }
                }
            }
        }
        this.f100630l = !this.f100631m.isEmpty();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f100621c;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        return (this.f100625g || this.f100621c == null) ? false : true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        View view = this.f100621c;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        View view = this.f100621c;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "release");
        WebView webView = this.f100622d;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.f100622d.destroy();
            this.f100622d = null;
        }
        View view = this.f100621c;
        if (view != null) {
            u.b(view);
            this.f100621c = null;
        }
        this.f100625g = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        c.b bVar;
        if (this.f100628j || this.f100627i || (bVar = this.f100620b) == null || this.f100626h <= 0) {
            return;
        }
        bVar.a(this.f100619a, SystemClock.elapsedRealtime() - this.f100626h);
    }

    final sg.bigo.ads.ad.c<?, ?> g() {
        Ad ad2 = this.f100634p;
        return ad2 instanceof sg.bigo.ads.ad.b.a.a.c ? (sg.bigo.ads.ad.b.a.a.c) ad2 : ad2 instanceof d ? (d) ad2 : ad2 instanceof s ? ((s) ad2).H() : (sg.bigo.ads.ad.c) ad2;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        sg.bigo.ads.core.player.c cVar;
        if (i10 != 1 || (cVar = this.f100632n) == null) {
            return;
        }
        cVar.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams;
        int i12;
        int i13;
        View view = this.f100623e;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i12 = layoutParams.width) == -1 || (i13 = layoutParams.height) == 0 || i12 == 0) {
            return;
        }
        if (i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = i13;
            float f12 = i12;
            float f13 = (f11 * f10) / f12;
            float f14 = i11;
            if (f13 > f14) {
                f10 = (f12 * f14) / f11;
                f13 = f14;
            }
            i12 = (int) f10;
            i13 = (int) f13;
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        this.f100623e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final List<a.C1291a> list, @Nullable final a.C1291a c1291a, final int i10) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.f100625g) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "static vast companion destroyed, stop preload.");
                    return;
                }
                if (list.isEmpty()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image list empty, stop preload.");
                    c cVar = c.this;
                    c.b bVar = cVar.f100620b;
                    if (bVar != null) {
                        sg.bigo.ads.api.core.b bVar2 = cVar.f100619a;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - c.this.f100626h;
                        a.C1291a c1291a2 = c1291a;
                        bVar.a(bVar2, jElapsedRealtime, c1291a2 == null ? null : c1291a2.f104180b, i10 - 1, c1291a2 != null ? c1291a2.f104183e : null, "load failed");
                        return;
                    }
                    return;
                }
                c.this.f100629k = (a.C1291a) list.remove(0);
                String str = c.this.f100629k.f104180b;
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to preload image: ".concat(String.valueOf(str)));
                if (URLUtil.isNetworkUrl(str)) {
                    e.a(context, str, c.this.f100619a.al(), new g() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i11, @NonNull String str2, String str3) {
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load failed: " + str2 + ", try to preload next image.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            c cVar2 = c.this;
                            cVar2.a(context, list, cVar2.f100629k, i10 + 1);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                            Bitmap bitmap2;
                            String string;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load success.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            final c cVar2 = c.this;
                            final Context context2 = context;
                            a.C1291a c1291a3 = cVar2.f100629k;
                            int i11 = i10;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to handle image.");
                            View view = null;
                            if (c1291a3.b()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle jpg/png image.");
                                AdImageView adImageView = new AdImageView(context2);
                                bitmap2 = bitmap;
                                adImageView.setImageBitmap(bitmap2);
                                adImageView.setOnTouchListener(cVar2.new b(context2, c1291a3));
                                string = null;
                                view = adImageView;
                            } else {
                                bitmap2 = bitmap;
                                if (c1291a3.c()) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle gif image.");
                                    try {
                                        File file = new File(fVar.f102682d);
                                        if (file.exists()) {
                                            URI uri = file.toURI();
                                            WebView webView = new WebView(context2);
                                            webView.getSettings().setAllowFileAccess(true);
                                            webView.getSettings().setAllowFileAccessFromFileURLs(false);
                                            webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                                            if (uri.toString().startsWith(AdPayload.FILE_SCHEME)) {
                                                webView.getSettings().setJavaScriptEnabled(false);
                                            } else {
                                                webView.getSettings().setJavaScriptEnabled(true);
                                            }
                                            webView.loadUrl(uri.toString());
                                            webView.getSettings().setLoadWithOverviewMode(true);
                                            webView.getSettings().setUseWideViewPort(true);
                                            webView.setOnTouchListener(cVar2.new b(context2, c1291a3));
                                            cVar2.f100622d = webView;
                                            string = null;
                                            view = webView;
                                        } else {
                                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "gif image file is not exists.");
                                            string = "git file not exists";
                                        }
                                    } catch (Exception e10) {
                                        string = e10.toString();
                                    }
                                } else {
                                    string = null;
                                }
                            }
                            if (view == null) {
                                c.b bVar3 = cVar2.f100620b;
                                if (bVar3 != null) {
                                    cVar2.f100628j = true;
                                    bVar3.a(cVar2.f100619a, SystemClock.elapsedRealtime() - cVar2.f100626h, c1291a3.f104180b, i11, c1291a3.f104183e, string);
                                    return;
                                }
                                return;
                            }
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            if (width <= 0 || height <= 0) {
                                width = sg.bigo.ads.common.utils.e.a(context2, c1291a3.f104181c);
                                height = sg.bigo.ads.common.utils.e.a(context2, c1291a3.f104182d);
                            }
                            float f10 = context2.getResources().getDisplayMetrics().widthPixels;
                            float fC = sg.bigo.ads.common.utils.e.c(context2);
                            if (f10 > 0.0f && fC > 0.0f) {
                                float f11 = height;
                                float f12 = width;
                                float f13 = (f11 * f10) / f12;
                                if (f13 > fC) {
                                    f10 = (f12 * fC) / f11;
                                } else {
                                    fC = f13;
                                }
                                width = (int) f10;
                                height = (int) fC;
                            }
                            FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
                            final a aVar = cVar2.new a(context2);
                            aVar.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    c.this.a(context2, aVar.f100645b);
                                }
                            });
                            cVar2.f100623e = view;
                            aVar.addView(view, layoutParams);
                            cVar2.f100621c = aVar;
                            c.b bVar4 = cVar2.f100620b;
                            if (bVar4 != null) {
                                cVar2.f100627i = true;
                                bVar4.a(cVar2.f100619a, SystemClock.elapsedRealtime() - cVar2.f100626h, c1291a3.f104180b, i11, c1291a3.f104183e);
                            }
                        }
                    });
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image url is invalid: " + str + ", try to preload next image.");
                c cVar2 = c.this;
                cVar2.a(context, list, cVar2.f100629k, i10 + 1);
            }
        });
    }

    public final void a(Context context, i iVar) {
        sg.bigo.ads.api.core.d dVarA;
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle ad click.");
        Ad ad2 = this.f100634p;
        if (ad2 instanceof sg.bigo.ads.api.b.f) {
            ((sg.bigo.ads.api.b.f) ad2).L();
        }
        if (this.f100619a.f().c() == 0 || !(this.f100634p instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f100619a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f100621c) : null, this.f100634p, this.f100619a, null, this.f100633o, this.f100629k, zA);
            dVarA.f102167k = 0;
        } else {
            sg.bigo.ads.controller.landing.e.a(this.f100621c.getContext(), g());
            dVarA = new sg.bigo.ads.api.core.d();
            dVarA.f102167k = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.f100632n;
        if (cVar != null && !cVar.b(this.f100619a)) {
            this.f100632n.a(this.f100619a);
        }
        c.a aVar = this.f100624f;
        if (aVar != null) {
            aVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        String str;
        if (!this.f100630l) {
            str = "image resource is disable.";
        } else if (this.f100625g) {
            str = "static vast companion destroyed, stop preload.";
        } else {
            if (!this.f100631m.isEmpty()) {
                this.f100626h = SystemClock.elapsedRealtime();
                c.b bVar = this.f100620b;
                if (bVar != null) {
                    bVar.a(this.f100619a);
                }
                a(context, this.f100631m, null, 0);
                return true;
            }
            str = "image list empty, stop preload.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", str);
        return false;
    }
}
