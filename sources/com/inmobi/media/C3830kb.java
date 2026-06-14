package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3830kb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Intrinsics.checkNotNullExpressionValue(C3880mb.f39030e, "access$getTAG$p(...)");
        C3880mb.f39031f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C3880mb.f39031f = false;
        Intrinsics.checkNotNullExpressionValue(C3880mb.f39030e, "access$getTAG$p(...)");
    }
}
