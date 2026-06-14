package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Priority f24111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ProductData f24112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EventContext f24113e;

    AutoValue_Event(Integer num, Object obj, Priority priority, ProductData productData, EventContext eventContext) {
        this.f24109a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f24110b = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f24111c = priority;
        this.f24112d = productData;
        this.f24113e = eventContext;
    }

    public boolean equals(Object obj) {
        ProductData productData;
        EventContext eventContext;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Event) {
            Event event = (Event) obj;
            Integer num = this.f24109a;
            if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
                if (this.f24110b.equals(event.getPayload()) && this.f24111c.equals(event.getPriority()) && ((productData = this.f24112d) != null ? productData.equals(event.getProductData()) : event.getProductData() == null) && ((eventContext = this.f24113e) != null ? eventContext.equals(event.getEventContext()) : event.getEventContext() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.f24109a;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public EventContext getEventContext() {
        return this.f24113e;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return (T) this.f24110b;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.f24111c;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public ProductData getProductData() {
        return this.f24112d;
    }

    public int hashCode() {
        Integer num = this.f24109a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f24110b.hashCode()) * 1000003) ^ this.f24111c.hashCode()) * 1000003;
        ProductData productData = this.f24112d;
        int iHashCode2 = (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        EventContext eventContext = this.f24113e;
        return iHashCode2 ^ (eventContext != null ? eventContext.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f24109a + ", payload=" + this.f24110b + ", priority=" + this.f24111c + ", productData=" + this.f24112d + ", eventContext=" + this.f24113e + "}";
    }
}
