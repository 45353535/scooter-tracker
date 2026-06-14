package f1;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v4 extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l4 f71363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebChromeClient f71364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f71365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p9 f71366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void a() {
        Unit unit;
        l4 l4Var = this.f71363b;
        if (l4Var == null) {
            eg.e("Webview is null on destroyWebview", null, 2, null);
            return;
        }
        RelativeLayout relativeLayout = this.f71365d;
        if (relativeLayout != null) {
            relativeLayout.removeView(l4Var);
            removeView(relativeLayout);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("webViewContainer is null destroyWebview", null, 2, null);
        }
        l4 l4Var2 = this.f71363b;
        if (l4Var2 != null) {
            l4Var2.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            l4Var2.onPause();
            l4Var2.removeAllViews();
            l4Var2.destroy();
        }
        removeAllViews();
    }

    @Nullable
    public final p9 getLastOrientation() {
        return this.f71366e;
    }

    @Nullable
    public final WebChromeClient getWebChromeClient() {
        return this.f71364c;
    }

    @Nullable
    public final l4 getWebView() {
        return this.f71363b;
    }

    @Nullable
    public final RelativeLayout getWebViewContainer() {
        return this.f71365d;
    }

    public final void setLastOrientation(@Nullable p9 p9Var) {
        this.f71366e = p9Var;
    }

    public final void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.f71364c = webChromeClient;
    }

    public final void setWebView(@Nullable l4 l4Var) {
        this.f71363b = l4Var;
    }

    public final void setWebViewContainer(@Nullable RelativeLayout relativeLayout) {
        this.f71365d = relativeLayout;
    }
}
