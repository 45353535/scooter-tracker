package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f36465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f36466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f36467c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f36468d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36465a = linkedBlockingQueue;
        this.f36466b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f36467c.poll();
        this.f36468d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f36466b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f36467c.add(bVar);
        if (this.f36468d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.a
    public void a(b bVar) {
        this.f36468d = null;
        a();
    }
}
