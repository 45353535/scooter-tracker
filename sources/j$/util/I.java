package j$.util;

import j$.util.function.IntConsumer$CC;
import j$.util.stream.InterfaceC5725l2;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f84791b;

    public /* synthetic */ I(Consumer consumer, int i10) {
        this.f84790a = i10;
        this.f84791b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.f84790a) {
            case 0:
                this.f84791b.accept(Integer.valueOf(i10));
                break;
            default:
                ((InterfaceC5725l2) this.f84791b).accept(i10);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f84790a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
