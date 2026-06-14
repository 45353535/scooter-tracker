package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0001¨\u0006\b"}, d2 = {"toAndroidRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toAndroidRectF", "Landroid/graphics/RectF;", "toComposeIntRect", "toComposeRect", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RectHelper_androidKt {
    @NotNull
    public static final Rect toAndroidRect(@NotNull androidx.compose.ui.geometry.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @NotNull
    public static final RectF toAndroidRectF(@NotNull androidx.compose.ui.geometry.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @NotNull
    public static final IntRect toComposeIntRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final Rect toAndroidRect(@NotNull IntRect intRect) {
        Intrinsics.checkNotNullParameter(intRect, "<this>");
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
