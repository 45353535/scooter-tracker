package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\r\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a5\u0010\u0014\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001d\u001a\u00020\u0003*\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lkotlin/Function3;", "", "Landroidx/compose/ui/geometry/Offset;", "", "onTransformation", "Landroidx/compose/foundation/gestures/TransformableState;", "TransformableState", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/TransformableState;", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "zoomFactor", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateZoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "degrees", "animateRotateBy", "offset", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animatePanBy", "zoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "panBy", "Landroidx/compose/foundation/MutatePriority;", "terminationPriority", "stopTransformation", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransformableStateKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {158}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<TransformScope, Continuation, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ s0 $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(s0 s0Var, float f10, AnimationSpec<Float> animationSpec, Continuation continuation) {
            super(2, continuation);
            this.$previous = s0Var;
            this.$degrees = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$previous, this.$degrees, this.$animationSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f93329b, 0.0f, 0L, 0L, false, 30, null);
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final s0 s0Var = this.$previous;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        d.a(transformScope, 0.0f, 0L, animateTo.getValue().floatValue() - s0Var.f93329b, 3, null);
                        s0Var.f93329b = animateTo.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fC, animationSpec, false, function1, this, 4, null) == objG) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", l = {138}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<TransformScope, Continuation, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ s0 $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(s0 s0Var, float f10, AnimationSpec<Float> animationSpec, Continuation continuation) {
            super(2, continuation);
            this.$previous = s0Var;
            this.$zoomFactor = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$previous, this.$zoomFactor, this.$animationSpec, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f93329b, 0.0f, 0L, 0L, false, 30, null);
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final s0 s0Var = this.$previous;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        d.a(transformScope, s0Var.f93329b == 0.0f ? 1.0f : animateTo.getValue().floatValue() / s0Var.f93329b, 0L, 0.0f, 6, null);
                        s0Var.f93329b = animateTo.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fC, animationSpec, false, function1, this, 4, null) == objG) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    static final class C14212 extends k implements Function2<TransformScope, Continuation, Object> {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14212(float f10, Continuation continuation) {
            super(2, continuation);
            this.$degrees = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14212 c14212 = new C14212(this.$degrees, continuation);
            c14212.L$0 = obj;
            return c14212;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
            return ((C14212) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((TransformScope) this.L$0).mo244transformByd4ec7I(1.0f, Offset.INSTANCE.m1387getZeroF1C5BW0(), this.$degrees);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    static final class C14222 extends k implements Function2<TransformScope, Continuation, Object> {
        int label;

        C14222(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C14222(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
            return ((C14222) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    static final class C14232 extends k implements Function2<TransformScope, Continuation, Object> {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14232(float f10, Continuation continuation) {
            super(2, continuation);
            this.$zoomFactor = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14232 c14232 = new C14232(this.$zoomFactor, continuation);
            c14232.L$0 = obj;
            return c14232;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
            return ((C14232) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((TransformScope) this.L$0).mo244transformByd4ec7I(this.$zoomFactor, Offset.INSTANCE.m1387getZeroF1C5BW0(), 0.0f);
            return Unit.f93236a;
        }
    }

    @NotNull
    public static final TransformableState TransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        return new DefaultTransformableState(onTransformation);
    }

    @Nullable
    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m336animatePanByubNVwUQ(@NotNull TransformableState transformableState, long j10, @NotNull AnimationSpec<Offset> animationSpec, @NotNull Continuation continuation) {
        u0 u0Var = new u0();
        u0Var.f93333b = Offset.INSTANCE.m1387getZeroF1C5BW0();
        Object objA = e.a(transformableState, null, new TransformableStateKt$animatePanBy$2(u0Var, j10, animationSpec, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m337animatePanByubNVwUQ$default(TransformableState transformableState, long j10, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m336animatePanByubNVwUQ(transformableState, j10, animationSpec, continuation);
    }

    @Nullable
    public static final Object animateRotateBy(@NotNull TransformableState transformableState, float f10, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation continuation) {
        Object objA = e.a(transformableState, null, new AnonymousClass2(new s0(), f10, animationSpec, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f10, animationSpec, continuation);
    }

    @Nullable
    public static final Object animateZoomBy(@NotNull TransformableState transformableState, float f10, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation continuation) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        s0 s0Var = new s0();
        s0Var.f93329b = 1.0f;
        Object objA = e.a(transformableState, null, new AnonymousClass3(s0Var, f10, animationSpec, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f10, animationSpec, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m338panByd4ec7I(@NotNull TransformableState transformableState, long j10, @NotNull Continuation continuation) {
        Object objA = e.a(transformableState, null, new TransformableStateKt$panBy$2(j10, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    @Composable
    @NotNull
    public static final TransformableState rememberTransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTransformation, composer, i10 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TransformableState(new Function3<Float, Offset, Float, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f10, Offset offset, Float f11) {
                    m339invoked4ec7I(f10.floatValue(), offset.getPackedValue(), f11.floatValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m339invoked4ec7I(float f10, long j10, float f11) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10), Offset.m1360boximpl(j10), Float.valueOf(f11));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    @Nullable
    public static final Object rotateBy(@NotNull TransformableState transformableState, float f10, @NotNull Continuation continuation) {
        Object objA = e.a(transformableState, null, new C14212(f10, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    @Nullable
    public static final Object stopTransformation(@NotNull TransformableState transformableState, @NotNull MutatePriority mutatePriority, @NotNull Continuation continuation) {
        Object objTransform = transformableState.transform(mutatePriority, new C14222(null), continuation);
        return objTransform == pf.b.g() ? objTransform : Unit.f93236a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, continuation);
    }

    @Nullable
    public static final Object zoomBy(@NotNull TransformableState transformableState, float f10, @NotNull Continuation continuation) {
        Object objA = e.a(transformableState, null, new C14232(f10, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
