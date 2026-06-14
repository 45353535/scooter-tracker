package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u0017H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"ScrollingAxesThreshold", "", "scrollAxes", "", "Landroidx/compose/ui/geometry/Offset;", "getScrollAxes-k-4lQ0M", "(J)I", "composeToViewOffset", "offset", "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "toOffset", "consumed", "", "available", "toOffset-Uv8p0NA", "([IJ)J", "ceilAwayFromZero", "reverseAxis", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "toViewVelocity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }

    public static final int composeToViewOffset(float f10) {
        return ((int) ceilAwayFromZero(f10)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m3322getScrollAxesk4lQ0M(long j10) {
        int i10 = Math.abs(Offset.m1371getXimpl(j10)) >= 0.5f ? 1 : 0;
        return Math.abs(Offset.m1372getYimpl(j10)) >= 0.5f ? i10 | 2 : i10;
    }

    @Composable
    @NotNull
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@Nullable View view, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1260107652);
        if ((i11 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1260107652, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i10) {
        return i10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m3323toOffsetUv8p0NA(int[] iArr, long j10) {
        return OffsetKt.Offset(Offset.m1371getXimpl(j10) >= 0.0f ? kotlin.ranges.g.i(reverseAxis(iArr[0]), Offset.m1371getXimpl(j10)) : kotlin.ranges.g.d(reverseAxis(iArr[0]), Offset.m1371getXimpl(j10)), Offset.m1372getYimpl(j10) >= 0.0f ? kotlin.ranges.g.i(reverseAxis(iArr[1]), Offset.m1372getYimpl(j10)) : kotlin.ranges.g.d(reverseAxis(iArr[1]), Offset.m1372getYimpl(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m3324toViewTypeGyEprt8(int i10) {
        return !NestedScrollSource.m2813equalsimpl0(i10, NestedScrollSource.INSTANCE.m2818getDragWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f10) {
        return f10 * (-1.0f);
    }
}
