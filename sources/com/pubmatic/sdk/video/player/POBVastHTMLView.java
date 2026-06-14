package com.pubmatic.sdk.video.player;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public abstract class POBVastHTMLView<T extends POBAdDescriptor> extends FrameLayout implements POBHtmlRendererListener, POBHTMLViewClient.OnRenderProcessGoneListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBHTMLRenderer f63079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBWebView f63080b;

    class a extends POBHTMLRenderer {
        a(POBWebView pOBWebView, POBHTMLViewClient pOBHTMLViewClient) {
            super(pOBWebView, pOBHTMLViewClient);
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer
        public void loadHTML(String str, String str2, boolean z10) {
            if (str == null) {
                POBVastHTMLView.this.f63080b.loadUrl(str2);
                return;
            }
            try {
                Formatter formatter = new Formatter(Locale.getDefault());
                formatter.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1\"/><style>body{margin:0;padding:0;}div{display:block;width:100%%;height:100%%;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                String strValueOf = String.valueOf(formatter);
                formatter.close();
                POBVastHTMLView.this.f63080b.loadDataWithBaseURL(null, strValueOf, "text/html", StandardCharsets.UTF_8.name(), null);
            } catch (IllegalFormatException e10) {
                notifyError(new POBError(1009, "Unable to render creative, due to " + e10.getMessage()));
            }
        }
    }

    interface b {
        void a();

        void a(POBVastError pOBVastError);

        void a(String str);
    }

    public POBVastHTMLView(@NonNull Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(getResources().getColor(R.color.transparent));
    }

    @Nullable
    @SuppressLint({"SetJavaScriptEnabled"})
    protected POBWebView createWebView(@NonNull Context context) {
        POBWebView pOBWebViewCreateInstance = POBWebView.createInstance(context);
        if (pOBWebViewCreateInstance != null) {
            pOBWebViewCreateInstance.getSettings().setJavaScriptEnabled(true);
            pOBWebViewCreateInstance.getSettings().setCacheMode(2);
            pOBWebViewCreateInstance.setScrollBarStyle(0);
        }
        return pOBWebViewCreateInstance;
    }

    public void destroy() {
        invalidateRenderer();
    }

    public void invalidateRenderer() {
        POBHTMLRenderer pOBHTMLRenderer = this.f63079a;
        if (pOBHTMLRenderer != null) {
            pOBHTMLRenderer.destroy();
            this.f63079a = null;
        }
    }

    public abstract /* synthetic */ void onRenderProcessGone();

    public abstract /* synthetic */ void onViewClicked(@Nullable String str);

    public abstract /* synthetic */ void onViewRendered(@NonNull View view);

    public abstract /* synthetic */ void onViewRenderingFailed(@NonNull POBError pOBError);

    protected boolean renderVastHTMLView(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBWebView pOBWebViewCreateWebView = createWebView(getContext());
        this.f63080b = pOBWebViewCreateWebView;
        if (pOBWebViewCreateWebView == null) {
            return false;
        }
        POBHTMLViewClient pOBHTMLViewClient = new POBHTMLViewClient(this);
        pOBHTMLViewClient.disableMultipleOnPageFinished(true);
        a aVar = new a(this.f63080b, pOBHTMLViewClient);
        this.f63079a = aVar;
        aVar.setRendererViewListener(this);
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        if (POBUtils.isNullOrEmpty(renderableContent)) {
            return false;
        }
        if (renderableContent.toLowerCase().startsWith("http")) {
            this.f63079a.loadHTML(null, renderableContent, pOBAdDescriptor.isCompanion());
        } else {
            this.f63079a.loadHTML(renderableContent, "", pOBAdDescriptor.isCompanion());
        }
        return true;
    }
}
