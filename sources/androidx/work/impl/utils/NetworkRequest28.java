package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(28)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0002\b\rJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "<init>", "()V", "hasCapability", "", "request", "Landroid/net/NetworkRequest;", "capability", "", "hasCapability$work_runtime_release", "hasTransport", NotificationCompat.CATEGORY_TRANSPORT, "hasTransport$work_runtime_release", "createNetworkRequest", "capabilities", "", "transports", "createNetworkRequestCompat", "Landroidx/work/impl/utils/NetworkRequestCompat;", "createNetworkRequestCompat$work_runtime_release", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkRequest28 {

    @NotNull
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    @NotNull
    public static final NetworkRequest createNetworkRequest(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                Logger.get().warning(NetworkRequestCompat.INSTANCE.getTAG(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int i11 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!ArraysKt.contains(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    Logger.get().warning(NetworkRequestCompat.INSTANCE.getTAG(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    @NotNull
    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        return new NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }

    public final boolean hasCapability$work_runtime_release(@NotNull NetworkRequest request, int capability) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasCapability(capability);
    }

    public final boolean hasTransport$work_runtime_release(@NotNull NetworkRequest request, int transport) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasTransport(transport);
    }
}
