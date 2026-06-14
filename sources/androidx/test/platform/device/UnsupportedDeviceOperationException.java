package androidx.test.platform.device;

import androidx.test.platform.TestFrameworkException;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedDeviceOperationException extends RuntimeException implements TestFrameworkException {
    public UnsupportedDeviceOperationException(String str) {
        super(str);
    }

    public UnsupportedDeviceOperationException(String str, Throwable th2) {
        super(str, th2);
    }
}
