package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5639b extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    m a();

    @Override // j$.time.temporal.m
    InterfaceC5639b d(long j10, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    InterfaceC5639b e(long j10, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.n
    boolean f(j$.time.temporal.q qVar);

    int hashCode();

    String toString();

    long u();

    InterfaceC5642e v(j$.time.j jVar);

    /* JADX INFO: renamed from: z */
    int compareTo(InterfaceC5639b interfaceC5639b);
}
