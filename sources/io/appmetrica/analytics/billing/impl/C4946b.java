package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4946b implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f74960a;

    public C4946b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(@NotNull C4945a c4945a) {
        d dVar = new d();
        List list = c4945a.f74958a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f74960a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f74971a = (c[]) array;
        dVar.f74972b = c4945a.f74959b;
        return dVar;
    }

    public C4946b(@NotNull i iVar) {
        this.f74960a = iVar;
    }

    public /* synthetic */ C4946b(i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4945a toModel(@NotNull d dVar) {
        c[] cVarArr = dVar.f74971a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f74960a.toModel(cVar));
        }
        return new C4945a(arrayList, dVar.f74972b);
    }
}
