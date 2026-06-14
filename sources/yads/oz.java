package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja f114450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f114452d;

    public oz(String str, ja jaVar, String str2, List list) {
        this.f114449a = str;
        this.f114450b = jaVar;
        this.f114451c = str2;
        this.f114452d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        return Intrinsics.areEqual(this.f114449a, ozVar.f114449a) && Intrinsics.areEqual(this.f114450b, ozVar.f114450b) && Intrinsics.areEqual(this.f114451c, ozVar.f114451c) && Intrinsics.areEqual(this.f114452d, ozVar.f114452d);
    }

    public final int hashCode() {
        int iHashCode = this.f114449a.hashCode() * 31;
        ja jaVar = this.f114450b;
        int iHashCode2 = (iHashCode + (jaVar == null ? 0 : jaVar.hashCode())) * 31;
        String str = this.f114451c;
        return this.f114452d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f114449a + ", adSize=" + this.f114450b + ", data=" + this.f114451c + ", creatives=" + this.f114452d + ")";
    }
}
