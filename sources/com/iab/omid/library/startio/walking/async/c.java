package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f36068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f36069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f36070c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f36071d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36068a = linkedBlockingQueue;
        this.f36069b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f36070c.poll();
        this.f36071d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f36069b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f36070c.add(bVar);
        if (this.f36071d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.startio.walking.async.b.a
    public void a(b bVar) {
        this.f36071d = null;
        a();
    }
}
