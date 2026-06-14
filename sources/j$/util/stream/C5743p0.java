package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5743p0 extends AbstractC5752r0 implements InterfaceC5720k2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
    }

    @Override // j$.util.stream.AbstractC5752r0, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        if (this.f85349a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j10);
        throw null;
    }
}
