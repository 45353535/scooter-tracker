package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HoverableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
        static final class AnonymousClass3 extends k implements Function2<PointerInputScope, Continuation, Object> {
            final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ CoroutineScope $scope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
            static final class AnonymousClass1 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                final /* synthetic */ CoroutineContext $currentContext;
                final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
                static final class C00211 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00211(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
                        super(2, continuation);
                        this.$interactionSource = mutableInteractionSource;
                        this.$hoverInteraction$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new C00211(this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitEnter(mutableInteractionSource, mutableState, this) == objG) {
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
                        return ((C00211) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
                static final class C00222 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00222(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                        super(2, continuation);
                        this.$hoverInteraction$delegate = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new C00222(this.$hoverInteraction$delegate, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            this.label = 1;
                            if (AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == objG) {
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
                        return ((C00222) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CoroutineContext coroutineContext, CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
                    super(2, continuation);
                    this.$currentContext = coroutineContext;
                    this.$scope = coroutineScope;
                    this.$interactionSource = mutableInteractionSource;
                    this.$hoverInteraction$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:14:0x0037). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = pf.b.g()
                        int r1 = r12.label
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1c
                        if (r1 != r2) goto L14
                        java.lang.Object r1 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.d.b(r13)
                        goto L37
                    L14:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1c:
                        kotlin.d.b(r13)
                        java.lang.Object r13 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                        r1 = r13
                    L24:
                        kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                        boolean r13 = kotlinx.coroutines.z.r(r13)
                        if (r13 == 0) goto L79
                        r12.L$0 = r1
                        r12.label = r2
                        java.lang.Object r13 = androidx.compose.ui.input.pointer.b.t(r1, r3, r12, r2, r3)
                        if (r13 != r0) goto L37
                        return r0
                    L37:
                        androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                        int r13 = r13.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                        int r5 = r4.m2862getEnter7fucELk()
                        boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r13, r5)
                        if (r5 == 0) goto L5c
                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r9 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r4 = r12.$hoverInteraction$delegate
                        r9.<init>(r13, r4, r3)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        eg.g.d(r6, r7, r8, r9, r10, r11)
                        goto L24
                    L5c:
                        int r4 = r4.m2863getExit7fucELk()
                        boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r13, r4)
                        if (r13 == 0) goto L24
                        kotlinx.coroutines.CoroutineScope r4 = r12.$scope
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r7 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r13 = r12.$hoverInteraction$delegate
                        androidx.compose.foundation.interaction.MutableInteractionSource r5 = r12.$interactionSource
                        r7.<init>(r13, r5, r3)
                        r8 = 3
                        r9 = 0
                        r5 = 0
                        r6 = 0
                        eg.g.d(r4, r5, r6, r7, r8, r9)
                        goto L24
                    L79:
                        kotlin.Unit r13 = kotlin.Unit.f93236a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
                super(2, continuation);
                this.$scope = coroutineScope;
                this.$interactionSource = mutableInteractionSource;
                this.$hoverInteraction$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objG) {
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
        AnonymousClass2(MutableInteractionSource mutableInteractionSource, boolean z10) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, kotlin.coroutines.Continuation r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.L$1
                androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r4
                java.lang.Object r5 = r0.L$0
                androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
                kotlin.d.b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.d.b(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r5)
                if (r6 != 0) goto L58
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
                r6.<init>()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r4 = r4.emit(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                invoke$lambda$2(r5, r4)
            L58:
                kotlin.Unit r4 = kotlin.Unit.f93236a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, kotlin.coroutines.Continuation r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
                kotlin.d.b(r6)
                goto L4e
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.d.b(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r4)
                if (r6 == 0) goto L52
                androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
                r2.<init>(r6)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L4e
                return r1
            L4e:
                r5 = 0
                invoke$lambda$2(r4, r5)
            L52:
                kotlin.Unit r4 = kotlin.Unit.f93236a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.AnonymousClass2.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private static final HoverInteraction.Enter invoke$lambda$1(MutableState<HoverInteraction.Enter> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
            HoverInteraction.Enter enterInvoke$lambda$1 = invoke$lambda$1(mutableState);
            if (enterInvoke$lambda$1 != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enterInvoke$lambda$1));
                mutableState.setValue(null);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
            Modifier modifierPointerInput;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(1294013553);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1294013553, i10, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
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
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<HoverInteraction.Enter> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                HoverableKt.AnonymousClass2.invoke$tryEmitExit(mutableState2, mutableInteractionSource2);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            Object objValueOf = Boolean.valueOf(this.$enabled);
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            boolean z10 = this.$enabled;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged2 = composer.changed(objValueOf) | composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new HoverableKt$hoverable$2$2$1(z10, mutableState, mutableInteractionSource2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue4, composer, 64);
            if (this.$enabled) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass3(coroutineScope, mutableInteractionSource3, mutableState, null));
            } else {
                modifierPointerInput = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }
    }

    @NotNull
    public static final Modifier hoverable(@NotNull Modifier modifier, @NotNull final MutableInteractionSource interactionSource, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("hoverable");
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(interactionSource, z10));
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z10);
    }
}
