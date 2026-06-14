package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5148hh extends Wg {
    public C5148hh(@NotNull C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NotNull W5 w52) {
        Ik ikB;
        Yk yk;
        C5392r9 c5392r9 = this.f76636a.f77075n;
        Wk wk = c5392r9.f78129c;
        if (wk.f76645g == 0) {
            ikB = wk.f76642d.b();
            Ik ikB2 = wk.f76643e.b();
            if ((ikB == null ? -1L : ikB.f75955d) <= (ikB2 != null ? ikB2.f75955d : -1L)) {
                ikB = ikB2;
            }
        } else {
            ikB = wk.f76644f;
        }
        if (ikB != null) {
            yk = new Yk();
            yk.f76719a = ikB.f75955d;
            long andIncrement = ikB.f75957f.getAndIncrement();
            Zk zk = ikB.f75953b;
            zk.a(Zk.f76764g, Long.valueOf(ikB.f75957f.get()));
            zk.b();
            yk.f76720b = andIncrement;
            yk.f76721c = TimeUnit.MILLISECONDS.toSeconds(ikB.f75961j);
            yk.f76722d = ikB.f75954c.f76086a;
        } else {
            long j10 = w52.f76623j;
            long jA = wk.f76640b.a();
            S6 s62 = wk.f76639a.f77066e;
            EnumC4971al enumC4971al = EnumC4971al.BACKGROUND;
            s62.a(jA, enumC4971al, j10);
            yk = new Yk();
            yk.f76719a = jA;
            yk.f76722d = enumC4971al;
            yk.f76720b = 0L;
            yk.f76721c = 0L;
        }
        c5392r9.a(w52, yk);
        return false;
    }
}
