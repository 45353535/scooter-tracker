package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public class POBAdvertisingIdClient {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile POBAdvertisingIdClient f62530g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f62532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Future f62533c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SharedPreferences f62536f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f62534d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f62535e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f62531a = Executors.newSingleThreadExecutor();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(POBAdvertisingIdClient.this.f62532b);
                String id2 = advertisingIdInfo.getId();
                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                if (id2 != null && !id2.equals(POBAdvertisingIdClient.this.getAdvertisingId())) {
                    POBAdvertisingIdClient.this.saveAndroidAid(id2);
                }
                if (zIsLimitAdTrackingEnabled != POBAdvertisingIdClient.this.getLMTState()) {
                    POBAdvertisingIdClient.this.saveLMTState(zIsLimitAdTrackingEnabled);
                }
            } catch (Exception e10) {
                e = e10;
                POBLog.error("POBAdvertisingIdClient", "Error while requesting AAID: ", e.getMessage());
            } catch (NoClassDefFoundError e11) {
                e = e11;
                POBLog.error("POBAdvertisingIdClient", "Error while requesting AAID: ", e.getMessage());
            }
        }
    }

    private POBAdvertisingIdClient(Context context) {
        this.f62532b = context.getApplicationContext();
        this.f62536f = context.getApplicationContext().getSharedPreferences("aid_shared_preference", 0);
    }

    public static POBAdvertisingIdClient getInstance(@NonNull Context context) {
        if (f62530g == null) {
            synchronized (POBAdvertisingIdClient.class) {
                try {
                    if (f62530g == null) {
                        f62530g = new POBAdvertisingIdClient(context);
                    }
                } finally {
                }
            }
        }
        return f62530g;
    }

    @Nullable
    public String getAdvertisingId() {
        if (this.f62534d == null) {
            this.f62531a.submit(new Runnable() { // from class: com.pubmatic.sdk.common.utility.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62596b.a();
                }
            });
        }
        return this.f62534d;
    }

    public boolean getLMTState() {
        if (this.f62535e == null) {
            this.f62531a.submit(new Runnable() { // from class: com.pubmatic.sdk.common.utility.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62595b.b();
                }
            });
        }
        return Boolean.TRUE.equals(this.f62535e);
    }

    protected boolean isReadyToRefresh() {
        Future future = this.f62533c;
        if (future != null) {
            return future.isDone();
        }
        return true;
    }

    public boolean refreshAAID() {
        if (isReadyToRefresh()) {
            c();
            return true;
        }
        POBLog.debug("POBAdvertisingIdClient", "Skipping AAID update as last request is in progress", new Object[0]);
        return false;
    }

    protected void saveAndroidAid(@NonNull String str) {
        this.f62534d = str;
        SharedPreferences.Editor editorEdit = this.f62536f.edit();
        if (editorEdit != null) {
            editorEdit.putString("aid_key", str);
            editorEdit.apply();
        }
    }

    protected void saveLMTState(boolean z10) {
        this.f62535e = Boolean.valueOf(z10);
        SharedPreferences.Editor editorEdit = this.f62536f.edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("limited_tracking_ad_key", z10);
            editorEdit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f62534d = this.f62536f.getString("aid_key", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f62535e = Boolean.valueOf(this.f62536f.getBoolean("limited_tracking_ad_key", false));
    }

    private void c() {
        try {
            this.f62533c = this.f62531a.submit(new a());
        } catch (OutOfMemoryError | RejectedExecutionException e10) {
            POBLog.error("POBAdvertisingIdClient", "Unable to dispatch thread while requesting AAID: ", e10.getMessage());
        }
    }
}
