package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
final class ScrollableKt$pointerScrollable$3$1 extends k implements Function3<CoroutineScope, Velocity, Continuation, Object> {
    final /* synthetic */ MutableState<NestedScrollDispatcher> $nestedScrollDispatcher;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;
    /* synthetic */ long J$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", l = {POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;
        final /* synthetic */ long $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<ScrollingLogic> state, long j10, Continuation continuation) {
            super(2, continuation);
            this.$scrollLogic = state;
            this.$velocity = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$scrollLogic, this.$velocity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ScrollingLogic value = this.$scrollLogic.getValue();
                long j10 = this.$velocity;
                this.label = 1;
                if (value.m320onDragStoppedsFctU(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$3$1(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, Continuation continuation) {
        super(3, continuation);
        this.$nestedScrollDispatcher = mutableState;
        this.$scrollLogic = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation continuation) {
        return m313invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m313invokeLuvzFrg(@NotNull CoroutineScope coroutineScope, long j10, @Nullable Continuation continuation) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.$nestedScrollDispatcher, this.$scrollLogic, continuation);
        scrollableKt$pointerScrollable$3$1.J$0 = j10;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        i.d(this.$nestedScrollDispatcher.getValue().getCoroutineScope(), null, null, new AnonymousClass1(this.$scrollLogic, this.J$0, null), 3, null);
        return Unit.f93236a;
    }
}
