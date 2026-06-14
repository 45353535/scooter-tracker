package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.BundleCompat;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzhu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzio;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private PendingPurchasesParams zzE;
    private boolean zzF;
    private boolean zzG;

    @Nullable
    private volatile BillingClientStateListener zzH;
    private ExecutorService zzI;
    private final Long zzJ;
    private com.google.android.gms.internal.play_billing.zzbo zzK;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;

    @Nullable
    private final String zzd;
    private final Handler zze;

    @Nullable
    private volatile zzab zzf;
    private Context zzg;
    private zzcz zzh;
    private volatile com.google.android.gms.internal.play_billing.zzap zzi;
    private volatile zzbw zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str, BillingClient.Builder builder) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzci(), str, null, null, null, null, null, builder);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable zzb zzbVar, String str, @Nullable zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zzjpVarZza = zzjr.zza();
        zzjpVarZza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zzjpVarZza.zzy(str2);
        }
        zzjpVarZza.zzq(this.zzg.getPackageName());
        zzjpVarZza.zzd(this.zzJ.longValue());
        zzjpVarZza.zzw(builder.zza);
        zzjpVarZza.zza(Build.VERSION.SDK_INT);
        zzjpVarZza.zzp(846465066L);
        zzbo(zzjpVarZza, context);
        try {
            zzjpVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th2);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zzjpVarZza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, zzbVar, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = zzbVar != null;
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j10) {
        startConnection(new zzci(j10));
    }

    public static /* synthetic */ Void zzA(BillingClientImpl billingClientImpl, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaL(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzB(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        billingClientImpl.zzaK(externalOfferAvailabilityListener);
        return null;
    }

    public static /* synthetic */ Void zzC(BillingClientImpl billingClientImpl, BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10) throws Exception {
        billingClientImpl.zzaJ(billingProgramAvailabilityListener, i10);
        return null;
    }

    public static /* synthetic */ Void zzD(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener, LaunchExternalLinkParams launchExternalLinkParams, Activity activity) throws RemoteException {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!billingClientImpl.zzbl(30000L)) {
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (billingClientImpl.zzD) {
                synchronized (billingClientImpl.zza) {
                    zzapVar = billingClientImpl.zzi;
                }
                if (zzapVar == null) {
                    billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = billingClientImpl.zzg.getPackageName();
                    String str = billingClientImpl.zzc;
                    String str2 = billingClientImpl.zzd;
                    long jLongValue = billingClientImpl.zzJ.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    zzhu zzhuVarZza = zzhx.zza();
                    zzio zzioVarZza = zziq.zza();
                    zzioVarZza.zza(launchExternalLinkParams.getLinkUri().toString());
                    zzhuVarZza.zza("externalOfferUri", (zziq) zzioVarZza.zzi());
                    zzio zzioVarZza2 = zziq.zza();
                    zzioVarZza2.zza(String.valueOf(launchExternalLinkParams.getLaunchMode()));
                    zzhuVarZza.zza("externalOfferLaunchMode", (zziq) zzioVarZza2.zzi());
                    zzio zzioVarZza3 = zziq.zza();
                    zzioVarZza3.zza(String.valueOf(launchExternalLinkParams.getLinkType()));
                    zzhuVarZza.zza("externalOfferLinkType", (zziq) zzioVarZza3.zzi());
                    zzio zzioVarZza4 = zziq.zza();
                    zzioVarZza4.zza(String.valueOf(launchExternalLinkParams.getBillingProgram()));
                    zzhuVarZza.zza("externalOfferBillingProgram", (zziq) zzioVarZza4.zzi());
                    bundle.putByteArray("REQUEST_PARAMS", ((zzhx) zzhuVarZza.zzi()).zzQ());
                    zzapVar.zzp(27, packageName, bundle, new zzcc(billingClientImpl, new WeakReference(activity), launchExternalLinkResponseListener, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support launch external link.");
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzG, zzjd.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
            }
        } catch (RuntimeException e10) {
            billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e10);
        }
        return null;
    }

    public static /* synthetic */ Void zzE(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        billingClientImpl.zzaH(externalOfferReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzF(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaM(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzG(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        billingClientImpl.zzaF(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzH(BillingClientImpl billingClientImpl, BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) throws Exception {
        billingClientImpl.zzaG(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
        return null;
    }

    public static /* synthetic */ Void zzI(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        billingClientImpl.zzaI(alternativeBillingOnlyAvailabilityListener);
        return null;
    }

    @Nullable
    static Future zzK(Callable callable, long j10, @Nullable final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaz
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* synthetic */ void zzL(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzM(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbw.zzk());
    }

    public static /* synthetic */ void zzN(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* synthetic */ void zzR(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* synthetic */ void zzT(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
    }

    public static /* synthetic */ void zzV(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        if (billingClientImpl.zzf.zzf() != null) {
            billingClientImpl.zzf.zzf().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final /* synthetic */ Object zzaA(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            if (!zzbl(30000L)) {
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid purchase token.");
                zzjd zzjdVar2 = zzjd.EMPTY_PURCHASE_TOKEN;
                BillingResult billingResult2 = zzdc.zzg;
                zzbs(zzjdVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.zzp) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar != null) {
                    String packageName = this.zzg.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long jLongValue = this.zzJ.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    Bundle bundleZzd = zzapVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzdc.zza(com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzk(bundleZzd, "BillingClient")));
                    return null;
                }
                zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzjd zzjdVar3 = zzjd.API_VERSION_NOT_V9;
                BillingResult billingResult3 = zzdc.zza;
                zzbs(zzjdVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (DeadObjectException e10) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzh, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    private final /* synthetic */ Object zzaB(BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.zzv) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long jLongValue = this.zzJ.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    zzapVar.zzo(18, packageName, bundle, new zzca(billingConfigResponseListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support get billing config.");
                zzjd zzjdVar2 = zzjd.GET_BILLING_CONFIG_NOT_SUPPORTED;
                BillingResult billingResult2 = zzdc.zzy;
                zzbs(zzjdVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (DeadObjectException e10) {
            zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaY(billingConfigResponseListener, zzdc.zzh, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Object zzaC(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzbb(-1, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzs(12, this.zzg.getPackageName(), bundle, new zzcf(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzbb(-1, zzjd.SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzbb(6, zzjd.SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final String zzaD(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    @Nullable
    @SuppressLint({"PrivateApi"})
    private static String zzaE() {
        try {
            return (String) w0.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final /* synthetic */ Void zzaF(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbx(alternativeBillingOnlyReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzh, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaG(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) throws Exception {
        BillingProgramReportingDetailsListener billingProgramReportingDetailsListener2;
        BillingProgramReportingDetailsListener billingProgramReportingDetailsListener3;
        RuntimeException runtimeException;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            try {
                if (!zzbl(30000L)) {
                    zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
                } else if (this.zzD) {
                    synchronized (this.zza) {
                        try {
                            try {
                                zzapVar = this.zzi;
                            } catch (DeadObjectException e10) {
                                e = e10;
                                zzaU(billingProgramReportingDetailsListener3, zzdc.zzj, zzjd.SERVICE_CALL_EXCEPTION, deadObjectException);
                            } catch (RuntimeException e11) {
                                e = e11;
                                runtimeException = e;
                                zzaU(billingProgramReportingDetailsListener2, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, runtimeException);
                            }
                        } finally {
                            th = th;
                            while (true) {
                                Throwable th2 = th;
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (zzapVar == null) {
                        zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                    } else {
                        String str = this.zzc;
                        com.google.android.gms.internal.play_billing.zzdy zzdyVarZzb = zzdg.zzb(str, 24, this.zzg, zzdf.CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC.zza());
                        zzhu zzhuVarZza = zzhx.zza();
                        zzio zzioVarZza = zziq.zza();
                        zzioVarZza.zza(str);
                        zzhuVarZza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zzioVarZza.zzi());
                        zzio zzioVarZza2 = zziq.zza();
                        zzioVarZza2.zza(this.zzg.getPackageName());
                        zzhuVarZza.zza("CALLING_PACKAGE", (zziq) zzioVarZza2.zzi());
                        zzio zzioVarZza3 = zziq.zza();
                        zzioVarZza3.zza(String.valueOf(billingProgramReportingDetailsParams.getBillingProgram()));
                        zzhuVarZza.zza("BILLING_PROGRAM", (zziq) zzioVarZza3.zzi());
                        zzio zzioVarZza4 = zziq.zza();
                        zzioVarZza4.zza("RESPONSE_FORMAT_PROTO");
                        zzhuVarZza.zza("RESPONSE_FORMAT", (zziq) zzioVarZza4.zzi());
                        if (billingProgramReportingDetailsParams.getBillingProgram() == 3) {
                            zzio zzioVarZza5 = zziq.zza();
                            zzioVarZza5.zza(String.valueOf(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime));
                            zzhuVarZza.zza("APP_INSTALL_TIME_MILLIS", (zziq) zzioVarZza5.zzi());
                        }
                        zzapVar.zzm(zzdg.zza(zzdyVarZzb, (zzhx) zzhuVarZza.zzi()), new CreateBillingProgramReportingDetailsDelegateToBackendCallback(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams.getBillingProgram(), this.zzh, this.zzm, zzav(), zzJ()));
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                    zzaU(billingProgramReportingDetailsListener, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
                }
            } catch (DeadObjectException e12) {
                DeadObjectException deadObjectException = e12;
                billingProgramReportingDetailsListener3 = billingProgramReportingDetailsListener;
                zzaU(billingProgramReportingDetailsListener3, zzdc.zzj, zzjd.SERVICE_CALL_EXCEPTION, deadObjectException);
            } catch (RuntimeException e13) {
                runtimeException = e13;
                billingProgramReportingDetailsListener2 = billingProgramReportingDetailsListener;
                zzaU(billingProgramReportingDetailsListener2, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, runtimeException);
            }
        } catch (DeadObjectException e14) {
            e = e14;
            billingProgramReportingDetailsListener3 = billingProgramReportingDetailsListener;
        } catch (RuntimeException e15) {
            e = e15;
            billingProgramReportingDetailsListener2 = billingProgramReportingDetailsListener;
        }
        return null;
    }

    private final /* synthetic */ Void zzaH(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzz) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    long j10 = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long jLongValue = this.zzJ.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                    bundle.putLong("appInstallTimeMillis", j10);
                    zzapVar.zzl(22, packageName, bundle, new zzby(externalOfferReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaV(externalOfferReportingDetailsListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzh, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaI(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzq(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcd(alternativeBillingOnlyAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzh, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaJ(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10) throws Exception {
        BillingClientImpl billingClientImpl;
        BillingProgramAvailabilityListener billingProgramAvailabilityListener2;
        int i11;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            try {
                if (zzbl(30000L)) {
                    billingClientImpl = this;
                    billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                    i11 = i10;
                    try {
                        if (!billingClientImpl.zzD) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                            billingClientImpl.zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
                            return null;
                        }
                        synchronized (billingClientImpl.zza) {
                            zzapVar = billingClientImpl.zzi;
                        }
                        if (zzapVar == null) {
                            billingClientImpl.zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                            return null;
                        }
                        String str = billingClientImpl.zzc;
                        com.google.android.gms.internal.play_billing.zzdy zzdyVarZzb = zzdg.zzb(str, 24, billingClientImpl.zzg, zzdf.IS_BILLING_PROGRAM_AVAILABLE_ASYNC.zza());
                        zzhu zzhuVarZza = zzhx.zza();
                        zzio zzioVarZza = zziq.zza();
                        zzioVarZza.zza(str);
                        zzhuVarZza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zzioVarZza.zzi());
                        zzio zzioVarZza2 = zziq.zza();
                        zzioVarZza2.zza(billingClientImpl.zzg.getPackageName());
                        zzhuVarZza.zza("CALLING_PACKAGE", (zziq) zzioVarZza2.zzi());
                        zzio zzioVarZza3 = zziq.zza();
                        zzioVarZza3.zza(String.valueOf(i11));
                        zzhuVarZza.zza("BILLING_PROGRAM", (zziq) zzioVarZza3.zzi());
                        try {
                            zzapVar.zzm(zzdg.zza(zzdyVarZzb, (zzhx) zzhuVarZza.zzi()), new IsBillingProgramAvailableDelegateToBackendCallback(billingProgramAvailabilityListener2, i11, billingClientImpl.zzh, billingClientImpl.zzm, zzav(), zzJ()));
                            return null;
                        } catch (DeadObjectException e10) {
                            e = e10;
                            billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                            i11 = i11;
                            zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                            return null;
                        } catch (Exception e11) {
                            e = e11;
                            billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                            i11 = i11;
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } else {
                    try {
                        try {
                            zzaR(billingProgramAvailabilityListener, i10, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
                            return null;
                        } catch (DeadObjectException e14) {
                            e = e14;
                            billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                            i11 = i10;
                            zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                            return null;
                        } catch (Exception e15) {
                            e = e15;
                            billingClientImpl = this;
                            billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                            i11 = i10;
                        }
                    } catch (DeadObjectException e16) {
                        e = e16;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                        i11 = i10;
                        zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                }
            } catch (Exception e17) {
                e = e17;
                billingClientImpl = this;
                billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                i11 = i10;
            }
            billingClientImpl.zzaR(billingProgramAvailabilityListener2, i11, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e);
            return null;
        } catch (DeadObjectException e18) {
            e = e18;
        }
    }

    private final /* synthetic */ Void zzaK(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(30000L)) {
                zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzB) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzr(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzce(externalOfferAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaW(externalOfferAvailabilityListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzh, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaL(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzn(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbz(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzh, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaM(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzp(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcb(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzh, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    @Nullable
    private final Future zzaN(Callable callable, long j10, @Nullable final Runnable runnable, Handler handler) throws Exception {
        try {
            final Future futureSubmit = zzJ().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    runnable2.run();
                }
            }, 28500L);
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e10);
            throw e10;
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void zzaO(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Throwable {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int iZza;
        String strZzk;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                try {
                    try {
                        zzapVar = this.zzi;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzh, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzapVar == null) {
                try {
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e12) {
                    e = e12;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzh, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.zzp) {
                String packageName = this.zzg.getPackageName();
                boolean z10 = this.zzp;
                String str = this.zzc;
                String str2 = this.zzd;
                long jLongValue = this.zzJ.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, jLongValue);
                }
                Bundle bundleZze = zzapVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundleZze, "BillingClient");
            } else {
                iZza = zzapVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                strZzk = "";
            }
            BillingResult billingResultZza = zzdc.zza(iZza, strZzk);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
                return;
            }
            zzaS(consumeResponseListener, purchaseToken, billingResultZza, zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + iZza, null);
        } catch (DeadObjectException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    private final void zzaP(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error in acknowledge purchase!", exc);
        zzbu(zzjdVar, 3, billingResult, zzcy.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 14, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 33, billingResult, zzcy.zza(exc));
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i10));
    }

    private final void zzaS(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzjd zzjdVar, String str2, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str2, exc);
        zzbu(zzjdVar, 4, billingResult, zzcy.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 15, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaU(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 35, billingResult, zzcy.zza(exc));
        billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 24, billingResult, zzcy.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaW(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 23, billingResult, zzcy.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaX(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 25, billingResult, zzcy.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzaY(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "getBillingConfig got an exception.", exc);
        zzbu(zzjdVar, 13, billingResult, zzcy.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ(LaunchExternalLinkResponseListener launchExternalLinkResponseListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 37, billingResult, zzcy.zza(exc));
        launchExternalLinkResponseListener.onLaunchExternalLinkResponse(billingResult);
    }

    static /* bridge */ /* synthetic */ void zzak(BillingClientImpl billingClientImpl, int i10) {
        billingClientImpl.zzm = i10;
        billingClientImpl.zzD = i10 >= 27;
        billingClientImpl.zzC = i10 >= 26;
        billingClientImpl.zzB = i10 >= 24;
        billingClientImpl.zzA = i10 >= 23;
        billingClientImpl.zzz = i10 >= 22;
        billingClientImpl.zzy = i10 >= 21;
        billingClientImpl.zzx = i10 >= 20;
        billingClientImpl.zzw = i10 >= 19;
        billingClientImpl.zzv = i10 >= 18;
        billingClientImpl.zzu = i10 >= 17;
        billingClientImpl.zzt = i10 >= 16;
        billingClientImpl.zzs = i10 >= 15;
        billingClientImpl.zzr = i10 >= 14;
        billingClientImpl.zzq = i10 >= 12;
        billingClientImpl.zzp = i10 >= 9;
        billingClientImpl.zzo = i10 >= 8;
        billingClientImpl.zzn = i10 >= 6;
    }

    static /* bridge */ /* synthetic */ void zzam(BillingClientImpl billingClientImpl, int i10) {
        if (i10 != 0) {
            billingClientImpl.zzbg(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb == 3) {
                    return;
                }
                billingClientImpl.zzbg(2);
                zzab zzabVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
                if (zzabVar != null) {
                    zzabVar.zzi(billingClientImpl.zzy);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzaq(BillingClientImpl billingClientImpl) {
        boolean z10;
        synchronized (billingClientImpl.zza) {
            z10 = true;
            if (billingClientImpl.zzb != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzat(int i10, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzg(i10, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzau(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzav() {
        return Looper.myLooper() == null ? this.zze : new Handler(Looper.myLooper());
    }

    private final zzcg zzaw(BillingResult billingResult, zzjd zzjdVar, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        zzbu(zzjdVar, 7, billingResult, zzcy.zza(exc));
        return new zzcg(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    private final BillingResult zzax(int i10) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
        zziy zziyVarZza = zzja.zza();
        zziyVarZza.zze(6);
        zzks zzksVarZza = zzku.zza();
        zzksVarZza.zze(true);
        zzksVarZza.zza(i10 > 0);
        zzksVarZza.zzb(i10);
        zziyVarZza.zzd(zzksVarZza);
        zzbe((zzja) zziyVarZza.zzi());
        return zzdc.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzay() {
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.zzb == iArr[i10]) {
                    return zzdc.zzj;
                }
            }
            return zzdc.zzh;
        }
    }

    private final com.google.android.gms.internal.play_billing.zzdc zzaz(final int i10) {
        if (this.zzF && !zzbm()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzad
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return BillingClientImpl.zzr(this.zza, i10, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcx.zza(zzdc.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, @Nullable Exception exc) {
        zzbu(zzjdVar, 16, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbb(int i10, zzjd zzjdVar, @Nullable Exception exc) {
        zziw zziwVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "showInAppMessages error.", exc);
        zzcz zzczVar = this.zzh;
        String strZza = zzcy.zza(exc);
        try {
            zzjb zzjbVarZza = zzjf.zza();
            zzjbVarZza.zzp(i10);
            if (zzjdVar != null) {
                zzjbVarZza.zze(zzjdVar);
            }
            if (strZza != null) {
                zzjbVarZza.zza(strZza);
            }
            zziu zziuVarZza = zziw.zza();
            zziuVarZza.zzb(zzjbVarZza);
            zziuVarZza.zzp(30);
            zziwVar = (zziw) zziuVarZza.zzi();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th2);
            zziwVar = null;
        }
        zzczVar.zza(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(zziw zziwVar) {
        try {
            this.zzh.zzb(zziwVar, this.zzm);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbd(zziw zziwVar, long j10, boolean z10) {
        try {
            this.zzh.zze(zziwVar, this.zzm, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbe(zzja zzjaVar) {
        try {
            this.zzh.zzg(zzjaVar, this.zzm);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(zzjd zzjdVar, BillingResult billingResult, int i10) {
        try {
            int i11 = zzcy.zza;
            zziu zziuVar = (zziu) zzcy.zzb(zzjdVar, 6, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED).zzq();
            zzks zzksVarZza = zzku.zza();
            zzksVarZza.zza(i10 > 0);
            zzksVarZza.zzb(i10);
            zziuVar.zze(zzksVarZza);
            zzbc((zziw) zziuVar.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbg(int i10) {
        synchronized (this.zza) {
            try {
                if (this.zzb == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Setting clientState from " + zzbn(this.zzb) + " to " + zzbn(i10));
                this.zzb = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized void zzbh() {
        ExecutorService executorService = this.zzI;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzI = null;
        }
    }

    private final void zzbi(BillingClientStateListener billingClientStateListener, int i10) {
        zzjd zzjdVar;
        BillingResult billingResultZzax;
        BillingResult billingResult;
        synchronized (this.zza) {
            try {
                if (zzbm()) {
                    billingResultZzax = zzax(i10);
                } else {
                    if (this.zzb == 1) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzjd zzjdVar2 = zzjd.BILLING_CLIENT_CONNECTING;
                        billingResult = zzdc.zzd;
                        zzbf(zzjdVar2, billingResult, i10);
                    } else if (this.zzb == 3) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzjd zzjdVar3 = zzjd.BILLING_CLIENT_CLOSED;
                        billingResult = zzdc.zzj;
                        zzbf(zzjdVar3, billingResult, i10);
                    } else {
                        zzbg(1);
                        if (i10 == 0) {
                            this.zzH = billingClientStateListener;
                            i10 = 0;
                        }
                        zzbj();
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Starting in-app billing setup.");
                        this.zzj = new zzbw(this, billingClientStateListener, i10, null);
                        this.zzj.zzc();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                    synchronized (this.zza) {
                                        try {
                                            if (this.zzb == 2) {
                                                billingResultZzax = zzax(i10);
                                            } else if (this.zzb != 1) {
                                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzjd zzjdVar4 = zzjd.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                billingResult = zzdc.zzj;
                                                zzbf(zzjdVar4, billingResult, i10);
                                            } else {
                                                zzbw zzbwVar = this.zzj;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbwVar, 1) : this.zzg.bindService(intent2, 1, zzJ(), zzbwVar)) {
                                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service was bonded successfully.");
                                                    billingResultZzax = null;
                                                } else {
                                                    zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        zzbg(0);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult2 = zzdc.zzb;
                        zzbf(zzjdVar, billingResult2, i10);
                        billingResultZzax = billingResult2;
                    }
                    billingResultZzax = billingResult;
                }
            } finally {
            }
        }
        if (billingResultZzax != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultZzax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbj() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding service!", th2);
                        this.zzi = null;
                        this.zzj = null;
                    } finally {
                        this.zzi = null;
                        this.zzj = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzbk(long j10) {
        try {
            BillingResult billingResult = (BillingResult) zzaz(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return zzbm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzbl(long j10) {
        long jMax;
        com.google.android.gms.internal.play_billing.zzbl zzblVarZzb = com.google.android.gms.internal.play_billing.zzbl.zzb(this.zzK);
        long jZza = 30000;
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                jMax = Math.max(0L, jZza);
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e10);
            }
            if (jMax <= 0) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No time remaining for reconnection attempt.");
                return zzbm();
            }
            BillingResult billingResult = (BillingResult) zzaz(i10).get(jMax, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return zzbm();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jZza = 30000 - zzblVarZzb.zza(timeUnit);
            long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (jZza < jPow) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed due to timeout limit reached.");
                return zzbm();
            }
            if (i10 < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jZza = 30000 - zzblVarZzb.zza(timeUnit);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                }
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Max retries reached.");
        return zzbm();
    }

    private final boolean zzbm() {
        boolean z10;
        synchronized (this.zza) {
            try {
                z10 = false;
                if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    private static final String zzbn(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private static final void zzbo(zzjp zzjpVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzjpVar.zzv((int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                zzjpVar.zzr(Build.BRAND);
                zzjpVar.zzu(Build.MODEL);
                zzjpVar.zzt(Build.MANUFACTURER);
                zzjpVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    private final zzdz zzbp(int i10, BillingResult billingResult, zzjd zzjdVar, String str, @Nullable Exception exc) {
        zzbu(zzjdVar, 9, billingResult, zzcy.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        return new zzdz(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.zzdz zzbq(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzbq(java.lang.String, boolean, int):com.android.billingclient.api.zzdz");
    }

    private final void zzbr(BillingResult billingResult, zzjd zzjdVar, int i10) {
        zzja zzjaVar = null;
        zziw zziwVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i11 = zzcy.zza;
            try {
                zziy zziyVarZza = zzja.zza();
                zziyVarZza.zze(5);
                zzjv zzjvVarZza = zzjy.zza();
                zzjvVarZza.zza(i10);
                zziyVarZza.zzb((zzjy) zzjvVarZza.zzi());
                zzjaVar = (zzja) zziyVarZza.zzi();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e10);
            }
            zzbe(zzjaVar);
            return;
        }
        int i12 = zzcy.zza;
        try {
            zziu zziuVarZza = zziw.zza();
            zzjb zzjbVarZza = zzjf.zza();
            zzjbVarZza.zzp(billingResult.getResponseCode());
            zzjbVarZza.zzb(billingResult.getDebugMessage());
            zzjbVarZza.zze(zzjdVar);
            zziuVarZza.zzb(zzjbVarZza);
            zziuVarZza.zzp(5);
            zzjv zzjvVarZza2 = zzjy.zza();
            zzjvVarZza2.zza(i10);
            zziuVarZza.zzc((zzjy) zzjvVarZza2.zzi());
            zziwVar = (zziw) zziuVarZza.zzi();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e11);
        }
        zzbc(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbs(zzjd zzjdVar, int i10, BillingResult billingResult) {
        try {
            int i11 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i10, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbt(zzjd zzjdVar, int i10, BillingResult billingResult, long j10) {
        try {
            int i11 = zzcy.zza;
            try {
                this.zzh.zzc(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.zzm, j10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th3);
        }
    }

    private final void zzbu(zzjd zzjdVar, int i10, BillingResult billingResult, @Nullable String str) {
        try {
            int i11 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i10, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbv(zzjd zzjdVar, int i10, BillingResult billingResult, long j10, boolean z10) {
        try {
            int i11 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbw(zzjd zzjdVar, int i10, BillingResult billingResult, @Nullable String str, long j10, boolean z10) {
        try {
            int i11 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private void zzbx(int i10) {
        try {
            int i11 = zzcy.zza;
            zzbe(zzcy.zzc(i10, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    static /* bridge */ /* synthetic */ ResultReceiver zzg(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        return new zzbt(billingClientImpl, billingClientImpl.zze, launchExternalLinkResponseListener);
    }

    static /* bridge */ /* synthetic */ BillingResult zzm(Exception exc) {
        return exc instanceof DeadObjectException ? zzdc.zzj : zzdc.zzh;
    }

    public static /* synthetic */ Object zzr(BillingClientImpl billingClientImpl, int i10, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        billingClientImpl.zzbi(new zzbs(billingClientImpl, zzpVar), i10);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object zzs(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) throws Throwable {
        if (billingClientImpl.zzbl(30000L)) {
            billingClientImpl.zzaO(consumeParams, consumeResponseListener);
            return null;
        }
        zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
        BillingResult billingResult = zzdc.zzj;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Object zzt(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) throws JSONException {
        if (!billingClientImpl.zzbl(30000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            billingClientImpl.zzbs(zzjdVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            zzcg zzcgVarZzh = billingClientImpl.zzh(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(zzdc.zza(zzcgVarZzh.zza(), zzcgVarZzh.zzb()), new QueryProductDetailsResult(zzcgVarZzh.zzc(), zzcgVarZzh.zzd()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Querying product details is not supported.");
        zzjd zzjdVar2 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
        BillingResult billingResult2 = zzdc.zzr;
        billingClientImpl.zzbs(zzjdVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        return null;
    }

    public static /* synthetic */ Object zzu(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        billingClientImpl.zzaA(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ Object zzv(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaC(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Object zzw(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        billingClientImpl.zzaB(billingConfigResponseListener);
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzu(this.zza, acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzR(this.zza, acknowledgePurchaseResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult billingResultZzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, billingResultZzay);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzay);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzba
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                BillingClientImpl.zzs(this.zza, consumeResponseListener, consumeParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbb
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzL(this.zza, consumeResponseListener, consumeParams);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult billingResultZzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, billingResultZzay);
            consumeResponseListener.onConsumeResponse(billingResultZzay, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzau
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzG(this.zza, alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzav
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void createBillingProgramReportingDetailsAsync(final BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        try {
            try {
                zzaN(new Callable() { // from class: com.android.billingclient.api.zzao
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        BillingClientImpl.zzH(this.zza, billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzap
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzaU(billingProgramReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                    }
                }, zzav());
            } catch (Exception e10) {
                e = e10;
                zzaU(billingProgramReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzj
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzE(this.zza, externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaV(externalOfferReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaV(externalOfferReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbx(12);
        synchronized (this.zza) {
            try {
            } finally {
            }
            if (this.zzf != null) {
                this.zzf.zzh();
                try {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                    zzbj();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                }
                try {
                    zzbh();
                    zzbg(3);
                } catch (Throwable th3) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        zzbg(3);
                    } catch (Throwable th4) {
                        zzbg(3);
                        this.zzH = null;
                        throw th4;
                    }
                }
                this.zzH = null;
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                zzbj();
                zzbh();
                zzbg(3);
                this.zzH = null;
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzm
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzw(this.zza, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzN(this.zza, billingConfigResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult billingResultZzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, billingResultZzay);
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzay, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i10;
        synchronized (this.zza) {
            i10 = this.zzb;
        }
        return i10;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzax
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzI(this.zza, alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void isBillingProgramAvailableAsync(final int i10, final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzC(this.zza, billingProgramAvailabilityListener, i10);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaR(billingProgramAvailabilityListener, i10, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaR(billingProgramAvailabilityListener, i10, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzj
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbk
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzB(this.zza, externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaW(externalOfferAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaW(externalOfferAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzF) {
            return true;
        }
        return zzbm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e4  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.android.billingclient.api.BillingClientImpl] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzo
    public void launchExternalLink(final Activity activity, final LaunchExternalLinkParams launchExternalLinkParams, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        try {
            try {
                zzaN(new Callable() { // from class: com.android.billingclient.api.zzas
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws RemoteException {
                        BillingClientImpl.zzD(this.zza, launchExternalLinkResponseListener, launchExternalLinkParams, activity);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzaZ(launchExternalLinkResponseListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                    }
                }, zzav());
            } catch (Exception e10) {
                e = e10;
                zzaZ(launchExternalLinkResponseListener, zzay(), zzjd.SERVICE_CALL_EXCEPTION, e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                BillingClientImpl.zzt(this.zza, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzT(this.zza, productDetailsResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult billingResultZzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, billingResultZzay);
            productDetailsResponseListener.onProductDetailsResponse(billingResultZzay, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (zzK(new zzbm(this, purchasesResponseListener, queryPurchasesParams.zza(), queryPurchasesParams.getIncludeSuspendedSubscriptions()), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbj
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzM(this.zza, purchasesResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult billingResultZzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, billingResultZzay);
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzay, com.google.android.gms.internal.play_billing.zzbw.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzjd zzjdVar2 = zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzC;
            zzbs(zzjdVar2, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbo zzboVar = new zzbo(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzA(this.zza, alternativeBillingOnlyInformationDialogListener, activity, zzboVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult billingResultZzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 16, billingResultZzay);
        return billingResultZzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzj
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support external offer.");
            zzjd zzjdVar2 = zzjd.EXTERNAL_OFFER_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzt;
            zzbs(zzjdVar2, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbp zzbpVar = new zzbp(this, handler, externalOfferInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbc
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzF(this.zza, externalOfferInformationDialogListener, activity, zzbpVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaX(externalOfferInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult billingResultZzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 25, billingResultZzay);
        return billingResultZzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!zzbk(3000L)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
            return zzdc.zzj;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzdc.zzs;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        String str = this.zzd;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        Handler handler = this.zze;
        final zzbn zzbnVar = new zzbn(this, handler, inAppMessageResponseListener);
        zzK(new Callable() { // from class: com.android.billingclient.api.zzbh
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzv(this.zza, bundle, activity, zzbnVar);
                return null;
            }
        }, 5000L, null, handler, zzJ());
        return zzdc.zzi;
    }

    final synchronized ExecutorService zzJ() {
        try {
            if (this.zzI == null) {
                this.zzI = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new zzbl(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzI;
    }

    public final void zzao(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    @VisibleForTesting
    final zzcg zzh(QueryProductDetailsParams queryProductDetailsParams) throws JSONException {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbw zzbwVarZza = queryProductDetailsParams.zza();
        int size = zzbwVarZza.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList<QueryProductDetailsParams.Product> arrayList3 = new ArrayList(zzbwVarZza.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i12)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    return zzaw(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.zzw && this.zzE.isEnabledForPrepaidPlans();
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                Bundle bundleZzj = zzapVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), strZzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzg(str, this.zzd, arrayList3, null, null, com.google.android.gms.internal.play_billing.zza.zza(z10, true, true, true, false, true), this.zzJ.longValue()));
                if (bundleZzj == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzj.containsKey("DETAILS_LIST")) {
                    int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzj, "BillingClient");
                    String strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundleZzj, "BillingClient");
                    if (iZzb == 0) {
                        return zzaw(zzdc.zza(6, strZzk), zzjd.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzaw(zzdc.zza(iZzb, strZzk), zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i13));
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e10) {
                        return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (QueryProductDetailsParams.Product product : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put(InAppPurchaseMetaData.KEY_PRODUCT_ID, product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                    break;
                                }
                                ProductDetails productDetails2 = (ProductDetails) it.next();
                                if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                }
                            }
                        }
                    } else {
                        Iterator<String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct(it2.next());
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i10 = i11;
                } catch (JSONException e11) {
                    return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return zzaw(zzdc.zzj, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return zzaw(zzdc.zzh, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new zzcg(0, "", arrayList, arrayList2);
    }

    final zzcz zzk() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zzn(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzV(this.zza, billingResult);
            }
        });
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        zzbi(billingClientStateListener, 0);
    }

    @AnyThread
    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable DeveloperProvidedBillingListener developerProvidedBillingListener, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, developerProvidedBillingListener, str, null, builder);
    }

    private BillingClientImpl(String str) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, Context context, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = lValueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String strZzaE = zzaE();
        this.zzd = strZzaE;
        this.zzg = context.getApplicationContext();
        zzjp zzjpVarZza = zzjr.zza();
        zzjpVarZza.zzx(BuildConfig.VERSION_NAME);
        if (strZzaE != null) {
            zzjpVarZza.zzy(strZzaE);
        }
        zzjpVarZza.zzq(this.zzg.getPackageName());
        zzjpVarZza.zzd(lValueOf.longValue());
        zzjpVarZza.zzw(builder.zza);
        zzjpVarZza.zza(Build.VERSION.SDK_INT);
        zzjpVarZza.zzp(846465066L);
        zzbo(zzjpVarZza, context);
        try {
            zzjpVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th2);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zzjpVarZza.zzi());
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable DeveloperProvidedBillingListener developerProvidedBillingListener, String str, @Nullable zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zzjpVarZza = zzjr.zza();
        zzjpVarZza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zzjpVarZza.zzy(str2);
        }
        zzjpVarZza.zzq(this.zzg.getPackageName());
        zzjpVarZza.zzd(this.zzJ.longValue());
        zzjpVarZza.zzw(builder.zza);
        zzjpVarZza.zza(Build.VERSION.SDK_INT);
        zzjpVarZza.zzp(846465066L);
        zzbo(zzjpVarZza, context);
        try {
            zzjpVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th2);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zzjpVarZza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, null, userChoiceBillingListener, developerProvidedBillingListener, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = userChoiceBillingListener != null;
        this.zzF = builder.zza;
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdo zzdoVar, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = lValueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String strZzaE = zzaE();
        this.zzd = strZzaE;
        this.zzg = context.getApplicationContext();
        zzjp zzjpVarZza = zzjr.zza();
        zzjpVarZza.zzx(BuildConfig.VERSION_NAME);
        if (strZzaE != null) {
            zzjpVarZza.zzy(strZzaE);
        }
        zzjpVarZza.zzq(this.zzg.getPackageName());
        zzjpVarZza.zzd(lValueOf.longValue());
        zzjpVarZza.zzw(builder.zza);
        zzjpVarZza.zza(Build.VERSION.SDK_INT);
        zzjpVarZza.zzp(846465066L);
        zzbo(zzjpVarZza, context);
        try {
            zzjpVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th2);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zzjpVarZza.zzi());
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new zzab(this.zzg, null, null, null, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzb zzbVar, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, null, BuildConfig.VERSION_NAME, null, builder);
    }

    @AnyThread
    BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable DeveloperProvidedBillingListener developerProvidedBillingListener, @Nullable zzcz zzczVar, @Nullable ExecutorService executorService, BillingClient.Builder builder) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, BuildConfig.VERSION_NAME, null, userChoiceBillingListener, developerProvidedBillingListener, null, null, builder);
    }
}
