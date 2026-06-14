package bf;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6404a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "current");

    @NotNull
    private volatile /* synthetic */ Object current = MapsKt.emptyMap();

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Map) this.current).get(key);
    }
}
