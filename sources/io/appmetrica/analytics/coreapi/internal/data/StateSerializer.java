package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public interface StateSerializer<T> {
    @NonNull
    T defaultValue();

    @NonNull
    byte[] toByteArray(@NonNull T t10);

    @NonNull
    T toState(@NonNull byte[] bArr) throws IOException;
}
