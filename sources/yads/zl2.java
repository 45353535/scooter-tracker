package yads;

import com.adjust.sdk.purchase.ADJPConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f118734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f118735c;

    public zl2(String str, Map map, c cVar) {
        this.f118733a = str;
        this.f118734b = map;
        this.f118735c = cVar;
        map.put(ADJPConstants.KEY_SDK_VERSION, "7.17.0");
    }

    public final c a() {
        return this.f118735c;
    }

    public final Map b() {
        return this.f118734b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return Intrinsics.areEqual(this.f118733a, zl2Var.f118733a) && Intrinsics.areEqual(this.f118734b, zl2Var.f118734b) && Intrinsics.areEqual(this.f118735c, zl2Var.f118735c);
    }

    public final int hashCode() {
        int iHashCode = (this.f118734b.hashCode() + (this.f118733a.hashCode() * 31)) * 31;
        c cVar = this.f118735c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f118733a + ", data=" + this.f118734b + ", abExperiments=" + this.f118735c + ")";
    }
}
