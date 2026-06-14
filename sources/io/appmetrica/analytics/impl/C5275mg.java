package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5275mg implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5300ng f77761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5549xg f77762b;

    public C5275mg(C5300ng c5300ng, InterfaceC5549xg interfaceC5549xg) {
        this.f77761a = c5300ng;
        this.f77762b = interfaceC5549xg;
    }

    public static final void a(C5300ng c5300ng, InterfaceC5549xg interfaceC5549xg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c5300ng.f77838b.getInstallReferrer();
                interfaceC5549xg.a(new C5424sg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC5399rg.f78153c));
                installReferrerClient = c5300ng.f77838b;
            } catch (Throwable th2) {
                try {
                    interfaceC5549xg.a(th2);
                    installReferrerClient = c5300ng.f77838b;
                } finally {
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (i10 == 0) {
            final C5300ng c5300ng = this.f77761a;
            ICommonExecutor iCommonExecutor = c5300ng.f77837a;
            final InterfaceC5549xg interfaceC5549xg = this.f77762b;
            iCommonExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.nq
                @Override // java.lang.Runnable
                public final void run() {
                    C5275mg.a(c5300ng, interfaceC5549xg);
                }
            });
            return;
        }
        this.f77761a.a(this.f77762b, new IllegalStateException("Referrer check failed with error " + i10));
    }
}
