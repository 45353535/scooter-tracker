package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/graphics/Color;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animateColorAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SingleValueAnimationKt {

    @NotNull
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @NotNull
    /* JADX INFO: renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m85Animatable8_81llA(long j10) {
        return new Animatable<>(Color.m1594boximpl(j10), ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m1608getColorSpaceimpl(j10)), null, null, 12, null);
    }

    @Composable
    /* JADX INFO: renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m86animateColorAsStateKTwxG1Y(long j10, AnimationSpec animationSpec, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1942442407);
        if ((i11 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)");
        }
        State<Color> stateM87animateColorAsStateeuL9pac = m87animateColorAsStateeuL9pac(j10, animationSpec2, null, function12, composer, (i10 & 14) | 64 | ((i10 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM87animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m87animateColorAsStateeuL9pac(long j10, @Nullable AnimationSpec<Color> animationSpec, @Nullable String str, @Nullable Function1<? super Color, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-451899108);
        AnimationSpec<Color> animationSpec2 = (i11 & 2) != 0 ? colorDefaultSpring : animationSpec;
        String str2 = (i11 & 4) != 0 ? "ColorAnimation" : str;
        Function1<? super Color, Unit> function12 = (i11 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)");
        }
        ColorSpace colorSpaceM1608getColorSpaceimpl = Color.m1608getColorSpaceimpl(j10);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorSpaceM1608getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m1608getColorSpaceimpl(j10));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        int i12 = i10 << 6;
        State<Color> stateAnimateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m1594boximpl(j10), (TwoWayConverter) objRememberedValue, animationSpec2, null, str2, function12, composer, (i10 & 14) | 576 | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValueAsState;
    }
}
