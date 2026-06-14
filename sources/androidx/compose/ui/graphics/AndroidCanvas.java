package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.APIMeta;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u000fH\u0016JH\u0010$\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J-\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J-\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106JE\u00107\u001a\u00020\u000f2\u0006\u00102\u001a\u0002032\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020;2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J-\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ)\u0010E\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002ø\u0001\u0001J0\u0010J\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010K\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J3\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020N2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ!\u0010L\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*H\u0002ø\u0001\u0001J \u0010Q\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002J-\u0010S\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020N2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ \u0010S\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002J0\u0010V\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J@\u0010W\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J-\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J\b\u0010a\u001a\u00020\u000fH\u0016J\b\u0010b\u001a\u00020\u000fH\u0016J\u0010\u0010c\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u0018H\u0016J\b\u0010e\u001a\u00020\u000fH\u0016J\u0018\u0010f\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020h2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010i\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\u0018\u0010l\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\u0018\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u0018H\u0016J\u0017\u0010p\u001a\u00020q*\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u00060\u0006j\u0002`\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006t"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "dstRect", "Landroid/graphics/Rect;", "internalCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getInternalCanvas$annotations", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "srcRect", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", APIMeta.POINTS, "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toRegionOp", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCanvas implements Canvas {

    @NotNull
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;

    @NotNull
    private final Rect srcRect = new Rect();

    @NotNull
    private final Rect dstRect = new Rect();

    private final void drawLines(List<Offset> points, Paint paint, int stepBy) {
        if (points.size() < 2) {
            return;
        }
        kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, points.size() - 1), stepBy);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            long packedValue = points.get(iE).getPackedValue();
            long packedValue2 = points.get(iE + 1).getPackedValue();
            this.internalCanvas.drawLine(Offset.m1371getXimpl(packedValue), Offset.m1372getYimpl(packedValue), Offset.m1371getXimpl(packedValue2), Offset.m1372getYimpl(packedValue2), paint.getInternalPaint());
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    private final void drawPoints(List<Offset> points, Paint paint) {
        int size = points.size();
        for (int i10 = 0; i10 < size; i10++) {
            long packedValue = points.get(i10).getPackedValue();
            this.internalCanvas.drawPoint(Offset.m1371getXimpl(packedValue), Offset.m1372getYimpl(packedValue), paint.getInternalPaint());
        }
    }

    private final void drawRawLines(float[] points, Paint paint, int stepBy) {
        if (points.length < 4 || points.length % 2 != 0) {
            return;
        }
        kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, points.length - 3), stepBy * 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawLine(points[iE], points[iE + 1], points[iE + 2], points[iE + 3], paint.getInternalPaint());
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    private final void drawRawPoints(float[] points, Paint paint, int stepBy) {
        if (points.length % 2 != 0) {
            return;
        }
        kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, points.length - 1), stepBy);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawPoint(points[iE], points[iE + 1], paint.getInternalPaint());
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo1465clipPathmtrdDE(@NotNull Path path, int clipOp) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m1476toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo1466clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m1476toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public /* synthetic */ void mo1467clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int i10) {
        c1.a(this, rect, i10);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo1468concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (MatrixKt.m1833isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1483setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArc(androidx.compose.ui.geometry.Rect rect, float f10, float f11, boolean z10, Paint paint) {
        c1.b(this, rect, f10, f11, z10, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArcRad(androidx.compose.ui.geometry.Rect rect, float f10, float f11, boolean z10, Paint paint) {
        c1.c(this, rect, f10, f11, z10, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo1469drawCircle9KIMszo(long center, float radius, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m1371getXimpl(center), Offset.m1372getYimpl(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo1470drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m1371getXimpl(topLeftOffset), Offset.m1372getYimpl(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo1471drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m4069getXimpl(srcOffset);
        rect.top = IntOffset.m4070getYimpl(srcOffset);
        rect.right = IntOffset.m4069getXimpl(srcOffset) + IntSize.m4111getWidthimpl(srcSize);
        rect.bottom = IntOffset.m4070getYimpl(srcOffset) + IntSize.m4110getHeightimpl(srcSize);
        Unit unit = Unit.f93236a;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m4069getXimpl(dstOffset);
        rect2.top = IntOffset.m4070getYimpl(dstOffset);
        rect2.right = IntOffset.m4069getXimpl(dstOffset) + IntSize.m4111getWidthimpl(dstSize);
        rect2.bottom = IntOffset.m4070getYimpl(dstOffset) + IntSize.m4110getHeightimpl(dstSize);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo1472drawLineWko1d7g(long p12, long p22, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m1371getXimpl(p12), Offset.m1372getYimpl(p12), Offset.m1371getXimpl(p22), Offset.m1372getYimpl(p22), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawOval(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c1.d(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo1473drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1875equalsimpl0(pointMode, companion.m1879getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m1875equalsimpl0(pointMode, companion.m1881getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m1875equalsimpl0(pointMode, companion.m1880getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo1474drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1875equalsimpl0(pointMode, companion.m1879getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m1875equalsimpl0(pointMode, companion.m1881getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m1875equalsimpl0(pointMode, companion.m1880getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawRect(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c1.e(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo1475drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m1518toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void skewRad(float f10, float f11) {
        c1.f(this, f10, f11);
    }

    @NotNull
    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m1476toRegionOp7u2Bmg(int i10) {
        return ClipOp.m1588equalsimpl0(i10, ClipOp.INSTANCE.m1592getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawOval(left, top, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(left, top, right, bottom, paint.getInternalPaint());
    }
}
