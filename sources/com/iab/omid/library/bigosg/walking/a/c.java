package com.iab.omid.library.bigosg.walking.a;

import com.iab.omid.library.bigosg.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f34598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f34599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f34600c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34601d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f34598a = linkedBlockingQueue;
        this.f34599b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f34600c.poll();
        this.f34601d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f34599b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f34600c.add(bVar);
        if (this.f34601d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.a
    public void a(b bVar) {
        this.f34601d = null;
        a();
    }
}
