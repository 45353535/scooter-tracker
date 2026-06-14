package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.net.URI;

/* JADX INFO: loaded from: classes11.dex */
public class gc extends LinearLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f59769n = kb.c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f59770o = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb f59771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageButton f59772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f59773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f59774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f59775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f59776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f59777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f59778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageButton f59779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RelativeLayout f59780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f59781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProgressBar f59782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f59783m;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            gc gcVar = gc.this;
            gcVar.f59774d.setText(gcVar.a(str));
            return true;
        }
    }

    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 < 100 && gc.this.f59782l.getVisibility() == 8) {
                gc.this.f59782l.setVisibility(0);
                gc.this.f59777g.setVisibility(8);
            }
            gc.this.f59782l.setProgress(i10);
            if (i10 >= 100) {
                gc.this.f59782l.setVisibility(8);
                gc.this.f59777g.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            gc.this.f59775e.setText(webView.getTitle());
            gc.this.f59775e.setVisibility(0);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gc gcVar = gc.this;
            if (view != gcVar.f59772b) {
                if (view == gcVar.f59779i) {
                    gcVar.e();
                }
            } else {
                d dVar = gcVar.f59783m;
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    public interface d {
        void a();
    }

    public gc(Context context) {
        super(context);
        this.f59780j = new RelativeLayout(context);
        this.f59781k = new m0(context);
        this.f59772b = new ImageButton(context);
        this.f59773c = new LinearLayout(context);
        this.f59774d = new TextView(context);
        this.f59775e = new TextView(context);
        this.f59776f = new FrameLayout(context);
        this.f59778h = new FrameLayout(context);
        this.f59779i = new ImageButton(context);
        this.f59782l = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        this.f59777g = new View(context);
        this.f59771a = kb.e(context);
    }

    public boolean a() {
        return this.f59781k.a();
    }

    public void b() {
        this.f59781k.setWebChromeClient(null);
        this.f59781k.a(0);
    }

    public void c() {
        this.f59781k.b();
    }

    public void d() {
        WebSettings settings = this.f59781k.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
        }
        this.f59781k.setWebViewClient(new a());
        this.f59781k.setWebChromeClient(new b());
        f();
    }

    public final void e() {
        String url = this.f59781k.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            if (!(getContext() instanceof Activity)) {
                intent.addFlags(268435456);
            }
            getContext().startActivity(intent);
        } catch (Throwable unused) {
            gb.a("WebViewBrowser: Unable to open url " + url);
        }
    }

    public final void f() {
        setOrientation(1);
        setGravity(16);
        c cVar = new c();
        this.f59781k.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int iB = this.f59771a.b(50);
        if (getContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            iB = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.f59780j.setLayoutParams(new LinearLayout.LayoutParams(-1, iB));
        this.f59776f.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
        FrameLayout frameLayout = this.f59776f;
        int i10 = f59769n;
        frameLayout.setId(i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f59772b.setLayoutParams(layoutParams);
        this.f59772b.setImageBitmap(l0.a(iB / 4, this.f59771a.b(2)));
        this.f59772b.setContentDescription("Close");
        this.f59772b.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iB, iB);
        layoutParams2.addRule(21);
        this.f59778h.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f59778h;
        int i11 = f59770o;
        frameLayout2.setId(i11);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f59779i.setLayoutParams(layoutParams3);
        this.f59779i.setImageBitmap(l0.b(getContext()));
        this.f59779i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f59779i.setContentDescription("Open outside");
        this.f59779i.setOnClickListener(cVar);
        kb.a(this.f59772b, 0, -3355444);
        kb.a(this.f59779i, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i10);
        layoutParams4.addRule(0, i11);
        this.f59773c.setLayoutParams(layoutParams4);
        this.f59773c.setOrientation(1);
        this.f59773c.setPadding(this.f59771a.b(4), this.f59771a.b(4), this.f59771a.b(4), this.f59771a.b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.f59775e.setVisibility(8);
        this.f59775e.setLayoutParams(layoutParams5);
        this.f59775e.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f59775e.setTextSize(2, 18.0f);
        this.f59775e.setSingleLine();
        TextView textView = this.f59775e;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        textView.setEllipsize(truncateAt);
        this.f59774d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f59774d.setSingleLine();
        this.f59774d.setTextSize(2, 12.0f);
        this.f59774d.setEllipsize(truncateAt);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.f59782l.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        this.f59782l.setProgressDrawable(layerDrawable);
        this.f59782l.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f59771a.b(2)));
        this.f59782l.setProgress(0);
        this.f59773c.addView(this.f59775e);
        this.f59773c.addView(this.f59774d);
        this.f59776f.addView(this.f59772b);
        this.f59778h.addView(this.f59779i);
        this.f59780j.addView(this.f59776f);
        this.f59780j.addView(this.f59773c);
        this.f59780j.addView(this.f59778h);
        addView(this.f59780j);
        this.f59777g.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.f59777g.setVisibility(8);
        this.f59777g.setLayoutParams(layoutParams6);
        addView(this.f59782l);
        addView(this.f59777g);
        addView(this.f59781k);
    }

    public void setListener(@Nullable d dVar) {
        this.f59783m = dVar;
    }

    public void setUrl(@NonNull String str) {
        this.f59781k.a(str);
        this.f59774d.setText(a(str));
    }

    public final String a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return str;
        }
    }
}
