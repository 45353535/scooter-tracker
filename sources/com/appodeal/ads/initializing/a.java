package com.appodeal.ads.initializing;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.utils.session.r;
import hg.l0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f13465b;

    public a(r sessionManager) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f13464a = sessionManager;
        this.f13465b = l0.a(CollectionsKt.emptyList());
    }

    public final StateFlow a() {
        return this.f13465b;
    }

    public final void b(ArrayList builders) {
        Intrinsics.checkNotNullParameter(builders, "builders");
        MutableStateFlow mutableStateFlow = this.f13465b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builders, 10));
        Iterator it = builders.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new e((l) pair.component1(), (AdNetworkBuilder) pair.component2(), this.f13464a));
        }
        mutableStateFlow.setValue(arrayList);
    }
}
