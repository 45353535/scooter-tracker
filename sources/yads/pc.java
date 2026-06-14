package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pc implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f114609d;

    public pc(String str, String str2, String str3, ArrayList arrayList) {
        this.f114606a = str;
        this.f114607b = str2;
        this.f114608c = str3;
        this.f114609d = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f114606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        return Intrinsics.areEqual(this.f114606a, pcVar.f114606a) && Intrinsics.areEqual(this.f114607b, pcVar.f114607b) && Intrinsics.areEqual(this.f114608c, pcVar.f114608c) && Intrinsics.areEqual(this.f114609d, pcVar.f114609d);
    }

    public final int hashCode() {
        return this.f114609d.hashCode() + j4.a(this.f114608c, j4.a(this.f114607b, this.f114606a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.f114606a + ", adtuneUrl=" + this.f114607b + ", optOutUrl=" + this.f114608c + ", trackingUrls=" + this.f114609d + ")";
    }
}
