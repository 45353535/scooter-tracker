package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J=\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\u00020\n8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PointerInputScope extends Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m2930getExtendedTouchPaddingNHjbRc(@NotNull PointerInputScope pointerInputScope) {
            return f.a(pointerInputScope);
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope) {
            return f.b(pointerInputScope);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2931roundToPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j10) {
            return androidx.compose.ui.unit.a.a(pointerInputScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2932roundToPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f10) {
            return androidx.compose.ui.unit.a.b(pointerInputScope, f10);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope, boolean z10) {
            f.c(pointerInputScope, z10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2933toDpGaN1DYA(@NotNull PointerInputScope pointerInputScope, long j10) {
            return androidx.compose.ui.unit.a.c(pointerInputScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2934toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, float f10) {
            return androidx.compose.ui.unit.a.d(pointerInputScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2936toDpSizekrfVVM(@NotNull PointerInputScope pointerInputScope, long j10) {
            return androidx.compose.ui.unit.a.f(pointerInputScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2937toPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j10) {
            return androidx.compose.ui.unit.a.g(pointerInputScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2938toPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f10) {
            return androidx.compose.ui.unit.a.h(pointerInputScope, f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PointerInputScope pointerInputScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.a.i(pointerInputScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2939toSizeXkaWNTQ(@NotNull PointerInputScope pointerInputScope, long j10) {
            return androidx.compose.ui.unit.a.j(pointerInputScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2940toSp0xMU5do(@NotNull PointerInputScope pointerInputScope, float f10) {
            return androidx.compose.ui.unit.a.k(pointerInputScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2941toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, float f10) {
            return androidx.compose.ui.unit.a.l(pointerInputScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2935toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, int i10) {
            return androidx.compose.ui.unit.a.e(pointerInputScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2942toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, int i10) {
            return androidx.compose.ui.unit.a.m(pointerInputScope, i10);
        }
    }

    @Nullable
    <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation);

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo2928getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long m2929getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z10);
}
