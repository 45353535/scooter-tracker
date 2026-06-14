package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldSizeKt {
    @NotNull
    public static final Modifier textFieldMinSize(@NotNull Modifier modifier, @NotNull final TextStyle style) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1582736677);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, i10, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle = style;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle2 = (TextStyle) objRememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle2.getFontFamily();
                    FontWeight fontWeight = textStyle2.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM3525getFontStyle4Lr2A7w = textStyle2.m3525getFontStyle4Lr2A7w();
                    int iM3591unboximpl = fontStyleM3525getFontStyle4Lr2A7w != null ? fontStyleM3525getFontStyle4Lr2A7w.m3591unboximpl() : FontStyle.INSTANCE.m3593getNormal_LCdwA();
                    FontSynthesis fontSynthesisM3526getFontSynthesisZQGJjVo = textStyle2.m3526getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo3563resolveDPcqOEQ(fontFamily, fontWeight, iM3591unboximpl, fontSynthesisM3526getFontSynthesisZQGJjVo != null ? fontSynthesisM3526getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m3603getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                TextStyle textStyle3 = style;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle3, state.getValue());
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final TextFieldSize textFieldSize = (TextFieldSize) objRememberedValue3;
                textFieldSize.update(layoutDirection, density, resolver, textStyle2, state.getValue());
                Modifier modifierLayout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m785invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m785invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j10) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        SizeKt.m446defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, 0.0f, 3, null);
                        long minSize = textFieldSize.getMinSize();
                        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(Constraints.m3910copyZbe2FdA$default(j10, g.n(IntSize.m4111getWidthimpl(minSize), Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10)), 0, g.n(IntSize.m4110getHeightimpl(minSize), Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10)), 0, 10, null));
                        return MeasureScope.CC.p(layout, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1.1
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
                                Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                });
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierLayout;
            }
        }, 1, null);
    }
}
