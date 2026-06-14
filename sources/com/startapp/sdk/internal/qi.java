package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public final class qi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f65164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f65165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f65166c;

    public qi(Intent[] intentArr, Context context, String str) {
        this.f65164a = intentArr;
        this.f65165b = context;
        this.f65166c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65164a[0] = vi.a(this.f65165b, this.f65166c);
        synchronized (this.f65164a) {
            this.f65164a.notifyAll();
        }
    }
}
