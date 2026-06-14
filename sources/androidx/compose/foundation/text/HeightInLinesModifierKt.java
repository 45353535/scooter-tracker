package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    @NotNull
    public static final Modifier heightInLines(@NotNull Modifier modifier, @NotNull final TextStyle textStyle, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i10));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i11));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i12) {
                char c10;
                char c11 = 3;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i12, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i10, i11);
                if (i10 == 1 && i11 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = textStyle;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(textStyle2) | composer.changed(layoutDirection);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM3525getFontStyle4Lr2A7w = textStyle3.m3525getFontStyle4Lr2A7w();
                    int iM3591unboximpl = fontStyleM3525getFontStyle4Lr2A7w != null ? fontStyleM3525getFontStyle4Lr2A7w.m3591unboximpl() : FontStyle.INSTANCE.m3593getNormal_LCdwA();
                    FontSynthesis fontSynthesisM3526getFontSynthesisZQGJjVo = textStyle3.m3526getFontSynthesisZQGJjVo();
                    c10 = 4;
                    objRememberedValue2 = resolver.mo3563resolveDPcqOEQ(fontFamily, fontWeight, iM3591unboximpl, fontSynthesisM3526getFontSynthesisZQGJjVo != null ? fontSynthesisM3526getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m3603getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    c10 = 4;
                }
                composer.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                Object obj = textStyle;
                Object value = state.getValue();
                Object[] objArr = new Object[5];
                objArr[0] = density;
                objArr[1] = resolver;
                objArr[2] = obj;
                objArr[3] = layoutDirection;
                objArr[c10] = value;
                composer.startReplaceableGroup(-568225417);
                int i13 = 0;
                boolean zChanged3 = false;
                while (i13 < 5) {
                    zChanged3 |= composer.changed(objArr[i13]);
                    i13++;
                    c11 = c11;
                }
                char c12 = c11;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m4110getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object obj2 = textStyle;
                Object value2 = state.getValue();
                Object[] objArr2 = new Object[5];
                objArr2[0] = density;
                objArr2[1] = resolver;
                objArr2[2] = obj2;
                objArr2[c12] = layoutDirection;
                objArr2[c10] = value2;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged4 = false;
                for (int i14 = 0; i14 < 5; i14++) {
                    zChanged4 |= composer.changed(objArr2[i14]);
                }
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m4110getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i15 = i10;
                Integer numValueOf = i15 == 1 ? null : Integer.valueOf(((i15 - 1) * iIntValue2) + iIntValue);
                int i16 = i11;
                Integer numValueOf2 = i16 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i16 - 1))) : null;
                Modifier modifierM448heightInVpY3zN4 = SizeKt.m448heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo305toDpu2uoSUM(numValueOf.intValue()) : Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo305toDpu2uoSUM(numValueOf2.intValue()) : Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM448heightInVpY3zN4;
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 1;
        }
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i10, i11);
    }

    public static final void validateMinMaxLines(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
    }
}
