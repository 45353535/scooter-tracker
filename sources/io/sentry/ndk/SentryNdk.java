package io.sentry.ndk;

import com.taurusx.tax.y.z.w.s;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ApiStatus.Internal
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(@NotNull NdkOptions ndkOptions) {
        loadNativeLibraries();
        initSentryNative(ndkOptions);
    }

    private static native void initSentryNative(@NotNull NdkOptions ndkOptions);

    public static synchronized void loadNativeLibraries() {
        if (!nativeLibrariesLoaded) {
            System.loadLibrary(s.z.f67719y);
            System.loadLibrary("sentry");
            System.loadLibrary("sentry-android");
            nativeLibrariesLoaded = true;
        }
    }

    private static native void shutdown();
}
