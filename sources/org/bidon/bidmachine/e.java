package org.bidon.bidmachine;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f97136c;

    public e(String sellerId, String str, Map map) {
        Intrinsics.checkNotNullParameter(sellerId, "sellerId");
        this.f97134a = sellerId;
        this.f97135b = str;
        this.f97136c = map;
    }

    public final Map a() {
        return this.f97136c;
    }

    public final String b() {
        return this.f97134a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f97134a, eVar.f97134a) && Intrinsics.areEqual(this.f97135b, eVar.f97135b) && Intrinsics.areEqual(this.f97136c, eVar.f97136c);
    }

    public int hashCode() {
        int iHashCode = this.f97134a.hashCode() * 31;
        String str = this.f97135b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f97136c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "BidMachineParameters(sellerId=" + this.f97134a + ", endpoint=" + this.f97135b + ", placements=" + this.f97136c + ")";
    }
}
