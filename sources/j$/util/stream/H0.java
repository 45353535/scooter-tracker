package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f85040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0 f85041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85042c;

    @Override // j$.util.stream.F0
    public final int q() {
        return 2;
    }

    public H0(F0 f02, F0 f03) {
        this.f85040a = f02;
        this.f85041b = f03;
        this.f85042c = f03.count() + f02.count();
    }

    @Override // j$.util.stream.F0
    public final F0 b(int i10) {
        if (i10 == 0) {
            return this.f85040a;
        }
        if (i10 == 1) {
            return this.f85041b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85042c;
    }

    @Override // j$.util.stream.F0
    public /* bridge */ /* synthetic */ E0 b(int i10) {
        return (E0) b(i10);
    }
}
