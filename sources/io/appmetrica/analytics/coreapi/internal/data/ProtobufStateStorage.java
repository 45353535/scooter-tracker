package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ProtobufStateStorage<T> {
    void delete();

    @NonNull
    T read();

    void save(@NonNull T t10);
}
