package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B,\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/Slide;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/IntOffset;", "slideOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", MenuActionType.COPY, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Slide;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getSlideOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Slide {

    @NotNull
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    @NotNull
    private final Function1<IntSize, IntOffset> slideOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(@NotNull Function1<? super IntSize, IntOffset> slideOffset, @NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(slideOffset, "slideOffset");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.slideOffset = slideOffset;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = slide.slideOffset;
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(function1, finiteAnimationSpec);
    }

    @NotNull
    public final Function1<IntSize, IntOffset> component1() {
        return this.slideOffset;
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    @NotNull
    public final Slide copy(@NotNull Function1<? super IntSize, IntOffset> slideOffset, @NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(slideOffset, "slideOffset");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Slide(slideOffset, animationSpec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) other;
        return Intrinsics.areEqual(this.slideOffset, slide.slideOffset) && Intrinsics.areEqual(this.animationSpec, slide.animationSpec);
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @NotNull
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
