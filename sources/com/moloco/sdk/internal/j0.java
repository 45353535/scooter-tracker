package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f54450a;

    public j0(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f54450a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.i0
    public boolean a(String url, long j10, d0 d0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVarB;
        Intrinsics.checkNotNullParameter(url, "url");
        if (d0Var != null) {
            try {
                cVarB = d0Var.b();
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e10.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVarB = null;
        }
        Uri uriBuild = Uri.parse(b(url, j10, cVarB)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar = this.f54450a;
        String string = uriBuild.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lVar.a(string);
        return true;
    }

    public final String b(String str, long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String strC;
        if (cVar != null && (strC = com.moloco.sdk.internal.utils.d.c(str, cVar.a())) != null) {
            str = strC;
        }
        return com.moloco.sdk.internal.utils.d.b(str, j10);
    }
}
