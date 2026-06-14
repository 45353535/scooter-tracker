package com.pubmatic.sdk.webrendering.ui;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBHTMLRenderer implements POBHTMLViewClient.HTMLViewClientListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBHtmlRendererListener f63441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBWebView f63442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Formatter f63444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63445e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBTimeoutHandler f63446f;

    class a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBHTMLRenderer pOBHTMLRenderer = POBHTMLRenderer.this;
            pOBHTMLRenderer.notifyError(new POBError(1009, String.format("Unable to render creative within %s seconds.", Long.valueOf(pOBHTMLRenderer.f63445e))));
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBHTMLRenderer.this.invalidateWebView();
        }
    }

    class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            POBHTMLRenderer.this.f63443c = true;
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public POBHTMLRenderer(@NonNull POBWebView pOBWebView, @NonNull POBHTMLViewClient pOBHTMLViewClient) {
        this.f63442b = pOBWebView;
        pOBWebView.setWebViewClient(pOBHTMLViewClient);
        this.f63442b.setOnTouchListener(new c());
        pOBHTMLViewClient.setHTMLClientListener(this);
        this.f63444d = new Formatter(Locale.getDefault());
    }

    private void b() {
        if (this.f63446f == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new a());
            this.f63446f = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.f63445e * 1000);
        }
    }

    public void destroy() {
        a();
        POBWebView pOBWebView = this.f63442b;
        if (pOBWebView != null) {
            pOBWebView.postDelayed(new b(), 1000L);
        }
    }

    public void invalidateWebView() {
        POBWebView pOBWebView = this.f63442b;
        if (pOBWebView != null) {
            pOBWebView.setWebViewClient(null);
            this.f63442b.stopLoading();
            this.f63442b.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            this.f63442b.clearHistory();
            this.f63442b.destroy();
            this.f63442b = null;
        }
    }

    public boolean isUserInteracted() {
        return this.f63443c;
    }

    public void loadHTML(@Nullable String str, @Nullable String str2, boolean z10) {
        if (this.f63442b != null) {
            if (str == null) {
                if (str2 != null) {
                    Trace.endSection();
                    Trace.beginSection("POB Rendering");
                    this.f63442b.loadUrl(str2);
                    return;
                }
                return;
            }
            try {
                if (z10) {
                    this.f63444d.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1\"/><style>body{margin:0;padding:0;}div{display:block;width:100%%;height:100%%;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                } else {
                    this.f63444d.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0\"/><style>body{margin:0;padding:0;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                }
                String strValueOf = String.valueOf(this.f63444d);
                this.f63444d.close();
                Trace.endSection();
                Trace.beginSection("POB Rendering");
                this.f63442b.loadDataWithBaseURL(str2, strValueOf, "text/html", StandardCharsets.UTF_8.name(), null);
                if (z10) {
                    return;
                }
                b();
            } catch (OutOfMemoryError e10) {
                e = e10;
                notifyError(new POBError(1009, "Unable to render creative, due to " + e.getMessage()));
            } catch (IllegalFormatException e11) {
                e = e11;
                notifyError(new POBError(1009, "Unable to render creative, due to " + e.getMessage()));
            }
        }
    }

    protected void notifyError(POBError pOBError) {
        a();
        POBHtmlRendererListener pOBHtmlRendererListener = this.f63441a;
        if (pOBHtmlRendererListener != null) {
            pOBHtmlRendererListener.onViewRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.HTMLViewClientListener
    public void onPageFinished(@NonNull WebView webView) {
        a();
        POBHtmlRendererListener pOBHtmlRendererListener = this.f63441a;
        if (pOBHtmlRendererListener != null) {
            pOBHtmlRendererListener.onViewRendered(webView);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.HTMLViewClientListener
    public void onReceivedError(@NonNull POBError pOBError) {
        notifyError(pOBError);
    }

    public void setRendererViewListener(@Nullable POBHtmlRendererListener pOBHtmlRendererListener) {
        this.f63441a = pOBHtmlRendererListener;
    }

    public void setRenderingTimeout(int i10) {
        this.f63445e = i10;
    }

    public void setUserInteracted(boolean z10) {
        this.f63443c = z10;
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.HTMLViewClientListener
    public boolean shouldOverrideUrlLoading(@Nullable String str) {
        POBHtmlRendererListener pOBHtmlRendererListener = this.f63441a;
        if (pOBHtmlRendererListener == null || !this.f63443c) {
            return false;
        }
        this.f63443c = false;
        pOBHtmlRendererListener.onViewClicked(str);
        return true;
    }

    private void a() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63446f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63446f = null;
        }
    }
}
