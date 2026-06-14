package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\n\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/runtime/Composable;", "transitionSpec", "", "label", "targetValueByState", "Landroidx/compose/runtime/State;", "animateColor", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animationSpec", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Color> animateColor(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Color> targetValueByState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-1939694975);
        if ((i11 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>() { // from class: androidx.compose.animation.TransitionKt.animateColor.1
                @Composable
                @NotNull
                public final SpringSpec<Color> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i12) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-1457805428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457805428, i12, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace colorSpaceM1608getColorSpaceimpl = Color.m1608getColorSpaceimpl(targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf((i10 >> 6) & 112)).m1614unboximpl());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorSpaceM1608getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1608getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        int i12 = (i10 & 14) | 64;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i15 = (i14 >> 9) & 112;
        State<Color> stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), (TwoWayConverter) objRememberedValue, str2, composer, (i14 & 14) | 32768 | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m97animateColorDTcfvLk(@NotNull InfiniteTransition animateColor, long j10, long j11, @NotNull InfiniteRepeatableSpec<Color> animationSpec, @Nullable String str, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1901963533);
        String str2 = (i11 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:96)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m1608getColorSpaceimpl(j11));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        int i12 = i10 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(animateColor, Color.m1594boximpl(j10), Color.m1594boximpl(j11), (TwoWayConverter) objRememberedValue, animationSpec, str2, composer, InfiniteTransition.$stable | 4096 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValue;
    }

    @Composable
    /* JADX INFO: renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m98animateColorRIQooxk(InfiniteTransition animateColor, long j10, long j11, InfiniteRepeatableSpec animationSpec, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1400583834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:113)");
        }
        State<Color> stateM97animateColorDTcfvLk = m97animateColorDTcfvLk(animateColor, j10, j11, animationSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM97animateColorDTcfvLk;
    }
}
