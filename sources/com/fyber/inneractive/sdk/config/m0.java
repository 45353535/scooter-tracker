package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20425b;

    public m0(Context context, w wVar) {
        this.f20424a = context;
        this.f20425b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            int i10 = AdvertisingIdClient.f25284a;
            n0.a(this.f20424a, this.f20425b);
            v vVar = u.f20500a.f20508b;
            if (TextUtils.isEmpty(vVar != null ? vVar.f20504a : null)) {
                n.a(this.f20424a, this.f20425b);
            }
        } catch (Throwable th2) {
            IAlog.b("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + th2.toString(), new Object[0]);
        }
    }
}
