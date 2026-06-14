package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2055drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j10, long j11, long j12, long j13, float f10, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i10, int i11) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            b.a(contentDrawScope, image, j10, j11, j12, j13, f10, style, colorFilter, i10, i11);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2056getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return b.b(contentDrawScope);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2057getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return b.c(contentDrawScope);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2058roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return androidx.compose.ui.unit.a.a(contentDrawScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2059roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return androidx.compose.ui.unit.a.b(contentDrawScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2060toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return androidx.compose.ui.unit.a.c(contentDrawScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2061toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return androidx.compose.ui.unit.a.d(contentDrawScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2063toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return androidx.compose.ui.unit.a.f(contentDrawScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2064toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return androidx.compose.ui.unit.a.g(contentDrawScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2065toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return androidx.compose.ui.unit.a.h(contentDrawScope, f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.a.i(contentDrawScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2066toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j10) {
            return androidx.compose.ui.unit.a.j(contentDrawScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2067toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return androidx.compose.ui.unit.a.k(contentDrawScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2068toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f10) {
            return androidx.compose.ui.unit.a.l(contentDrawScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2062toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i10) {
            return androidx.compose.ui.unit.a.e(contentDrawScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2069toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i10) {
            return androidx.compose.ui.unit.a.m(contentDrawScope, i10);
        }
    }

    void drawContent();
}
