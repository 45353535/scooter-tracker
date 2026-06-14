package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4115vm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f39800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f39801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f39802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4115vm(ArrayList arrayList, double d10, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.f39800c = arrayList;
        this.f39801d = d10;
        this.f39802e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4115vm c4115vm = new C4115vm(this.f39800c, this.f39801d, this.f39802e, continuation);
        c4115vm.f39799b = obj;
        return c4115vm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4115vm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f39798a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39799b;
            if (this.f39800c.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            int iA = AbstractC4173y5.a();
            Pe peA = AbstractC4172y4.a();
            ArrayList arrayList = this.f39800c;
            double d10 = this.f39801d;
            AdConfig.VastVideoConfig vastVideoConfig = this.f39802e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(eg.i.b(coroutineScope, null, null, new C4065tm((C3965pl) it.next(), d10, peA, iA, vastVideoConfig, null), 3, null));
                peA = peA;
                vastVideoConfig = vastVideoConfig;
                d10 = d10;
            }
            this.f39798a = 1;
            objA = eg.d.a(arrayList2, this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = obj;
        }
        List listSortedWith = CollectionsKt.sortedWith((Iterable) objA, new C4090um());
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C3965pl) ((Pair) it2.next()).getFirst());
        }
        return arrayList3;
    }
}
