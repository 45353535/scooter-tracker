package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f48064d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f48065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f48066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f48067c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f48065a = obj;
        this.f48066b = subscription;
    }

    static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f48064d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f48065a = obj;
                pendingPostRemove.f48066b = subscription;
                pendingPostRemove.f48067c = null;
                return pendingPostRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void a(PendingPost pendingPost) {
        pendingPost.f48065a = null;
        pendingPost.f48066b = null;
        pendingPost.f48067c = null;
        List<PendingPost> list = f48064d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
