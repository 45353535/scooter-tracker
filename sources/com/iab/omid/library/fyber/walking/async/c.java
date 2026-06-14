package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f35117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f35118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f35119c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f35120d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f35117a = linkedBlockingQueue;
        this.f35118b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f35119c.poll();
        this.f35120d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f35118b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f35119c.add(bVar);
        if (this.f35120d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.a
    public void a(b bVar) {
        this.f35120d = null;
        a();
    }
}
