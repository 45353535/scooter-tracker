package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class U implements Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f76531b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FutureTask f76538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J f76539j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f76542m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76532c = "advertising identifiers collecting is forbidden by client configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76533d = "advertising identifiers collecting is forbidden by startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76534e = "advertising identifiers collecting is forbidden by unknown reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f76535f = new N(new Eg("google"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f76536g = new N(new Eg("huawei"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f76537h = new N(new Eg("yandex"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f76540k = new AdvertisingIdsHolder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f76541l = new G(4, 4, 4);

    public U(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C5204jm c5204jm) {
        this.f76530a = context;
        this.f76531b = iCommonExecutor;
        this.f76539j = new J(c5204jm);
    }

    public static final Void e(U u10) {
        u10.f76540k = new AdvertisingIdsHolder(u10.a(u10.f76541l.f75802a, new Q(u10)), u10.a(u10.f76541l.f75803b, new S(u10)), u10.a(u10.f76541l.f75804c, new T(u10, new C5067ee())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void init() {
        if (this.f76538i == null) {
            this.f76541l = this.f76539j.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.up
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return U.e(this.f78402b);
                }
            });
            this.f76538i = futureTask;
            this.f76531b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha, io.appmetrica.analytics.impl.InterfaceC5331om
    public final synchronized void a(@NotNull C5204jm c5204jm) {
        this.f76539j.a(c5204jm);
        a((Li) new C5067ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void b(boolean z10) {
        this.f76542m = true;
        this.f76539j.f75972b.update(z10);
        a((Li) new C5067ee(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized void c(boolean z10) {
        if (!this.f76542m) {
            b(z10);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f76538i;
        if (futureTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ToolBar.REFRESH);
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f76540k;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C5067ee());
    }

    @Override // io.appmetrica.analytics.impl.Ha
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull Li li) {
        try {
            a(li, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f76540k;
    }

    public final FutureTask a(final Li li, final boolean z10) {
        final G gA = this.f76539j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.tp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z10, gA, this, li);
            }
        });
        this.f76538i = futureTask;
        this.f76531b.execute(futureTask);
        FutureTask futureTask2 = this.f76538i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ToolBar.REFRESH);
        return null;
    }

    public static final Void a(boolean z10, G g10, U u10, Li li) {
        if (!z10 && Intrinsics.areEqual(g10, u10.f76541l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u10.f76540k;
        AdTrackingInfoResult adTrackingInfoResultA = u10.a(g10.f75802a, new Q(u10));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = u10.a(g10.f75803b, new S(u10));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = u10.a(g10.f75804c, new T(u10, li));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        u10.f76540k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public final AdTrackingInfoResult a(int i10, Function0 function0) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (AdTrackingInfoResult) function0.invoke();
        }
        if (i11 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f76532c);
        }
        if (i11 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f76533d);
        }
        if (i11 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f76534e);
        }
        throw new lf.m();
    }
}
