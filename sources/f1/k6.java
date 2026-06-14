package f1;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.D5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k6 extends v4 {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70257f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l4 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new l4(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f70258f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new WebChromeClient();
        }
    }

    public static final class c extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ zb f70259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zb zbVar) {
            super(2);
            this.f70259f = zbVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b5 invoke(v5 cb2, Cif et) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new b5(cb2, et, this.f70259f, (ga) rd.f70996b.a().b().get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(Context context, String html, v5 callback, zb impressionInterface, String str, Cif eventTracker, Function1 cbWebViewFactory, Function1 cbWebChromeClientFactory, Function2 cbWebViewClientFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbWebChromeClientFactory, "cbWebChromeClientFactory");
        Intrinsics.checkNotNullParameter(cbWebViewClientFactory, "cbWebViewClientFactory");
        setFocusable(false);
        jf jfVarA = jf.a();
        setWebViewContainer((RelativeLayout) jfVarA.b(new RelativeLayout(context)));
        setWebView((l4) cbWebViewFactory.invoke(context));
        ld.f70416c.b(context);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e10) {
            eg.o("Exception while enabling webview debugging", e10);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        l4 webView = getWebView();
        if (webView != null) {
            webView.getSettings().setSupportZoom(false);
            webView.setLayoutParams(layoutParams);
            webView.setBackgroundColor(0);
            webView.setWebViewClient((WebViewClient) jfVarA.b(cbWebViewClientFactory.invoke(callback, eventTracker)));
            RelativeLayout webViewContainer = getWebViewContainer();
            if (webViewContainer != null) {
                webViewContainer.setLayoutParams(layoutParams);
                webView.setWebChromeClient((WebChromeClient) cbWebChromeClientFactory.invoke(webViewContainer));
                webViewContainer.addView(webView);
            }
            webView.loadDataWithBaseURL(str, html, "text/html", D5.N, null);
        }
    }

    public /* synthetic */ k6(Context context, String str, v5 v5Var, zb zbVar, String str2, Cif cif, Function1 function1, Function1 function12, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        zb zbVar2;
        Function2 cVar;
        Function1 function13 = (i10 & 64) != 0 ? a.f70257f : function1;
        Function1 function14 = (i10 & 128) != 0 ? b.f70258f : function12;
        if ((i10 & 256) != 0) {
            zbVar2 = zbVar;
            cVar = new c(zbVar2);
        } else {
            zbVar2 = zbVar;
            cVar = function2;
        }
        this(context, str, v5Var, zbVar2, str2, cif, function13, function14, cVar);
    }
}
