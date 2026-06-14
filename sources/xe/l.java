package xe;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
