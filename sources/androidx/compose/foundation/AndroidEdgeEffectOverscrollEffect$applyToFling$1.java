package androidx.compose.foundation;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 244}, m = "applyToFling-BMRW4eQ")
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation continuation) {
        super(continuation);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo164applyToFlingBMRW4eQ(0L, null, this);
    }
}
