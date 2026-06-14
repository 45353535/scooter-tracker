package f1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class l4 extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
    }

    @Override // android.webkit.WebView
    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        a();
    }
}
