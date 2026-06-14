package yads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ua3 implements ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lc1 f116593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f116595d;

    public ua3(String str, lc1 lc1Var, String str2, HashMap map) {
        this.f116592a = str;
        this.f116593b = lc1Var;
        this.f116594c = str2;
        this.f116595d = map;
    }

    @Override // yads.ah3
    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.f116595d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua3)) {
            return false;
        }
        ua3 ua3Var = (ua3) obj;
        return Intrinsics.areEqual(this.f116592a, ua3Var.f116592a) && Intrinsics.areEqual(this.f116593b, ua3Var.f116593b) && Intrinsics.areEqual(this.f116594c, ua3Var.f116594c) && Intrinsics.areEqual(this.f116595d, ua3Var.f116595d);
    }

    public final int hashCode() {
        int iHashCode = this.f116592a.hashCode() * 31;
        lc1 lc1Var = this.f116593b;
        int iHashCode2 = (iHashCode + (lc1Var == null ? 0 : lc1Var.hashCode())) * 31;
        String str = this.f116594c;
        return this.f116595d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f116592a + ", javaScriptResource=" + this.f116593b + ", parameters=" + this.f116594c + ", events=" + this.f116595d + ")";
    }
}
