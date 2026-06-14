package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import j$.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public final class UserMessagingPlatform {

    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull final Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza zzaVarZza = com.google.android.gms.internal.consent_sdk.zza.zza(activity);
        if (zzaVarZza.zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zzaVarZza.zzd().zzc();
        zzbq zzbqVarZzc = zzaVarZza.zzc();
        zzcz.zza();
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzbqVarZzc.zzb(onConsentFormLoadSuccessListener, new OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                onConsentFormDismissedListener.onConsentFormDismissed(formError);
            }
        }, true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza zzaVarZza = com.google.android.gms.internal.consent_sdk.zza.zza(context);
        ((Queue) zzaVarZza.zzd().zzb.get()).add(Long.valueOf(System.currentTimeMillis()));
        zzaVarZza.zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
