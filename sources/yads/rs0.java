package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rs0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115563b;

    public rs0(String str, ArrayList arrayList) {
        this.f115562a = str;
        this.f115563b = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f115562a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs0)) {
            return false;
        }
        rs0 rs0Var = (rs0) obj;
        return Intrinsics.areEqual(this.f115562a, rs0Var.f115562a) && Intrinsics.areEqual(this.f115563b, rs0Var.f115563b);
    }

    public final int hashCode() {
        return this.f115563b.hashCode() + (this.f115562a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f115562a + ", items=" + this.f115563b + ")";
    }
}
