package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.animation.core.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003YZ[B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0087\u0004¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010!\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JA\u0010&\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0012H\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R4\u0010@\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R/\u0010C\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0B0A8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR-\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010B8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020M*\u00020\u00178BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001b\u0010R\u001a\u00020M*\u00020\u00178BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001d\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010=R\u0014\u0010V\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010U\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "targetSizeMap", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "", "isLeft-9jb1Dl8", "(I)Z", "isLeft", "isRight-9jb1Dl8", "isRight", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalAnimationApi
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    public static final int $stable = 8;

    @Nullable
    private State<IntSize> animatedSize;

    @NotNull
    private Alignment contentAlignment;

    @NotNull
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: measuredSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState measuredSize;

    @NotNull
    private final Map<S, State<IntSize>> targetSizeMap;

    @NotNull
    private final Transition<S> transition;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z10) {
            this.isTarget = z10;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = childData.isTarget;
            }
            return childData.copy(z10);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean all(Function1 function1) {
            return b.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean any(Function1 function1) {
            return b.b(this, function1);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        @NotNull
        public final ChildData copy(boolean isTarget) {
            return new ChildData(isTarget);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return b.c(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return b.d(this, obj, function2);
        }

        public int hashCode() {
            boolean z10 = this.isTarget;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z10) {
            this.isTarget = z10;
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return a.a(this, modifier);
        }

        @NotNull
        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B6\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0002\u0010\nJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalAnimationApi
    final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {

        @NotNull
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @NotNull
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentScope<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(@NotNull AnimatedContentScope animatedContentScope, @NotNull Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.this$0 = animatedContentScope;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        @NotNull
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @NotNull
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            final AnimatedContentScope<S> animatedContentScope = this.this$0;
            Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> function1 = new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<S> animate) {
                    FiniteAnimationSpec<IntSize> finiteAnimationSpecMo94createAnimationSpecTemP2vQ;
                    Intrinsics.checkNotNullParameter(animate, "$this$animate");
                    State<IntSize> state = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getInitialState());
                    long packedValue = state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g();
                    State<IntSize> state2 = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getTargetState());
                    long packedValue2 = state2 != null ? state2.getValue().getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g();
                    SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (finiteAnimationSpecMo94createAnimationSpecTemP2vQ = value.mo94createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : finiteAnimationSpecMo94createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentScope<S> animatedContentScope2 = this.this$0;
            State<IntSize> stateAnimate = deferredAnimation.animate(function1, (Function1<? super S, ? extends IntSize>) new Function1<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                    return IntSize.m4103boximpl(m44invokeYEO4UFw(obj));
                }

                /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m44invokeYEO4UFw(S s10) {
                    State<IntSize> state = animatedContentScope2.getTargetSizeMap$animation_release().get(s10);
                    return state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g();
                }
            });
            this.this$0.setAnimatedSize$animation_release(stateAnimate);
            final long jMo1265alignKFBX0sM = this.this$0.getContentAlignment().mo1265alignKFBX0sM(IntSizeKt.IntSize(placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight()), stateAnimate.getValue().getPackedValue(), LayoutDirection.Ltr);
            return MeasureScope.CC.p(measure, IntSize.m4111getWidthimpl(stateAnimate.getValue().getPackedValue()), IntSize.m4110getHeightimpl(stateAnimate.getValue().getPackedValue()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    Placeable.PlacementScope.m3046place70tqf50$default(layout, placeableMo3011measureBRTryo0, jMo1265alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    public static final class SlideDirection {
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Left = m46constructorimpl(0);
        private static final int Right = m46constructorimpl(1);
        private static final int Up = m46constructorimpl(2);
        private static final int Down = m46constructorimpl(3);
        private static final int Start = m46constructorimpl(4);
        private static final int End = m46constructorimpl(5);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "getDown-aUPqQNE", "()I", "I", "End", "getEnd-aUPqQNE", "Left", "getLeft-aUPqQNE", "Right", "getRight-aUPqQNE", "Start", "getStart-aUPqQNE", "Up", "getUp-aUPqQNE", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDown-aUPqQNE, reason: not valid java name */
            public final int m52getDownaUPqQNE() {
                return SlideDirection.Down;
            }

            /* JADX INFO: renamed from: getEnd-aUPqQNE, reason: not valid java name */
            public final int m53getEndaUPqQNE() {
                return SlideDirection.End;
            }

            /* JADX INFO: renamed from: getLeft-aUPqQNE, reason: not valid java name */
            public final int m54getLeftaUPqQNE() {
                return SlideDirection.Left;
            }

            /* JADX INFO: renamed from: getRight-aUPqQNE, reason: not valid java name */
            public final int m55getRightaUPqQNE() {
                return SlideDirection.Right;
            }

            /* JADX INFO: renamed from: getStart-aUPqQNE, reason: not valid java name */
            public final int m56getStartaUPqQNE() {
                return SlideDirection.Start;
            }

            /* JADX INFO: renamed from: getUp-aUPqQNE, reason: not valid java name */
            public final int m57getUpaUPqQNE() {
                return SlideDirection.Up;
            }

            private Companion() {
            }
        }

        private /* synthetic */ SlideDirection(int i10) {
            this.value = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m45boximpl(int i10) {
            return new SlideDirection(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m46constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m47equalsimpl(int i10, Object obj) {
            return (obj instanceof SlideDirection) && i10 == ((SlideDirection) obj).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m48equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m49hashCodeimpl(int i10) {
            return i10;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m50toStringimpl(int i10) {
            return m48equalsimpl0(i10, Left) ? "Left" : m48equalsimpl0(i10, Right) ? "Right" : m48equalsimpl0(i10, Up) ? "Up" : m48equalsimpl0(i10, Down) ? "Down" : m48equalsimpl0(i10, Start) ? "Start" : m48equalsimpl0(i10, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m47equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m49hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m50toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    public AnimatedContentScope(@NotNull Transition<S> transition, @NotNull Alignment contentAlignment, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m4103boximpl(IntSize.INSTANCE.m4116getZeroYbymL2g()), null, 2, null);
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m33calculateOffsetemnUabE(long fullSize, long currentSize) {
        return this.contentAlignment.mo1265alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m34getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().getPackedValue() : m39getMeasuredSizeYbymL2g$animation_release();
    }

    /* JADX INFO: renamed from: isLeft-9jb1Dl8, reason: not valid java name */
    private final boolean m35isLeft9jb1Dl8(int i10) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        if (SlideDirection.m48equalsimpl0(i10, companion.m54getLeftaUPqQNE())) {
            return true;
        }
        if (SlideDirection.m48equalsimpl0(i10, companion.m56getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return SlideDirection.m48equalsimpl0(i10, companion.m53getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* JADX INFO: renamed from: isRight-9jb1Dl8, reason: not valid java name */
    private final boolean m36isRight9jb1Dl8(int i10) {
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        if (SlideDirection.m48equalsimpl0(i10, companion.m55getRightaUPqQNE())) {
            return true;
        }
        if (SlideDirection.m48equalsimpl0(i10, companion.m56getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return SlideDirection.m48equalsimpl0(i10, companion.m53getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideIntoContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m37slideIntoContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i10, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$1
                @NotNull
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m41slideIntoContainerHTTW7Ok(i10, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideOutOfContainer-HTTW7Ok$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m38slideOutOfContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i10, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$1
                @NotNull
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m42slideOutOfContainerHTTW7Ok(i10, finiteAnimationSpec, function1);
    }

    @Composable
    @NotNull
    public final Modifier createSizeAnimationModifier$animation_release(@NotNull ContentTransform contentTransform, @Nullable Composer composer, int i10) {
        Composer composer2;
        Modifier modifier;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(-1349251863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1349251863, i10, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            composer2 = composer;
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer2, 64, 2);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(new SizeModifier(this, deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState));
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            modifier = (Modifier) objRememberedValue2;
        } else {
            composer2 = composer;
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifier;
    }

    @Nullable
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @NotNull
    /* JADX INFO: renamed from: getContentAlignment$animation_release, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m39getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    @NotNull
    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @NotNull
    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return d.a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(@Nullable State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m40setMeasuredSizeozmzZPI$animation_release(long j10) {
        this.measuredSize.setValue(IntSize.m4103boximpl(j10));
    }

    @NotNull
    /* JADX INFO: renamed from: slideIntoContainer-HTTW7Ok, reason: not valid java name */
    public final EnterTransition m41slideIntoContainerHTTW7Ok(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        if (m35isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final Integer invoke(int i10) {
                    return initialOffset.invoke(Integer.valueOf(IntSize.m4111getWidthimpl(this.m34getCurrentSizeYbymL2g()) - IntOffset.m4069getXimpl(this.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), this.m34getCurrentSizeYbymL2g()))));
                }
            });
        }
        if (m36isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final Integer invoke(int i10) {
                    return initialOffset.invoke(Integer.valueOf((-IntOffset.m4069getXimpl(this.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), this.m34getCurrentSizeYbymL2g()))) - i10));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m48equalsimpl0(towards, companion.m57getUpaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Integer invoke(int i10) {
                return initialOffset.invoke(Integer.valueOf(IntSize.m4110getHeightimpl(this.m34getCurrentSizeYbymL2g()) - IntOffset.m4070getYimpl(this.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), this.m34getCurrentSizeYbymL2g()))));
            }
        }) : SlideDirection.m48equalsimpl0(towards, companion.m52getDownaUPqQNE()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Integer invoke(int i10) {
                return initialOffset.invoke(Integer.valueOf((-IntOffset.m4070getYimpl(this.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), this.m34getCurrentSizeYbymL2g()))) - i10));
            }
        }) : EnterTransition.INSTANCE.getNone();
    }

    @NotNull
    /* JADX INFO: renamed from: slideOutOfContainer-HTTW7Ok, reason: not valid java name */
    public final ExitTransition m42slideOutOfContainerHTTW7Ok(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        if (m35isLeft9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final Integer invoke(int i10) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m4069getXimpl(this.this$0.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g()))) - i10));
                }
            });
        }
        if (m36isRight9jb1Dl8(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$3
                final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final Integer invoke(int i10) {
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g();
                    return targetOffset.invoke(Integer.valueOf((-IntOffset.m4069getXimpl(this.this$0.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), packedValue))) + IntSize.m4111getWidthimpl(packedValue)));
                }
            });
        }
        SlideDirection.Companion companion = SlideDirection.INSTANCE;
        return SlideDirection.m48equalsimpl0(towards, companion.m57getUpaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Integer invoke(int i10) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                return targetOffset.invoke(Integer.valueOf((-IntOffset.m4070getYimpl(this.this$0.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g()))) - i10));
            }
        }) : SlideDirection.m48equalsimpl0(towards, companion.m52getDownaUPqQNE()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$5
            final /* synthetic */ AnimatedContentScope<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Integer invoke(int i10) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m4116getZeroYbymL2g();
                return targetOffset.invoke(Integer.valueOf((-IntOffset.m4070getYimpl(this.this$0.m33calculateOffsetemnUabE(IntSizeKt.IntSize(i10, i10), packedValue))) + IntSize.m4110getHeightimpl(packedValue)));
            }
        }) : ExitTransition.INSTANCE.getNone();
    }

    @ExperimentalAnimationApi
    @NotNull
    public final ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
