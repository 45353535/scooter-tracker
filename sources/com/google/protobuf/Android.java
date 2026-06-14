package com.google.protobuf;

/* JADX INFO: loaded from: classes9.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");
    private static final boolean IS_ROBOLECTRIC = false;

    private Android() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    static boolean isOnAndroidDevice() {
        return true;
    }
}
