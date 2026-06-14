package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.t;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    public static final List a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, t0 externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, n linkHandler) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        k.c cVar = new k.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g(aVar.g(), 0, z10, bool, i10, z11, z12, context, customUserEventBuilderService, externalLinkHandler, linkHandler));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVarC = aVar.c();
        k.a aVar2 = cVarC != null ? new k.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e(cVarC, t.c(kotlin.ranges.g.e(i11, 0)), context, customUserEventBuilderService, externalLinkHandler, z10, linkHandler, null)) : null;
        k0 k0VarD = aVar.d();
        return CollectionsKt.listOfNotNull((Object[]) new k[]{cVar, aVar2, k0VarD != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(k0VarD, aVar.g().d(), t.c(kotlin.ranges.g.e(i12, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
