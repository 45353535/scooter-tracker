package androidx.test.platform.ui;

import androidx.test.platform.TestFrameworkException;

/* JADX INFO: loaded from: classes5.dex */
public class InjectEventSecurityException extends Exception implements TestFrameworkException {
    public InjectEventSecurityException(String str) {
        super(str);
    }

    public InjectEventSecurityException(Throwable th2) {
        super(th2);
    }

    public InjectEventSecurityException(String str, Throwable th2) {
        super(str, th2);
    }
}
