package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes12.dex */
public final class B2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiConsumer f75567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f75568b;

    public B2(V2 v22, ICommonExecutor iCommonExecutor) {
        this.f75567a = v22;
        this.f75568b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f75568b.execute(new A2(this, context, intent));
    }
}
