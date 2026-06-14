package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int f61758f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile p0 f61759g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e0 f61760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f61761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f61762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InstallReferrerClient f61763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f61764e;

    final class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            x2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + p0.this.f61764e);
            p0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            x2.a("ReferrerHandler: install referrer setup is finished");
            if (i10 == -1) {
                p0.this.a(this);
            } else {
                p0.this.a(i10);
            }
        }
    }

    p0(e0 e0Var, n nVar, Context context) {
        this.f61760a = e0Var;
        this.f61761b = nVar;
        this.f61762c = context.getApplicationContext();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (f61759g != null) {
            return;
        }
        synchronized (p0.class) {
            try {
                if (f61759g != null) {
                    return;
                }
                final p0 p0Var = new p0(e0Var, nVar, context);
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.w6
                    @Override // java.lang.Runnable
                    public final void run() {
                        p0.a(this.f61892b);
                    }
                });
                f61759g = p0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            x2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.f61763d = InstallReferrerClient.newBuilder(this.f61762c).build();
            a(new a());
        } catch (Throwable th2) {
            x2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th2);
        }
    }

    void b() {
        p1 p1VarA = p1.a(this.f61762c);
        if (p1VarA.r()) {
            return;
        }
        String strM = p1VarA.m();
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        a(strM, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p0 p0Var) {
        p0Var.b();
        p0Var.a();
    }

    public static void a(String str, Context context, Runnable runnable) {
        p0 p0Var = f61759g;
        if (p0Var == null) {
            p1 p1VarA = p1.a(context);
            if (!p1VarA.r()) {
                p1VarA.l(str);
            }
            runnable.run();
            return;
        }
        p0Var.a(str, runnable);
    }

    void a() {
        if (p1.a(this.f61762c).o()) {
            return;
        }
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.x6
            @Override // java.lang.Runnable
            public final void run() {
                this.f61906b.c();
            }
        });
    }

    void a(int i10) {
        if (this.f61763d == null) {
            x2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i10 == 0) {
                x2.a("ReferrerHandler: retrieving install referrer");
                final ReferrerDetails installReferrer = this.f61763d.getInstallReferrer();
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.v6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61869b.b(installReferrer);
                    }
                });
            } else {
                x2.a("ReferrerHandler: InstallReferrerResponse code: " + i10);
            }
        } catch (Throwable th2) {
            x2.b("ReferrerHandler: error occurred while retrieving install referrer", th2);
        }
        try {
            this.f61763d.endConnection();
        } catch (Throwable unused) {
        }
        this.f61763d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f61763d;
        if (installReferrerClient == null) {
            x2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i10 = this.f61764e;
        if (i10 >= f61758f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f61763d = null;
            return;
        }
        this.f61764e = i10 + 1;
        try {
            x2.a("ReferrerHandler: connect to referrer client");
            this.f61763d.startConnection(installReferrerStateListener);
        } catch (Throwable th2) {
            x2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th2);
            a(installReferrerStateListener);
        }
    }

    void a(String str, Runnable runnable) {
        p1 p1VarA = p1.a(this.f61762c);
        if (p1VarA.r()) {
            x2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f61760a.a(str, t.b(this.f61762c), runnable);
        this.f61761b.a(str);
        p1VarA.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        p1 p1VarA = p1.a(this.f61762c);
        if (p1VarA.o()) {
            x2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f61760a.a(installReferrer, t.b(this.f61762c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f61761b.a(installReferrer);
        p1VarA.s();
    }
}
