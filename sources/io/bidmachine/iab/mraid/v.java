package io.bidmachine.iab.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends WebChromeClient {
    private final boolean a(JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str;
        if (consoleMessage == null || consoleMessage.message() == null) {
            return false;
        }
        if (i.a()) {
            String strMessage = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(strMessage, "consoleMessage.message()");
            if (!StringsKt.g0(strMessage, "Uncaught ReferenceError", false, 2, null)) {
                String strSourceId = consoleMessage.sourceId();
                a1 a1Var = a1.f93282a;
                String strMessage2 = consoleMessage.message();
                if (strSourceId == null || strSourceId.length() == 0) {
                    str = "";
                } else {
                    str = " at " + strSourceId;
                }
                String str2 = String.format("%s%s:%d", Arrays.copyOf(new Object[]{strMessage2, str, Integer.valueOf(consoleMessage.lineNumber())}, 3));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                i.c("JS console", str2, new Object[0]);
            }
        }
        if (i.b()) {
            String strMessage3 = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(strMessage3, "consoleMessage.message()");
            if (StringsKt.g0(strMessage3, "AppodealAlert", false, 2, null)) {
                String strMessage4 = consoleMessage.message();
                Intrinsics.checkNotNullExpressionValue(strMessage4, "consoleMessage.message()");
                i.d("Appodeal", StringsKt.W(strMessage4, "AppodealAlert:", "", false, 4, null), new Object[0]);
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        i.c("JS alert", str2, new Object[0]);
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        i.c("JS confirm", str2, new Object[0]);
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        i.c("JS prompt", str2, new Object[0]);
        return a(result);
    }
}
