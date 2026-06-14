package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 extends W1 {
    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f85159b);
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85159b += ((W1) q12).f85159b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f85159b++;
    }
}
