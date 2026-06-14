package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes10.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f48068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f48069b;

    PendingPostQueue() {
    }

    synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f48069b;
            if (pendingPost2 != null) {
                pendingPost2.f48067c = pendingPost;
                this.f48069b = pendingPost;
            } else {
                if (this.f48068a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f48069b = pendingPost;
                this.f48068a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f48068a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f48067c;
            this.f48068a = pendingPost2;
            if (pendingPost2 == null) {
                this.f48069b = null;
            }
        }
        return pendingPost;
    }

    synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f48068a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a();
    }
}
