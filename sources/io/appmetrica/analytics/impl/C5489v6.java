package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5489v6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5581yn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C5581yn(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
