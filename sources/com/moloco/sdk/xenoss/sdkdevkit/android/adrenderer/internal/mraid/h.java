package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final List a(g gVar, q mraidFullscreenContentController, int i10, Context context, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n linkHandler) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        k.d dVar = new k.d(mraidFullscreenContentController);
        k0 k0VarB = gVar.b();
        return CollectionsKt.listOfNotNull((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k[]{dVar, k0VarB != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(k0VarB, null, lf.t.c(kotlin.ranges.g.e(i10, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
