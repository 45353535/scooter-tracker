package io.sentry.transport;

import io.sentry.i0;
import io.sentry.u5;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements io.sentry.cache.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t f84245b = new t();

    public static t e() {
        return f84245b;
    }

    @Override // io.sentry.cache.g
    public void d(u5 u5Var) {
    }

    @Override // io.sentry.cache.g
    public boolean h(u5 u5Var, i0 i0Var) {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.emptyIterator();
    }
}
