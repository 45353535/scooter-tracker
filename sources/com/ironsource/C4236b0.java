package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4236b0 implements InterfaceC4218a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4622xc f42446a;

    public C4236b0(@NotNull InterfaceC4622xc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f42446a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC4218a0
    public void a(@NotNull Activity activity, @NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f42446a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4218a0
    public boolean a(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f42446a.a(adInstance);
    }
}
