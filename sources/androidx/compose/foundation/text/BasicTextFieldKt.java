package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aß\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020!2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010\"\u001aÕ\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010#\u001aÕ\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020!2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final java.lang.String r37, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r39, boolean r40, boolean r41, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r42, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0416 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r36, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r37, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r38, boolean r39, boolean r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r41, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r42, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, int r46, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r49, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r36, final kotlin.jvm.functions.Function1 r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.ui.text.input.VisualTransformation r46, kotlin.jvm.functions.Function1 r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.ui.graphics.Brush r49, kotlin.jvm.functions.Function3 r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r36, final kotlin.jvm.functions.Function1 r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.ui.text.input.VisualTransformation r46, kotlin.jvm.functions.Function1 r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.ui.graphics.Brush r49, kotlin.jvm.functions.Function3 r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
