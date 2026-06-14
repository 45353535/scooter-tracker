package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static Object a(NestedScrollConnection nestedScrollConnection, long j10, long j11, Continuation continuation) {
        return i(nestedScrollConnection, j10, j11, continuation);
    }

    public static long b(NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
        return Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    public static Object c(NestedScrollConnection nestedScrollConnection, long j10, Continuation continuation) {
        return j(nestedScrollConnection, j10, continuation);
    }

    public static long d(NestedScrollConnection nestedScrollConnection, long j10, int i10) {
        return Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    public static /* synthetic */ Object i(NestedScrollConnection nestedScrollConnection, long j10, long j11, Continuation continuation) {
        return Velocity.m4167boximpl(Velocity.INSTANCE.m4187getZero9UxMQ8M());
    }

    public static /* synthetic */ Object j(NestedScrollConnection nestedScrollConnection, long j10, Continuation continuation) {
        return Velocity.m4167boximpl(Velocity.INSTANCE.m4187getZero9UxMQ8M());
    }
}
