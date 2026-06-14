package id;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f74538a;

    public i1(List urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        this.f74538a = urls;
    }

    public final List a() {
        return this.f74538a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(String url) {
        this(CollectionsKt.listOf(url));
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
