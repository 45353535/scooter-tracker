package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25284a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;

    @Nullable
    BlockingServiceConnection zza;

    @Nullable
    zzf zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzi;

    @KeepForSdkWithMembers
    public static final class Info {

        @Nullable
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@Nullable String str, boolean z10) {
            this.zza = str;
            this.zzb = z10;
        }

        @Nullable
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws Throwable {
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        zzd zzdVarZza = zzd.zza(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = -1;
        try {
            Info infoZzf = advertisingIdClient2.zzf(-1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            advertisingIdClient2.zze(infoZzf, true, 0.0f, jElapsedRealtime2, "", null);
            try {
                zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                jElapsedRealtime = jElapsedRealtime;
                Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
                return infoZzf;
            } catch (Throwable th2) {
                th = th2;
                zzdVarZza = zzdVarZza;
                jElapsedRealtime = jElapsedRealtime;
                Throwable th3 = th;
                advertisingIdClient2.zze(null, true, 0.0f, -1L, "", th3);
                if (th3 instanceof IOException) {
                    i10 = 1;
                } else if (th3 instanceof GooglePlayServicesNotAvailableException) {
                    i10 = 9;
                } else if (th3 instanceof GooglePlayServicesRepairableException) {
                    i10 = 16;
                } else if (th3 instanceof IllegalStateException) {
                    i10 = 8;
                }
                zzdVarZza.zzc(35401, i10, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                Preconditions.checkNotNull(advertisingIdClient.zza);
                Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zZzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception", e10);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }

    private final Info zzf(int i10) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            Preconditions.checkNotNull(this.zza);
            Preconditions.checkNotNull(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception", e10);
            }
        }
        zzb();
        return info;
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    @KeepForSdk
    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzc(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzi, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.zzf;
            if (j10 > 0) {
                this.zze = new zzb(this, j10);
            }
        }
    }

    @VisibleForTesting
    protected final void zzc(boolean z10) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        IOException iOException;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        if (z10) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            try {
                                this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } finally {
        }
    }

    @VisibleForTesting
    final boolean zze(@Nullable Info info, boolean z10, float f10, long j10, String str, @Nullable Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put(C4240b4.i.L0, "1");
        if (info != null) {
            map.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put(s.z.f67720z, "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new zza(this, map).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j10, boolean z10, boolean z11) {
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j10;
    }
}
