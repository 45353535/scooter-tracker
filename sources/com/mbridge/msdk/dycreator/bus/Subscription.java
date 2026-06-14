package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes10.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f48076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f48077b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f48076a = obj;
        this.f48077b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f48076a == subscription.f48076a && this.f48077b.equals(subscription.f48077b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f48076a.hashCode() + this.f48077b.f48073d.hashCode();
    }
}
