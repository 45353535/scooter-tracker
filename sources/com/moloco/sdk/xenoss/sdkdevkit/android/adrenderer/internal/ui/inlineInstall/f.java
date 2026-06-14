package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f57064a;

    public f(t0 externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f57064a = externalLinkHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f57064a.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void b(String str) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void c(String str) {
    }
}
