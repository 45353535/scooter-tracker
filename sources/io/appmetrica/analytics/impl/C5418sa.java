package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5418sa implements BiFunction {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiFunction
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5581yn apply(@NonNull Thread thread, @Nullable StackTraceElement[] stackTraceElementArr) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C5581yn(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread.getState().ordinal()), stackTraceElementArr == null ? null : Arrays.asList(stackTraceElementArr));
    }
}
