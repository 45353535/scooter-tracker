package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f34206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f34207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f34208c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34209d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f34206a = linkedBlockingQueue;
        this.f34207b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f34208c.poll();
        this.f34209d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f34207b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f34208c.add(bVar);
        if (this.f34209d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.a
    public void a(b bVar) {
        this.f34209d = null;
        a();
    }
}
