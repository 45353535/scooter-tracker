package com.moloco.sdk.internal.utils;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements CoroutineContext.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mutex f55778b;

    public f(Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f55778b = mutex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f55778b, ((f) obj).f55778b);
    }

    public int hashCode() {
        return this.f55778b.hashCode();
    }

    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f55778b + ')';
    }
}
