package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(@NonNull I i10);

    @NonNull
    O mergeFrom(@NonNull I i10);
}
