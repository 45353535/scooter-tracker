package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class AFd1vSDK implements AFd1wSDK {

    @NotNull
    private final AFd1zSDK getRevenue;

    public AFd1vSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getRevenue = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getRevenue(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1qSDK(bArr, map, 2000).getRevenue()) {
            this.getRevenue.getCurrencyIso4217Code();
        }
    }
}
