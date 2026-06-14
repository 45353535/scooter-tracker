package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b extends j0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f8307j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f8308k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f8311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8315i;

    class a extends t4 {
        a() {
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f8314h = new ArrayList();
        this.f8315i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8310d = kVar;
        this.f8309c = kVar.O();
        Integer num = (Integer) kVar.a(x4.G6);
        if (num.intValue() > 0) {
            synchronized (f8308k) {
                Set set = f8307j;
                set.add(this);
                n7.a("AdWebView", set.size(), num.intValue(), kVar.D());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (o0.i() && ((Boolean) kVar.a(x4.Z5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.c0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.a(view, motionEvent);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f8325b.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f8312f = true;
        this.f8313g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f8311e;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f8313g = z10;
        if (z10 && ((Boolean) this.f8310d.a(x4.f11470y6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f8315i) {
            try {
                Iterator it = this.f8314h.iterator();
                while (it.hasNext()) {
                    o8.a(this, (String) it.next(), "AdWebView", this.f8310d);
                }
                this.f8314h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f8309c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f8312f) {
            this.f8311e = bVar;
            try {
                applySettings(bVar);
                if (n7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                try {
                    if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                        try {
                            loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8309c.a("AdWebView", "AppLovinAd rendered");
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (bVar instanceof o7) {
                            o7 o7Var = (o7) bVar;
                            r7 r7VarG1 = o7Var.g1();
                            if (r7VarG1 != null) {
                                w7 w7VarE = r7VarG1.e();
                                Uri uriC = w7VarE.c();
                                if (uriC != null) {
                                    string = uriC.toString();
                                } else {
                                    string = "";
                                }
                                String str = string;
                                String strB = w7VarE.b();
                                String strI1 = o7Var.i1();
                                if (!StringUtils.isValidString(str) && !StringUtils.isValidString(strB)) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f8309c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                        return;
                                    }
                                    return;
                                }
                                if (w7VarE.d() == w7.a.STATIC) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f8309c.a("AdWebView", "Rendering WebView for static VAST ad");
                                    }
                                    String strA = a((String) this.f8310d.a(x4.N4), str);
                                    if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                                        strA = this.f8310d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                                    }
                                    loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                                    return;
                                }
                                if (w7VarE.d() == w7.a.HTML) {
                                    if (StringUtils.isValidString(strB)) {
                                        String strA2 = a(strI1, strB);
                                        String str2 = StringUtils.isValidString(strA2) ? strA2 : strB;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.f8309c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str2);
                                        }
                                        loadDataWithBaseURL(bVar.k(), str2, "text/html", null, "");
                                        return;
                                    }
                                    if (StringUtils.isValidString(str)) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.f8309c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                        }
                                        a(str, bVar.k(), strI1, this.f8310d, o7Var);
                                        return;
                                    }
                                    return;
                                }
                                if (w7VarE.d() == w7.a.IFRAME) {
                                    if (StringUtils.isValidString(str)) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.f8309c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                        }
                                        a(str, bVar.k(), strI1, this.f8310d, o7Var);
                                        return;
                                    } else {
                                        if (StringUtils.isValidString(strB)) {
                                            String strA3 = a(strI1, strB);
                                            String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                            if (com.applovin.impl.sdk.o.a()) {
                                                this.f8309c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                            }
                                            loadDataWithBaseURL(bVar.k(), str3, "text/html", null, "");
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8309c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                                    return;
                                }
                                return;
                            }
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8309c.a("AdWebView", "No companion ad provided.");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f8310d.a(x4.f11470y6)).booleanValue()) {
            if (this.f8313g) {
                o8.a(this, str, "AdWebView", this.f8310d);
                return;
            }
            synchronized (this.f8314h) {
                this.f8314h.add(str);
            }
            return;
        }
        o8.a(this, str, "AdWebView", this.f8310d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, o7 o7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8309c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(x4.O4), str);
        if (StringUtils.isValidString(strA2)) {
            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.e0().a(strA2, f2.a((AppLovinAdImpl) o7Var));
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8309c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA2);
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8309c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
