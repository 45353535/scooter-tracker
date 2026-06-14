package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectC;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectC = b.c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m4111getWidthimpl(layoutCoordinates.mo3015getSizeYbymL2g()), IntSize.m4110getHeightimpl(layoutCoordinates.mo3015getSizeYbymL2g())) : rectC;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return b.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float fM4111getWidthimpl = IntSize.m4111getWidthimpl(layoutCoordinatesFindRootCoordinates.mo3015getSizeYbymL2g());
        float fM4110getHeightimpl = IntSize.m4110getHeightimpl(layoutCoordinatesFindRootCoordinates.mo3015getSizeYbymL2g());
        float fM = kotlin.ranges.g.m(rectBoundsInRoot.getLeft(), 0.0f, fM4111getWidthimpl);
        float fM2 = kotlin.ranges.g.m(rectBoundsInRoot.getTop(), 0.0f, fM4110getHeightimpl);
        float fM3 = kotlin.ranges.g.m(rectBoundsInRoot.getRight(), 0.0f, fM4111getWidthimpl);
        float fM4 = kotlin.ranges.g.m(rectBoundsInRoot.getBottom(), 0.0f, fM4110getHeightimpl);
        if (fM == fM3 || fM2 == fM4) {
            return Rect.INSTANCE.getZero();
        }
        long jMo3018localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM, fM2));
        long jMo3018localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM3, fM2));
        long jMo3018localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM3, fM4));
        long jMo3018localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM, fM4));
        return new Rect(mf.a.l(Offset.m1371getXimpl(jMo3018localToWindowMKHz9U), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U2), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U4), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U3)), mf.a.l(Offset.m1372getYimpl(jMo3018localToWindowMKHz9U), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U2), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U4), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U3)), mf.a.i(Offset.m1371getXimpl(jMo3018localToWindowMKHz9U), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U2), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U4), Offset.m1371getXimpl(jMo3018localToWindowMKHz9U3)), mf.a.i(Offset.m1372getYimpl(jMo3018localToWindowMKHz9U), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U2), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U4), Offset.m1372getYimpl(jMo3018localToWindowMKHz9U3)));
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo3016localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1387getZeroF1C5BW0()) : Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3017localToRootMKHz9U(Offset.INSTANCE.m1387getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3018localToWindowMKHz9U(Offset.INSTANCE.m1387getZeroF1C5BW0());
    }
}
