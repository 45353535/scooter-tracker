package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import com.vungle.ads.internal.protos.Sdk;
import eg.i;
import eg.p;
import eg.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B$\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR!\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00103\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Landroidx/compose/ui/geometry/Offset;", "origin", "Landroidx/compose/ui/unit/Dp;", "radius", "", "bounded", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "fadeIn", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fadeOut", "animate", "finish", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "F", "Z", "", "startRadius", "Ljava/lang/Float;", "targetRadius", "targetCenter", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "animatedRadiusPercent", "animatedCenterPercent", "Leg/p;", "finishSignalDeferred", "Leg/p;", "<set-?>", "finishedFadingIn$delegate", "Landroidx/compose/runtime/MutableState;", "getFinishedFadingIn", "()Z", "setFinishedFadingIn", "(Z)V", "finishedFadingIn", "finishRequested$delegate", "getFinishRequested", "setFinishRequested", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleAnimation {

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha;

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;

    /* JADX INFO: renamed from: finishRequested$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState finishRequested;

    @NotNull
    private final p finishSignalDeferred;

    /* JADX INFO: renamed from: finishedFadingIn$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState finishedFadingIn;

    @Nullable
    private Offset origin;
    private final float radius;

    @Nullable
    private Float startRadius;

    @Nullable
    private Offset targetCenter;

    @Nullable
    private Float targetRadius;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$animate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RippleAnimation rippleAnimation, Continuation continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fC, tweenSpecTween$default, null, null, this, 12, null) == objG) {
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

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
        static final class C00962 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00962(RippleAnimation rippleAnimation, Continuation continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C00962(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Animatable animatable = this.this$0.animatedRadiusPercent;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fC, tweenSpecTween$default, null, null, this, 12, null) == objG) {
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
                return ((C00962) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
        static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(RippleAnimation rippleAnimation, Continuation continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Animatable animatable = this.this$0.animatedCenterPercent;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fC, tweenSpecTween$default, null, null, this, 12, null) == objG) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = RippleAnimation.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            i.d(coroutineScope, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
            i.d(coroutineScope, null, null, new C00962(RippleAnimation.this, null), 3, null);
            return i.d(coroutineScope, null, null, new AnonymousClass3(RippleAnimation.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class C15592 extends k implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RippleAnimation rippleAnimation, Continuation continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fC, tweenSpecTween$default, null, null, this, 12, null) == objG) {
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

        C15592(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15592 c15592 = RippleAnimation.this.new C15592(continuation);
            c15592.L$0 = obj;
            return c15592;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return i.d((CoroutineScope) this.L$0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C15592) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new AnonymousClass2(null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new C15592(null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z10) {
        this.finishRequested.setValue(Boolean.valueOf(z10));
    }

    private final void setFinishedFadingIn(boolean z10) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.fadeOut(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animate(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.d.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.d.b(r7)
            goto L56
        L47:
            kotlin.d.b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            eg.p r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1210draw4WTKRHQ(@NotNull DrawScope draw, long j10) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1212getRippleStartRadiusuvyYCjk(draw.mo2040getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            this.targetRadius = Float.isNaN(this.radius) ? Float.valueOf(RippleAnimationKt.m1211getRippleEndRadiuscSwnlzA(draw, this.bounded, draw.mo2040getSizeNHjbRc())) : Float.valueOf(draw.mo308toPx0680j_4(this.radius));
        }
        if (this.origin == null) {
            this.origin = Offset.m1360boximpl(draw.mo2039getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m1360boximpl(OffsetKt.Offset(Size.m1440getWidthimpl(draw.mo2040getSizeNHjbRc()) / 2.0f, Size.m1437getHeightimpl(draw.mo2040getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        Intrinsics.checkNotNull(f10);
        float fFloatValue2 = f10.floatValue();
        Float f11 = this.targetRadius;
        Intrinsics.checkNotNull(f11);
        float fLerp = MathHelpersKt.lerp(fFloatValue2, f11.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        Intrinsics.checkNotNull(offset);
        float fM1371getXimpl = Offset.m1371getXimpl(offset.getPackedValue());
        Offset offset2 = this.targetCenter;
        Intrinsics.checkNotNull(offset2);
        float fLerp2 = MathHelpersKt.lerp(fM1371getXimpl, Offset.m1371getXimpl(offset2.getPackedValue()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        Intrinsics.checkNotNull(offset3);
        float fM1372getYimpl = Offset.m1372getYimpl(offset3.getPackedValue());
        Offset offset4 = this.targetCenter;
        Intrinsics.checkNotNull(offset4);
        long jOffset = OffsetKt.Offset(fLerp2, MathHelpersKt.lerp(fM1372getYimpl, Offset.m1372getYimpl(offset4.getPackedValue()), this.animatedCenterPercent.getValue().floatValue()));
        long jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j10, Color.m1606getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            androidx.compose.ui.graphics.drawscope.b.x(draw, jM1603copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fM1440getWidthimpl = Size.m1440getWidthimpl(draw.mo2040getSizeNHjbRc());
        float fM1437getHeightimpl = Size.m1437getHeightimpl(draw.mo2040getSizeNHjbRc());
        int iM1593getIntersectrtfAjoo = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
        DrawContext drawContext = draw.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2049clipRectN_I0leg(0.0f, 0.0f, fM1440getWidthimpl, fM1437getHeightimpl, iM1593getIntersectrtfAjoo);
        androidx.compose.ui.graphics.drawscope.b.x(draw, jM1603copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.s(Unit.f93236a);
    }

    private RippleAnimation(Offset offset, float f10, boolean z10) {
        this.origin = offset;
        this.radius = f10;
        this.bounded = z10;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = r.b(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
