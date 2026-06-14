package io.sentry.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeScope implements a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeSetTrace(String str, String str2);

    @Override // io.sentry.ndk.a
    public void a(String str, String str2) {
        nativeSetTrace(str, str2);
    }

    @Override // io.sentry.ndk.a
    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }
}
