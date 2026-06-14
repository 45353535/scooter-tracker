package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.android.billingclient.api.EnableBillingProgramParams;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingProgram {

        @zzi
        public static final int EXTERNAL_CONTENT_LINK = 1;

        @zzk
        public static final int EXTERNAL_OFFER = 3;

        @zzl
        public static final int EXTERNAL_PAYMENTS = 4;

        @zzh
        public static final int UNSPECIFIED_BILLING_PROGRAM = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzf
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @NonNull
        @zzm
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        @zzj
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String INCLUDE_SUSPENDED_SUBSCRIPTIONS = "nnn";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @zzq
    @Retention(RetentionPolicy.SOURCE)
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    @AnyThread
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context, null);
    }

    @AnyThread
    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    @AnyThread
    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @AnyThread
    @zzf
    @KeepForSdk
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @AnyThread
    @zzh
    public abstract void createBillingProgramReportingDetailsAsync(@NonNull BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, @NonNull BillingProgramReportingDetailsListener billingProgramReportingDetailsListener);

    @AnyThread
    @zzj
    @Deprecated
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    @AnyThread
    public abstract void endConnection();

    @AnyThread
    @zzm
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    @AnyThread
    public abstract int getConnectionState();

    @AnyThread
    @zzf
    @KeepForSdk
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @AnyThread
    @zzh
    public abstract void isBillingProgramAvailableAsync(int i10, @NonNull BillingProgramAvailabilityListener billingProgramAvailabilityListener);

    @AnyThread
    @zzj
    @Deprecated
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    @AnyThread
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    @AnyThread
    public abstract boolean isReady();

    @NonNull
    @UiThread
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    @zzo
    @UiThread
    public abstract void launchExternalLink(@NonNull Activity activity, @NonNull LaunchExternalLinkParams launchExternalLinkParams, @NonNull LaunchExternalLinkResponseListener launchExternalLinkResponseListener);

    @AnyThread
    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    @AnyThread
    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @NonNull
    @zzf
    @UiThread
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @NonNull
    @Deprecated
    @zzj
    @UiThread
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    @UiThread
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    @AnyThread
    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);

    @AnyThread
    public static final class Builder {
        volatile boolean zza;
        volatile com.google.android.gms.internal.play_billing.zzbo zzb;
        private volatile String zzc;
        private volatile PendingPurchasesParams zzd;
        private final Context zze;
        private volatile PurchasesUpdatedListener zzf;
        private volatile zzdo zzg;
        private volatile zzcz zzh;
        private volatile zzb zzi;
        private volatile UserChoiceBillingListener zzj;

        @Nullable
        private volatile DeveloperProvidedBillingListener zzk;

        @Nullable
        private volatile ExecutorService zzl;
        private volatile boolean zzm;
        private volatile boolean zzn;
        private volatile boolean zzo;
        private volatile boolean zzp;
        private volatile boolean zzq;
        private volatile boolean zzr;

        /* synthetic */ Builder(Context context, zzac zzacVar) {
            this.zze = context;
        }

        private final boolean zza() {
            try {
                Context context = this.zze;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        @NonNull
        public BillingClient build() {
            Context context = this.zze;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.zzf == null) {
                if (this.zzj != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.zzm || this.zzn || this.zzp || this.zzq || this.zzr) {
                    return zza() ? new zzcw(null, context, null, null, this) : new BillingClientImpl(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.zzd == null || !this.zzd.isEnabledForOneTimeProducts()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.zzf == null) {
                PendingPurchasesParams pendingPurchasesParams = this.zzd;
                return zza() ? new zzcw(null, pendingPurchasesParams, context, null, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams, context, null, null, null, this);
            }
            if (this.zzj == null && this.zzk == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.zzd;
                PurchasesUpdatedListener purchasesUpdatedListener = this.zzf;
                return zza() ? new zzcw(null, pendingPurchasesParams2, context, purchasesUpdatedListener, null, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams2, context, purchasesUpdatedListener, null, null, null, this);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.zzd;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.zzf;
            UserChoiceBillingListener userChoiceBillingListener = this.zzj;
            DeveloperProvidedBillingListener developerProvidedBillingListener = this.zzk;
            return zza() ? new zzcw(null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, null, null, this);
        }

        @NonNull
        @zzf
        public Builder enableAlternativeBillingOnly() {
            this.zzm = true;
            return this;
        }

        @NonNull
        @zzg
        public Builder enableAutoServiceReconnection() {
            this.zza = true;
            return this;
        }

        @NonNull
        @zzh
        public Builder enableBillingProgram(int i10) {
            EnableBillingProgramParams.Builder builderNewBuilder = EnableBillingProgramParams.newBuilder();
            builderNewBuilder.setBillingProgram(i10);
            enableBillingProgram(builderNewBuilder.build());
            return this;
        }

        @NonNull
        @zzj
        @Deprecated
        public Builder enableExternalOffer() {
            this.zzn = true;
            return this;
        }

        @NonNull
        @zzu
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.zzd = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzw
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.zzj = userChoiceBillingListener;
            if (this.zzk == null) {
                return this;
            }
            throw new IllegalArgumentException("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzf = purchasesUpdatedListener;
            return this;
        }

        @NonNull
        @zzl
        public Builder enableBillingProgram(@NonNull EnableBillingProgramParams enableBillingProgramParams) {
            if (enableBillingProgramParams.getDeveloperProvidedBillingListener() != null) {
                if (this.zzj == null) {
                    if (enableBillingProgramParams.getBillingProgram() == 4) {
                        this.zzk = enableBillingProgramParams.getDeveloperProvidedBillingListener();
                    } else {
                        throw new IllegalArgumentException("DeveloperProvidedBillingListener can only be set when enabling the EXTERNAL_PAYMENTS billing program.");
                    }
                } else {
                    throw new IllegalArgumentException("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
                }
            }
            int billingProgram = enableBillingProgramParams.getBillingProgram();
            if (billingProgram == 1) {
                this.zzp = true;
                return this;
            }
            if (billingProgram == 2) {
                this.zzq = true;
                return this;
            }
            if (billingProgram == 3) {
                this.zzn = true;
                return this;
            }
            if (billingProgram != 4) {
                throw new IllegalArgumentException("An invalid BillingProgram has been provided.");
            }
            this.zzr = true;
            return this;
        }
    }
}
