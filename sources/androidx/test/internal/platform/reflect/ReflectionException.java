package androidx.test.internal.platform.reflect;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReflectionException extends Exception {
    ReflectionException(Exception exc) {
        super("Reflection access failed", exc);
    }
}
