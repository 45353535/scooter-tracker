package androidx.compose.foundation.layout;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/DoNothingNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DoNothingNestedScrollConnection implements NestedScrollConnection {

    @NotNull
    public static final DoNothingNestedScrollConnection INSTANCE = new DoNothingNestedScrollConnection();

    private DoNothingNestedScrollConnection() {
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo314onPostFlingRZ2iAVY(long j10, long j11, Continuation continuation) {
        return androidx.compose.ui.input.nestedscroll.a.a(this, j10, j11, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public /* synthetic */ long mo315onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return androidx.compose.ui.input.nestedscroll.a.b(this, j10, j11, i10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo316onPreFlingQWom1Mo(long j10, Continuation continuation) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j10, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo317onPreScrollOzD1aCk(long j10, int i10) {
        return androidx.compose.ui.input.nestedscroll.a.d(this, j10, i10);
    }
}
