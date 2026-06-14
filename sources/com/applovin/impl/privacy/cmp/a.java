package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d2;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConsentForm f10164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10165d;

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0178a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.f10162a = kVar;
        this.f10163b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f10164c != null) {
            this.f10164c = null;
        }
        this.f10165d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0178a interfaceC0178a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0178a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f10162a.c(x4.f11285c7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f10162a.a(x4.f11276b7);
        return num.intValue() < 0 || this.f10165d < num.intValue();
    }

    public void a(final Activity activity, k0 k0Var, final InterfaceC0178a interfaceC0178a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (n7.c(this.f10162a) && k0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f10162a.n0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.applovin.impl.privacy.cmp.b
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                this.f10166a.a(activity, interfaceC0178a);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.applovin.impl.privacy.cmp.c
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                this.f10169a.b(interfaceC0178a, formError);
            }
        });
    }

    public void b(Activity activity, final k0 k0Var, final InterfaceC0178a interfaceC0178a) {
        if (this.f10164c == null) {
            b("Failed to show - not ready yet");
            interfaceC0178a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f10164c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.h
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f10182a.a(k0Var, interfaceC0178a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final FormError formError, final k0 k0Var, final InterfaceC0178a interfaceC0178a) {
        a("Retrying to load and show consent form...");
        this.f10165d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.f
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.f10175a.a(interfaceC0178a, formError, k0Var, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.g
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError2) {
                this.f10179a.a(interfaceC0178a, formError, formError2);
            }
        });
    }

    private void b(String str) {
        if (o.a()) {
            this.f10163b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, final InterfaceC0178a interfaceC0178a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0178a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            return;
        }
        if (consentStatus != 2) {
            b("Failed to load with consent status: " + consentStatus);
            interfaceC0178a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
            return;
        }
        a("Successfully requested consent info");
        a("Loading consent form...");
        UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.d
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.f10171a.a(interfaceC0178a, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.e
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                this.f10173a.a(interfaceC0178a, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0178a interfaceC0178a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f10164c = consentForm;
        interfaceC0178a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0178a interfaceC0178a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0178a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final k0 k0Var, final InterfaceC0178a interfaceC0178a, final FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f10162a.D().a(d2.O0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a("Consent form was dismissed due to error: " + message);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.privacy.cmp.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10185b.a(formError, k0Var, interfaceC0178a);
                    }
                });
                return;
            }
            b("Failed to show with error: " + message);
            interfaceC0178a.onFlowShowFailed(a(formError, "Consent form show failed"));
            return;
        }
        a("Consent form finished showing");
        interfaceC0178a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0178a interfaceC0178a, FormError formError, k0 k0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f10164c = consentForm;
        Activity activityU0 = this.f10162a.u0();
        if (activityU0 == null) {
            interfaceC0178a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityU0, k0Var, interfaceC0178a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0178a interfaceC0178a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0178a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    private void a(String str) {
        if (o.a()) {
            this.f10163b.a("GoogleCmpAdapter", str);
        }
    }
}
