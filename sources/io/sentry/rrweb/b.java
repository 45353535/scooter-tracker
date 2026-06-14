package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.c;
import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f84109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f84110c = System.currentTimeMillis();

    public static final class a {
        public boolean a(b bVar, String str, m3 m3Var, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f84109b = (c) w.c((c) m3Var.B(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f84110c = m3Var.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C1014b {
        public void a(b bVar, n3 n3Var, ILogger iLogger) {
            n3Var.e("type").j(iLogger, bVar.f84109b);
            n3Var.e("timestamp").b(bVar.f84110c);
        }
    }

    protected b(c cVar) {
        this.f84109b = cVar;
    }

    public long e() {
        return this.f84110c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f84110c == bVar.f84110c && this.f84109b == bVar.f84109b;
    }

    public void f(long j10) {
        this.f84110c = j10;
    }

    public int hashCode() {
        return w.b(this.f84109b, Long.valueOf(this.f84110c));
    }
}
