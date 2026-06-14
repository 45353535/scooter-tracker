package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f21274a;

    public a(b bVar) {
        this.f21274a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = b.a(this.f21274a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f21274a.f21277b = g.a(fileA, 41943040L);
                g gVar = this.f21274a.f21277b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f21450a);
                this.f21274a.f21277b = g.a(fileA, 41943040L);
                g gVar2 = this.f21274a.f21277b;
                synchronized (gVar2) {
                    j10 = gVar2.f21457h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                b bVar = this.f21274a;
                bVar.f21277b.f21461l = bVar;
                bVar.f21278c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
