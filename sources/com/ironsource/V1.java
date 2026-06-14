package com.ironsource;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class V1 implements W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4414l9 f41859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.d f41860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final C4255c2 f41861c;

    public V1(@NotNull C4414l9 instanceInfo, @NotNull com.ironsource.mediationsdk.d auctionDataUtils, @Nullable C4255c2 c4255c2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f41859a = instanceInfo;
        this.f41860b = auctionDataUtils;
        this.f41861c = c4255c2;
    }

    @Override // com.ironsource.W1
    public void a(@NotNull String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4255c2 c4255c2 = this.f41861c;
        if (c4255c2 == null || (listEmptyList = c4255c2.b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.W1
    public void b(@NotNull String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4255c2 c4255c2 = this.f41861c;
        if (c4255c2 == null || (listEmptyList = c4255c2.a()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.W1
    public void c(@NotNull String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C4255c2 c4255c2 = this.f41861c;
        if (c4255c2 == null || (listEmptyList = c4255c2.c()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        a(listEmptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f41860b.a(str, this.f41859a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f41859a.e(), this.f41859a.f(), this.f41859a.d(), "", "", "", ""));
        }
    }
}
