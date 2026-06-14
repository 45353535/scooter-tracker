package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vh.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvh/c0;", "path", "Landroidx/datastore/core/InterProcessCoordinator;", "createSingleProcessCoordinator", "(Lvh/c0;)Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.i().toString());
    }
}
