package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidOverscrollKt {

    @NotNull
    private static final Modifier StretchOverscrollNonClippingLayer;

    static {
        StretchOverscrollNonClippingLayer = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m167invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m167invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j10) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
                final int iMo302roundToPx0680j_4 = layout.mo302roundToPx0680j_4(Dp.m3951constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.p(layout, placeableMo3011measureBRTryo0.getMeasuredWidth() - iMo302roundToPx0680j_4, placeableMo3011measureBRTryo0.getMeasuredHeight() - iMo302roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
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
                    public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                        Placeable placeable = placeableMo3011measureBRTryo0;
                        Placeable.PlacementScope.placeWithLayer$default(layout2, placeable, ((-iMo302roundToPx0680j_4) / 2) - ((placeable.getWidth() - placeableMo3011measureBRTryo0.getMeasuredWidth()) / 2), ((-iMo302roundToPx0680j_4) / 2) - ((placeableMo3011measureBRTryo0.getHeight() - placeableMo3011measureBRTryo0.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                    }
                }, 4, null);
            }
        }), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m168invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m168invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j10) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Intrinsics.checkNotNullParameter(measurable, "measurable");
                final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
                final int iMo302roundToPx0680j_4 = layout.mo302roundToPx0680j_4(Dp.m3951constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.p(layout, placeableMo3011measureBRTryo0.getWidth() + iMo302roundToPx0680j_4, placeableMo3011measureBRTryo0.getHeight() + iMo302roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
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
                    public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                        Placeable placeable = placeableMo3011measureBRTryo0;
                        int i10 = iMo302roundToPx0680j_4;
                        Placeable.PlacementScope.place$default(layout2, placeable, i10 / 2, i10 / 2, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }) : Modifier.INSTANCE;
    }

    @Composable
    @NotNull
    public static final OverscrollEffect rememberOverscrollEffect(@Nullable Composer composer, int i10) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-81138291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81138291, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) objRememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
