package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4981b5 extends AbstractC4955a5 {
    public C4981b5(@NotNull C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4955a5
    public final boolean b(int i10) {
        return i10 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4955a5
    public final void c() {
        C4991bf c4991bf = this.f76794a.f77064c;
        try {
            Zk zk = new Zk(c4991bf, H2.f75840g);
            Long lA = zk.f76769c.a(Zk.f76761d);
            if (lA != null) {
                zk.a(Zk.f76761d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = zk.f76769c.a(Zk.f76762e);
            if (lA2 != null) {
                zk.a(Zk.f76762e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Zk zk2 = new Zk(c4991bf, "foreground");
            Long lA3 = zk2.f76769c.a(Zk.f76761d);
            if (lA3 != null) {
                zk2.a(Zk.f76761d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = zk2.f76769c.a(Zk.f76762e);
            if (lA4 != null) {
                zk2.a(Zk.f76762e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
