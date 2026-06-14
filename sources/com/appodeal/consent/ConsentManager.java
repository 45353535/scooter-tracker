package com.appodeal.consent;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.form.v;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.o0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/appodeal/consent/ConsentManager;", "", "", "canShowAds", "()Z", "Lcom/appodeal/consent/ConsentUpdateRequestParameters;", "parameters", "Lcom/appodeal/consent/ConsentInfoUpdateCallback;", "callback", "", "requestConsentInfoUpdate", "(Lcom/appodeal/consent/ConsentUpdateRequestParameters;Lcom/appodeal/consent/ConsentInfoUpdateCallback;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/consent/OnConsentFormLoadSuccessListener;", "successListener", "Lcom/appodeal/consent/OnConsentFormLoadFailureListener;", "failureListener", "load", "(Landroid/content/Context;Lcom/appodeal/consent/OnConsentFormLoadSuccessListener;Lcom/appodeal/consent/OnConsentFormLoadFailureListener;)V", "Landroid/app/Activity;", "activity", "Lcom/appodeal/consent/OnConsentFormDismissedListener;", "dismissedListener", "loadAndShowConsentFormIfRequired", "(Landroid/app/Activity;Lcom/appodeal/consent/OnConsentFormDismissedListener;)V", "revoke", "(Landroid/content/Context;)V", "Lcom/appodeal/consent/ConsentInformation;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/appodeal/consent/ConsentInformation;", "getConsentInformation$consent_release", "()Lcom/appodeal/consent/ConsentInformation;", "setConsentInformation$consent_release", "(Lcom/appodeal/consent/ConsentInformation;)V", "consentInformation", "Lcom/appodeal/consent/ConsentStatus;", "getStatus", "()Lcom/appodeal/consent/ConsentStatus;", "getStatus$annotations", "()V", "status", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentManager {

    @NotNull
    public static final ConsentManager INSTANCE = new ConsentManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f15360a = lf.i.a(new Function0() { // from class: com.appodeal.consent.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ConsentManager.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f15361b = lf.i.a(new Function0() { // from class: com.appodeal.consent.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ConsentManager.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static ConsentInformation consentInformation;

    public static final com.appodeal.consent.cache.i a() {
        return new com.appodeal.consent.cache.i();
    }

    public static final v access$getGetConsentForm(ConsentManager consentManager) {
        consentManager.getClass();
        return new v();
    }

    public static final com.appodeal.consent.networking.v access$getLoadConsentInfo(ConsentManager consentManager) {
        consentManager.getClass();
        return new com.appodeal.consent.networking.v();
    }

    public static final com.appodeal.consent.cache.i access$getPrivacyPreferences(ConsentManager consentManager) {
        consentManager.getClass();
        return (com.appodeal.consent.cache.i) f15361b.getValue();
    }

    public static final com.appodeal.consent.revoke.c access$getRevokeConsent(ConsentManager consentManager) {
        consentManager.getClass();
        return new com.appodeal.consent.revoke.c();
    }

    public static final CoroutineScope b() {
        return kotlinx.coroutines.i.a(o0.c());
    }

    public static final boolean canShowAds() {
        return getStatus() == ConsentStatus.NotRequired || getStatus() == ConsentStatus.Obtained;
    }

    @NotNull
    public static final ConsentStatus getStatus() {
        ConsentStatus status;
        ConsentInformation consentInformation2 = consentInformation;
        return (consentInformation2 == null || (status = consentInformation2.getStatus()) == null) ? ConsentStatus.Unknown : status;
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final void load(@NotNull Context context, @NotNull OnConsentFormLoadSuccessListener successListener, @NotNull OnConsentFormLoadFailureListener failureListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(successListener, "successListener");
        Intrinsics.checkNotNullParameter(failureListener, "failureListener");
        INSTANCE.getClass();
        eg.i.d((CoroutineScope) f15360a.getValue(), null, null, new h(context, failureListener, successListener, null), 3, null);
    }

    public static final void loadAndShowConsentFormIfRequired(@NotNull final Activity activity, @NotNull final OnConsentFormDismissedListener dismissedListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dismissedListener, "dismissedListener");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        load(applicationContext, new OnConsentFormLoadSuccessListener() { // from class: com.appodeal.consent.c
            @Override // com.appodeal.consent.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                ConsentManager.a(activity, dismissedListener, consentForm);
            }
        }, new OnConsentFormLoadFailureListener() { // from class: com.appodeal.consent.d
            @Override // com.appodeal.consent.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(ConsentManagerError consentManagerError) {
                ConsentManager.a(dismissedListener, consentManagerError);
            }
        });
    }

    public static final void requestConsentInfoUpdate(@NotNull ConsentUpdateRequestParameters parameters, @NotNull ConsentInfoUpdateCallback callback) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.getClass();
        eg.i.d((CoroutineScope) f15360a.getValue(), null, null, new i(parameters, callback, null), 3, null);
    }

    public static final void revoke(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getClass();
        eg.i.d((CoroutineScope) f15360a.getValue(), null, null, new j(context, null), 3, null);
    }

    @Nullable
    public final ConsentInformation getConsentInformation$consent_release() {
        return consentInformation;
    }

    public final void setConsentInformation$consent_release(@Nullable ConsentInformation consentInformation2) {
        consentInformation = consentInformation2;
    }

    public static final void a(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener, ConsentForm form) {
        Intrinsics.checkNotNullParameter(form, "form");
        if (getStatus() == ConsentStatus.Required) {
            form.show(activity, onConsentFormDismissedListener);
        } else {
            onConsentFormDismissedListener.onConsentFormDismissed(ConsentManagerError.FormPresentationNotRequired.INSTANCE);
        }
    }

    public static final void a(OnConsentFormDismissedListener onConsentFormDismissedListener, ConsentManagerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        onConsentFormDismissedListener.onConsentFormDismissed(error);
    }
}
