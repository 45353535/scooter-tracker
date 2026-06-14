package ng;

import jg.e0;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f96130a = new e0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f96131b = new e0("ALREADY_LOCKED_BY_OWNER");

    public static final Mutex a(boolean z10) {
        return new e(z10);
    }

    public static /* synthetic */ Mutex b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
