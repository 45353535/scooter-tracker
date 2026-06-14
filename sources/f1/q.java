package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70793c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh.x f70794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f70795b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public q(hh.x okHttpClient, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f70794a = okHttpClient;
        this.f70795b = ioDispatcher;
    }
}
