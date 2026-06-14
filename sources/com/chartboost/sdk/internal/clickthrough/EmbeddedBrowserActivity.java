package com.chartboost.sdk.internal.clickthrough;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import f1.ag;
import f1.eg;
import f1.oc;
import f1.u;
import f1.xc;
import f1.xe;
import f1.y0;
import f1.z2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002'/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\r\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity;", "Landroid/app/Activity;", "Lf1/ag;", "<init>", "()V", "", "type", "location", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;)V", "Lf1/y0;", "event", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Lf1/y0;)V", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "(Lf1/y0;)Lf1/y0;", "p", "Lf1/u;", "n", "(Lf1/u;)Lf1/u;", "Lf1/xc;", "m", "(Lf1/xc;)Lf1/xc;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "Lkotlin/Lazy;", "g", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/widget/FrameLayout;", "d", "a", "()Landroid/widget/FrameLayout;", "frameLayout", "Landroid/webkit/WebView;", "h", "()Landroid/webkit/WebView;", "webView", InneractiveMediationDefs.GENDER_FEMALE, "b", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class EmbeddedBrowserActivity extends Activity implements ag {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f17929b = xe.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Lazy view = i.a(new d());

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Lazy frameLayout = i.a(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Lazy webView = i.a(new e());

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intentPutExtra = new Intent(context, (Class<?>) EmbeddedBrowserActivity.class).putExtra("KEY_INTENT_URL", url);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final String b(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_INTENT_URL");
            }
            return null;
        }

        public Companion() {
        }
    }

    public final class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f17933a = CollectionsKt.listOf((Object[]) new Integer[]{-1, -2, -3, -6, -9, -10, -11, -12});

        public b() {
        }

        public final String a(WebResourceError webResourceError) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.b(intent) : null);
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
            if (description == null) {
                description = "";
            } else {
                Intrinsics.checkNotNull(description);
            }
            jSONObject.put("error", description);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final String b(WebResourceResponse webResourceResponse) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.b(intent) : null);
            jSONObject.put("error", "HTTP status code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final void c(WebResourceResponse webResourceResponse) {
            EmbeddedBrowserActivity.this.e((y0) new oc(z2.g.f71736d, b(webResourceResponse), null, null, null, 28, null));
        }

        public final boolean d(WebResourceError webResourceError) {
            List list = this.f17933a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (webResourceError != null && iIntValue == webResourceError.getErrorCode()) {
                    return true;
                }
            }
            return false;
        }

        public final void e(WebResourceError webResourceError) {
            if (d(webResourceError)) {
                EmbeddedBrowserActivity.this.e((y0) new oc(z2.g.f71736d, a(webResourceError), null, null, null, 28, null));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            eg.j("onReceivedError: " + webResourceError, null, 2, null);
            if (b1.b.h()) {
                e(webResourceError);
                return;
            }
            eg.j("SDK is not initialized. Cannot track error: " + webResourceError, null, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            eg.j("onReceivedHttpError: " + webResourceResponse, null, 2, null);
            c(webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            z2.b bVar = z2.b.f71705d;
            if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                str = "Webview killed, likely due to low memory";
            } else {
                str = "Webview crashed " + renderProcessGoneDetail;
            }
            embeddedBrowserActivity.e((y0) new oc(bVar, str, null, null, null, 28, null));
            Context context = webView != null ? webView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return true;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayout = new FrameLayout(EmbeddedBrowserActivity.this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayoutA = EmbeddedBrowserActivity.this.a();
            frameLayoutA.addView(EmbeddedBrowserActivity.this.h());
            return frameLayoutA;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final WebView invoke() {
            WebView webView = new WebView(EmbeddedBrowserActivity.this);
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setWebViewClient(embeddedBrowserActivity.new b());
            return webView;
        }
    }

    public static /* synthetic */ void b(EmbeddedBrowserActivity embeddedBrowserActivity, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        embeddedBrowserActivity.c(th2);
    }

    public final FrameLayout a() {
        return (FrameLayout) this.frameLayout.getValue();
    }

    public final void c(Throwable t10) {
        eg.i("Error loading URL into embedded browser", t10);
        finish();
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f17929b.e(y0Var);
    }

    public final View g() {
        return (View) this.view.getValue();
    }

    public final WebView h() {
        return (WebView) this.webView.getValue();
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f17929b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f17929b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f17929b.n(uVar);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objB;
        Unit unit;
        try {
            Result.Companion companion = Result.f93230c;
            super.onCreate(savedInstanceState);
            setContentView(g());
            String strB = INSTANCE.b(getIntent());
            if (strB != null) {
                h().loadUrl(strB);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                b(this, null, 1, null);
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            c(thG);
        }
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f17929b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f17929b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17929b.mo4436e(event);
    }
}
