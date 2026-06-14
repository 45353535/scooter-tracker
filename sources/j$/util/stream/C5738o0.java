package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5738o0 extends AbstractC5752r0 implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC5757s0 f85323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f85324d;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5738o0(EnumC5757s0 enumC5757s0, IntPredicate intPredicate) {
        super(enumC5757s0);
        this.f85323c = enumC5757s0;
        this.f85324d = intPredicate;
    }

    @Override // j$.util.stream.AbstractC5752r0, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        if (this.f85349a) {
            return;
        }
        boolean zTest = this.f85324d.test(i10);
        EnumC5757s0 enumC5757s0 = this.f85323c;
        if (zTest == enumC5757s0.f85355a) {
            this.f85349a = true;
            this.f85350b = enumC5757s0.f85356b;
        }
    }
}
