package androidx.datastore.core;

import androidx.annotation.RestrictTo;
import com.ironsource.V5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", V5.c.f41893c, "", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InterProcessCoordinatorKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
