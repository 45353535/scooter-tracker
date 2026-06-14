package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/AndroidBringIntoViewParent;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "bringChildIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AndroidBringIntoViewParent implements BringIntoViewParent {

    @NotNull
    private final View view;

    public AndroidBringIntoViewParent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    @Nullable
    public Object bringChildIntoView(@NotNull LayoutCoordinates layoutCoordinates, @NotNull Function0<Rect> function0, @NotNull Continuation continuation) {
        Rect rectM1408translatek4lQ0M;
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || (rectM1408translatek4lQ0M = rectInvoke.m1408translatek4lQ0M(jPositionInRoot)) == null) {
            return Unit.f93236a;
        }
        this.view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.toRect(rectM1408translatek4lQ0M), false);
        return Unit.f93236a;
    }
}
