package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f19955a = new n();

    public interface a {
        void a(String str);
    }

    public static final class b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f19956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f19957b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f19956a = installReferrerClient;
            this.f19957b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (e3.a.d(this)) {
                return;
            }
            try {
                if (i10 == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f19956a.getInstallReferrer();
                        Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      …rer\n                    }");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (StringsKt.g0(installReferrer2, "fb", false, 2, null) || StringsKt.g0(installReferrer2, "facebook", false, 2, null))) {
                            this.f19957b.a(installReferrer2);
                        }
                        n.f19955a.e();
                    } catch (RemoteException | Exception unused) {
                        return;
                    }
                } else if (i10 == 2) {
                    n.f19955a.e();
                }
                this.f19956a.endConnection();
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
    }

    private n() {
    }

    private final boolean b() {
        return com.facebook.s.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(com.facebook.s.m()).build();
        try {
            installReferrerClientBuild.startConnection(new b(installReferrerClientBuild, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        n nVar = f19955a;
        if (nVar.b()) {
            return;
        }
        nVar.c(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        com.facebook.s.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
