package pg;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final j a(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new f(inputStream);
    }

    public static final boolean b(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.g0(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
