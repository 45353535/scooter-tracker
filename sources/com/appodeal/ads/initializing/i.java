package com.appodeal.ads.initializing;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f13478a;

    public i(a collector, com.appodeal.ads.utils.reflection.a reflectionClassCreator) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(reflectionClassCreator, "reflectionClassCreator");
        this.f13478a = collector;
        l[] lVarArrValues = l.values();
        ArrayList builders = new ArrayList();
        int length = lVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            l lVar = lVarArrValues[i10];
            Object objA = com.appodeal.ads.utils.reflection.a.a(lVar.d() + "$builder");
            Throwable thG = Result.g(objA);
            if (thG != null) {
                LogExtKt.logInternal("AdNetworkRegistry", "Error while creating instance for " + lVar, thG);
            }
            AdNetworkBuilder adNetworkBuilder = (AdNetworkBuilder) (Result.i(objA) ? null : objA);
            Pair pair = adNetworkBuilder != null ? TuplesKt.to(lVar, adNetworkBuilder) : null;
            if (pair != null) {
                builders.add(pair);
            }
            i10++;
        }
        Intrinsics.checkNotNullParameter(builders, "builders");
        this.f13478a.b(builders);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builders, 10));
        Iterator it = builders.iterator();
        while (it.hasNext()) {
            LogExtKt.logInternal$default("AdNetworkRegistry", "Builder for " + ((l) ((Pair) it.next()).component1()) + " created successfully", null, 4, null);
            arrayList.add(Unit.f93236a);
        }
    }

    @Override // com.appodeal.ads.initializing.h
    public final Set a(AdType adType) {
        Iterable iterable = (Iterable) this.f13478a.a().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (adType != null ? ((e) obj).f(adType) : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e) it.next()).e());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        LogExtKt.logInternal$default("AdNetworkRegistry", "All available networks for " + adType + " --> " + set, null, 4, null);
        return set;
    }

    public final void b(AdType adType, String networkName) {
        Object next;
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        l.f13481e.getClass();
        l lVarA = k.a(networkName);
        if (lVarA != null) {
            Iterator it = ((Iterable) this.f13478a.a().getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((e) next).h() == lVarA) {
                        break;
                    }
                }
            }
            e eVar = (e) next;
            if (eVar != null) {
                eVar.c(adType);
            }
        }
        LogExtKt.logInternal$default("AdNetworkRegistry", "disableAdNetwork " + adType + " " + networkName, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appodeal.ads.AdNetwork c(com.appodeal.ads.modules.common.internal.adtype.AdType r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "adType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "networkName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.appodeal.ads.initializing.k r0 = com.appodeal.ads.initializing.l.f13481e
            r0.getClass()
            com.appodeal.ads.initializing.l r0 = com.appodeal.ads.initializing.k.a(r7)
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            com.appodeal.ads.initializing.a r2 = r5.f13478a
            kotlinx.coroutines.flow.StateFlow r2 = r2.a()
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.appodeal.ads.initializing.e r4 = (com.appodeal.ads.initializing.e) r4
            com.appodeal.ads.initializing.l r4 = r4.h()
            if (r4 != r0) goto L27
            goto L3c
        L3b:
            r3 = r1
        L3c:
            com.appodeal.ads.initializing.e r3 = (com.appodeal.ads.initializing.e) r3
            if (r3 == 0) goto L4f
            boolean r0 = r3.f(r6)
            if (r0 == 0) goto L47
            goto L48
        L47:
            r3 = r1
        L48:
            if (r3 == 0) goto L4f
            com.appodeal.ads.AdNetwork r0 = r3.g()
            goto L50
        L4f:
            r0 = r1
        L50:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAdNetwork("
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ", "
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = ") --> "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "AdNetworkRegistry"
            r2 = 4
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r7, r6, r1, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.initializing.i.c(com.appodeal.ads.modules.common.internal.adtype.AdType, java.lang.String):com.appodeal.ads.AdNetwork");
    }

    @Override // com.appodeal.ads.initializing.h
    public final AdNetwork a(String networkName) {
        Object next;
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        l.f13481e.getClass();
        l lVarA = k.a(networkName);
        if (lVarA == null) {
            return null;
        }
        Iterator it = ((Iterable) this.f13478a.a().getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).h() == lVarA) {
                break;
            }
        }
        e eVar = (e) next;
        AdNetwork adNetworkG = eVar != null ? eVar.g() : null;
        LogExtKt.logInternal$default("AdNetworkRegistry", "getAdNetwork(" + networkName + ") --> " + adNetworkG, null, 4, null);
        return adNetworkG;
    }
}
