package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NestedScrollConnection {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m2802onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j10, long j11, @NotNull Continuation continuation) {
            return a.a(nestedScrollConnection, j10, j11, continuation);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m2803onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
            return a.b(nestedScrollConnection, j10, j11, i10);
        }

        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m2804onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j10, @NotNull Continuation continuation) {
            return a.c(nestedScrollConnection, j10, continuation);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m2805onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j10, int i10) {
            return a.d(nestedScrollConnection, j10, i10);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    Object mo314onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation continuation);

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    long mo315onPostScrollDzOQY0M(long consumed, long available, int source);

    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    Object mo316onPreFlingQWom1Mo(long j10, @NotNull Continuation continuation);

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    long mo317onPreScrollOzD1aCk(long available, int source);
}
