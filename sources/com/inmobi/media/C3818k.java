package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3818k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3968q c3968q = C3968q.f39323a;
            C4148x5.f39893a.getClass();
            if (C4148x5.w()) {
                eg.i.d(C3968q.f39329g, null, null, new C3868m(null), 3, null);
            } else {
                C3968q.a((Float) null);
            }
        }
    }
}
