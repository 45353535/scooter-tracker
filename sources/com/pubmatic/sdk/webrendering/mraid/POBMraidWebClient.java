package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class POBMraidWebClient extends POBHTMLViewClient {
    POBMraidWebClient(POBHTMLViewClient.OnRenderProcessGoneListener onRenderProcessGoneListener) {
        super(onRenderProcessGoneListener);
    }

    private WebResourceResponse a(Context context) {
        String mraidJs = POBInstanceProvider.getCacheManager(context).getMraidJs();
        if (mraidJs == null) {
            return null;
        }
        return new WebResourceResponse("text/javascript", StandardCharsets.UTF_8.name(), new ByteArrayInputStream(("javascript:" + mraidJs).getBytes()));
    }

    private boolean b(String str) {
        return "mraid.js".equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!b(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        POBLog.debug("POBMraidWebClient", "Injecting MRAID in webView via url", new Object[0]);
        WebResourceResponse webResourceResponseA = a(webView.getContext());
        return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (b(webResourceRequest.getUrl().toString())) {
            POBLog.debug("POBMraidWebClient", "Injecting MRAID in webView via request", new Object[0]);
            WebResourceResponse webResourceResponseA = a(webView.getContext());
            return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
