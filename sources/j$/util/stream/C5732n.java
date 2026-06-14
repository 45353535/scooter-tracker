package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5732n extends AbstractC5680c2 {
    public static J0 R(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        j$.time.format.a aVar = new j$.time.format.a(14);
        j$.time.format.a aVar2 = new j$.time.format.a(15);
        j$.time.format.a aVar3 = new j$.time.format.a(16);
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        return new J0((Collection) new A1(EnumC5676b3.REFERENCE, aVar3, aVar2, aVar, 3).c(abstractC5667a, spliterator));
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5671a3.DISTINCT.n(abstractC5667a.f85185f)) {
            return abstractC5667a.z(spliterator, false, intFunction);
        }
        if (EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
            return R(abstractC5667a, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.s sVar = new j$.util.concurrent.s(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(sVar);
        new O(sVar, false).e(abstractC5667a, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new J0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        if (EnumC5671a3.DISTINCT.n(abstractC5667a.f85185f)) {
            return abstractC5667a.Q(spliterator);
        }
        if (EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
            return R(abstractC5667a, spliterator).spliterator();
        }
        return new C5716j3(abstractC5667a.Q(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        Objects.requireNonNull(interfaceC5725l2);
        if (EnumC5671a3.DISTINCT.n(i10)) {
            return interfaceC5725l2;
        }
        if (EnumC5671a3.SORTED.n(i10)) {
            return new C5722l(interfaceC5725l2);
        }
        return new C5727m(interfaceC5725l2);
    }
}
