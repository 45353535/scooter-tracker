package te;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final se.c f105168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f105169b;

    public e(se.c response, Throwable cause) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f105168a = response;
        this.f105169b = cause;
    }
}
