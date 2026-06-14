package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f114871a;

    public q40(ArrayList arrayList) {
        this.f114871a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q40) && Intrinsics.areEqual(this.f114871a, ((q40) obj).f114871a);
    }

    public final int hashCode() {
        return this.f114871a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f114871a + ")";
    }
}
