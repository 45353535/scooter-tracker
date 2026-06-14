package io.appmetrica.analytics.gpllibrary.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* JADX INFO: loaded from: classes12.dex */
public interface IGplLibraryWrapper {
    void startLocationUpdates(@NonNull GplLibraryWrapper.Priority priority) throws Throwable;

    void stopLocationUpdates() throws Throwable;

    void updateLastKnownLocation() throws Throwable;
}
