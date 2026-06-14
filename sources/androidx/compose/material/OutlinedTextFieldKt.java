package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010.\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010/\u001aÄ\u0001\u00100\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\t0\r2\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00109\u001a\u00020:H\u0001ø\u0001\u0000¢\u0006\u0002\u0010;\u001aU\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a]\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a)\u0010P\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010Q\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a|\u0010T\u001a\u00020\t*\u00020U2\u0006\u0010V\u001a\u00020$2\u0006\u0010W\u001a\u00020$2\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010Y2\b\u0010]\u001a\u0004\u0018\u00010Y2\u0006\u0010^\u001a\u00020Y2\u0006\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010D\u001a\u0002052\u0006\u0010_\u001a\u00020`2\u0006\u00109\u001a\u00020:H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-zUg2_y0", "(IIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "calculateWidth-O3s9Psw", "(IIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OutlinedTextFieldKt {

    @NotNull
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m3951constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m3951constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0626 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final java.lang.String r75, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r77, boolean r78, boolean r79, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, boolean r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r88, boolean r89, int r90, int r91, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r92, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r93, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r94, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r95, final int r96, final int r97, final int r98) {
        /*
            Method dump skipped, instruction units count: 1599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull final Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> textField, @Nullable final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z10, final float f10, @NotNull final Function1<? super Size, Unit> onLabelMeasured, @NotNull final Function2<? super Composer, ? super Integer, Unit> border, @NotNull final PaddingValues paddingValues, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049536174);
        int i13 = (i10 & 14) == 0 ? i10 | (composerStartRestartGroup.changed(modifier) ? 4 : 2) : i10;
        if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onLabelMeasured) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(border) ? 536870912 : 268435456;
        }
        int i14 = i13;
        int i15 = (i11 & 14) == 0 ? i11 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) : i11;
        if ((i14 & 1533916891) == 306783378 && (i15 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i14, i15, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:476)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z10), Float.valueOf(f10), paddingValues};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i16 = 0;
            boolean zChanged = false;
            for (int i17 = 4; i16 < i17; i17 = 4) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z10, f10, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            border.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 27) & 14));
            composerStartRestartGroup.startReplaceableGroup(1169918076);
            if (function22 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen);
                if (!s.a(composerStartRestartGroup.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composerStartRestartGroup);
                Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1169918361);
            if (function23 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen2);
                if (!s.a(composerStartRestartGroup.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1248constructorimpl3 = Updater.m1248constructorimpl(composerStartRestartGroup);
                Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function22 != null) {
                i12 = 0;
                fCalculateStartPadding = Dp.m3951constructorimpl(g.d(Dp.m3951constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3951constructorimpl(0)));
            } else {
                i12 = 0;
            }
            float f11 = fCalculateStartPadding;
            if (function23 != null) {
                fCalculateEndPadding = Dp.m3951constructorimpl(g.d(Dp.m3951constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3951constructorimpl(i12)));
            }
            Modifier modifierM422paddingqDBjuR0$default = PaddingKt.m422paddingqDBjuR0$default(companion2, f11, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(1169919372);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM422paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i14 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM422paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierThen3);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl4 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl4, density4, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            textField.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-614207951);
            if (function2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId);
                if (!s.a(composerStartRestartGroup.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1248constructorimpl5 = Updater.m1248constructorimpl(composerStartRestartGroup);
                Updater.m1255setimpl(composerM1248constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl5, density5, companion.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i18) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, textField, function3, function2, function22, function23, z10, f10, onLabelMeasured, border, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-zUg2_y0, reason: not valid java name */
    public static final int m1071calculateHeightzUg2_y0(int i10, int i11, int i12, int i13, int i14, long j10, float f10, PaddingValues paddingValues) {
        return Math.max(Constraints.m3920getMinHeightimpl(j10), Math.max(i10, Math.max(i11, zf.a.d(Math.max(i12, i14) + (paddingValues.getBottom() * f10) + Math.max(paddingValues.getTop() * f10, i13 / 2.0f)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1072calculateWidthO3s9Psw(int i10, int i11, int i12, int i13, int i14, boolean z10, long j10, float f10, PaddingValues paddingValues) {
        int iD = 0;
        int iMax = i10 + Math.max(i12, Math.max(z10 ? i13 : 0, i14)) + i11;
        if (!z10) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            iD = i13 + zf.a.d(Dp.m3951constructorimpl(paddingValues.mo399calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo400calculateRightPaddingu2uoSUM(layoutDirection)) * f10);
        }
        return Math.max(iMax, Math.max(iD, Constraints.m3921getMinWidthimpl(j10)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @NotNull
    /* JADX INFO: renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1073outlineCutout12SF9DM(@NotNull Modifier outlineCutout, final long j10, @NotNull final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float fM1440getWidthimpl = Size.m1440getWidthimpl(j10);
                if (fM1440getWidthimpl <= 0.0f) {
                    drawWithContent.drawContent();
                    return;
                }
                float fMo308toPx0680j_4 = drawWithContent.mo308toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo308toPx0680j_42 = drawWithContent.mo308toPx0680j_4(paddingValues.mo399calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - fMo308toPx0680j_4;
                float f10 = 2;
                float fM1440getWidthimpl2 = fM1440getWidthimpl + fMo308toPx0680j_42 + (fMo308toPx0680j_4 * f10);
                LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM1440getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m1440getWidthimpl(drawWithContent.mo2040getSizeNHjbRc()) - fM1440getWidthimpl2 : g.d(fMo308toPx0680j_42, 0.0f);
                if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                    fM1440getWidthimpl2 = Size.m1440getWidthimpl(drawWithContent.mo2040getSizeNHjbRc()) - g.d(fMo308toPx0680j_42, 0.0f);
                }
                float f11 = fM1440getWidthimpl2;
                float fM1437getHeightimpl = Size.m1437getHeightimpl(j10);
                float f12 = (-fM1437getHeightimpl) / f10;
                float f13 = fM1437getHeightimpl / f10;
                int iM1592getDifferencertfAjoo = ClipOp.INSTANCE.m1592getDifferencertfAjoo();
                DrawContext drawContext = drawWithContent.getDrawContext();
                long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2049clipRectN_I0leg(fM1440getWidthimpl3, f12, f11, f13, iM1592getDifferencertfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f10, boolean z10, float f11, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Integer numValueOf;
        int iIntValue;
        int iD = zf.a.d(paddingValues.getTop() * f11);
        int iD2 = zf.a.d(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f11);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f11;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i10), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i11 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i10), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            int iLerp = MathHelpersKt.lerp(z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i10) : iD, -(placeable4.getHeight() / 2), f10);
            numValueOf = Integer.valueOf(iLerp);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, zf.a.d(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f10)) + iD2, iLerp, 0.0f, 4, null);
        } else {
            numValueOf = null;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i10) : iD, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z10) {
                iD = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i10);
            }
            int iMax = Math.max(iD, TextFieldImplKt.heightOrZero(placeable4) / 2);
            if (numValueOf != null && iMax <= (iIntValue = numValueOf.intValue())) {
                iMax = iIntValue + 1;
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), iMax, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m3046place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m4079getZeronOccac(), 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(final java.lang.String r74, final kotlin.jvm.functions.Function1 r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, kotlin.jvm.functions.Function2 r82, kotlin.jvm.functions.Function2 r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0649 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r75, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r77, boolean r78, boolean r79, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, boolean r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r88, boolean r89, int r90, int r91, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r92, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r93, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r94, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r95, final int r96, final int r97, final int r98) {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r74, final kotlin.jvm.functions.Function1 r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, kotlin.jvm.functions.Function2 r82, kotlin.jvm.functions.Function2 r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
