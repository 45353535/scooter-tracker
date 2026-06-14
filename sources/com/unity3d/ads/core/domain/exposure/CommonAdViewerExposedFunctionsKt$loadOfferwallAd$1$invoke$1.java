package com.unity3d.ads.core.domain.exposure;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1", f = "CommonAdViewerExposedFunctions.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "invoke")
final class CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C48221 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(CommonAdViewerExposedFunctionsKt.C48221 c48221, Continuation continuation) {
        super(continuation);
        this.this$0 = c48221;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation) this);
    }
}
