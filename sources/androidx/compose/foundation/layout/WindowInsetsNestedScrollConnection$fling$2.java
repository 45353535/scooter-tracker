package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {348}, m = "invokeSuspend")
final class WindowInsetsNestedScrollConnection$fling$2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ s0 $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {332}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ s0 $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, float f10, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i11, int i12, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, s0 s0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.$current = i10;
            this.$flingAmount = f10;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i11;
            this.$shown = i12;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = s0Var;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                float f10 = this.$current;
                float f11 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                final int i11 = this.$hidden;
                final int i12 = this.$shown;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                final s0 s0Var = this.$endVelocity;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
                final boolean z10 = this.$targetShown;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f12, Float f13) {
                        invoke(f12.floatValue(), f13.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(float f12, float f13) {
                        float f14 = i11;
                        if (f12 <= i12 && f14 <= f12) {
                            windowInsetsNestedScrollConnection.adjustInsets(f12);
                            return;
                        }
                        s0Var.f93329b = f13;
                        windowInsetsAnimationController.finish(z10);
                        windowInsetsNestedScrollConnection.animationController = null;
                        Job job = windowInsetsNestedScrollConnection.animationJob;
                        if (job != null) {
                            Job.a.a(job, null, 1, null);
                        }
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(f10, f11, splineBasedFloatDecayAnimationSpec, function2, this) == objG) {
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
    WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, float f10, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i11, int i12, s0 s0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i10;
        this.$flingAmount = f10;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i11;
        this.$shown = i12;
        this.$endVelocity = s0Var;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, continuation);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            windowInsetsNestedScrollConnection.animationJob = eg.i.d(coroutineScope, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3, null);
            Job job = this.this$0.animationJob;
            if (job != null) {
                this.label = 1;
                if (job.i0(this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.this$0.animationJob = null;
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
