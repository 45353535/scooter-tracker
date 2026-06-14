package jg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements CoroutineContext.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal f85899b;

    public n0(ThreadLocal threadLocal) {
        this.f85899b = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.areEqual(this.f85899b, ((n0) obj).f85899b);
    }

    public int hashCode() {
        return this.f85899b.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f85899b + ')';
    }
}
