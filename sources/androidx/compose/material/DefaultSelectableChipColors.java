package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\fJ&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> backgroundColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:654)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledBackgroundColor : !z11 ? this.backgroundColor : this.selectedBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> contentColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:664)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledContentColor : !z11 ? this.contentColor : this.selectedContentColor), composer, 0);
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
        if (other == null || DefaultSelectableChipColors.class != other.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) other;
        return Color.m1605equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m1605equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m1605equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m1605equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m1605equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m1605equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m1605equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m1605equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m1605equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((Color.m1611hashCodeimpl(this.backgroundColor) * 31) + Color.m1611hashCodeimpl(this.contentColor)) * 31) + Color.m1611hashCodeimpl(this.leadingIconColor)) * 31) + Color.m1611hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m1611hashCodeimpl(this.disabledContentColor)) * 31) + Color.m1611hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m1611hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m1611hashCodeimpl(this.selectedContentColor)) * 31) + Color.m1611hashCodeimpl(this.selectedLeadingIconColor);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public State<Color> leadingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(!z10 ? this.disabledLeadingIconColor : !z11 ? this.leadingIconColor : this.selectedLeadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    private DefaultSelectableChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.backgroundColor = j10;
        this.contentColor = j11;
        this.leadingIconColor = j12;
        this.disabledBackgroundColor = j13;
        this.disabledContentColor = j14;
        this.disabledLeadingIconColor = j15;
        this.selectedBackgroundColor = j16;
        this.selectedContentColor = j17;
        this.selectedLeadingIconColor = j18;
    }
}
