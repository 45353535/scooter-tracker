package f1;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class e7 implements x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8 f69709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7 f69710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f69711c;

    public e7(p8 storage, c7 notifier, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f69709a = storage;
        this.f69710b = notifier;
        this.f69711c = ioDispatcher;
    }
}
