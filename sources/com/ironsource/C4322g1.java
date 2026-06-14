package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4322g1 implements Ze<JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C4305f1> f43144a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.g1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43145a;

        static {
            int[] iArr = new int[Ye.values().length];
            try {
                iArr[Ye.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ye.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43145a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4294e7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull Ye mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i10 = a.f43145a[mode.ordinal()];
        if (i10 == 1) {
            List<C4305f1> listB = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4305f1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i10 != 2) {
            throw new lf.m();
        }
        List<C4305f1> listA = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4305f1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(@NotNull C4305f1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f43144a.add(event);
    }

    private final List<C4305f1> a() {
        List<C4305f1> list = this.f43144a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4305f1 c4305f1 = (C4305f1) obj;
            if (c4305f1.e() != We.LoadSuccess && c4305f1.e() != We.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4305f1) it.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C4305f1> list2 = this.f43144a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4305f1 c4305f12 = (C4305f1) obj2;
            if (c4305f12.e() == We.LoadSuccess && !set.contains(c4305f12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C4305f1> b() {
        List<C4305f1> list = this.f43144a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4305f1) obj).e() != We.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
