package yads;

import com.yandex.div.DivDataTag;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class oh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f114318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f114319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f114320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k8.ea f114321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivDataTag f114322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f114323g;

    public oh0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, k8.ea eaVar, DivDataTag divDataTag, Set set) {
        this.f114317a = str;
        this.f114318b = jSONObject;
        this.f114319c = jSONObject2;
        this.f114320d = list;
        this.f114321e = eaVar;
        this.f114322f = divDataTag;
        this.f114323g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh0)) {
            return false;
        }
        oh0 oh0Var = (oh0) obj;
        return Intrinsics.areEqual(this.f114317a, oh0Var.f114317a) && Intrinsics.areEqual(this.f114318b, oh0Var.f114318b) && Intrinsics.areEqual(this.f114319c, oh0Var.f114319c) && Intrinsics.areEqual(this.f114320d, oh0Var.f114320d) && Intrinsics.areEqual(this.f114321e, oh0Var.f114321e) && Intrinsics.areEqual(this.f114322f, oh0Var.f114322f) && Intrinsics.areEqual(this.f114323g, oh0Var.f114323g);
    }

    public final int hashCode() {
        int iHashCode = (this.f114318b.hashCode() + (this.f114317a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f114319c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.f114320d;
        return this.f114323g.hashCode() + ((this.f114322f.hashCode() + ((this.f114321e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f114317a + ", card=" + this.f114318b + ", templates=" + this.f114319c + ", images=" + this.f114320d + ", divData=" + this.f114321e + ", divDataTag=" + this.f114322f + ", divAssets=" + this.f114323g + ")";
    }
}
