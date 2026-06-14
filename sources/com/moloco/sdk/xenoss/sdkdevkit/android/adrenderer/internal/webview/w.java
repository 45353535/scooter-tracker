package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f58834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f58835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f58836c;

    public w(x localAssetLoader, u contentEncoder, v cssMarginHandler) {
        Intrinsics.checkNotNullParameter(localAssetLoader, "localAssetLoader");
        Intrinsics.checkNotNullParameter(contentEncoder, "contentEncoder");
        Intrinsics.checkNotNullParameter(cssMarginHandler, "cssMarginHandler");
        this.f58834a = localAssetLoader;
        this.f58835b = contentEncoder;
        this.f58836c = cssMarginHandler;
    }

    public String a(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        String strA = this.f58834a.a("mraid.js");
        return StringsKt.n("\n            <script>" + this.f58834a.a("mraid-bridge.js") + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + this.f58835b.a(StringsKt.W(this.f58836c.a(html), "<script src=\"mraid.js\"></script>", "<script>" + strA + "</script>", false, 4, null)) + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public /* synthetic */ w(x xVar, u uVar, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, uVar, (i10 & 4) != 0 ? new v() : vVar);
    }
}
