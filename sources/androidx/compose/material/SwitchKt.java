package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.amazon.device.ads.DtbConstants;
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
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a?\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u0014*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u000b\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwitchKt {

    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl(34);
        TrackWidth = fM3951constructorimpl;
        TrackStrokeWidth = Dp.m3951constructorimpl(14);
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(20);
        ThumbDiameter = fM3951constructorimpl2;
        ThumbRippleRadius = Dp.m3951constructorimpl(24);
        DefaultSwitchPadding = Dp.m3951constructorimpl(2);
        SwitchWidth = fM3951constructorimpl;
        SwitchHeight = fM3951constructorimpl2;
        ThumbPathLength = Dp.m3951constructorimpl(fM3951constructorimpl - fM3951constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m3951constructorimpl(1);
        ThumbPressedElevation = Dp.m3951constructorimpl(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(final boolean r37, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r39, boolean r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r41, @org.jetbrains.annotations.Nullable androidx.compose.material.SwitchColors r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z10, final boolean z11, final SwitchColors switchColors, final State<Float> state, final InteractionSource interactionSource, Composer composer, final int i10) {
        int i11;
        int i12;
        long jSwitchImpl$lambda$7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1834839253);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1834839253, i11, -1, "androidx.compose.material.SwitchImpl (Switch.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i13 = (i11 >> 15) & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13 | 64);
            float f10 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            int i14 = ((i11 >> 6) & 14) | (i11 & 112) | ((i11 >> 3) & 896);
            final State<Color> stateTrackColor = switchColors.trackColor(z11, z10, composerStartRestartGroup, i14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        SwitchKt.m1144drawTrackRPmYEkk(Canvas, SwitchKt.SwitchImpl$lambda$5(stateTrackColor), Canvas.mo308toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo308toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z11, z10, composerStartRestartGroup, i14);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM3951constructorimpl = Dp.m3951constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m3965unboximpl() + f10);
            composerStartRestartGroup.startReplaceableGroup(-539245302);
            if (!Color.m1605equalsimpl0(SwitchImpl$lambda$7(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m966getSurface0d7_KjU()) || elevationOverlay == null) {
                i12 = 1157296644;
                jSwitchImpl$lambda$7 = SwitchImpl$lambda$7(stateThumbColor);
            } else {
                long jSwitchImpl$lambda$72 = SwitchImpl$lambda$7(stateThumbColor);
                i12 = 1157296644;
                jSwitchImpl$lambda$7 = elevationOverlay.mo996apply7g2Lkgo(jSwitchImpl$lambda$72, fM3951constructorimpl, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = boxScope.align(companion2, companion3.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(i12);
            boolean zChanged3 = composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m4060boximpl(m1145invokeBjo55l4(density));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1145invokeBjo55l4(@NotNull Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(zf.a.d(state.getValue().floatValue()), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU(ShadowKt.m1288shadows4CzXII$default(SizeKt.m453requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m1216rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), ThumbDiameter), f10, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), jSwitchImpl$lambda$7, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.SwitchImpl.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                SwitchKt.SwitchImpl(boxScope, z10, z11, switchColors, state, interactionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$5(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    private static final long SwitchImpl$lambda$7(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1144drawTrackRPmYEkk(DrawScope drawScope, long j10, float f10, float f11) {
        float f12 = f11 / 2;
        b.C(drawScope, j10, androidx.compose.ui.geometry.OffsetKt.Offset(f12, Offset.m1372getYimpl(drawScope.mo2039getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f10 - f12, Offset.m1372getYimpl(drawScope.mo2039getCenterF1C5BW0())), f11, StrokeCap.INSTANCE.m1928getRoundKaPHkGw(), null, 0.0f, null, 0, DtbConstants.DEFAULT_PLAYER_HEIGHT, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
