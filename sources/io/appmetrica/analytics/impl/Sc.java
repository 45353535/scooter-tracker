package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Sc implements InterfaceC5456tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f76436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f76437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f76438d;

    public Sc(@NotNull Context context) {
        this.f76435a = context;
        this.f76436b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C5468ua.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f76437c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f76438d = new CachedDataProvider.CachedData(millis, millis * ((long) 2), "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5456tn
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Rc a() {
        Rc rc2;
        try {
            rc2 = (Rc) this.f76438d.getData();
            if (rc2 == null || this.f76438d.shouldUpdateData()) {
                rc2 = new Rc(this.f76436b.hasNecessaryPermissions(this.f76435a) ? this.f76437c.getNetworkType() : "unknown");
                this.f76438d.setData(rc2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return rc2;
    }
}
