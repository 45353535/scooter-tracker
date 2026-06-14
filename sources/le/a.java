package le;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f94168b;

    public /* synthetic */ a(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f94168b;
    }

    public a(Throwable th2) {
        super("Client already closed");
        this.f94168b = th2;
    }
}
