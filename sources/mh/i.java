package mh;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IOException f95004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f95005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f95004b = firstConnectException;
        this.f95005c = firstConnectException;
    }

    public final void a(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        lf.c.a(this.f95004b, e10);
        this.f95005c = e10;
    }

    public final IOException d() {
        return this.f95004b;
    }

    public final IOException g() {
        return this.f95005c;
    }
}
