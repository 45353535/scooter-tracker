package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TransportContext f24544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventInternal f24545c;

    AutoValue_PersistedEvent(long j10, TransportContext transportContext, EventInternal eventInternal) {
        this.f24543a = j10;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f24544b = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.f24545c = eventInternal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedEvent) {
            PersistedEvent persistedEvent = (PersistedEvent) obj;
            if (this.f24543a == persistedEvent.getId() && this.f24544b.equals(persistedEvent.getTransportContext()) && this.f24545c.equals(persistedEvent.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.f24545c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f24543a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.f24544b;
    }

    public int hashCode() {
        long j10 = this.f24543a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f24544b.hashCode()) * 1000003) ^ this.f24545c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f24543a + ", transportContext=" + this.f24544b + ", event=" + this.f24545c + "}";
    }
}
