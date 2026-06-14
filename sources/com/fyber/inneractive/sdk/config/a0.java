package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f20321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f20322b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.f20321a = iAConfigManager;
        this.f20322b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = Omid.f34991a;
            com.fyber.inneractive.sdk.util.r.f23896b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
