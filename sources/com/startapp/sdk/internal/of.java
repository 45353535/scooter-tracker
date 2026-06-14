package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public final class of implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f65040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf f65041b;

    public of(sf sfVar, Activity activity) {
        this.f65041b = sfVar;
        this.f65040a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65041b.b(this.f65040a);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
