package f1;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import f1.tf;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 extends WebChromeClient implements tf.a, e5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f70750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da f70751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tf f70752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f70754f;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70755r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f70756s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ConsoleMessage f70757t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConsoleMessage consoleMessage, Continuation continuation) {
            super(2, continuation);
            this.f70756s = str;
            this.f70757t = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f70756s, this.f70757t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f70755r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            eg.e("Chartboost Rich Webview: " + this.f70756s + " -- From line " + this.f70757t.lineNumber() + " of " + this.f70757t.sourceId(), null, 2, null);
            return Unit.f93236a;
        }
    }

    public p0(View activityNonVideoView, da cmd, tf tfVar) {
        Intrinsics.checkNotNullParameter(activityNonVideoView, "activityNonVideoView");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        this.f70750b = activityNonVideoView;
        this.f70751c = cmd;
        this.f70752d = tfVar;
        cmd.e(this);
    }

    public final void a(String str) {
        tf tfVar = this.f70752d;
        if (tfVar != null) {
            tfVar.a(str, this);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String strMessage = cm.message();
        eg.i.d(kotlinx.coroutines.i.a(eg.o0.b()), null, null, new a(strMessage, cm, null), 3, null);
        Intrinsics.checkNotNull(strMessage);
        a(strMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient, f1.e5
    public void onHideCustomView() {
        WebChromeClient.CustomViewCallback customViewCallback;
        if (this.f70753e) {
            this.f70750b.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback2 = this.f70754f;
            if (customViewCallback2 != null && !StringsKt.g0(customViewCallback2.getClass().getName(), ".chromium.", false, 2, null) && (customViewCallback = this.f70754f) != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.f70753e = false;
            this.f70754f = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2 == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("eventType");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONObject jSONObject2 = jSONObject.getJSONObject("eventArgs");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            String strC = this.f70751c.c(jSONObject2, string);
            if (jsPromptResult != null) {
                jsPromptResult.confirm(strC);
            }
            return true;
        } catch (JSONException unused) {
            eg.j("Exception caught parsing the function name from js to native", null, 2, null);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // f1.tf.a
    public void a(JSONObject jSONObject) {
        this.f70751c.c(jSONObject, ta.f71174u.h());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f70753e = true;
            this.f70754f = customViewCallback;
            this.f70750b.setVisibility(4);
        }
    }
}
