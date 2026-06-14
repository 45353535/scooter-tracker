package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public interface Compressor {
    @Nullable
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    @Nullable
    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
