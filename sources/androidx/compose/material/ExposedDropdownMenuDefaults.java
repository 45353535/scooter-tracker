package androidx.compose.material;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(final boolean z10, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(876077373);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        } else {
            function02 = i13 != 0 ? new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            } : function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i12, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:285)");
            }
            IconButtonKt.IconButton(function02, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver clearAndSetSemantics) {
                    Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.f93236a;
                }
            }), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 726122713, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.f93236a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i14) {
                    if ((i14 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(726122713, i14, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:293)");
                    }
                    IconKt.m1043Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, z10 ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i12 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i14) {
                ExposedDropdownMenuDefaults.this.TrailingIcon(z10, function02, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1023outlinedTextFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long j32;
        long jM1603copywmQWz5c$default;
        long j33;
        long jM1603copywmQWz5c$default2;
        long j34;
        long jM1603copywmQWz5c$default3;
        long j35;
        long jM1603copywmQWz5c$default4;
        composer.startReplaceableGroup(1162641182);
        long jM1603copywmQWz5c$default5 = (i13 & 1) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1603copywmQWz5c$default6 = (i13 & 2) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1639getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m1639getTransparent0d7_KjU() : j12;
        long jM962getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j13;
        long jM956getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j14;
        long jM1603copywmQWz5c$default7 = (i13 & 32) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1603copywmQWz5c$default8 = (i13 & 64) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j36 = jM1603copywmQWz5c$default8;
            j32 = j36;
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j32 = jM1603copywmQWz5c$default8;
            jM1603copywmQWz5c$default = j17;
        }
        long jM956getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j18;
        long jM1603copywmQWz5c$default9 = (i13 & 512) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j37 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default2 = Color.m1603copywmQWz5c$default(j37, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j37;
        } else {
            j33 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default2 = j20;
        }
        long j38 = (i13 & 2048) != 0 ? j33 : j21;
        long jM1603copywmQWz5c$default10 = (i13 & 4096) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1603copywmQWz5c$default11 = (i13 & 8192) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            long j39 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default3 = Color.m1603copywmQWz5c$default(j39, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j39;
        } else {
            j34 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default3 = j24;
        }
        long jM956getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j25;
        long jM1603copywmQWz5c$default12 = (65536 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1603copywmQWz5c$default13 = (131072 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            long j40 = jM1603copywmQWz5c$default13;
            jM1603copywmQWz5c$default4 = Color.m1603copywmQWz5c$default(j40, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j40;
        } else {
            j35 = jM1603copywmQWz5c$default13;
            jM1603copywmQWz5c$default4 = j28;
        }
        long jM956getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j29;
        long jM1603copywmQWz5c$default14 = (1048576 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long jM1603copywmQWz5c$default15 = (i13 & 2097152) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j31;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1162641182, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:454)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM1603copywmQWz5c$default5, jM1603copywmQWz5c$default6, jM962getPrimary0d7_KjU, jM956getError0d7_KjU, jM1603copywmQWz5c$default7, j32, jM956getError0d7_KjU2, jM1603copywmQWz5c$default, j33, jM1603copywmQWz5c$default2, j38, j34, jM1603copywmQWz5c$default11, jM1603copywmQWz5c$default3, jM956getError0d7_KjU3, jM1639getTransparent0d7_KjU, jM1603copywmQWz5c$default12, j35, jM1603copywmQWz5c$default4, jM956getError0d7_KjU4, jM1603copywmQWz5c$default14, jM1603copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1024textFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long j32;
        long jM1603copywmQWz5c$default;
        long j33;
        long jM1603copywmQWz5c$default2;
        long j34;
        long jM1603copywmQWz5c$default3;
        long j35;
        long jM1603copywmQWz5c$default4;
        composer.startReplaceableGroup(1208167904);
        long jM1603copywmQWz5c$default5 = (i13 & 1) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1603copywmQWz5c$default6 = (i13 & 2) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1603copywmQWz5c$default7 = (i13 & 4) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM962getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU() : j13;
        long jM956getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j14;
        long jM1603copywmQWz5c$default8 = (i13 & 32) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1603copywmQWz5c$default9 = (i13 & 64) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j36 = jM1603copywmQWz5c$default9;
            j32 = j36;
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j32 = jM1603copywmQWz5c$default9;
            jM1603copywmQWz5c$default = j17;
        }
        long jM956getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j18;
        long jM1603copywmQWz5c$default10 = (i13 & 512) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j37 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default2 = Color.m1603copywmQWz5c$default(j37, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j37;
        } else {
            j33 = jM1603copywmQWz5c$default10;
            jM1603copywmQWz5c$default2 = j20;
        }
        long j38 = (i13 & 2048) != 0 ? j33 : j21;
        long jM1603copywmQWz5c$default11 = (i13 & 4096) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1603copywmQWz5c$default12 = (i13 & 8192) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            long j39 = jM1603copywmQWz5c$default11;
            jM1603copywmQWz5c$default3 = Color.m1603copywmQWz5c$default(j39, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j39;
        } else {
            j34 = jM1603copywmQWz5c$default11;
            jM1603copywmQWz5c$default3 = j24;
        }
        long jM956getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j25;
        long jM1603copywmQWz5c$default13 = (65536 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m962getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1603copywmQWz5c$default14 = (131072 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            long j40 = jM1603copywmQWz5c$default14;
            jM1603copywmQWz5c$default4 = Color.m1603copywmQWz5c$default(j40, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j40;
        } else {
            j35 = jM1603copywmQWz5c$default14;
            jM1603copywmQWz5c$default4 = j28;
        }
        long jM956getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m956getError0d7_KjU() : j29;
        long jM1603copywmQWz5c$default15 = (1048576 & i13) != 0 ? Color.m1603copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m961getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long jM1603copywmQWz5c$default16 = (i13 & 2097152) != 0 ? Color.m1603copywmQWz5c$default(jM1603copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j31;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208167904, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:351)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM1603copywmQWz5c$default5, jM1603copywmQWz5c$default6, jM962getPrimary0d7_KjU, jM956getError0d7_KjU, jM1603copywmQWz5c$default8, j32, jM956getError0d7_KjU2, jM1603copywmQWz5c$default, j33, jM1603copywmQWz5c$default2, j38, j34, jM1603copywmQWz5c$default12, jM1603copywmQWz5c$default3, jM956getError0d7_KjU3, jM1603copywmQWz5c$default7, jM1603copywmQWz5c$default13, j35, jM1603copywmQWz5c$default4, jM956getError0d7_KjU4, jM1603copywmQWz5c$default15, jM1603copywmQWz5c$default16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
