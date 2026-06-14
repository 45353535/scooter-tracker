package com.iab.omid.library.mobilefuse.walking.async;

import com.iab.omid.library.mobilefuse.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f35663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f35664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f35665c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f35666d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f35663a = linkedBlockingQueue;
        this.f35664b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f35665c.poll();
        this.f35666d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f35664b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f35665c.add(bVar);
        if (this.f35666d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.b.a
    public void a(b bVar) {
        this.f35666d = null;
        a();
    }
}
