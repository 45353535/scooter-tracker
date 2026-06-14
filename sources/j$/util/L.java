package j$.util;

import j$.util.stream.InterfaceC5725l2;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L implements LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f84795b;

    public /* synthetic */ L(Consumer consumer, int i10) {
        this.f84794a = i10;
        this.f84795b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        switch (this.f84794a) {
            case 0:
                this.f84795b.accept(Long.valueOf(j10));
                break;
            default:
                ((InterfaceC5725l2) this.f84795b).accept(j10);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f84794a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }
}
