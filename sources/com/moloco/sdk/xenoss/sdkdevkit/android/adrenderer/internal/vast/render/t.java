package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t {
    public static final p a(a0 a0Var, Integer num, Integer num2, String str, CoroutineScope scope, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return new s(a0Var, num, num2, str, scope, context, customUserEventBuilderService, externalLinkHandler, function0, function02);
    }
}
