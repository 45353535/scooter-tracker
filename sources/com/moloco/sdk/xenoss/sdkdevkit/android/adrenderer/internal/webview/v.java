package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58833a = "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ";

    public final String a(String toHtml) {
        Intrinsics.checkNotNullParameter(toHtml, "toHtml");
        return this.f58833a + toHtml;
    }
}
