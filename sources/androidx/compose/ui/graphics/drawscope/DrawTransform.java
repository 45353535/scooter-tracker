package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H&J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DrawTransform {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2120getCenterF1C5BW0(@NotNull DrawTransform drawTransform) {
            return c.a(drawTransform);
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo2048clipPathmtrdDE(@NotNull Path path, int clipOp);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo2049clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp);

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    long mo2050getCenterF1C5BW0();

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo2051getSizeNHjbRc();

    void inset(float left, float top, float right, float bottom);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo2052rotateUv8p0NA(float degrees, long pivot);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo2053scale0AR0LA0(float scaleX, float scaleY, long pivot);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo2054transform58bKbWc(@NotNull float[] matrix);

    void translate(float left, float top);
}
