package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106JÂ\u0001\u00107\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00108Jç\u0001\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ=\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJç\u0001\u0010Y\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010Z\u001a\u00020;2\b\b\u0002\u0010[\u001a\u00020;2\b\b\u0002\u0010\\\u001a\u00020;2\b\b\u0002\u0010]\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010QJ=\u0010_\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010XJ=\u0010a\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010XJM\u0010c\u001a\u00020d*\u00020d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010e\u001a\u00020\u00062\b\b\u0002\u0010f\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", "start", "top", "end", "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m3951constructorimpl(56);
    private static final float MinWidth = Dp.m3951constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m3951constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m3951constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1163indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, float f10, float f11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            f10 = FocusedBorderThickness;
        }
        return textFieldDefaults.m1172indicatorLinegv0btCI(modifier, z10, z11, interactionSource, textFieldColors, f10, (i10 & 32) != 0 ? UnfocusedBorderThickness : f11);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1164outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1174outlinedTextFieldPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1165textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1176textFieldWithLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1166textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1177textFieldWithoutLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* JADX INFO: renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1167BorderBoxnbWgWpA(final boolean r19, final boolean r20, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r21, @org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldColors r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r23, float r24, float r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m1167BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OutlinedTextFieldDecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r63, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r64, final boolean r65, final boolean r66, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r67, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r68, boolean r69, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r73, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r74, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r75, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r77, final int r78, final int r79, final int r80) {
        /*
            Method dump skipped, instruction units count: 957
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0355 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r63, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r64, final boolean r65, final boolean r66, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r67, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r68, boolean r69, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r73, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r74, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r75, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1168getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1169getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1170getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape getTextFieldShape(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeCopy$default;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1171getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1172indicatorLinegv0btCI(@NotNull Modifier indicatorLine, final boolean z10, final boolean z11, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors colors, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", colors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
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
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1398930845);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i10, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1179animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f10, f11, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1173outlinedTextFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long j31;
        long jM1603copywmQWz5c$default;
        long j32;
        long jM1603copywmQWz5c$default2;
        long j33;
        long jM1603copywmQWz5c$default3;
        long j34;
        long jM1603copywmQWz5c$default4;
        composer.startReplaceableGroup(1762667317);
        long jM1603copywmQWz5c$default5 = (i13 & 1) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1603copywmQWz5c$default6 = (i13 & 2) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1639getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m1639getTransparent0d7_KjU() : j12;
        long jM962getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j13;
        long jM956getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j14;
        long jM1603copywmQWz5c$default7 = (i13 & 32) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1603copywmQWz5c$default8 = (i13 & 64) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j35 = jM1603copywmQWz5c$default8;
            j31 = j35;
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j31 = jM1603copywmQWz5c$default8;
            jM1603copywmQWz5c$default = j17;
        }
        long jM956getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j18;
        long jM1603copywmQWz5c$default9 = (i13 & 512) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j36 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default2 = Color.m1603copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j36;
        } else {
            j32 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default2 = j20;
        }
        long j37 = (i13 & 2048) != 0 ? j32 : j21;
        long jM1603copywmQWz5c$default10 = (i13 & 4096) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            long j38 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default3 = Color.m1603copywmQWz5c$default(j38, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j38;
        } else {
            j33 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default3 = j23;
        }
        long jM956getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j24;
        long jM1603copywmQWz5c$default11 = (32768 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM1603copywmQWz5c$default12 = (65536 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            long j39 = jM1603copywmQWz5c$default12;
            jM1603copywmQWz5c$default4 = Color.m1603copywmQWz5c$default(j39, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j39;
        } else {
            j34 = jM1603copywmQWz5c$default12;
            jM1603copywmQWz5c$default4 = j27;
        }
        long jM956getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j28;
        long jM1603copywmQWz5c$default13 = (524288 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jM1603copywmQWz5c$default14 = (i13 & 1048576) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i10, i11, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1603copywmQWz5c$default5, jM1603copywmQWz5c$default6, jM962getPrimary0d7_KjU, jM956getError0d7_KjU, jM1603copywmQWz5c$default7, j31, jM956getError0d7_KjU2, jM1603copywmQWz5c$default, j32, jM1603copywmQWz5c$default2, j37, j33, jM1603copywmQWz5c$default3, jM956getError0d7_KjU3, jM1639getTransparent0d7_KjU, jM1603copywmQWz5c$default11, j34, jM1603copywmQWz5c$default4, jM956getError0d7_KjU4, jM1603copywmQWz5c$default13, jM1603copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1174outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m414PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1175textFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long j31;
        long jM1603copywmQWz5c$default;
        long j32;
        long jM1603copywmQWz5c$default2;
        long j33;
        long jM1603copywmQWz5c$default3;
        long j34;
        long jM1603copywmQWz5c$default4;
        composer.startReplaceableGroup(231892599);
        long jM1603copywmQWz5c$default5 = (i13 & 1) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1603copywmQWz5c$default6 = (i13 & 2) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1603copywmQWz5c$default7 = (i13 & 4) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM962getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j13;
        long jM956getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j14;
        long jM1603copywmQWz5c$default8 = (i13 & 32) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1603copywmQWz5c$default9 = (i13 & 64) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j35 = jM1603copywmQWz5c$default9;
            j31 = j35;
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j31 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default = j17;
        }
        long jM956getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j18;
        long jM1603copywmQWz5c$default10 = (i13 & 512) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j36 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default2 = Color.m1603copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j36;
        } else {
            j32 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default2 = j20;
        }
        long j37 = (i13 & 2048) != 0 ? j32 : j21;
        long jM1603copywmQWz5c$default11 = (i13 & 4096) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            long j38 = jM1603copywmQWz5c$default11;
            jM1603copywmQWz5c$default3 = Color.m1603copywmQWz5c$default(j38, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j38;
        } else {
            j33 = jM1603copywmQWz5c$default11;
            jM1603copywmQWz5c$default3 = j23;
        }
        long jM956getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j24;
        long jM1603copywmQWz5c$default12 = (32768 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM1603copywmQWz5c$default13 = (65536 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            long j39 = jM1603copywmQWz5c$default13;
            jM1603copywmQWz5c$default4 = Color.m1603copywmQWz5c$default(j39, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j39;
        } else {
            j34 = jM1603copywmQWz5c$default13;
            jM1603copywmQWz5c$default4 = j27;
        }
        long jM956getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j28;
        long jM1603copywmQWz5c$default14 = (524288 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jM1603copywmQWz5c$default15 = (i13 & 1048576) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1603copywmQWz5c$default5, jM1603copywmQWz5c$default6, jM962getPrimary0d7_KjU, jM956getError0d7_KjU, jM1603copywmQWz5c$default8, j31, jM956getError0d7_KjU2, jM1603copywmQWz5c$default, j32, jM1603copywmQWz5c$default2, j37, j33, jM1603copywmQWz5c$default3, jM956getError0d7_KjU3, jM1603copywmQWz5c$default7, jM1603copywmQWz5c$default12, j34, jM1603copywmQWz5c$default4, jM956getError0d7_KjU4, jM1603copywmQWz5c$default14, jM1603copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1176textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m414PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1177textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m414PaddingValuesa9UjIt4(start, top, end, bottom);
    }
}
