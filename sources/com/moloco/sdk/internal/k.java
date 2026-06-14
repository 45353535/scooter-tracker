package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f54451a;

    public k(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f54451a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.j
    public void a(String burl) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        try {
            Uri uri = Uri.parse(burl);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar = this.f54451a;
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            lVar.a(string);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e10.toString(), null, false, 12, null);
        }
    }
}
