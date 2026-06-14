package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5409s1;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5409s1 f78679a;

    public AppMetricaInitializerJsInterface(@NonNull C5409s1 c5409s1) {
        this.f78679a = c5409s1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f78679a.c(str);
    }
}
