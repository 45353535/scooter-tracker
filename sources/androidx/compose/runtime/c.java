package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    static {
        MonotonicFrameClock.Key key = MonotonicFrameClock.Key;
    }

    public static CoroutineContext.b a(MonotonicFrameClock monotonicFrameClock) {
        return MonotonicFrameClock.Key;
    }
}
