package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57079c;

    public l(boolean z10, boolean z11, boolean z12) {
        this.f57077a = z10;
        this.f57078b = z11;
        this.f57079c = z12;
    }

    public final n a(t0 externalLinkHandler, g gVar) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return ((this.f57077a || this.f57079c || this.f57078b) && gVar != null) ? new e(gVar, externalLinkHandler, this.f57077a, this.f57078b, this.f57079c) : new f(externalLinkHandler);
    }
}
