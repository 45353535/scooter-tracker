package com.iab.omid.library.corpmailru.walking.a;

import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f34981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f34982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f34983c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34984d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f34981a = linkedBlockingQueue;
        this.f34982b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f34983c.poll();
        this.f34984d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f34982b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f34983c.add(bVar);
        if (this.f34984d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.a
    public void a(b bVar) {
        this.f34984d = null;
        a();
    }
}
