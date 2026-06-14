package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a9\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aA\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\n\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m3951constructorimpl(24);
    private static final float CheckboxSize = Dp.m3951constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = 2;
        CheckboxDefaultPadding = Dp.m3951constructorimpl(f10);
        StrokeWidth = Dp.m3951constructorimpl(f10);
        RadiusSize = Dp.m3951constructorimpl(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Checkbox(final boolean r23, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, boolean r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r27, @org.jetbrains.annotations.Nullable androidx.compose.material.CheckboxColors r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0274 A[LOOP:0: B:108:0x0272->B:109:0x0274, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CheckboxImpl(final boolean r37, final androidx.compose.ui.state.ToggleableState r38, final androidx.compose.ui.Modifier r39, final androidx.compose.material.CheckboxColors r40, androidx.compose.runtime.Composer r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TriStateCheckbox(@org.jetbrains.annotations.NotNull final androidx.compose.ui.state.ToggleableState r23, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, boolean r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r27, @org.jetbrains.annotations.Nullable androidx.compose.material.CheckboxColors r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m943drawBox1wkBAMs(DrawScope drawScope, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        Stroke stroke = new Stroke(f11, 0.0f, 0, 0, null, 30, null);
        float fM1440getWidthimpl = Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc());
        if (Color.m1605equalsimpl0(j10, j11)) {
            b.M(drawScope, j10, 0L, SizeKt.Size(fM1440getWidthimpl, fM1440getWidthimpl), CornerRadiusKt.CornerRadius$default(f10, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, null);
            return;
        }
        float f13 = fM1440getWidthimpl - (2 * f11);
        b.M(drawScope, j10, OffsetKt.Offset(f11, f11), SizeKt.Size(f13, f13), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f10 - f11), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f14 = fM1440getWidthimpl - f11;
        b.M(drawScope, j11, OffsetKt.Offset(f12, f12), SizeKt.Size(f14, f14), CornerRadiusKt.CornerRadius$default(f10 - f12, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m944drawCheck3IgeMak(DrawScope drawScope, long j10, float f10, float f11, float f12, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f12, 0.0f, StrokeCap.INSTANCE.m1929getSquareKaPHkGw(), 0, null, 26, null);
        float fM1440getWidthimpl = Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f11);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f11);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f11);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f11);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * fM1440getWidthimpl, fLerp3 * fM1440getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(fLerp * fM1440getWidthimpl, fLerp2 * fM1440getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * fM1440getWidthimpl, fM1440getWidthimpl * fLerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f10, checkDrawingCache.getPathToDraw(), true);
        b.G(drawScope, checkDrawingCache.getPathToDraw(), j10, 0.0f, stroke, null, 0, 52, null);
    }
}
