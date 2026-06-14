package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends f1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f70286i = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WebView f70288h;

    public static final class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f70289a;

        public a(Function0 function0) {
            this.f70289a = function0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Function0 function0 = this.f70289a;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, AttributeSet attributeSet, int i10, String persistentCtaContentDescription, final Function0 function0) {
        super(context, attributeSet, i10, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        this.f70287g = persistentCtaContentDescription;
        WebView webView = new WebView(context);
        webView.setId(View.generateViewId());
        webView.setLayoutParams(new ConstraintLayout.LayoutParams(b(320), b(60)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new a(function0));
        webView.setFocusable(true);
        webView.setClickable(true);
        webView.setOnClickListener(new View.OnClickListener() { // from class: f1.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l0.g(function0, view);
            }
        });
        this.f70288h = webView;
        setContentDescription(persistentCtaContentDescription);
        addView(webView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(webView.getId(), 1, 0, 1);
        constraintSet.connect(webView.getId(), 2, 0, 2);
        constraintSet.connect(webView.getId(), 3, 0, 3);
        constraintSet.connect(webView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    public static final void g(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // f1.f1
    public void e(m4 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strB = config.b();
        if (strB != null) {
            this.f70288h.loadDataWithBaseURL(null, strB, "text/html", "UTF-8", null);
        }
    }

    @Override // f1.f1
    public void f(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f70288h, purpose);
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final WebView getWebView() {
        return this.f70288h;
    }

    public final void setContentUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f70288h.loadUrl(url);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l0(Context context, AttributeSet attributeSet, int i10, String str, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        i10 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            str = context.getString(R$string.f17919e, "Advertisement");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet, i10, str, (i11 & 16) != 0 ? null : function0);
    }
}
