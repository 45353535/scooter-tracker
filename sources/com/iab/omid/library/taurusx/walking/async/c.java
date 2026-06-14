package com.iab.omid.library.taurusx.walking.async;

import com.iab.omid.library.taurusx.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f36196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f36197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f36198c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f36199d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36196a = linkedBlockingQueue;
        this.f36197b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f36198c.poll();
        this.f36199d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f36197b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f36198c.add(bVar);
        if (this.f36199d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.taurusx.walking.async.b.a
    public void a(b bVar) {
        this.f36199d = null;
        a();
    }
}
