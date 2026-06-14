package je;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85824b;

    public a(b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f85824b = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f85824b;
    }
}
