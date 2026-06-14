package net.pubnative.lite.sdk.utils.browser;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public interface BrowserView {
    void closeBrowser();

    void hideProgressIndicator();

    void launchExternalBrowser(Intent intent);

    void redirectToExternalApp(Intent intent);

    void setPageNavigationBackEnabled(boolean z10);

    void setPageNavigationForwardEnabled(boolean z10);

    void showConnectionSecure(boolean z10);

    void showHostname(String str);

    void showProgressIndicator();

    void updateProgressIndicator(int i10);
}
