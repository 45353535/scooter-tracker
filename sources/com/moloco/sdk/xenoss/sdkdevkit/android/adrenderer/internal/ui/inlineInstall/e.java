package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f57059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f57060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57063e;

    public e(g inlineInstallSheetLauncher, t0 fallbackHandler, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(inlineInstallSheetLauncher, "inlineInstallSheetLauncher");
        Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        this.f57059a = inlineInstallSheetLauncher;
        this.f57060b = fallbackHandler;
        this.f57061c = z10;
        this.f57062d = z11;
        this.f57063e = z12;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f57061c) {
            this.f57059a.a(url, this.f57060b);
        } else {
            this.f57060b.a(url);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void b(String str) {
        if (this.f57062d) {
            this.f57059a.b(str, this.f57060b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n
    public void c(String str) {
        if (this.f57063e) {
            this.f57059a.b(str, this.f57060b);
        }
    }
}
