package androidx.datastore.core;

import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"createMultiProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", C4240b4.i.f42616b, "Ljava/io/File;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinatorKt {
    @NotNull
    public static final InterProcessCoordinator createMultiProcessCoordinator(@NotNull CoroutineContext context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
