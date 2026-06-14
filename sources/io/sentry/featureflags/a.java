package io.sentry.featureflags;

import io.sentry.protocol.g;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile CopyOnWriteArrayList f83497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f83498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83499c;

    private a(int i10) {
        this.f83498b = new io.sentry.util.a();
        this.f83499c = i10;
        this.f83497a = new CopyOnWriteArrayList();
    }

    public static b a(v7 v7Var) {
        int maxFeatureFlags = v7Var.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new a(maxFeatureFlags) : c.a();
    }

    private static b b(int i10, a aVar, a aVar2, a aVar3) {
        CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.f83497a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f83497a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.f83497a : null;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return c.a();
        }
        int i11 = size - 1;
        int i12 = size2 - 1;
        int i13 = size3 - 1;
        if (copyOnWriteArrayList != null && i11 >= 0) {
            androidx.privacysandbox.ads.adservices.topics.a.a(copyOnWriteArrayList.get(i11));
        }
        if (copyOnWriteArrayList2 != null && i12 >= 0) {
            androidx.privacysandbox.ads.adservices.topics.a.a(copyOnWriteArrayList2.get(i12));
        }
        if (copyOnWriteArrayList3 != null && i13 >= 0) {
            androidx.privacysandbox.ads.adservices.topics.a.a(copyOnWriteArrayList3.get(i13));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        linkedHashMap.size();
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new a(i10, new CopyOnWriteArrayList(arrayList));
    }

    public static b c(v7 v7Var, b bVar, b bVar2, b bVar3) {
        int maxFeatureFlags = v7Var.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return c.a();
        }
        return b(maxFeatureFlags, bVar instanceof a ? (a) bVar : null, bVar2 instanceof a ? (a) bVar2 : null, bVar3 instanceof a ? (a) bVar3 : null);
    }

    @Override // io.sentry.featureflags.b
    public g getFeatureFlags() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f83497a.iterator();
        if (!it.hasNext()) {
            return new g(arrayList);
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
        throw null;
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m7809clone() {
        return new a(this);
    }

    private a(int i10, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f83498b = new io.sentry.util.a();
        this.f83499c = i10;
        this.f83497a = copyOnWriteArrayList;
    }

    private a(a aVar) {
        this.f83498b = new io.sentry.util.a();
        this.f83499c = aVar.f83499c;
        this.f83497a = new CopyOnWriteArrayList(aVar.f83497a);
    }
}
