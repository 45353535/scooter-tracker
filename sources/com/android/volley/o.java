package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o {
    private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
    private final com.android.volley.b mCache;
    private com.android.volley.c mCacheDispatcher;
    private final PriorityBlockingQueue<n> mCacheQueue;
    private final Set<n> mCurrentRequests;
    private final q mDelivery;
    private final i[] mDispatchers;
    private final List<b> mEventListeners;
    private final List<d> mFinishedListeners;
    private final h mNetwork;
    private final PriorityBlockingQueue<n> mNetworkQueue;
    private final AtomicInteger mSequenceGenerator;

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f7539a;

        a(Object obj) {
            this.f7539a = obj;
        }

        @Override // com.android.volley.o.c
        public boolean apply(n nVar) {
            return nVar.getTag() == this.f7539a;
        }
    }

    public interface b {
    }

    public interface c {
        boolean apply(n nVar);
    }

    public interface d {
    }

    public o(com.android.volley.b bVar, h hVar, int i10, q qVar) {
        this.mSequenceGenerator = new AtomicInteger();
        this.mCurrentRequests = new HashSet();
        this.mCacheQueue = new PriorityBlockingQueue<>();
        this.mNetworkQueue = new PriorityBlockingQueue<>();
        this.mFinishedListeners = new ArrayList();
        this.mEventListeners = new ArrayList();
        this.mCache = bVar;
        this.mNetwork = hVar;
        this.mDispatchers = new i[i10];
        this.mDelivery = qVar;
    }

    public <T> n add(n nVar) {
        nVar.setRequestQueue(this);
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.add(nVar);
        }
        nVar.setSequence(getSequenceNumber());
        nVar.addMarker("add-to-queue");
        sendRequestEvent(nVar, 0);
        beginRequest(nVar);
        return nVar;
    }

    public void addRequestEventListener(b bVar) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.add(bVar);
        }
    }

    @Deprecated
    public <T> void addRequestFinishedListener(d dVar) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.add(dVar);
        }
    }

    <T> void beginRequest(n nVar) {
        if (nVar.shouldCache()) {
            this.mCacheQueue.add(nVar);
        } else {
            sendRequestOverNetwork(nVar);
        }
    }

    public void cancelAll(c cVar) {
        synchronized (this.mCurrentRequests) {
            try {
                for (n nVar : this.mCurrentRequests) {
                    if (cVar.apply(nVar)) {
                        nVar.cancel();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void finish(n nVar) {
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.remove(nVar);
        }
        synchronized (this.mFinishedListeners) {
            Iterator<d> it = this.mFinishedListeners.iterator();
            if (it.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                throw null;
            }
        }
        sendRequestEvent(nVar, 5);
    }

    public com.android.volley.b getCache() {
        return this.mCache;
    }

    public q getResponseDelivery() {
        return this.mDelivery;
    }

    public int getSequenceNumber() {
        return this.mSequenceGenerator.incrementAndGet();
    }

    public void removeRequestEventListener(b bVar) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.remove(bVar);
        }
    }

    @Deprecated
    public <T> void removeRequestFinishedListener(d dVar) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.remove(dVar);
        }
    }

    void sendRequestEvent(n nVar, int i10) {
        synchronized (this.mEventListeners) {
            try {
                Iterator<b> it = this.mEventListeners.iterator();
                if (it.hasNext()) {
                    androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void sendRequestOverNetwork(n nVar) {
        this.mNetworkQueue.add(nVar);
    }

    public void start() {
        stop();
        com.android.volley.c cVar = new com.android.volley.c(this.mCacheQueue, this.mNetworkQueue, this.mCache, this.mDelivery);
        this.mCacheDispatcher = cVar;
        cVar.start();
        for (int i10 = 0; i10 < this.mDispatchers.length; i10++) {
            i iVar = new i(this.mNetworkQueue, this.mNetwork, this.mCache, this.mDelivery);
            this.mDispatchers[i10] = iVar;
            iVar.start();
        }
    }

    public void stop() {
        com.android.volley.c cVar = this.mCacheDispatcher;
        if (cVar != null) {
            cVar.e();
        }
        for (i iVar : this.mDispatchers) {
            if (iVar != null) {
                iVar.f();
            }
        }
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((c) new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public o(com.android.volley.b bVar, h hVar, int i10) {
        this(bVar, hVar, i10, new f(new Handler(Looper.getMainLooper())));
    }

    public o(com.android.volley.b bVar, h hVar) {
        this(bVar, hVar, 4);
    }
}
