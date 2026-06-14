package androidx.compose.ui.input.nestedscroll;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "dispatchPostFling-RZ2iAVY")
final class NestedScrollDispatcher$dispatchPostFling$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, Continuation continuation) {
        super(continuation);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2806dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
