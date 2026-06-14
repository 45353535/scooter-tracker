package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerParams;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 implements u2, t2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile l2 f61638g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i2 f61639a = new i2(h2.f61554a, new z2() { // from class: com.my.tracker.obfuscated.i6
        @Override // com.my.tracker.obfuscated.z2
        public final void a(Object obj, Object obj2, Object obj3) {
            this.f61591a.b((q2) obj, (Boolean) obj2, (b3) obj3);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y2 f61640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f61641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    o2 f61642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    m2 f61643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    k2 f61644f;

    private l2() {
    }

    static l2 c() {
        l2 l2Var;
        l2 l2Var2 = f61638g;
        if (l2Var2 != null) {
            return l2Var2;
        }
        synchronized (l2.class) {
            try {
                l2Var = f61638g;
                if (l2Var == null) {
                    l2Var = new l2();
                    f61638g = l2Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l2Var;
    }

    public static t2 d() {
        return c();
    }

    public static u2 e() {
        return c();
    }

    @Override // com.my.tracker.obfuscated.t2
    public synchronized void b() {
        x2.a("TimeSpentModule: onAppGoingBackground");
        if (this.f61642d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f61639a.d();
        }
    }

    @Override // com.my.tracker.obfuscated.t2
    public void a(y2 y2Var, Context context) {
        p2 p2VarA = p2.a(700, y2Var, context);
        this.f61642d = p2VarA;
        this.f61643e = m2.a(10, y2Var, p2VarA);
        final i2 i2Var = this.f61639a;
        Objects.requireNonNull(i2Var);
        s sVar = new s() { // from class: com.my.tracker.obfuscated.e6
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                i2Var.a((Boolean) obj);
            }
        };
        final i2 i2Var2 = this.f61639a;
        Objects.requireNonNull(i2Var2);
        y2Var.a(sVar, new s() { // from class: com.my.tracker.obfuscated.f6
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                i2Var2.b((Boolean) obj);
            }
        });
        MyTrackerParams myTrackerParamsM = y2Var.m();
        final i2 i2Var3 = this.f61639a;
        Objects.requireNonNull(i2Var3);
        s sVar2 = new s() { // from class: com.my.tracker.obfuscated.g6
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                i2Var3.b((b3) obj);
            }
        };
        final i2 i2Var4 = this.f61639a;
        Objects.requireNonNull(i2Var4);
        myTrackerParamsM.a(sVar2, new s() { // from class: com.my.tracker.obfuscated.h6
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                i2Var4.a((b3) obj);
            }
        });
        this.f61639a.a();
        this.f61644f = new k2();
        this.f61641c = context;
        this.f61640b = y2Var;
        x2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void b(int i10, boolean z10) {
        x2.a("TimeSpentModule: stopTimeSpent id = " + i10 + ", canUseInBackground = " + z10);
        if (this.f61642d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i10 + ")");
            return;
        }
        this.f61639a.b(i10, z10);
    }

    void b(final q2 q2Var, final Boolean bool, final b3 b3Var) {
        x2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.f61642d == null) {
            x2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
            return;
        }
        if (this.f61644f == null) {
            x2.a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.f61640b == null) {
            x2.a("TimeSpentModule: config is not specified, drop");
        } else {
            m.d(new Runnable() { // from class: com.my.tracker.obfuscated.j6
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f61612b.a(q2Var, bool, b3Var);
                }
            });
        }
    }

    @Override // com.my.tracker.obfuscated.t2
    public synchronized void a() {
        x2.a("TimeSpentModule: onAppGoingForeground");
        if (this.f61642d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f61639a.e();
        }
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void a(int i10, boolean z10) {
        x2.a("TimeSpentModule: startTimeSpent id = " + i10 + ", canUseInBackground = " + z10);
        if (this.f61642d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i10 + ")");
            return;
        }
        this.f61639a.a(i10, z10);
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void a(int i10) {
        x2.a("TimeSpentModule: incrementEventTimeSpent id = " + i10);
        if (this.f61642d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i10 + ")");
            return;
        }
        this.f61639a.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q2 q2Var, Boolean bool, b3 b3Var) throws Throwable {
        if (!r2.a(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!r2.c(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.f61642d.a(q2Var.c(), this.f61644f.a(bool.booleanValue(), this.f61640b.o(), b3Var, q2Var, this.f61640b.h(), this.f61640b.n(), this.f61641c));
            x2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.f61643e.c();
        } catch (Exception unused) {
            x2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }
}
