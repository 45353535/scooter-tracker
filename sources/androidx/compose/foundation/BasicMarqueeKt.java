package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001aU\u0010&\u001a\u00020'*\u00020'2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\"\u001c\u0010\u0000\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001c\u0010\t\u001a\u00020\n8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"!\u0010\u000e\u001a\u00020\u000f8GX\u0087\u0004ø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"DefaultMarqueeDelayMillis", "", "getDefaultMarqueeDelayMillis$annotations", "()V", "getDefaultMarqueeDelayMillis", "()I", "DefaultMarqueeIterations", "getDefaultMarqueeIterations$annotations", "getDefaultMarqueeIterations", "DefaultMarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing$annotations", "getDefaultMarqueeSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "DefaultMarqueeVelocity", "Landroidx/compose/ui/unit/Dp;", "getDefaultMarqueeVelocity$annotations", "getDefaultMarqueeVelocity", "()F", "F", "MarqueeSpacing", "spacing", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BasicMarqueeKt {
    private static final int DefaultMarqueeDelayMillis = 1200;
    private static final int DefaultMarqueeIterations = 3;

    @NotNull
    private static final MarqueeSpacing DefaultMarqueeSpacing = MarqueeSpacing.INSTANCE.fractionOfContainer(0.33333334f);
    private static final float DefaultMarqueeVelocity = Dp.m3951constructorimpl(30);

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m171MarqueeSpacing0680j_4(final float f10) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$MarqueeSpacing$1
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(@NotNull Density MarqueeSpacing, int i10, int i11) {
                Intrinsics.checkNotNullParameter(MarqueeSpacing, "$this$MarqueeSpacing");
                return MarqueeSpacing.mo302roundToPx0680j_4(f10);
            }
        };
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m173basicMarquee1Mj1MLw(@NotNull Modifier basicMarquee, final int i10, final int i11, final int i12, final int i13, @NotNull final MarqueeSpacing spacing, final float f10) {
        Intrinsics.checkNotNullParameter(basicMarquee, "$this$basicMarquee");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        return ComposedModifierKt.composed(basicMarquee, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("basicMarquee");
                inspectorInfo.getProperties().set("iterations", Integer.valueOf(i10));
                inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m220boximpl(i11));
                inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(i12));
                inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(i13));
                inspectorInfo.getProperties().set("spacing", spacing);
                inspectorInfo.getProperties().set("velocity", Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i14) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-562302205);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562302205, i14, -1, "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Object obj = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Dp.m3949boximpl(f10), density, obj};
                int i15 = i10;
                int i16 = i12;
                int i17 = i13;
                float f11 = f10;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i18 = 0; i18 < 6; i18++) {
                    zChanged |= composer.changed(objArr[i18]);
                }
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object marqueeModifier = new MarqueeModifier(i15, i16, i17, Dp.m3951constructorimpl((obj == LayoutDirection.Ltr ? 1.0f : -1.0f) * f11), density, null);
                    composer.updateRememberedValue(marqueeModifier);
                    objRememberedValue = marqueeModifier;
                }
                composer.endReplaceableGroup();
                MarqueeModifier marqueeModifier2 = (MarqueeModifier) objRememberedValue;
                marqueeModifier2.setSpacing(spacing);
                marqueeModifier2.m232setAnimationMode97h66l8(i11);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer.changed(marqueeModifier2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new BasicMarqueeKt$basicMarquee$2$1$1(marqueeModifier2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(marqueeModifier2, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composer, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return marqueeModifier2;
            }
        });
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m174basicMarquee1Mj1MLw$default(Modifier modifier, int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = DefaultMarqueeIterations;
        }
        if ((i14 & 2) != 0) {
            i11 = MarqueeAnimationMode.INSTANCE.m229getImmediatelyZbEOnfQ();
        }
        if ((i14 & 4) != 0) {
            i12 = DefaultMarqueeDelayMillis;
        }
        if ((i14 & 8) != 0) {
            i13 = MarqueeAnimationMode.m223equalsimpl0(i11, MarqueeAnimationMode.INSTANCE.m229getImmediatelyZbEOnfQ()) ? i12 : 0;
        }
        if ((i14 & 16) != 0) {
            marqueeSpacing = DefaultMarqueeSpacing;
        }
        if ((i14 & 32) != 0) {
            f10 = DefaultMarqueeVelocity;
        }
        return m173basicMarquee1Mj1MLw(modifier, i10, i11, i12, i13, marqueeSpacing, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m175createMarqueeAnimationSpecZ4HSEVQ(int i10, float f10, int i11, int i12, float f11, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo308toPx0680j_4(f11)), f10, i12);
        long jM130constructorimpl$default = StartOffset.m130constructorimpl$default((-i12) + i11, 0, 2, null);
        return i10 == Integer.MAX_VALUE ? AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM130constructorimpl$default, 2, null) : AnimationSpecKt.m112repeatable91I0pcU$default(i10, tweenSpecVelocityBasedTween, null, jM130constructorimpl$default, 4, null);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return DefaultMarqueeDelayMillis;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return DefaultMarqueeIterations;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return DefaultMarqueeSpacing;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return DefaultMarqueeVelocity;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }

    private static final TweenSpec<Float> velocityBasedTween(float f10, float f11, int i10) {
        return AnimationSpecKt.tween((int) Math.ceil(f11 / (f10 / 1000.0f)), i10, EasingKt.getLinearEasing());
    }
}
