package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class R3 extends AbstractC5700g2 implements X3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S3 f85134b;

    @Override // j$.util.stream.X3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s32, InterfaceC5725l2 interfaceC5725l2, boolean z10) {
        super(interfaceC5725l2);
        this.f85134b = s32;
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        this.f85134b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j10);
        throw null;
    }
}
