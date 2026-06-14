package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
final class WindowInsetsNestedScrollConnection$fling$3 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {358}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation) {
            super(2, continuation);
            this.$current = i10;
            this.$target = i11;
            this.$flingAmount = f10;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z10;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass1 anonymousClass1;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$target);
                Float fC2 = kotlin.coroutines.jvm.internal.b.c(this.$flingAmount);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        windowInsetsNestedScrollConnection.adjustInsets(animateTo.getValue().floatValue());
                    }
                };
                this.label = 1;
                anonymousClass1 = this;
                if (Animatable.animateTo$default(animatableAnimatable$default, fC, null, fC2, function1, anonymousClass1, 2, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.$animationController.finish(anonymousClass1.$targetShown);
            anonymousClass1.this$0.animationController = null;
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i10, int i11, float f10, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i10;
        this.$target = i11;
        this.$flingAmount = f10;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, continuation);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
        windowInsetsNestedScrollConnection.animationJob = eg.i.d(coroutineScope, null, null, new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3, null);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
