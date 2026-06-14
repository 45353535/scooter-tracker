package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0019\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001d\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aL\u0010#\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aL\u0010'\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aL\u0010,\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001f\u001a\u00020)2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aL\u00100\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001f\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aL\u00103\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010%\u001a\u00020)2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001aL\u00106\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010%\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020 2\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a8\u00109\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010\u0010\u001a8\u0010;\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0010\u001a8\u0010=\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010\u0013\u001a8\u0010?\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0013\u001a\u0013\u0010@\u001a\u00020\u001e*\u00020)H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010@\u001a\u00020\u001e*\u00020.H\u0002¢\u0006\u0004\b@\u0010B\u001a1\u0010J\u001a\u00020I*\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010K\u001aI\u0010P\u001a\u00020I*\u00020I2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020D0C2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M2\u0006\u0010O\u001a\u00020GH\u0002¢\u0006\u0004\bP\u0010Q\u001aI\u0010U\u001a\u00020I*\u00020I2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020D0C2\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0M2\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0M2\u0006\u0010O\u001a\u00020GH\u0002¢\u0006\u0004\bU\u0010Q\"#\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bX\u0010Y\"\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0]8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b`\u0010_\"\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\r0]8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\ba\u0010_\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/EnterTransition;", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "initialOffset", "slideIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetOffset", "slideOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "shrinkTowards", "targetSize", "shrinkOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "initialWidth", "expandHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "expandVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetWidth", "shrinkHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "targetHeight", "shrinkVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "toAlignment", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "transition", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "labelPrefix", "slideInOut", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "shrinkExpand", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/runtime/MutableState;", "DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EnterExitTransitionKt {

    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m65invoke__ExYCQ(transformOrigin.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m65invoke__ExYCQ(long j10) {
            return new AnimationVector2D(TransformOrigin.m1960getPivotFractionXimpl(j10), TransformOrigin.m1961getPivotFractionYimpl(j10));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m1952boximpl(m66invokeLIALnN8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m66invokeLIALnN8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
        }
    });

    @NotNull
    private static final MutableState<Float> DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e7  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.Modifier createModifier(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r25, @org.jetbrains.annotations.NotNull final androidx.compose.animation.EnterTransition r26, @org.jetbrains.annotations.NotNull final androidx.compose.animation.ExitTransition r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().getPackedValue();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal expandFrom, boolean z10, @NotNull final Function1<? super Integer, Integer> initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z10, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4103boximpl(m67invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m67invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(initialWidth.invoke(Integer.valueOf(IntSize.m4111getWidthimpl(j10))).intValue(), IntSize.m4110getHeightimpl(j10));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment expandFrom, boolean z10, @NotNull Function1<? super IntSize, IntSize> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m4103boximpl(m68invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m68invokemzRDjE0(long j10) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical expandFrom, boolean z10, @NotNull final Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z10, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4103boximpl(m69invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m69invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(IntSize.m4111getWidthimpl(j10), initialHeight.invoke(Integer.valueOf(IntSize.m4110getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> animationSpec, float f10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f10);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> animationSpec, float f10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f10);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m61scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f10, long j10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m62scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m1965getCenterSzJe1aQ();
        }
        return m61scaleInL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m63scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f10, long j10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f10, j10, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m64scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m1965getCenterSzJe1aQ();
        }
        return m63scaleOutL8ZKhE(finiteAnimationSpec, f10, j10);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z10) {
                mutableState.setValue(Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, int r21) {
                /*
                    Method dump skipped, instruction units count: 498
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.C13591.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal shrinkTowards, boolean z10, @NotNull final Function1<? super Integer, Integer> targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z10, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4103boximpl(m70invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m70invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(targetWidth.invoke(Integer.valueOf(IntSize.m4111getWidthimpl(j10))).intValue(), IntSize.m4110getHeightimpl(j10));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z10, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment shrinkTowards, boolean z10, @NotNull Function1<? super IntSize, IntSize> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m4103boximpl(m71invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m71invokemzRDjE0(long j10) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z10, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical shrinkTowards, boolean z10, @NotNull final Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z10, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4103boximpl(m72invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m72invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(IntSize.m4111getWidthimpl(j10), targetHeight.invoke(Integer.valueOf(IntSize.m4110getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4060boximpl(m73invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m73invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(initialOffsetX.invoke(Integer.valueOf(IntSize.m4111getWidthimpl(j10))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z10) {
                mutableState.setValue(Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Composer composer2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(158379472);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(158379472, i10, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)");
                }
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    invoke$lambda$2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    invoke$lambda$2(mutableState, true);
                }
                if (invoke$lambda$1(mutableState)) {
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = str2 + " slide";
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    composer2 = composer;
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) objRememberedValue2, composer2, 448, 0);
                    Transition<EnterExitState> transition4 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer2.changed(transition4);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state3, state4);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    composed = composed.then((SlideModifier) objRememberedValue3);
                } else {
                    composer2 = composer;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return composed;
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4060boximpl(m74invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m74invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(0, initialOffsetY.invoke(Integer.valueOf(IntSize.m4110getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4060boximpl(m75invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m75invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(targetOffsetX.invoke(Integer.valueOf(IntSize.m4111getWidthimpl(j10))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4060boximpl(m76invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m76invokemHKZG7I(long j10) {
                return IntOffsetKt.IntOffset(0, targetOffsetY.invoke(Integer.valueOf(IntSize.m4110getHeightimpl(j10))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4060boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                @NotNull
                public final Integer invoke(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(horizontal, companion.getStart()) ? companion.getCenterStart() : Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(vertical, companion.getTop()) ? companion.getTopCenter() : Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
