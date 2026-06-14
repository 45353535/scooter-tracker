package jg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f85870b;

    public e(CoroutineContext coroutineContext) {
        this.f85870b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f85870b;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
