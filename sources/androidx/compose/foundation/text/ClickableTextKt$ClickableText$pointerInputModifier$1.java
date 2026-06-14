package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", l = {174}, m = "invokeSuspend")
final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends k implements Function2<PointerInputScope, Continuation, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<Integer, Unit> $onClick;
    final /* synthetic */ Function1<Integer, Unit> $onHover;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", l = {165}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ Function1<Integer, Unit> $onHover;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, Function1<? super Integer, Unit> function1, MutableState<TextLayoutResult> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$onHover = function1;
            this.$layoutResult = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$onHover, this.$layoutResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                final Function1<Integer, Unit> function1 = this.$onHover;
                final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
                Function1<Offset, Unit> function12 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m701invokek4lQ0M(offset.getPackedValue());
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m701invokek4lQ0M(long j10) {
                        Integer numClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState, j10);
                        if (Intrinsics.areEqual(ref$ObjectRef.f93280b, numClickableText_03UYbkw$getOffset)) {
                            return;
                        }
                        ref$ObjectRef.f93280b = numClickableText_03UYbkw$getOffset;
                        function1.invoke(numClickableText_03UYbkw$getOffset);
                    }
                };
                this.label = 1;
                if (PointerMoveDetectorKt.detectMoves(pointerInputScope, pointerEventPass, function12, this) == objG) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableTextKt$ClickableText$pointerInputModifier$1(CoroutineScope coroutineScope, Function1<? super Integer, Unit> function1, MutableState<TextLayoutResult> mutableState, Function1<? super Integer, Unit> function12, Continuation continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$onHover = function1;
        this.$layoutResult = mutableState;
        this.$onClick = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, continuation);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            i.d(this.$coroutineScope, null, null, new AnonymousClass1(pointerInputScope, this.$onHover, this.$layoutResult, null), 3, null);
            final Function1<Integer, Unit> function1 = this.$onClick;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            Function1<Offset, Unit> function12 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m702invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m702invokek4lQ0M(long j10) {
                    Integer numClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState, j10);
                    if (numClickableText_03UYbkw$getOffset != null) {
                        function1.invoke(numClickableText_03UYbkw$getOffset);
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function12, this, 7, null) == objG) {
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
}
