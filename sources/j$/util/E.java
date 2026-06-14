package j$.util;

import j$.util.stream.InterfaceC5725l2;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f84787b;

    public /* synthetic */ E(Consumer consumer, int i10) {
        this.f84786a = i10;
        this.f84787b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f84786a) {
            case 0:
                this.f84787b.accept(Double.valueOf(d10));
                break;
            default:
                ((InterfaceC5725l2) this.f84787b).accept(d10);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f84786a) {
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
