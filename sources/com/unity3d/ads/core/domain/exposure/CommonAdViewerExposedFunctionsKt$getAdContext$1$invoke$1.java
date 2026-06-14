package com.unity3d.ads.core.domain.exposure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1", f = "CommonAdViewerExposedFunctions.kt", l = {85}, m = "invoke")
final class CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$getAdContext$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(CommonAdViewerExposedFunctionsKt$getAdContext$1 commonAdViewerExposedFunctionsKt$getAdContext$1, Continuation continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$getAdContext$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation) this);
    }
}
