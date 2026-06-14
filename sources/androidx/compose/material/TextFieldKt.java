package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.b;
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
import androidx.compose.ui.unit.LayoutDirection;
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
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00101\u001a\u009a\u0001\u00102\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001a]\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aE\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u0014\u0010O\u001a\u00020\u0010*\u00020\u00102\u0006\u0010P\u001a\u00020QH\u0000\u001at\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020%2\u0006\u0010]\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u000207H\u0002\u001aZ\u0010^\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010_\u001a\u00020W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m3951constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m3951constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m3951constructorimpl(4);

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
    /* JADX WARN: Removed duplicated region for block: B:305:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0663 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0664  */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull final java.lang.String r75, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r77, boolean r78, boolean r79, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, boolean r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r88, boolean r89, int r90, int r91, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r92, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r93, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r94, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r95, final int r96, final int r97, final int r98) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull final Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> textField, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z10, final float f10, @NotNull final PaddingValues paddingValues, @Nullable Composer composer, final int i10) {
        int i11;
        boolean z11;
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i11, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            Float fValueOf = Float.valueOf(f10);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(paddingValues);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z10, f10, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
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
            Updater.m1255setimpl(composerM1248constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(254819681);
            if (function22 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                z11 = false;
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
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                z11 = false;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(254819966);
            if (function23 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, z11, composerStartRestartGroup, 6);
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
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 15) & 14));
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
            composerStartRestartGroup.startReplaceableGroup(254820977);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM422paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(254821106);
            if (function2 != null) {
                Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId).then(modifierM422paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
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
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen4 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM422paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor5 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierThen4);
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
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            textField.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextFieldLayout.2
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

            public final void invoke(@Nullable Composer composer2, int i13) {
                TextFieldKt.TextFieldLayout(modifier, textField, function2, function3, function22, function23, z10, f10, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1186calculateHeightO3s9Psw(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, PaddingValues paddingValues) {
        float f11 = TextFieldTopPadding * f10;
        float top = paddingValues.getTop() * f10;
        float bottom = paddingValues.getBottom() * f10;
        int iMax = Math.max(i10, i14);
        return Math.max(zf.a.d(z10 ? i11 + f11 + iMax + bottom : top + iMax + bottom), Math.max(Math.max(i12, i13), Constraints.m3920getMinHeightimpl(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1187calculateWidthVsPV1Ek(int i10, int i11, int i12, int i13, int i14, long j10) {
        return Math.max(i10 + Math.max(i12, Math.max(i13, i14)) + i11, Constraints.m3921getMinWidthimpl(j10));
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier, @NotNull final BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt.drawIndicatorLine.1
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
                drawWithContent.drawContent();
                if (Dp.m3956equalsimpl0(width, Dp.INSTANCE.m3969getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float fM1437getHeightimpl = Size.m1437getHeightimpl(drawWithContent.mo2040getSizeNHjbRc()) - (density / 2);
                b.B(drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, fM1437getHeightimpl), OffsetKt.Offset(Size.m1440getWidthimpl(drawWithContent.mo2040getSizeNHjbRc()), fM1437getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z10, int i12, int i13, float f10, float f11) {
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i11), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i10 - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i11), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i11) : zf.a.d(TextFieldImplKt.getTextFieldPadding() * f11)) - zf.a.d((r0 - i12) * f10), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i13, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i13, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z10, float f10, PaddingValues paddingValues) {
        int iD = zf.a.d(paddingValues.getTop() * f10);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i11), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i10 - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i11), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i11) : iD, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z10) {
                iD = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i11);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iD, 0.0f, 4, null);
        }
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
    /* JADX WARN: Removed duplicated region for block: B:286:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x050b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x050c  */
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
    public static final /* synthetic */ void TextField(final java.lang.String r74, final kotlin.jvm.functions.Function1 r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, kotlin.jvm.functions.Function2 r82, kotlin.jvm.functions.Function2 r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    /* JADX WARN: Removed duplicated region for block: B:320:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0641 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0642  */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r75, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r77, boolean r78, boolean r79, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, boolean r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r88, boolean r89, int r90, int r91, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r92, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r93, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r94, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r95, final int r96, final int r97, final int r98) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final /* synthetic */ void TextField(final androidx.compose.ui.text.input.TextFieldValue r74, final kotlin.jvm.functions.Function1 r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, kotlin.jvm.functions.Function2 r82, kotlin.jvm.functions.Function2 r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
