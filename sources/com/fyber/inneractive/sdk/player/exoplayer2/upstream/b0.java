package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f22943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f22944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f22945c;

    public b0(String str) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
        this.f22943a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final boolean a() {
        return this.f22944b != null;
    }

    public final void b() throws IOException {
        IOException iOException = this.f22945c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f22944b;
        if (yVar != null) {
            int i10 = yVar.f23093c;
            IOException iOException2 = yVar.f23095e;
            if (iOException2 != null && yVar.f23096f > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f22944b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f22943a.execute(kVar);
        }
        this.f22943a.shutdown();
    }
}
