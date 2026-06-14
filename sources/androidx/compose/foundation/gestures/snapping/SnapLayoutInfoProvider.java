package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.Density;
import bg.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "Landroidx/compose/ui/unit/Density;", "", "calculateSnapStepSize", "(Landroidx/compose/ui/unit/Density;)F", "initialVelocity", "calculateApproachOffset", "(Landroidx/compose/ui/unit/Density;F)F", "Lbg/b;", "calculateSnappingOffsetBounds", "(Landroidx/compose/ui/unit/Density;)Lbg/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SnapLayoutInfoProvider {
    float calculateApproachOffset(@NotNull Density density, float f10);

    float calculateSnapStepSize(@NotNull Density density);

    @NotNull
    b calculateSnappingOffsetBounds(@NotNull Density density);
}
