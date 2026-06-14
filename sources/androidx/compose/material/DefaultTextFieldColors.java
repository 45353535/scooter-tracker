package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B°\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J.\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017ø\u0001\u0000¢\u0006\u0002\u0010'J.\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017ø\u0001\u0000¢\u0006\u0002\u0010'J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010*J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017ø\u0001\u0000¢\u0006\u0002\u0010*R\u0019\u0010\u0011\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0014\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0017\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0010\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0016\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0013\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material/DefaultTextFieldColors;", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "equals", "other", "", "hashCode", "", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultTextFieldColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i10, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> cursorColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i10, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.errorCursorColor : this.cursorColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultTextFieldColors.class != other.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) other;
        return Color.m1605equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m1605equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m1605equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m1605equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m1605equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m1605equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m1605equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m1605equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m1605equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m1605equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m1605equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m1605equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m1605equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m1605equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m1605equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m1605equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m1605equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m1605equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m1605equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m1605equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m1605equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m1611hashCodeimpl(this.textColor) * 31) + Color.m1611hashCodeimpl(this.disabledTextColor)) * 31) + Color.m1611hashCodeimpl(this.cursorColor)) * 31) + Color.m1611hashCodeimpl(this.errorCursorColor)) * 31) + Color.m1611hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m1611hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m1611hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m1611hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m1611hashCodeimpl(this.leadingIconColor)) * 31) + Color.m1611hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m1611hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m1611hashCodeimpl(this.trailingIconColor)) * 31) + Color.m1611hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m1611hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m1611hashCodeimpl(this.backgroundColor)) * 31) + Color.m1611hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m1611hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m1611hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m1611hashCodeimpl(this.errorLabelColor)) * 31) + Color.m1611hashCodeimpl(this.placeholderColor)) * 31) + Color.m1611hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> indicatorColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        Composer composer2;
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i10, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        long j10 = !z10 ? this.disabledIndicatorColor : z11 ? this.errorIndicatorColor : indicatorColor$lambda$0(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z10) {
            composer.startReplaceableGroup(-2054190397);
            composer2 = composer;
            stateRememberUpdatedState = SingleValueAnimationKt.m86animateColorAsStateKTwxG1Y(j10, AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null), null, composer2, 48, 4);
            composer2.endReplaceableGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceableGroup(-2054190292);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(j10), composer2, 0);
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> labelColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i10, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledLabelColor : z11 ? this.errorLabelColor : labelColor$lambda$1(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> leadingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i10, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledLeadingIconColor : z11 ? this.errorLeadingIconColor : this.leadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> placeholderColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i10, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> textColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i10, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public State<Color> trailingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i10, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledTrailingIconColor : z11 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    private DefaultTextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        this.textColor = j10;
        this.disabledTextColor = j11;
        this.cursorColor = j12;
        this.errorCursorColor = j13;
        this.focusedIndicatorColor = j14;
        this.unfocusedIndicatorColor = j15;
        this.errorIndicatorColor = j16;
        this.disabledIndicatorColor = j17;
        this.leadingIconColor = j18;
        this.disabledLeadingIconColor = j19;
        this.errorLeadingIconColor = j20;
        this.trailingIconColor = j21;
        this.disabledTrailingIconColor = j22;
        this.errorTrailingIconColor = j23;
        this.backgroundColor = j24;
        this.focusedLabelColor = j25;
        this.unfocusedLabelColor = j26;
        this.disabledLabelColor = j27;
        this.errorLabelColor = j28;
        this.placeholderColor = j29;
        this.disabledPlaceholderColor = j30;
    }
}
