package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class zzb implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ zzb f31759b = new zzb();

    private /* synthetic */ zzb() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
