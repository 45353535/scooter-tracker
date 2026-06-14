package io.bidmachine.analytics.internal.v;

import android.content.Context;
import eg.m1;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.d;
import io.bidmachine.analytics.internal.h.e;
import io.bidmachine.analytics.internal.v.b;
import io.bidmachine.analytics.internal.v.c;
import io.bidmachine.analytics.internal.y.a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f79897a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f79898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CoroutineScope f79899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static io.bidmachine.analytics.internal.A.a f79900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static io.bidmachine.analytics.internal.D.a f79901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static io.bidmachine.analytics.internal.D.c f79902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f79903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map f79904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f79905i;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.a$a, reason: collision with other inner class name */
    static final class C0969a extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.D.a f79907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f79909d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0969a(io.bidmachine.analytics.internal.D.a aVar, String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f79907b = aVar;
            this.f79908c = str;
            this.f79909d = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0969a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0969a(this.f79907b, this.f79908c, this.f79909d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f79906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f79907b.a(this.f79908c, this.f79909d);
            return Unit.f93236a;
        }
    }

    static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.D.c f79911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f79913d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.bidmachine.analytics.internal.D.c cVar, List list, List list2, Continuation continuation) {
            super(2, continuation);
            this.f79911b = cVar;
            this.f79912c = list;
            this.f79913d = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f79911b, this.f79912c, this.f79913d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f79910a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f79911b.a(this.f79912c, this.f79913d);
            return Unit.f93236a;
        }
    }

    static {
        d dVarA = d.f79505g.a();
        f79898b = dVarA;
        f79899c = i.a(m1.b(null, 1, null).plus(dVarA.b()));
        f79903g = MapsKt.emptyMap();
        f79904h = MapsKt.emptyMap();
        f79905i = DesugarCollections.synchronizedList(new ArrayList());
    }

    private a() {
    }

    private final synchronized io.bidmachine.analytics.internal.D.c b(io.bidmachine.analytics.internal.A.a aVar) {
        io.bidmachine.analytics.internal.D.c cVar;
        io.bidmachine.analytics.internal.D.c cVar2 = f79902f;
        cVar = cVar2;
        if (cVar2 == null) {
            io.bidmachine.analytics.internal.D.d dVar = new io.bidmachine.analytics.internal.D.d(aVar);
            dVar.b();
            f79902f = dVar;
            cVar = dVar;
        }
        return cVar;
    }

    public final void a(Context context, AnalyticsConfig analyticsConfig) {
        synchronized (this) {
            try {
                a aVar = f79897a;
                io.bidmachine.analytics.internal.A.a aVarA = aVar.a(context);
                io.bidmachine.analytics.internal.D.a aVarA2 = aVar.a(aVarA);
                io.bidmachine.analytics.internal.D.c cVarB = aVar.b(aVarA);
                aVar.a(f79903g);
                f79903g = aVar.a(analyticsConfig, aVarA2);
                f79904h = aVar.a(context, analyticsConfig, cVarB);
                aVar.a(analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String());
                String str = analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
                List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(monitorConfigList, 10));
                Iterator<T> it = monitorConfigList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MonitorConfig) it.next()).getName());
                }
                aVar.a(aVarA2, str, arrayList);
                a aVar2 = f79897a;
                List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(readerConfigList, 10));
                Iterator<T> it2 = readerConfigList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ReaderConfig) it2.next()).getName());
                }
                List<ReaderConfig> readerConfigList2 = analyticsConfig.getReaderConfigList();
                ArrayList<List> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(readerConfigList2, 10));
                Iterator<T> it3 = readerConfigList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ReaderConfig) it3.next()).getRules());
                }
                ArrayList arrayList4 = new ArrayList();
                for (List list : arrayList3) {
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(io.bidmachine.analytics.internal.g.d.a((ReaderConfig.Rule) it4.next()));
                    }
                    CollectionsKt.addAll(arrayList4, arrayList5);
                }
                aVar2.a(cVarB, arrayList2, arrayList4);
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void a(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((io.bidmachine.analytics.internal.v.b) it.next()).a();
        }
    }

    private final io.bidmachine.analytics.internal.D.a a(io.bidmachine.analytics.internal.A.a aVar) {
        io.bidmachine.analytics.internal.D.a aVar2 = f79901e;
        if (aVar2 != null) {
            return aVar2;
        }
        io.bidmachine.analytics.internal.D.b bVar = new io.bidmachine.analytics.internal.D.b(aVar);
        bVar.b();
        f79901e = bVar;
        return bVar;
    }

    private final synchronized io.bidmachine.analytics.internal.A.a a(Context context) {
        io.bidmachine.analytics.internal.A.a aVar;
        aVar = f79900d;
        if (aVar == null) {
            aVar = new io.bidmachine.analytics.internal.A.a(context);
            f79900d = aVar;
        }
        return aVar;
    }

    private final Map a(AnalyticsConfig analyticsConfig, io.bidmachine.analytics.internal.D.a aVar) {
        List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : monitorConfigList) {
            if (((MonitorConfig) obj).getIsReportEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new io.bidmachine.analytics.internal.v.b(d.f79505g.a(), new b.C0970b((MonitorConfig) it.next(), analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras()), aVar));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((io.bidmachine.analytics.internal.v.b) obj2).b(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Map a(Context context, AnalyticsConfig analyticsConfig, io.bidmachine.analytics.internal.D.c cVar) {
        c cVar2;
        a.InterfaceC0974a bVar;
        List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig readerConfig : readerConfigList) {
            String name = readerConfig.getName();
            switch (name.hashCode()) {
                case 2986528:
                    if (name.equals("aapp")) {
                        bVar = new io.bidmachine.analytics.internal.z.b(e.f79581a.a().a());
                        cVar2 = new c(d.f79505g.a(), new c.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), bVar), cVar);
                    }
                    cVar2 = null;
                    break;
                case 2990623:
                    if (name.equals("aexs")) {
                        bVar = new io.bidmachine.analytics.internal.z.a();
                        cVar2 = new c(d.f79505g.a(), new c.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), bVar), cVar);
                    }
                    cVar2 = null;
                    break;
                case 2997059:
                    if (name.equals("alog")) {
                        bVar = new io.bidmachine.analytics.internal.z.d(e.f79581a.a().b());
                        cVar2 = new c(d.f79505g.a(), new c.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), bVar), cVar);
                    }
                    cVar2 = null;
                    break;
                case 3001100:
                    if (name.equals("apur")) {
                        bVar = new io.bidmachine.analytics.internal.z.e(e.f79581a.a().c());
                        cVar2 = new c(d.f79505g.a(), new c.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), bVar), cVar);
                    }
                    cVar2 = null;
                    break;
                case 92819013:
                    if (name.equals("aints")) {
                        bVar = new io.bidmachine.analytics.internal.z.c(context.getFilesDir().getParentFile());
                        cVar2 = new c(d.f79505g.a(), new c.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), bVar), cVar);
                    }
                    cVar2 = null;
                    break;
                default:
                    cVar2 = null;
                    break;
            }
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((c) obj).a(), obj);
        }
        return linkedHashMap;
    }

    private final void a(String str) {
        List list = f79905i;
        List list2 = CollectionsKt.toList(list);
        list.clear();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = str;
            f79897a.a(io.bidmachine.analytics.internal.g.b.a((io.bidmachine.analytics.internal.g.b) it.next(), null, null, str2, 0L, null, null, 59, null));
            str = str2;
        }
    }

    private final void a(io.bidmachine.analytics.internal.D.a aVar, String str, List list) {
        eg.i.d(f79899c, f79898b.c(), null, new C0969a(aVar, str, list, null), 2, null);
    }

    private final void a(io.bidmachine.analytics.internal.D.c cVar, List list, List list2) {
        eg.i.d(f79899c, f79898b.c(), null, new b(cVar, list, list2, null), 2, null);
    }

    public final void a(io.bidmachine.analytics.internal.g.b bVar) {
        if (Intrinsics.areEqual(bVar.e(), "")) {
            f79905i.add(bVar);
            return;
        }
        io.bidmachine.analytics.internal.v.b bVar2 = (io.bidmachine.analytics.internal.v.b) f79903g.get(bVar.d());
        if (bVar2 != null) {
            bVar2.b(bVar);
        }
    }

    public final void a(io.bidmachine.analytics.internal.g.c cVar) {
        a(cVar.d(), CollectionsKt.listOf(cVar));
    }

    public final void a(String str, List list) {
        c cVar = (c) f79904h.get(str);
        if (cVar != null) {
            cVar.b(str, list);
        }
    }
}
