package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Velocity", "Landroidx/compose/ui/unit/Velocity;", "x", "", "y", "(FF)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VelocityKt {
    @Stable
    public static final long Velocity(float f10, float f11) {
        return Velocity.m4170constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }
}
