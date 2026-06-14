package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/font/FontWeight;", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FontWeightKt {
    @NotNull
    public static final FontWeight lerp(@NotNull FontWeight start, @NotNull FontWeight stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new FontWeight(kotlin.ranges.g.n(MathHelpersKt.lerp(start.getWeight(), stop.getWeight(), f10), 1, 1000));
    }
}
