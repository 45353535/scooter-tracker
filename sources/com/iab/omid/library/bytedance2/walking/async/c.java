package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f34727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f34728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f34729c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34730d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f34727a = linkedBlockingQueue;
        this.f34728b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f34729c.poll();
        this.f34730d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f34728b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f34729c.add(bVar);
        if (this.f34730d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f34730d = null;
        a();
    }
}
