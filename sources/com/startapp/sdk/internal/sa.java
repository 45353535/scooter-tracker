package com.startapp.sdk.internal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes11.dex */
public final class sa extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                g9 g9Var = new g9(h9.f64610e);
                g9Var.f64553d = "MraidMode.ConsoleError";
                g9Var.f64554e = consoleMessage.message();
                g9Var.a();
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
