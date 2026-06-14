package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a f23878a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.f23878a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (o.f23888a == null || (aVar = this.f23878a) == null) {
                return;
            }
            o.f23888a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
