package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int f61857f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile v0 f61858g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e0 f61859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f61860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f61861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InstallReferrerClient f61862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f61863e;

    final class a implements InstallReferrerStateListener {
        a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            x2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + v0.this.f61863e);
            v0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i10) {
            if (i10 == -1) {
                v0.this.a(this);
            } else {
                x2.a("HuaweiReferrerHandler: install referrer setup is finished");
                v0.this.a(i10);
            }
        }
    }

    v0(e0 e0Var, n nVar, Context context) {
        this.f61859a = e0Var;
        this.f61860b = nVar;
        this.f61861c = context.getApplicationContext();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (f61858g != null) {
            return;
        }
        synchronized (v0.class) {
            try {
                if (f61858g != null) {
                    return;
                }
                final v0 v0Var = new v0(e0Var, nVar, context);
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.a7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61276b.a();
                    }
                });
                f61858g = v0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(int i10) {
        if (this.f61862d == null) {
            x2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i10 == 0) {
                x2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.f61862d.getInstallReferrer());
            } else {
                x2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i10);
            }
        } catch (Throwable th2) {
            x2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th2);
        }
        try {
            this.f61862d.endConnection();
        } catch (Throwable unused) {
        }
        this.f61862d = null;
    }

    void a() {
        if (p1.a(this.f61861c).p()) {
            return;
        }
        try {
            x2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.f61862d = InstallReferrerClient.newBuilder(this.f61861c).build();
            a(new a());
        } catch (Throwable th2) {
            x2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th2);
        }
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f61862d == null) {
            x2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i10 = this.f61863e;
        if (i10 >= f61857f) {
            x2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f61862d.endConnection();
            } catch (Throwable unused) {
            }
            this.f61862d = null;
            return;
        }
        this.f61863e = i10 + 1;
        try {
            x2.a("HuaweiReferrerHandler: connect to referrer client");
            this.f61862d.startConnection(installReferrerStateListener);
        } catch (Throwable th2) {
            x2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th2);
            a(installReferrerStateListener);
        }
    }

    void a(ReferrerDetails referrerDetails) {
        p1 p1VarA = p1.a(this.f61861c);
        if (p1VarA.p()) {
            x2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f61859a.b(installReferrer, t.b(this.f61861c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f61860b.a(installReferrer);
        p1VarA.t();
    }
}
