package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f21473a;

    public m(n nVar) {
        this.f21473a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = n.a(this.f21473a.f21475a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", fileA);
                this.f21473a.f21476b = g.a(fileA, 52428800L);
                g gVar = this.f21473a.f21476b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f21450a);
                this.f21473a.f21476b = g.a(fileA, 52428800L);
                g gVar2 = this.f21473a.f21476b;
                synchronized (gVar2) {
                    j10 = gVar2.f21457h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                n nVar = this.f21473a;
                nVar.f21476b.f21461l = nVar;
                nVar.f21477c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
