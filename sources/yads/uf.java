package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116629b;

    public uf(vf vfVar, JSONObject jSONObject) {
        this.f116628a = vfVar.a();
        this.f116629b = jSONObject.toString();
    }

    public final String a() {
        return this.f116628a;
    }

    public final String b() {
        return this.f116629b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return Intrinsics.areEqual(ufVar.f116628a, this.f116628a) && Intrinsics.areEqual(ufVar.f116629b, this.f116629b);
    }

    public final int hashCode() {
        return this.f116629b.hashCode() + (this.f116628a.hashCode() * 31);
    }
}
