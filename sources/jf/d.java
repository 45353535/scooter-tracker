package jf;

import jf.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements e, AutoCloseable {
    @Override // jf.e
    public void O(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e.a.a(this);
    }

    @Override // jf.e
    public void dispose() {
    }
}
