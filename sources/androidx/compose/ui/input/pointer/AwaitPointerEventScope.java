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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AwaitPointerEventScope extends Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m2823getExtendedTouchPaddingNHjbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
            return b.a(awaitPointerEventScope);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2824roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return androidx.compose.ui.unit.a.a(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2825roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return androidx.compose.ui.unit.a.b(awaitPointerEventScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2826toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return androidx.compose.ui.unit.a.c(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2827toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return androidx.compose.ui.unit.a.d(awaitPointerEventScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2829toDpSizekrfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return androidx.compose.ui.unit.a.f(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2830toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return androidx.compose.ui.unit.a.g(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2831toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return androidx.compose.ui.unit.a.h(awaitPointerEventScope, f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.a.i(awaitPointerEventScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2832toSizeXkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return androidx.compose.ui.unit.a.j(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2833toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return androidx.compose.ui.unit.a.k(awaitPointerEventScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2834toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f10) {
            return androidx.compose.ui.unit.a.l(awaitPointerEventScope, f10);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
            return b.b(awaitPointerEventScope, j10, function2, continuation);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
            return b.c(awaitPointerEventScope, j10, function2, continuation);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2828toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return androidx.compose.ui.unit.a.e(awaitPointerEventScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2835toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return androidx.compose.ui.unit.a.m(awaitPointerEventScope, i10);
        }
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation continuation);

    @NotNull
    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo2821getExtendedTouchPaddingNHjbRc();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo2822getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    <T> Object withTimeout(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation);

    @Nullable
    <T> Object withTimeoutOrNull(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation);
}
