package ne;

import java.net.ConnectException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ConnectException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f95840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th2) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f95840b = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f95840b;
    }
}
