package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;

/* JADX INFO: loaded from: classes11.dex */
public final class q6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager$DiskCachedAd f65136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r6 f65137b;

    public q6(r6 r6Var, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd) {
        this.f65137b = r6Var;
        this.f65136a = diskAdCacheManager$DiskCachedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = this.f65136a;
            if (diskAdCacheManager$DiskCachedAd == null) {
                r6 r6Var = this.f65137b;
                a0.a(r6Var.f65187a, r6Var.f65189c, null, true);
                return;
            }
            if (diskAdCacheManager$DiskCachedAd.a() != null && this.f65136a.a().isReady()) {
                if (this.f65136a.a().hasAdCacheTtlPassed()) {
                    r6 r6Var2 = this.f65137b;
                    a0.a(r6Var2.f65187a, r6Var2.f65189c, null, true);
                    return;
                } else {
                    r6 r6Var3 = this.f65137b;
                    t6.a(r6Var3.f65187a, this.f65136a, r6Var3.f65190d, r6Var3.f65189c);
                    return;
                }
            }
            r6 r6Var4 = this.f65137b;
            a0.a(r6Var4.f65187a, r6Var4.f65189c, null, true);
        } catch (Throwable th2) {
            g9.a(th2);
            r6 r6Var5 = this.f65137b;
            a0.a(r6Var5.f65187a, r6Var5.f65189c, null, true);
        }
    }
}
