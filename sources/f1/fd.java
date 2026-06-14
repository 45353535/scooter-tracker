package f1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4 f69863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f69864b;

    public fd(t4 eventData, List pendingTrackers) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(pendingTrackers, "pendingTrackers");
        this.f69863a = eventData;
        this.f69864b = pendingTrackers;
    }

    public final t4 a() {
        return this.f69863a;
    }

    public final List b() {
        return this.f69864b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return Intrinsics.areEqual(this.f69863a, fdVar.f69863a) && Intrinsics.areEqual(this.f69864b, fdVar.f69864b);
    }

    public int hashCode() {
        return (this.f69863a.hashCode() * 31) + this.f69864b.hashCode();
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.f69863a + ", pendingTrackers=" + this.f69864b + ")";
    }
}
