package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111852a;

    public i40(ArrayList arrayList) {
        this.f111852a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i40) && Intrinsics.areEqual(this.f111852a, ((i40) obj).f111852a);
    }

    public final int hashCode() {
        return this.f111852a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f111852a + ")";
    }
}
