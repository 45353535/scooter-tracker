package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public class DeadEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30517b;

    public DeadEvent(Object obj, Object obj2) {
        this.f30516a = Preconditions.checkNotNull(obj);
        this.f30517b = Preconditions.checkNotNull(obj2);
    }

    public Object getEvent() {
        return this.f30517b;
    }

    public Object getSource() {
        return this.f30516a;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.f30516a).add("event", this.f30517b).toString();
    }
}
