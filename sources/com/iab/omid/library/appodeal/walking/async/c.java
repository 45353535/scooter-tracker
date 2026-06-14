package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f34477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f34478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f34479c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34480d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f34477a = linkedBlockingQueue;
        this.f34478b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f34479c.poll();
        this.f34480d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f34478b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f34479c.add(bVar);
        if (this.f34480d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.a
    public void a(b bVar) {
        this.f34480d = null;
        a();
    }
}
