package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldPressGestureFilterKt {
    @NotNull
    public static final Modifier tapPressTextFieldModifier(@NotNull Modifier modifier, @Nullable final MutableInteractionSource mutableInteractionSource, boolean z10, @NotNull final Function1<? super Offset, Unit> onTap) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
            static final class AnonymousClass2 extends k implements Function2<PointerInputScope, Continuation, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ State<Function1<Offset, Unit>> $onTapState;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
                static final class C00551 extends k implements Function3<PressGestureScope, Offset, Continuation, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                    final /* synthetic */ CoroutineScope $scope;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
                    static final class C00561 extends k implements Function2<CoroutineScope, Continuation, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ long $it;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00561(MutableState<PressInteraction.Press> mutableState, long j10, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                            super(2, continuation);
                            this.$pressedInteraction = mutableState;
                            this.$it = j10;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new C00561(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                        @Override // kotlin.coroutines.jvm.internal.a
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                            /*
                                r7 = this;
                                java.lang.Object r0 = pf.b.g()
                                int r1 = r7.label
                                r2 = 0
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L27
                                if (r1 == r4) goto L1f
                                if (r1 != r3) goto L17
                                java.lang.Object r0 = r7.L$0
                                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                kotlin.d.b(r8)
                                goto L66
                            L17:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L1f:
                                java.lang.Object r1 = r7.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                kotlin.d.b(r8)
                                goto L4b
                            L27:
                                kotlin.d.b(r8)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                java.lang.Object r8 = r8.getValue()
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                if (r8 == 0) goto L4f
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                r6.<init>(r8)
                                if (r1 == 0) goto L4c
                                r7.L$0 = r5
                                r7.label = r4
                                java.lang.Object r8 = r1.emit(r6, r7)
                                if (r8 != r0) goto L4a
                                goto L64
                            L4a:
                                r1 = r5
                            L4b:
                                r5 = r1
                            L4c:
                                r5.setValue(r2)
                            L4f:
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                long r4 = r7.$it
                                r8.<init>(r4, r2)
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                if (r1 == 0) goto L67
                                r7.L$0 = r8
                                r7.label = r3
                                java.lang.Object r1 = r1.emit(r8, r7)
                                if (r1 != r0) goto L65
                            L64:
                                return r0
                            L65:
                                r0 = r8
                            L66:
                                r8 = r0
                            L67:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                                r0.setValue(r8)
                                kotlin.Unit r8 = kotlin.Unit.f93236a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.AnonymousClass1.AnonymousClass2.C00551.C00561.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                            return ((C00561) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
                    static final class C00572 extends k implements Function2<CoroutineScope, Continuation, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        final /* synthetic */ boolean $success;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00572(MutableState<PressInteraction.Press> mutableState, boolean z10, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                            super(2, continuation);
                            this.$pressedInteraction = mutableState;
                            this.$success = z10;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new C00572(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            MutableState<PressInteraction.Press> mutableState;
                            MutableState<PressInteraction.Press> mutableState2;
                            Object objG = b.g();
                            int i10 = this.label;
                            if (i10 == 0) {
                                d.b(obj);
                                PressInteraction.Press value = this.$pressedInteraction.getValue();
                                if (value != null) {
                                    boolean z10 = this.$success;
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$pressedInteraction;
                                    Interaction release = z10 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(release, this) == objG) {
                                            return objG;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return Unit.f93236a;
                            }
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            d.b(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return Unit.f93236a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                            return ((C00572) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00551(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                        super(3, continuation);
                        this.$scope = coroutineScope;
                        this.$pressedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation continuation) {
                        return m778invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m778invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j10, @Nullable Continuation continuation) {
                        C00551 c00551 = new C00551(this.$scope, this.$pressedInteraction, this.$interactionSource, continuation);
                        c00551.L$0 = pressGestureScope;
                        c00551.J$0 = j10;
                        return c00551.invokeSuspend(Unit.f93236a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                            i.d(this.$scope, null, null, new C00561(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                            this.label = 1;
                            obj = pressGestureScope.tryAwaitRelease(this);
                            if (obj == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d.b(obj);
                        }
                        i.d(this.$scope, null, null, new C00572(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                        return Unit.f93236a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Offset, Unit>> state, Continuation continuation) {
                    super(2, continuation);
                    this.$scope = coroutineScope;
                    this.$pressedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                    this.$onTapState = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00551 c00551 = new C00551(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                        final State<Function1<Offset, Unit>> state = this.$onTapState;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m779invokek4lQ0M(offset.getPackedValue());
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m779invokek4lQ0M(long j10) {
                                state.getValue().invoke(Offset.m1360boximpl(j10));
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, c00551, function1, this) == objG) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue2;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTap, composer, 0);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(cancel);
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource3, stateRememberUpdatedState, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        }, 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z10, function1);
    }
}
