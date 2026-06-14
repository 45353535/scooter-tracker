package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110182a;

    public e40(List list) {
        this.f110182a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e40) && Intrinsics.areEqual(this.f110182a, ((e40) obj).f110182a);
    }

    public final int hashCode() {
        return this.f110182a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f110182a + ")";
    }
}
