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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    public /* synthetic */ DefaultChipColors(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i10, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:592)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.backgroundColor : this.disabledBackgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public State<Color> contentColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i10, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:597)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.contentColor : this.disabledContentColor), composer, 0);
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
        if (other == null || DefaultChipColors.class != other.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) other;
        return Color.m1605equalsimpl0(this.backgroundColor, defaultChipColors.backgroundColor) && Color.m1605equalsimpl0(this.contentColor, defaultChipColors.contentColor) && Color.m1605equalsimpl0(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.m1605equalsimpl0(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.m1605equalsimpl0(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.m1605equalsimpl0(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor);
    }

    public int hashCode() {
        return (((((((((Color.m1611hashCodeimpl(this.backgroundColor) * 31) + Color.m1611hashCodeimpl(this.contentColor)) * 31) + Color.m1611hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m1611hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m1611hashCodeimpl(this.disabledContentColor)) * 31) + Color.m1611hashCodeimpl(this.disabledLeadingIconContentColor);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public State<Color> leadingIconContentColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i10, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:602)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1594boximpl(z10 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    private DefaultChipColors(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.backgroundColor = j10;
        this.contentColor = j11;
        this.leadingIconContentColor = j12;
        this.disabledBackgroundColor = j13;
        this.disabledContentColor = j14;
        this.disabledLeadingIconContentColor = j15;
    }
}
