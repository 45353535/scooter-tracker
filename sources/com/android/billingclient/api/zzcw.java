package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
final class zzcw extends BillingClientImpl {
    private final Context zza;
    private volatile int zzb;

    @Nullable
    private volatile com.google.android.gms.internal.play_billing.zzay zzc;
    private volatile zzcu zzd;

    @Nullable
    private volatile ScheduledExecutorService zze;

    @AnyThread
    zzcw(@Nullable String str, Context context, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    public static /* synthetic */ Object zzaD(zzcw zzcwVar, int i10, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        try {
            if (zzcwVar.zzc == null) {
                throw null;
            }
            zzcwVar.zzc.zza(zzcwVar.zza.getPackageName(), i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new zzct(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            zzcwVar.zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzaG(com.google.android.gms.internal.play_billing.zzdc zzdcVar) {
        try {
            return ((Integer) zzdcVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService zzaH() {
        try {
            if (this.zze == null) {
                this.zze = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zze;
    }

    private final synchronized void zzaI() {
        zzaO(27);
        try {
            try {
                zzcv zzcvVar = null;
                if (this.zzd != null && this.zzc != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.zza.unbindService(this.zzd);
                    this.zzd = new zzcu(this, zzcvVar);
                }
                this.zzc = null;
                if (this.zze != null) {
                    this.zze.shutdownNow();
                    this.zze = null;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.zzb = 3;
        } catch (Throwable th2) {
            this.zzb = 3;
            throw th2;
        }
    }

    private final synchronized void zzaJ() {
        if (zzaB()) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            zzaO(26);
            return;
        }
        if (this.zzb == 1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.zzb == 3) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            zzaN(zzjd.BILLING_CLIENT_CLOSED, 26, zzdc.zza(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.zzb = 1;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Starting Billing Override Service setup.");
        this.zzd = new zzcu(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.zza;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzjd zzjdVar = zzjd.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.zzd, 1)) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.zzb = 0;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service unavailable on device.");
        zzaN(zzjdVar, 26, zzdc.zza(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzaK(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaL(int i10, int i11) {
        BillingResult billingResultZza = zzdc.zza(i11, "Billing override value was set by a license tester.");
        zzaN(zzjd.LICENSE_TESTER_BILLING_OVERRIDE, i10, billingResultZza);
        return billingResultZza;
    }

    private final com.google.android.gms.internal.play_billing.zzdc zzaM(final int i10) {
        if (zzaB()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzcn
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return zzcw.zzaD(this.zza, i10, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Billing Override Service is not ready.");
        zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, zzdc.zza(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.zzcx.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaN(zzjd zzjdVar, int i10, BillingResult billingResult) {
        int i11 = zzcy.zza;
        zziw zziwVarZzb = zzcy.zzb(zzjdVar, i10, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zziwVarZzb, "ApiFailure should not be null");
        zzk().zza(zziwVarZzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaO(int i10) {
        int i11 = zzcy.zza;
        zzja zzjaVarZzc = zzcy.zzc(i10, zzjk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjaVarZzc, "ApiSuccess should not be null");
        zzk().zzf(zzjaVarZzc);
    }

    private final void zzaP(int i10, Consumer consumer, Runnable runnable) {
        com.google.android.gms.internal.play_billing.zzcx.zzc(com.google.android.gms.internal.play_billing.zzcx.zzb(zzaM(i10), 28500L, TimeUnit.MILLISECONDS, zzaH()), new zzcs(this, i10, consumer, runnable), zzJ());
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        zzaP(3, new Consumer() { // from class: com.android.billingclient.api.zzco
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzcp
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        zzaP(4, new Consumer() { // from class: com.android.billingclient.api.zzcl
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                consumeResponseListener.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzcm
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.consumeAsync(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaI();
        super.endConnection();
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.zzcq
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.BillingClientImpl*/.zzn((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzcr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.BillingClientImpl*/.launchBillingFlow(activity, billingFlowParams);
            }
        };
        int iZzaG = zzaG(zzaM(2));
        if (zzaK(iZzaG)) {
            BillingResult billingResultZzaL = zzaL(2, iZzaG);
            consumer.accept(billingResultZzaL);
            return billingResultZzaL;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e10) {
            zzjd zzjdVar = zzjd.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            BillingResult billingResult = zzdc.zzh;
            zzaN(zzjdVar, 2, billingResult);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An internal error occurred.", e10);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        zzaP(7, new Consumer() { // from class: com.android.billingclient.api.zzcj
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
                productDetailsResponseListener.onProductDetailsResponse((BillingResult) obj, queryProductDetailsResult);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzck
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        zzaJ();
        super.startConnection(billingClientStateListener);
    }

    public final synchronized boolean zzaB() {
        if (this.zzb == 2 && this.zzc != null) {
            if (this.zzd != null) {
                return true;
            }
        }
        return false;
    }

    @AnyThread
    zzcw(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdo zzdoVar, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, null, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    @AnyThread
    zzcw(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzb zzbVar, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, purchasesUpdatedListener, null, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    @AnyThread
    zzcw(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable DeveloperProvidedBillingListener developerProvidedBillingListener, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, developerProvidedBillingListener, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }
}
