package com.unity3d.ads.core.domain.exposure;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1", f = "CommonAdViewerExposedFunctions.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invoke")
final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C48341 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(CommonAdViewerExposedFunctionsKt.C48341 c48341, Continuation continuation) {
        super(continuation);
        this.this$0 = c48341;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation) this);
    }
}
