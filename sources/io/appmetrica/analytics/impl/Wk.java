package io.appmetrica.analytics.impl;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class Wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f76639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f76640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5033d5 f76641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC5104g f76642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC5104g f76643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ik f76644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f76645g = 0;

    public Wk(C5058e5 c5058e5, Vk vk, C5033d5 c5033d5, C5319oa c5319oa, H2 h22) {
        this.f76639a = c5058e5;
        this.f76641c = c5033d5;
        this.f76642d = c5319oa;
        this.f76643e = h22;
        this.f76640b = vk;
    }

    public final synchronized long a() {
        Ik ik;
        ik = this.f76644f;
        return ik == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : ik.f75955d - 1;
    }

    public final void b(Ik ik, W5 w52) {
        if (ik.f75958g && ik.f75955d > 0) {
            C5033d5 c5033d5 = this.f76641c;
            W5 w5A = W5.a(w52, EnumC5168ib.EVENT_TYPE_ALIVE);
            Yk yk = new Yk();
            yk.f76719a = ik.f75955d;
            yk.f76722d = ik.f75954c.f76086a;
            long andIncrement = ik.f75957f.getAndIncrement();
            Zk zk = ik.f75953b;
            zk.a(Zk.f76764g, Long.valueOf(ik.f75957f.get()));
            zk.b();
            yk.f76720b = andIncrement;
            yk.f76721c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ik.f75960i - ik.f75956e, ik.f75961j));
            c5033d5.f77003a.f77075n.a(w5A, yk);
            if (ik.f75958g) {
                ik.f75958g = false;
                Zk zk2 = ik.f75953b;
                zk2.a(Zk.f76766i, Boolean.FALSE);
                zk2.b();
            }
        }
        PublicLogger publicLogger = this.f76639a.f77074m;
        int iOrdinal = ik.f75954c.f76086a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ik) {
            Zk zk3 = ik.f75953b;
            zk3.getClass();
            zk3.f76769c = new C5270mb();
            zk3.b();
            ik.f75959h = null;
        }
    }

    public final synchronized void c(W5 w52) {
        try {
            if (this.f76645g == 0) {
                Ik ikB = this.f76642d.b();
                if (a(ikB, w52)) {
                    this.f76644f = ikB;
                    this.f76645g = 3;
                } else {
                    Ik ikB2 = this.f76643e.b();
                    if (a(ikB2, w52)) {
                        this.f76644f = ikB2;
                        this.f76645g = 2;
                    } else {
                        this.f76644f = null;
                        this.f76645g = 1;
                    }
                }
            }
            int iA = Q7.a(this.f76645g);
            if (iA == 0) {
                this.f76644f = a(w52);
            } else if (iA == 1) {
                b(this.f76644f, w52);
                this.f76644f = a(w52);
            } else if (iA == 2) {
                if (a(this.f76644f, w52)) {
                    Ik ik = this.f76644f;
                    long j10 = w52.f76622i;
                    ik.f75960i = j10;
                    Zk zk = ik.f75953b;
                    zk.a(Zk.f76761d, Long.valueOf(j10));
                    zk.b();
                } else {
                    this.f76644f = a(w52);
                }
            }
        } finally {
        }
    }

    public final Ik a(W5 w52) {
        this.f76639a.f77074m.info("Start foreground session", new Object[0]);
        long j10 = w52.f76622i;
        AbstractC5104g abstractC5104g = this.f76642d;
        Jk jk = new Jk(j10, w52.f76623j);
        abstractC5104g.getClass();
        Ik ikA = abstractC5104g.a(jk);
        this.f76645g = 3;
        ((C5388r5) this.f76639a.f77077p).e();
        C5033d5 c5033d5 = this.f76641c;
        c5033d5.f77003a.f77075n.a(W5.a(w52, C5468ua.H.i()), a(ikA, j10));
        return ikA;
    }

    public static Yk a(Ik ik, long j10) {
        Yk yk = new Yk();
        yk.f76719a = ik.f75955d;
        long andIncrement = ik.f75957f.getAndIncrement();
        Zk zk = ik.f75953b;
        zk.a(Zk.f76764g, Long.valueOf(ik.f75957f.get()));
        zk.b();
        yk.f76720b = andIncrement;
        Zk zk2 = ik.f75953b;
        long j11 = j10 - ik.f75956e;
        ik.f75961j = j11;
        zk2.a(Zk.f76762e, Long.valueOf(j11));
        yk.f76721c = TimeUnit.MILLISECONDS.toSeconds(ik.f75961j);
        yk.f76722d = ik.f75954c.f76086a;
        return yk;
    }

    public final synchronized Ik b(W5 w52) {
        try {
            if (this.f76645g == 0) {
                Ik ikB = this.f76642d.b();
                if (a(ikB, w52)) {
                    this.f76644f = ikB;
                    this.f76645g = 3;
                } else {
                    Ik ikB2 = this.f76643e.b();
                    if (a(ikB2, w52)) {
                        this.f76644f = ikB2;
                        this.f76645g = 2;
                    } else {
                        this.f76644f = null;
                        this.f76645g = 1;
                    }
                }
            }
            if (this.f76645g != 1 && !a(this.f76644f, w52)) {
                this.f76645g = 1;
                this.f76644f = null;
            }
            int iA = Q7.a(this.f76645g);
            if (iA == 1) {
                Ik ik = this.f76644f;
                long j10 = w52.f76622i;
                ik.f75960i = j10;
                Zk zk = ik.f75953b;
                zk.a(Zk.f76761d, Long.valueOf(j10));
                zk.b();
                return this.f76644f;
            }
            if (iA != 2) {
                this.f76639a.f77074m.info("Start background session", new Object[0]);
                this.f76645g = 2;
                long j11 = w52.f76622i;
                AbstractC5104g abstractC5104g = this.f76643e;
                Jk jk = new Jk(j11, w52.f76623j);
                abstractC5104g.getClass();
                Ik ikA = abstractC5104g.a(jk);
                if (this.f76639a.f77081t.c()) {
                    C5033d5 c5033d5 = this.f76641c;
                    c5033d5.f77003a.f77075n.a(W5.a(w52, C5468ua.H.i()), a(ikA, w52.f76622i));
                } else {
                    int i10 = w52.f76617d;
                    EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
                    if (i10 == 6145) {
                        C5033d5 c5033d52 = this.f76641c;
                        c5033d52.f77003a.f77075n.a(w52, a(ikA, j11));
                        C5033d5 c5033d53 = this.f76641c;
                        c5033d53.f77003a.f77075n.a(W5.a(w52, C5468ua.H.i()), a(ikA, j11));
                    }
                }
                this.f76644f = ikA;
                return ikA;
            }
            return this.f76644f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(io.appmetrica.analytics.impl.Ik r17, io.appmetrica.analytics.impl.W5 r18) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Wk.a(io.appmetrica.analytics.impl.Ik, io.appmetrica.analytics.impl.W5):boolean");
    }
}
