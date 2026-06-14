package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1", f = "Clickable.kt", l = {343}, m = "invokeSuspend")
final class ClickableKt$combinedClickable$4$gesture$1$1 extends k implements Function2<PointerInputScope, Continuation, Object> {
    final /* synthetic */ MutableState<Offset> $centreOffset;
    final /* synthetic */ State<Function0<Boolean>> $delayPressInteraction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $hasDoubleClick;
    final /* synthetic */ boolean $hasLongClick;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Function0<Unit>> $onClickState;
    final /* synthetic */ State<Function0<Unit>> $onDoubleClickState;
    final /* synthetic */ State<Function0<Unit>> $onLongClickState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1$3", f = "Clickable.kt", l = {356}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function3<PressGestureScope, Offset, Continuation, Object> {
        final /* synthetic */ State<Function0<Boolean>> $delayPressInteraction;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(boolean z10, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends Function0<Boolean>> state, Continuation continuation) {
            super(3, continuation);
            this.$enabled = z10;
            this.$interactionSource = mutableInteractionSource;
            this.$pressedInteraction = mutableState;
            this.$delayPressInteraction = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation continuation) {
            return m206invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m206invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j10, @Nullable Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, continuation);
            anonymousClass3.L$0 = pressGestureScope;
            anonymousClass3.J$0 = j10;
            return anonymousClass3.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (this.$enabled) {
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    MutableState<PressInteraction.Press> mutableState = this.$pressedInteraction;
                    State<Function0<Boolean>> state = this.$delayPressInteraction;
                    this.label = 1;
                    if (ClickableKt.m201handlePressInteractionEPk0efs(pressGestureScope, j10, mutableInteractionSource, mutableState, state, this) == objG) {
                        return objG;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$combinedClickable$4$gesture$1$1(MutableState<Offset> mutableState, boolean z10, boolean z11, boolean z12, State<? extends Function0<Unit>> state, State<? extends Function0<Unit>> state2, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState2, State<? extends Function0<Boolean>> state3, State<? extends Function0<Unit>> state4, Continuation continuation) {
        super(2, continuation);
        this.$centreOffset = mutableState;
        this.$hasDoubleClick = z10;
        this.$enabled = z11;
        this.$hasLongClick = z12;
        this.$onDoubleClickState = state;
        this.$onLongClickState = state2;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState2;
        this.$delayPressInteraction = state3;
        this.$onClickState = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ClickableKt$combinedClickable$4$gesture$1$1 clickableKt$combinedClickable$4$gesture$1$1 = new ClickableKt$combinedClickable$4$gesture$1$1(this.$centreOffset, this.$hasDoubleClick, this.$enabled, this.$hasLongClick, this.$onDoubleClickState, this.$onLongClickState, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, continuation);
        clickableKt$combinedClickable$4$gesture$1$1.L$0 = obj;
        return clickableKt$combinedClickable$4$gesture$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((ClickableKt$combinedClickable$4$gesture$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function1<Offset, Unit> function1;
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            MutableState<Offset> mutableState = this.$centreOffset;
            long jM4117getCenterozmzZPI = IntSizeKt.m4117getCenterozmzZPI(pointerInputScope.m2929getSizeYbymL2g());
            mutableState.setValue(Offset.m1360boximpl(OffsetKt.Offset(IntOffset.m4069getXimpl(jM4117getCenterozmzZPI), IntOffset.m4070getYimpl(jM4117getCenterozmzZPI))));
            Function1<Offset, Unit> function12 = null;
            if (this.$hasDoubleClick && this.$enabled) {
                final State<Function0<Unit>> state = this.$onDoubleClickState;
                function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m204invokek4lQ0M(offset.getPackedValue());
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m204invokek4lQ0M(long j10) {
                        Function0<Unit> value = state.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            } else {
                function1 = null;
            }
            if (this.$hasLongClick && this.$enabled) {
                final State<Function0<Unit>> state2 = this.$onLongClickState;
                function12 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m205invokek4lQ0M(offset.getPackedValue());
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m205invokek4lQ0M(long j10) {
                        Function0<Unit> value = state2.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                    }
                };
            }
            Function1<Offset, Unit> function13 = function12;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, null);
            final boolean z10 = this.$enabled;
            final State<Function0<Unit>> state3 = this.$onClickState;
            Function1<Offset, Unit> function14 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m207invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m207invokek4lQ0M(long j10) {
                    if (z10) {
                        state3.getValue().invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures(pointerInputScope, function1, function13, anonymousClass3, function14, this) == objG) {
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
