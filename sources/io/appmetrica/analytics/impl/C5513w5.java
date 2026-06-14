package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5513w5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5181j f78484b = C5468ua.k().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumSet f78485c = EnumSet.of(NetworkType.OFFLINE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78486d = "connection based";

    public C5513w5(@NotNull Context context) {
        this.f78483a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C5181j c5181j = this.f78484b;
        Context context = this.f78483a;
        c5181j.getClass();
        He he2 = Le.f76072a;
        return !this.f78485c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f78486d;
    }
}
