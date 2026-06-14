package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.my.target.common.menu.MenuActionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002bcB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0012JX\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0006\u0010 \u001a\u00020\fJ\u0010\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0015H\u0002J \u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002JX\u0010'\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0002J \u0010/\u001a\u00020\f2\u0006\u00100\u001a\u0002012\u0006\u0010\u001e\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u00102\u0006\u00100\u001a\u000201H\u0002J\u0018\u00105\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u0010&\u001a\u00020%H\u0002J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u000201J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J\u0010\u00109\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\u0015J\u0014\u0010:\u001a\u00020\f*\u00020;2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010<\u001a\u00020\f*\u00020=2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010>\u001a\u00020\f*\u00020?2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010@\u001a\u00020\f*\u00020A2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010B\u001a\u00020\f*\u00020C2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010D\u001a\u00020\f*\u00020E2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u001c\u0010F\u001a\u00020\f*\u00020G2\u0006\u0010H\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u001c\u0010I\u001a\u00020\f*\u00020J2\u0006\u0010K\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010L\u001a\u00020\f*\u00020M2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010N\u001a\u00020\f*\u00020O2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010P\u001a\u00020\f*\u00020Q2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010R\u001a\u00020\f*\u00020S2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010T\u001a\u00020\f*\u00020U2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010V\u001a\u00020\f*\u00020W2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u001c\u0010X\u001a\u00020\f*\u00020Y2\u0006\u0010H\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u001c\u0010Z\u001a\u00020\f*\u00020[2\u0006\u0010K\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010\\\u001a\u00020\f*\u00020]2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\f\u0010^\u001a\u00020\u0017*\u00020\u0017H\u0002J\f\u0010^\u001a\u00020_*\u00020_H\u0002J\u0014\u0010`\u001a\u00020\f*\u00020a2\u0006\u0010\"\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "ctrlPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "reflectiveCtrlPoint", "segmentPoint", "addNode", "", "cmd", "", "args", "", "addPathNodes", "", "arcToBezier", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "clear", "close", TypedValues.AttributesType.S_TARGET, "copyOfRange", "original", "", "end", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "extract", "s", "", "result", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "getFloats", "nextStart", "parsePathString", "pathData", "toNodes", "toPath", "arcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "curveTo", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "horizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "lineTo", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "moveTo", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "quadTo", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "reflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "prevIsCurve", "reflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "prevIsQuad", "relativeArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeHorizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeLineTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeMoveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeReflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "relativeReflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "relativeVerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "toRadians", "", "verticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathParser {

    @NotNull
    private final PathPoint ctrlPoint;

    @NotNull
    private final PathPoint currentPoint;

    @NotNull
    private final List<PathNode> nodes = new ArrayList();

    @NotNull
    private final PathPoint reflectiveCtrlPoint;

    @NotNull
    private final PathPoint segmentPoint;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "endPosition", "", "endWithNegativeOrDot", "", "(IZ)V", "getEndPosition", "()I", "setEndPosition", "(I)V", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "component1", "component2", MenuActionType.COPY, "equals", "other", "hashCode", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        public ExtractFloatResult() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = extractFloatResult.endPosition;
            }
            if ((i11 & 2) != 0) {
                z10 = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i10, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEndPosition() {
            return this.endPosition;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        @NotNull
        public final ExtractFloatResult copy(int endPosition, boolean endWithNegativeOrDot) {
            return new ExtractFloatResult(endPosition, endWithNegativeOrDot);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i10 = this.endPosition * 31;
            boolean z10 = this.endWithNegativeOrDot;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return i10 + r12;
        }

        public final void setEndPosition(int i10) {
            this.endPosition = i10;
        }

        public final void setEndWithNegativeOrDot(boolean z10) {
            this.endWithNegativeOrDot = z10;
        }

        @NotNull
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }

        public ExtractFloatResult(int i10, boolean z10) {
            this.endPosition = i10;
            this.endWithNegativeOrDot = z10;
        }

        public /* synthetic */ ExtractFloatResult(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "x", "", "y", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "reset", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class PathPoint {
        private float x;
        private float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public PathPoint() {
            float f10 = 0.0f;
            this(f10, f10, 3, null);
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pathPoint.x;
            }
            if ((i10 & 2) != 0) {
                f11 = pathPoint.y;
            }
            return pathPoint.copy(f10, f11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final PathPoint copy(float x10, float y10) {
            return new PathPoint(x10, y10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return Float.compare(this.x, pathPoint.x) == 0 && Float.compare(this.y, pathPoint.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void setX(float f10) {
            this.x = f10;
        }

        public final void setY(float f10) {
            this.y = f10;
        }

        @NotNull
        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }

        public PathPoint(float f10, float f11) {
            this.x = f10;
            this.y = f11;
        }

        public /* synthetic */ PathPoint(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        }
    }

    public PathParser() {
        float f10 = 0.0f;
        int i10 = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.currentPoint = new PathPoint(f10, f10, i10, defaultConstructorMarker);
        this.ctrlPoint = new PathPoint(f10, f10, i10, defaultConstructorMarker);
        this.segmentPoint = new PathPoint(f10, f10, i10, defaultConstructorMarker);
        this.reflectiveCtrlPoint = new PathPoint(f10, f10, i10, defaultConstructorMarker);
    }

    private final void addNode(char cmd, float[] args) {
        this.nodes.addAll(PathNodeKt.toPathNodes(cmd, args));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path p10, double cx, double cy, double a10, double b10, double e1x, double e1y, double theta, double start, double sweep) {
        double d10 = 4;
        int iCeil = (int) Math.ceil(Math.abs((sweep * d10) / 3.141592653589793d));
        double dCos = Math.cos(theta);
        double dSin = Math.sin(theta);
        double dCos2 = Math.cos(start);
        double dSin2 = Math.sin(start);
        double d11 = -a10;
        double d12 = d11 * dCos;
        double d13 = b10 * dSin;
        double d14 = (d12 * dSin2) - (d13 * dCos2);
        double d15 = d11 * dSin;
        double d16 = b10 * dCos;
        double d17 = (dSin2 * d15) + (dCos2 * d16);
        double d18 = sweep / ((double) iCeil);
        double d19 = d17;
        double d20 = d14;
        int i10 = 0;
        double d21 = e1x;
        double d22 = e1y;
        double d23 = start;
        while (i10 < iCeil) {
            double d24 = d23 + d18;
            double dSin3 = Math.sin(d24);
            double dCos3 = Math.cos(d24);
            int i11 = i10;
            double d25 = (cx + ((a10 * dCos) * dCos3)) - (d13 * dSin3);
            double d26 = d10;
            double d27 = cy + (a10 * dSin * dCos3) + (d16 * dSin3);
            double d28 = (d12 * dSin3) - (d13 * dCos3);
            double d29 = (dSin3 * d15) + (dCos3 * d16);
            double d30 = d24 - d23;
            int i12 = iCeil;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSin4 = (Math.sin(d30) * (Math.sqrt(d26 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            p10.cubicTo((float) (d21 + (d20 * dSin4)), (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d28)), (float) (d27 - (dSin4 * d29)), (float) d25, (float) d27);
            dSin = dSin;
            d18 = d18;
            d21 = d25;
            d22 = d27;
            i10 = i11 + 1;
            d23 = d24;
            d19 = d29;
            iCeil = i12;
            d20 = d28;
            dCos = dCos;
            d10 = d26;
        }
    }

    private final void close(Path target) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        target.close();
        target.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = end - start;
        int iMin = Math.min(i10, length - start);
        float[] fArr = new float[i10];
        ArraysKt.copyInto(original, fArr, 0, start, iMin + start);
        return fArr;
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path p10, double x02, double y02, double x12, double y12, double a10, double b10, double theta, boolean isMoreThanHalf, boolean isPositiveArc) {
        double d10;
        double d11;
        double radians = toRadians(theta);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = ((x02 * dCos) + (y02 * dSin)) / a10;
        double d13 = (((-x02) * dSin) + (y02 * dCos)) / b10;
        double d14 = ((x12 * dCos) + (y12 * dSin)) / a10;
        double d15 = (((-x12) * dSin) + (y12 * dCos)) / b10;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d16 * d16) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            drawArc(p10, x02, y02, x12, y12, a10 * dSqrt, b10 * dSqrt, theta, isMoreThanHalf, isPositiveArc);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (isMoreThanHalf == isPositiveArc) {
            d10 = d19 - d24;
            d11 = d20 + d23;
        } else {
            d10 = d19 + d24;
            d11 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d11, d12 - d10);
        double dAtan22 = Math.atan2(d15 - d11, d14 - d10) - dAtan2;
        if (isPositiveArc != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d10 * a10;
        double d26 = d11 * b10;
        arcToBezier(p10, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), a10, b10, x02, y02, radians, dAtan2, dAtan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[LOOP:0: B:3:0x0008->B:30:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a A[EDGE_INSN: B:34:0x004a->B:31:0x004a BREAK  A[LOOP:0: B:3:0x0008->B:30:0x0047], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void extract(java.lang.String r9, int r10, androidx.compose.ui.graphics.vector.PathParser.ExtractFloatResult r11) {
        /*
            r8 = this;
            r0 = 0
            r11.setEndWithNegativeOrDot(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L4a
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L18
            goto L1c
        L18:
            r6 = 44
            if (r5 != r6) goto L1f
        L1c:
            r2 = r0
            r4 = r7
            goto L44
        L1f:
            r6 = 45
            if (r5 != r6) goto L2b
            if (r1 == r10) goto L43
            if (r2 != 0) goto L43
            r11.setEndWithNegativeOrDot(r7)
            goto L1c
        L2b:
            r2 = 46
            if (r5 != r2) goto L38
            if (r3 != 0) goto L34
            r2 = r0
            r3 = r7
            goto L44
        L34:
            r11.setEndWithNegativeOrDot(r7)
            goto L1c
        L38:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L3d
            goto L41
        L3d:
            r2 = 69
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L44
        L43:
            r2 = r0
        L44:
            if (r4 == 0) goto L47
            goto L4a
        L47:
            int r1 = r1 + 1
            goto L8
        L4a:
            r11.setEndPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathParser.extract(java.lang.String, int, androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult):void");
    }

    private final float[] getFloats(String s10) {
        int i10 = 0;
        byte b10 = 0;
        if (s10.charAt(0) == 'z' || s10.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s10.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i10, b10 == true ? 1 : 0, 3, null);
        int length = s10.length();
        int i11 = 1;
        int i12 = 0;
        while (i11 < length) {
            extract(s10, i11, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i11 < endPosition) {
                String strSubstring = s10.substring(i11, endPosition);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i12] = Float.parseFloat(strSubstring);
                i12++;
            }
            i11 = extractFloatResult.getEndWithNegativeOrDot() ? endPosition : endPosition + 1;
        }
        return copyOfRange(fArr, 0, i12);
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String s10, int end) {
        while (end < s10.length()) {
            char cCharAt = s10.charAt(end);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            end++;
        }
        return end;
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z10, Path path) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f10) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f10 * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z10, Path path) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f10) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f10 * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy2());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z10, Path path) {
        if (z10) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z10, Path path) {
        if (z10) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d10) {
        return (d10 / ((double) 180)) * 3.141592653589793d;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.nodes.clear();
        int i10 = 0;
        int i11 = 1;
        while (i11 < pathData.length()) {
            int iNextStart = nextStart(pathData, i11);
            String strSubstring = pathData.substring(i10, iNextStart);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - 1;
            int i12 = 0;
            boolean z10 = false;
            while (i12 <= length) {
                boolean z11 = Intrinsics.compare((int) strSubstring.charAt(!z10 ? i12 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i12++;
                } else {
                    z10 = true;
                }
            }
            String string = strSubstring.subSequence(i12, length + 1).toString();
            if (string.length() > 0) {
                addNode(string.charAt(0), getFloats(string));
            }
            i10 = iNextStart;
            i11 = iNextStart + 1;
        }
        if (i11 - i10 == 1 && i10 < pathData.length()) {
            addNode(pathData.charAt(i10), new float[0]);
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i10 = 0;
        while (i10 < size) {
            PathNode pathNode2 = list.get(i10);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(target);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                Intrinsics.checkNotNull(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                Intrinsics.checkNotNull(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                Intrinsics.checkNotNull(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                Intrinsics.checkNotNull(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, target);
            }
            i10++;
            pathNode = pathNode2;
        }
        return target;
    }

    private final float toRadians(float f10) {
        return (f10 / 180.0f) * 3.1415927f;
    }
}
