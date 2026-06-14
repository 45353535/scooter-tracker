package com.applovin.impl;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.d6;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class c6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8504g;

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f8504g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f8504g.D().a("license_validation", exc);
        }
        this.f8504g.q0().a(new s6(this.f8504g, p2Var, exc));
    }

    private void g() {
        String str;
        boolean zC = this.f8504g.o0().c();
        Map mapP = this.f8504g.A().p();
        Map mapM = this.f8504g.A().M();
        String strA = zC ? this.f8504g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8504g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f8504g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a(IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str).a(ExifInterface.TAG_MODEL, mapP.get("model")).a("Locale", mapP.get(CommonUrlParts.LOCALE)).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f8504g.i0()).a("Mediation Provider", this.f8504g.V()).a("TG", m7.a(this.f8504g)).a("MD", this.f8504g.a(x4.f11423t)).a("Test Mode On", Boolean.valueOf(this.f8504g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.f8504g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f8504g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.f8504g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f8504g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.f8504g.a(x4.f11463y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f11624i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.f8504g.a(x4.f11471z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f8504g.N().a(l10.longValue()).a(this.f8504g.q0().a("lv_task"), new s4.b() { // from class: com.applovin.impl.k9
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f9185a.a(z10, (p2) obj, (Exception) obj2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e7 A[PHI: r8 r9 r10
  0x01e7: PHI (r8v18 com.applovin.impl.sdk.o) = (r8v14 com.applovin.impl.sdk.o), (r8v66 com.applovin.impl.sdk.o) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r9v9 java.lang.String) = (r9v8 java.lang.String), (r9v18 java.lang.String) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r10v4 java.lang.StringBuilder) = (r10v3 java.lang.StringBuilder), (r10v8 java.lang.StringBuilder) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c6.run():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f8504g.S().a(this.f8504g.e().b());
    }

    private void f() {
        if (this.f8504g.S().c()) {
            return;
        }
        Activity activityU0 = this.f8504g.u0();
        if (activityU0 != null) {
            this.f8504g.S().a(activityU0);
            return;
        }
        this.f8504g.D().a(d2.D0, this.f9072b + ":maybeInitializeAdapters()");
        this.f8504g.q0().a(new r6(this.f8504g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.j9
            @Override // java.lang.Runnable
            public final void run() {
                this.f9138b.e();
            }
        }), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }
}
