package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5409s1;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5409s1 f78680a;

    public AppMetricaJsInterface(@NonNull C5409s1 c5409s1) {
        this.f78680a = c5409s1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f78680a.d(str, str2);
    }
}
