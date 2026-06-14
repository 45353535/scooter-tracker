package ph;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f98549b = errorCode;
    }
}
