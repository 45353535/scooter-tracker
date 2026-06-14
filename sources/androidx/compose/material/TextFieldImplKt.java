package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", FirebaseAnalytics.Param.INDEX, "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    private static final Modifier IconDefaultSizeModifier;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String TextFieldId = "TextField";

    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m3951constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m3951constructorimpl(12);

    static {
        float f10 = 48;
        IconDefaultSizeModifier = SizeKt.m445defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m3951constructorimpl(f10), Dp.m3951constructorimpl(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x040b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(@org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldType r36, @org.jetbrains.annotations.NotNull final java.lang.String r37, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r39, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, boolean r44, boolean r45, boolean r46, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r47, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r48, @org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldColors r49, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.CommonDecorationBox(androidx.compose.material.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableOpenTarget(index = 0)
    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1180DecorationeuL9pac(final long j10, @Nullable TextStyle textStyle, @Nullable Float f10, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final Float f11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-399493340);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f11 = f10;
        } else {
            if (i13 != 0) {
                textStyle = null;
            }
            final Float f12 = i14 != 0 ? null : f10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i12, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:231)");
            }
            final int i15 = i12;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                @Composable
                public final void invoke(@Nullable Composer composer2, int i16) {
                    if ((i16 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(494684590, i16, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:237)");
                    }
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1594boximpl(j10))};
                    final Float f13 = f12;
                    final Function2<Composer, Integer, Unit> function2 = content;
                    final int i17 = i15;
                    final long j11 = j10;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.f93236a;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i18) {
                            if ((i18 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1132188434, i18, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:238)");
                            }
                            if (f13 != null) {
                                composer3.startReplaceableGroup(-452622131);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f13)}, function2, composer3, ((i17 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-452621951);
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1606getAlphaimpl(j11)))}, function2, composer3, ((i17 >> 6) & 112) | 8);
                                composer3.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceableGroup(-2009952864);
                TextKt.ProvideTextStyle(textStyle, composableLambda, composerStartRestartGroup, ((i15 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2009952812);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f11 = f12;
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

            public final void invoke(@Nullable Composer composer2, int i16) {
                TextFieldImplKt.m1180DecorationeuL9pac(j10, textStyle2, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
