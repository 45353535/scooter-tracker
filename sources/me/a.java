package me;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94841a = new a();

    private a() {
    }

    @Override // le.k
    public le.b a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        g gVar = new g();
        block.invoke(gVar);
        return new c(gVar);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public int hashCode() {
        return 885084173;
    }

    public String toString() {
        return "Android";
    }
}
