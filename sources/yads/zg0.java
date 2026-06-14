package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zg0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh0 f118658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f118659c;

    public zg0(String str, oh0 oh0Var, ArrayList arrayList) {
        this.f118657a = str;
        this.f118658b = oh0Var;
        this.f118659c = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f118657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg0)) {
            return false;
        }
        zg0 zg0Var = (zg0) obj;
        return Intrinsics.areEqual(this.f118657a, zg0Var.f118657a) && Intrinsics.areEqual(this.f118658b, zg0Var.f118658b) && Intrinsics.areEqual(this.f118659c, zg0Var.f118659c);
    }

    public final int hashCode() {
        return this.f118659c.hashCode() + ((this.f118658b.hashCode() + (this.f118657a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f118657a + ", design=" + this.f118658b + ", trackingUrls=" + this.f118659c + ")";
    }
}
