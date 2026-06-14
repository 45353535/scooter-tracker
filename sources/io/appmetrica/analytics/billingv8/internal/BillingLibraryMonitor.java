package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.c;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\u0018"}, d2 = {"Lio/appmetrica/analytics/billingv8/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "Lio/appmetrica/analytics/billingv8/impl/n;", "", "onSessionResumed", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "onUpdateFinished", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "billing-v8_release"}, k = 1, mv = {1, 6, 0})
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f75154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f75155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f75156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f75157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f75158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f75159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BillingConfig f75160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f75161h;

    public BillingLibraryMonitor(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull BillingInfoStorage billingInfoStorage, @NotNull BillingInfoSender billingInfoSender, @NotNull BillingInfoManager billingInfoManager, @NotNull UpdatePolicy updatePolicy) {
        this.f75154a = context;
        this.f75155b = executor;
        this.f75156c = executor2;
        this.f75157d = billingInfoSender;
        this.f75158e = billingInfoManager;
        this.f75159f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(@Nullable BillingConfig billingConfig) {
        if (Intrinsics.areEqual(this.f75160g, billingConfig)) {
            return;
        }
        this.f75160g = billingConfig;
        if (billingConfig != null && !this.f75161h) {
            this.f75161h = true;
            BillingClient billingClientBuild = BillingClient.newBuilder(this.f75154a).setListener(new l()).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
            try {
                billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    @WorkerThread
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f75160g;
            if (billingConfig != null && !this.f75161h) {
                this.f75161h = true;
                BillingClient billingClientBuild = BillingClient.newBuilder(this.f75154a).setListener(new l()).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f75161h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i10 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i10 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
