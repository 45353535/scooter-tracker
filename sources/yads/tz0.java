package yads;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes4.dex */
public final class tz0 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.sourceId();
        consoleMessage.lineNumber();
        boolean z10 = lb1.f113032a;
        return true;
    }
}
