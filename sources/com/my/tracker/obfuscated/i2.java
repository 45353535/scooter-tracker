package com.my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final z2 f61573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w2 f61574b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f61580h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected b3 f61581i = b3.f61279j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f61575c = b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j0 f61576d = new j0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c f61577e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final x f61578f = new x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final i f61579g = new i();

    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f61582a = {0};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f61583b = {0};

        a() {
        }

        private boolean d(int i10) {
            for (int i11 : this.f61583b) {
                if (i10 == i11) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i10 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i10) {
            for (int i11 : this.f61582a) {
                if (i10 == i11) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i10 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        boolean a(int i10) {
            if (e(i10)) {
                return false;
            }
            if (i2.this.f61577e.b(i10)) {
                x2.c("TimeSpent: you can't create timespent with id = " + i10 + " (reason: already have same type timespent with this id)");
                return false;
            }
            if (!i2.this.f61576d.b(i10) && !i2.this.f61578f.a(i10)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i10 + " (reason: already have another type timespent with this id)");
            return false;
        }

        boolean b(int i10) {
            if (e(i10)) {
                return false;
            }
            if (i2.this.f61576d.b(i10)) {
                x2.c("TimeSpent: you can't create timespent with id = " + i10 + " (reason: already have same type timespent with this id)");
                return false;
            }
            if (!i2.this.f61577e.b(i10) && !i2.this.f61578f.a(i10)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i10 + " (reason: already have another type timespent with this id)");
            return false;
        }

        boolean c(int i10) {
            if (d(i10)) {
                return false;
            }
            if (!i2.this.f61576d.b(i10) && !i2.this.f61577e.b(i10)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i10 + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public i2(long j10, z2 z2Var) {
        this.f61573a = z2Var;
        this.f61574b = w2.a(j10, new Runnable() { // from class: com.my.tracker.obfuscated.t5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61842b.f();
            }
        });
        x2.a("TimeSpentCore: created");
    }

    public void a(Boolean bool) {
        this.f61580h = bool.booleanValue();
    }

    public void b(b3 b3Var) {
        this.f61581i = b3Var;
    }

    public void d() {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.s5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61830b.c(jUptimeMillis);
            }
        });
    }

    public void e() {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.b6
            @Override // java.lang.Runnable
            public final void run() {
                this.f61292b.d(jUptimeMillis);
            }
        });
    }

    public void a() {
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.v5
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f61868b.c();
            }
        });
    }

    public void b(final Boolean bool) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.u5
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f61851b.a(bool, jUptimeMillis, jCurrentTimeMillis);
            }
        });
    }

    public void f() {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.d6
            @Override // java.lang.Runnable
            public final void run() {
                this.f61447b.b(jUptimeMillis, jCurrentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, long j10, long j11) throws Throwable {
        i2 i2Var;
        boolean zBooleanValue = bool.booleanValue();
        boolean z10 = this.f61580h;
        if (zBooleanValue != z10) {
            i2Var = this;
            i2Var.a(j10, j11, z10, this.f61581i);
        } else {
            i2Var = this;
        }
        i2Var.f61580h = bool.booleanValue();
    }

    synchronized void c() throws Throwable {
        try {
            try {
                x2.a("TimeSpentCore: ***** start generating zero tick *****");
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f61578f.b(0);
                b(jUptimeMillis, jCurrentTimeMillis, this.f61580h, this.f61581i);
                x2.a("TimeSpentCore: ***** zero tick generated *****");
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void h(long j10, int i10) {
        try {
            this.f61576d.b(i10, j10, this.f61579g.c());
        } catch (Exception unused) {
        }
    }

    public void b(final int i10, boolean z10) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (z10) {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.x5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61903b.g(jUptimeMillis, i10);
                }
            });
        } else {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.y5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61955b.h(jUptimeMillis, i10);
                }
            });
        }
    }

    public void a(final b3 b3Var) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.c6
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f61388b.a(b3Var, jUptimeMillis, jCurrentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j10, long j11) {
        b(j10, j11, this.f61580h, this.f61581i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var, long j10, long j11) throws Throwable {
        i2 i2Var;
        if (l.a(this.f61581i.f61286g, b3Var.f61286g) != 0) {
            i2Var = this;
            i2Var.a(j10, j11, this.f61580h, this.f61581i);
        } else {
            i2Var = this;
        }
        i2Var.f61581i = b3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void d(long j10) {
        x2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.f61579g.c()) {
            x2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.f61576d.e(j10);
        this.f61577e.e(j10);
        this.f61579g.e(j10);
        this.f61579g.d();
        this.f61576d.c(j10);
        this.f61577e.c(j10);
        this.f61579g.c(j10);
        if (this.f61574b.b()) {
            x2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.f61574b.e();
        }
        x2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void g(long j10, int i10) {
        try {
            this.f61577e.b(i10, j10, this.f61579g.c());
            if (this.f61579g.b() && this.f61577e.b() == 0) {
                this.f61579g.g(j10);
                x2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    public void a(final int i10, boolean z10) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (z10) {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.z5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61996b.e(jUptimeMillis, i10);
                }
            });
        } else {
            m.c(new Runnable() { // from class: com.my.tracker.obfuscated.a6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61273b.f(jUptimeMillis, i10);
                }
            });
        }
    }

    public void a(final int i10) {
        m.c(new Runnable() { // from class: com.my.tracker.obfuscated.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61890b.c(i10);
            }
        });
    }

    synchronized void a(long j10, long j11, boolean z10, b3 b3Var) throws Throwable {
        try {
            this.f61574b.d();
            b(j10, j11, z10, b3Var);
        } catch (Throwable th2) {
            th = th2;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void c(long j10) {
        x2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.f61579g.b()) {
            x2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.f61576d.d(j10);
        this.f61577e.d(j10);
        this.f61579g.d(j10);
        this.f61579g.a(this.f61577e.b());
        this.f61576d.b(j10);
        this.f61577e.b(j10);
        this.f61579g.b(j10);
        x2.a("TimeSpentCore: ***** app is on background *****");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void f(long j10, int i10) {
        if (this.f61575c.b(i10)) {
            this.f61576d.a(i10, j10, this.f61579g.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void c(int i10) {
        if (this.f61575c.c(i10)) {
            this.f61578f.b(i10);
            if (this.f61574b.b()) {
                x2.a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.f61574b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void e(long j10, int i10) {
        if (this.f61575c.a(i10)) {
            this.f61577e.a(i10, j10, this.f61579g.c());
            if (this.f61579g.b() && this.f61577e.b() == 1) {
                this.f61579g.h(j10);
                x2.a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.f61574b.e();
                x2.a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    synchronized void b(long j10, long j11, boolean z10, b3 b3Var) {
        try {
            x2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j11);
            if (this.f61579g.b() && this.f61577e.b() == 0 && this.f61574b.a()) {
                x2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.f61574b.f();
            }
            q2 q2VarA = a(j10, j11);
            x2.a("TimeSpentCore: ***** onTick finished *****");
            this.f61573a.a(q2VarA, Boolean.valueOf(z10), b3Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized q2 a(long j10, long j11) {
        x2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j11);
        boolean zC = this.f61579g.c();
        ArrayList arrayListA = this.f61578f.a();
        ArrayList arrayListA2 = this.f61577e.a(j10, zC);
        ArrayList arrayListA3 = this.f61576d.a(j10, zC);
        e2 e2VarA = this.f61579g.a(j10);
        ArrayList arrayList = new ArrayList(arrayListA2.size() + arrayListA3.size());
        arrayList.addAll(arrayListA2);
        arrayList.addAll(arrayListA3);
        q2 q2Var = new q2(j11, e2VarA, (e2[]) arrayList.toArray(new e2[0]), (v[]) arrayListA.toArray(new v[0]));
        if (!x2.a()) {
            return q2Var;
        }
        x2.a("TimeSpentCore: collected DTO data:\n" + q2Var);
        return q2Var;
    }

    a b() {
        return new a();
    }
}
