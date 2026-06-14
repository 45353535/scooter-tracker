package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aJ\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0005*\u00020\n¢\u0006\u0004\b\u0010\u0010\f\u001a\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\u0005*\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0004*\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "", "", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransformGestureDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {59, 61}, m = "invokeSuspend")
    static final class AnonymousClass2 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z10, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation continuation) {
            super(2, continuation);
            this.$panZoomLock = z10;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m334anglek4lQ0M(long j10) {
        if (Offset.m1371getXimpl(j10) == 0.0f && Offset.m1372getYimpl(j10) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jM1387getZeroF1C5BW0 = Offset.INSTANCE.m1387getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM1387getZeroF1C5BW0 = Offset.m1376plusMKHz9U(jM1387getZeroF1C5BW0, z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i10++;
            }
        }
        return i10 == 0 ? Offset.INSTANCE.m1386getUnspecifiedF1C5BW0() : Offset.m1366divtuRUvjQ(jM1387getZeroF1C5BW0, i10);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroid(pointerEvent, z10);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, z10);
        float fM1369getDistanceimpl = 0.0f;
        if (Offset.m1368equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m1386getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM1369getDistanceimpl += Offset.m1369getDistanceimpl(Offset.m1375minusMKHz9U(z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i10++;
            }
        }
        return fM1369getDistanceimpl / i10;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroidSize(pointerEvent, z10);
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m1368equalsimpl0(jCalculateCentroid, companion.m1386getUnspecifiedF1C5BW0()) ? companion.m1387getZeroF1C5BW0() : Offset.m1375minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            PointerInputChange pointerInputChange2 = changes2.get(i13);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM1375minusMKHz9U = Offset.m1375minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM1375minusMKHz9U2 = Offset.m1375minusMKHz9U(position, jCalculateCentroid);
                float fM334anglek4lQ0M = m334anglek4lQ0M(jM1375minusMKHz9U2) - m334anglek4lQ0M(jM1375minusMKHz9U);
                float fM1369getDistanceimpl = Offset.m1369getDistanceimpl(Offset.m1376plusMKHz9U(jM1375minusMKHz9U2, jM1375minusMKHz9U)) / 2.0f;
                if (fM334anglek4lQ0M > 180.0f) {
                    fM334anglek4lQ0M -= 360.0f;
                } else if (fM334anglek4lQ0M < -180.0f) {
                    fM334anglek4lQ0M += 360.0f;
                }
                f11 += fM334anglek4lQ0M * fM1369getDistanceimpl;
                f10 += fM1369getDistanceimpl;
            }
        }
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f11 / f10;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z10, @NotNull Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(z10, function4, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z10, Function4 function4, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return detectTransformGestures(pointerInputScope, z10, function4, continuation);
    }
}
