package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4240b4;
import com.ironsource.C4257c4;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R3\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR3\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020 8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0014\u0010'\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u001d\u0010)\u001a\u00020\u00068DX\u0084\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", "recalculateWidthAndHeight", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010J+\u0010\u0011\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0011\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ?\u0010\u0018\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u001a\u0010\u0019J?\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017JE\u0010\u001d\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0017JE\u0010\u001f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0017R\u001c\u0010$\u001a\u0004\u0018\u00010 8WX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020\r8$X¤\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8$X¤\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates$annotations", C4257c4.f42802f, "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        @Nullable
        private static LayoutCoordinates _coordinates;

        @Nullable
        private static LayoutNodeLayoutDelegate layoutDelegate;
        private static int parentWidth;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "<init>", "()V", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "scope", "", "configureForPlacingForAlignment", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Z", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "lookaheadCapablePlaceable", "Lkotlin/Function1;", "", "block", "executeWithRtlMirroringValues", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/node/LookaheadCapablePlaceable;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates$annotations", C4257c4.f42802f, "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "I", "getParentWidth", "()I", "_coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean configureForPlacingForAlignment(LookaheadCapablePlaceable scope) {
                if (scope == null) {
                    PlacementScope._coordinates = null;
                    PlacementScope.layoutDelegate = null;
                    return false;
                }
                boolean zIsPlacingForAlignment$ui_release = scope.getIsPlacingForAlignment();
                LookaheadCapablePlaceable parent = scope.getParent();
                if (parent != null && parent.getIsPlacingForAlignment()) {
                    scope.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.layoutDelegate = scope.getLayoutNode().getLayoutDelegate();
                if (scope.getIsPlacingForAlignment() || scope.getIsShallowPlacing()) {
                    PlacementScope._coordinates = null;
                    return zIsPlacingForAlignment$ui_release;
                }
                PlacementScope._coordinates = scope.getCoordinates();
                return zIsPlacingForAlignment$ui_release;
            }

            @ExperimentalComposeUiApi
            public static /* synthetic */ void getCoordinates$annotations() {
            }

            public final void executeWithRtlMirroringValues(int parentWidth, @NotNull LayoutDirection parentLayoutDirection, @Nullable LookaheadCapablePlaceable lookaheadCapablePlaceable, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                LayoutCoordinates layoutCoordinates = PlacementScope._coordinates;
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth2 = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                boolean zConfigureForPlacingForAlignment = configureForPlacingForAlignment(lookaheadCapablePlaceable);
                block.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                }
                PlacementScope.parentWidth = parentWidth2;
                PlacementScope.parentLayoutDirection = parentLayoutDirection2;
                PlacementScope._coordinates = layoutCoordinates;
                PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @Nullable
            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                if (layoutNodeLayoutDelegate != null) {
                    layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(true);
                }
                return PlacementScope._coordinates;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }

            private Companion() {
            }
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCoordinates$annotations() {
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.place(placeable, i10, i11, f10);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3046place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m3050place70tqf50(placeable, j10, f10);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelative(placeable, i10, i11, f10);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3047placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m3053placeRelative70tqf50(placeable, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, f11, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3048placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3054placeRelativeWithLayeraW9wM(placeable, j10, f11, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i10, i11, f11, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3049placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3055placeWithLayeraW9wM(placeable, j10, f11, function1);
        }

        @ExperimentalComposeUiApi
        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i10, int i11, float f10) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long jM3041getApparentToRealOffsetnOccac = placeable.m3041getApparentToRealOffsetnOccac();
            placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m3050place70tqf50(@NotNull Placeable place, long j10, float f10) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long jM3041getApparentToRealOffsetnOccac = place.m3041getApparentToRealOffsetnOccac();
            place.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3051placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeApparentToRealOffset, long j10, float f10, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long jM3041getApparentToRealOffsetnOccac = placeApparentToRealOffset.m3041getApparentToRealOffsetnOccac();
            placeApparentToRealOffset.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, function1);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3052placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeAutoMirrored, long j10, float f10, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3041getApparentToRealOffsetnOccac = placeAutoMirrored.m3041getApparentToRealOffsetnOccac();
                placeAutoMirrored.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeAutoMirrored.getWidth()) - IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10));
                long jM3041getApparentToRealOffsetnOccac2 = placeAutoMirrored.m3041getApparentToRealOffsetnOccac();
                placeAutoMirrored.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac2), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac2)), f10, function1);
            }
        }

        public final void placeRelative(@NotNull Placeable placeable, int i10, int i11, float f10) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3041getApparentToRealOffsetnOccac = placeable.m3041getApparentToRealOffsetnOccac();
                placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4069getXimpl(jIntOffset), IntOffset.m4070getYimpl(jIntOffset));
                long jM3041getApparentToRealOffsetnOccac2 = placeable.m3041getApparentToRealOffsetnOccac();
                placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset2) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac2), IntOffset.m4070getYimpl(jIntOffset2) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac2)), f10, null);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3053placeRelative70tqf50(@NotNull Placeable placeRelative, long j10, float f10) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3041getApparentToRealOffsetnOccac = placeRelative.m3041getApparentToRealOffsetnOccac();
                placeRelative.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelative.getWidth()) - IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10));
                long jM3041getApparentToRealOffsetnOccac2 = placeRelative.m3041getApparentToRealOffsetnOccac();
                placeRelative.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac2), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac2)), f10, null);
            }
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f10, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3041getApparentToRealOffsetnOccac = placeable.m3041getApparentToRealOffsetnOccac();
                placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, layerBlock);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4069getXimpl(jIntOffset), IntOffset.m4070getYimpl(jIntOffset));
                long jM3041getApparentToRealOffsetnOccac2 = placeable.m3041getApparentToRealOffsetnOccac();
                placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset2) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac2), IntOffset.m4070getYimpl(jIntOffset2) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac2)), f10, layerBlock);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3054placeRelativeWithLayeraW9wM(@NotNull Placeable placeRelativeWithLayer, long j10, float f10, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3041getApparentToRealOffsetnOccac = placeRelativeWithLayer.m3041getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, layerBlock);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelativeWithLayer.getWidth()) - IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10));
                long jM3041getApparentToRealOffsetnOccac2 = placeRelativeWithLayer.m3041getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac2), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac2)), f10, layerBlock);
            }
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f10, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long jM3041getApparentToRealOffsetnOccac = placeable.m3041getApparentToRealOffsetnOccac();
            placeable.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jIntOffset) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(jIntOffset) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, layerBlock);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3055placeWithLayeraW9wM(@NotNull Placeable placeWithLayer, long j10, float f10, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jM3041getApparentToRealOffsetnOccac = placeWithLayer.m3041getApparentToRealOffsetnOccac();
            placeWithLayer.mo3012placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(j10) + IntOffset.m4069getXimpl(jM3041getApparentToRealOffsetnOccac), IntOffset.m4070getYimpl(j10) + IntOffset.m4070getYimpl(jM3041getApparentToRealOffsetnOccac)), f10, layerBlock);
        }
    }

    private final void recalculateWidthAndHeight() {
        this.width = kotlin.ranges.g.n(IntSize.m4111getWidthimpl(this.measuredSize), Constraints.m3921getMinWidthimpl(this.measurementConstraints), Constraints.m3919getMaxWidthimpl(this.measurementConstraints));
        this.height = kotlin.ranges.g.n(IntSize.m4110getHeightimpl(this.measuredSize), Constraints.m3920getMinHeightimpl(this.measurementConstraints), Constraints.m3918getMaxHeightimpl(this.measurementConstraints));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m3041getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m4111getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m4110getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m4110getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m4111getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured
    public /* synthetic */ Object getParentData() {
        return f.a(this);
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo3012placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m3044setMeasuredSizeozmzZPI(long j10) {
        if (IntSize.m4109equalsimpl0(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3045setMeasurementConstraintsBRTryo0(long j10) {
        if (Constraints.m3912equalsimpl0(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        recalculateWidthAndHeight();
    }
}
