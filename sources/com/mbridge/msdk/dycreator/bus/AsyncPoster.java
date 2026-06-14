package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes10.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f48035a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f48036b;

    AsyncPoster(EventBus eventBus) {
        this.f48036b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f48035a.a(PendingPost.a(subscription, obj));
        EventBus.f48040n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f48035a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f48036b.a(pendingPostA);
    }
}
