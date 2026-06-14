package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f35393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f35394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f35395c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f35396d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f35393a = linkedBlockingQueue;
        this.f35394b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f35395c.poll();
        this.f35396d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f35394b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f35395c.add(bVar);
        if (this.f35396d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.a
    public void a(b bVar) {
        this.f35396d = null;
        a();
    }
}
