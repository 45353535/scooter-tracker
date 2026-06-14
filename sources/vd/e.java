package vd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f106497a;

    public e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f106497a = throwable;
    }

    public final Throwable a() {
        return this.f106497a;
    }

    public String toString() {
        return this.f106497a.toString();
    }
}
