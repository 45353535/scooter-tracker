package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.n;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55707a;

    public p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55707a = context;
    }

    @Override // com.moloco.sdk.internal.services.o
    public n a() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f55707a));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        n aVar = null;
        if (Result.i(objB)) {
            objB = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) objB;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                aVar = n.b.f55706a;
            } else {
                String id2 = info.getId();
                if (id2 != null) {
                    aVar = new n.a(id2);
                }
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return n.b.f55706a;
    }
}
