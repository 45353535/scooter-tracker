package eg;

/* JADX INFO: loaded from: classes3.dex */
final class q0 implements kotlinx.coroutines.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f69165b;

    public q0(p0 p0Var) {
        this.f69165b = p0Var;
    }

    @Override // kotlinx.coroutines.d
    public void a(Throwable th2) {
        this.f69165b.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f69165b + ']';
    }
}
