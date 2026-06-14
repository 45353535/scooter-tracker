package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface Function<I, O> {
    @Nullable
    O apply(@NonNull I i10);
}
