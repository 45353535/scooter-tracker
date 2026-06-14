package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", f = "LazyNearestItemsRange.kt", l = {66}, m = "invokeSuspend")
final class LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function0<Integer> $extraItemCount;
    final /* synthetic */ Function0<Integer> $firstVisibleItemIndex;
    final /* synthetic */ Function0<Integer> $slidingWindowSize;
    final /* synthetic */ MutableState<IntRange> $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(Function0<Integer> function0, Function0<Integer> function02, Function0<Integer> function03, MutableState<IntRange> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$firstVisibleItemIndex = function0;
        this.$slidingWindowSize = function02;
        this.$extraItemCount = function03;
        this.$state = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(this.$firstVisibleItemIndex, this.$slidingWindowSize, this.$extraItemCount, this.$state, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            final Function0<Integer> function0 = this.$firstVisibleItemIndex;
            final Function0<Integer> function02 = this.$slidingWindowSize;
            final Function0<Integer> function03 = this.$extraItemCount;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<IntRange>() { // from class: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IntRange invoke() {
                    return LazyNearestItemsRangeKt.calculateNearestItemsRange(function0.invoke().intValue(), function02.invoke().intValue(), function03.invoke().intValue());
                }
            });
            final MutableState<IntRange> mutableState = this.$state;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(@NotNull IntRange intRange, @NotNull Continuation continuation) {
                    mutableState.setValue(intRange);
                    return Unit.f93236a;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
