package id;

import id.q0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f74524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q0.b f74525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(List urls, q0.b deliveryType) {
        super(deliveryType, null);
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
        this.f74524c = urls;
        this.f74525d = deliveryType;
    }

    @Override // id.q0
    public q0.b a() {
        return this.f74525d;
    }

    public final List b() {
        return this.f74524c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.areEqual(this.f74524c, h1Var.f74524c) && a() == h1Var.a();
    }

    public int hashCode() {
        return (this.f74524c.hashCode() * 31) + a().hashCode();
    }

    public String toString() {
        return "UrlMediaSource(urls=" + this.f74524c + ", deliveryType=" + a() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(String url, q0.b deliveryType) {
        this(CollectionsKt.listOf(url), deliveryType);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(deliveryType, "deliveryType");
    }
}
