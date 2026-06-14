package jg;

import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final CoroutineDispatcher b(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new w(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
