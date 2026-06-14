package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TensorFlowLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[][] f97932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Throwable f97933c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean[] f97935e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f97931a = Logger.getLogger(TensorFlowLite.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f97934d = false;

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f97932b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    f97931a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e10) {
                    f97931a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e10;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e10);
                    }
                }
            }
        }
        f97933c = unsatisfiedLinkError;
        f97935e = new AtomicBoolean[d.a.EnumC1156a.values().length];
        for (int i10 = 0; i10 < d.a.EnumC1156a.values().length; i10++) {
            f97935e[i10] = new AtomicBoolean();
        }
    }

    public static void a() {
        if (f97934d) {
            return;
        }
        try {
            nativeDoNothing();
            f97934d = true;
        } catch (UnsatisfiedLinkError e10) {
            Throwable th2 = f97933c;
            if (th2 == null) {
                th2 = e10;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th2);
            unsatisfiedLinkError.initCause(e10);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();
}
