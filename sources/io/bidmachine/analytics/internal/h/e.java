package io.bidmachine.analytics.internal.h;

import android.content.Context;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.h.c;
import io.bidmachine.analytics.internal.i.a;
import io.bidmachine.analytics.internal.j.a;
import io.bidmachine.analytics.internal.k.a;
import io.bidmachine.analytics.internal.n.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import rd.g;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f79581a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f79582b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f79583c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f79584d = new f();

    private static final class b implements io.bidmachine.analytics.internal.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f79587a;

        public b(String str) {
            this.f79587a = str;
        }

        @Override // io.bidmachine.analytics.internal.h.c
        public void a(List list) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c.a aVar = (c.a) it.next();
                String str = this.f79587a;
                String strA = aVar.a();
                if (strA == null) {
                    strA = "";
                }
                arrayList.add(new io.bidmachine.analytics.internal.g.c(null, str, 0L, strA, io.bidmachine.analytics.internal.g.d.a(aVar.c()), aVar.b(), false, 69, null));
            }
            io.bidmachine.analytics.internal.v.a.f79897a.a(this.f79587a, arrayList);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f79588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f79588a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.bidmachine.analytics.internal.h.a aVar) {
            return aVar.a(this.f79588a);
        }
    }

    private e() {
    }

    public final void b(Context context) {
        if (f79582b.compareAndSet(false, true) && !io.bidmachine.analytics.internal.a.e.a(context)) {
            f79583c = a(context);
        }
    }

    public final f a() {
        return f79584d;
    }

    private final void b(Context context, String str, Set set) {
        Object objB;
        Context applicationContext = context.getApplicationContext();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar = (d) f79583c.get((String) it.next());
            if (dVar != null) {
                try {
                    Result.Companion companion = Result.f93230c;
                    dVar.c(applicationContext);
                    objB = Result.b(Unit.f93236a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                Throwable thG = Result.g(objB);
                if (thG != null) {
                    f79581a.a(dVar, str, thG);
                }
            }
        }
    }

    public final Map a(Context context) {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        Object objB5;
        Object objB6;
        Object objB7;
        Object objB8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.f93230c;
            io.bidmachine.analytics.internal.m.a aVar = new io.bidmachine.analytics.internal.m.a();
            aVar.a(context);
            linkedHashMap.put(aVar.a(), aVar);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            f79581a.a("mimp", "", thG);
        }
        try {
            io.bidmachine.analytics.internal.l.a aVar2 = new io.bidmachine.analytics.internal.l.a();
            aVar2.a(context);
            linkedHashMap.put(aVar2.a(), aVar2);
            objB2 = Result.b(Unit.f93236a);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.f93230c;
            objB2 = Result.b(kotlin.d.a(th3));
        }
        Throwable thG2 = Result.g(objB2);
        if (thG2 != null) {
            f79581a.a("isimp", "", thG2);
        }
        a.i iVar = null;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        try {
            io.bidmachine.analytics.internal.k.a aVar3 = new io.bidmachine.analytics.internal.k.a(iVar, 0 == true ? 1 : 0, 3, b12 == true ? 1 : 0);
            aVar3.a(context);
            linkedHashMap.put(aVar3.a(), aVar3);
            objB3 = Result.b(Unit.f93236a);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.f93230c;
            objB3 = Result.b(kotlin.d.a(th4));
        }
        Throwable thG3 = Result.g(objB3);
        if (thG3 != null) {
            f79581a.a("bic", "", thG3);
        }
        try {
            io.bidmachine.analytics.internal.u.a aVar4 = new io.bidmachine.analytics.internal.u.a(context.getFilesDir().getParentFile());
            aVar4.a(context);
            linkedHashMap.put(aVar4.a(), aVar4);
            objB4 = Result.b(Unit.f93236a);
        } catch (Throwable th5) {
            Result.Companion companion5 = Result.f93230c;
            objB4 = Result.b(kotlin.d.a(th5));
        }
        Throwable thG4 = Result.g(objB4);
        if (thG4 != null) {
            f79581a.a("aints", thG4);
        }
        try {
            io.bidmachine.analytics.internal.t.a aVar5 = new io.bidmachine.analytics.internal.t.a();
            aVar5.a(context);
            linkedHashMap.put(aVar5.a(), aVar5);
            objB5 = Result.b(Unit.f93236a);
        } catch (Throwable th6) {
            Result.Companion companion6 = Result.f93230c;
            objB5 = Result.b(kotlin.d.a(th6));
        }
        Throwable thG5 = Result.g(objB5);
        if (thG5 != null) {
            f79581a.a("aexs", thG5);
        }
        int i10 = 2;
        try {
            io.bidmachine.analytics.internal.p.c cVar = new io.bidmachine.analytics.internal.p.c(f79584d.b(), null, 2, null);
            cVar.a(context);
            linkedHashMap.put(cVar.a(), cVar);
            objB6 = Result.b(Unit.f93236a);
        } catch (Throwable th7) {
            Result.Companion companion7 = Result.f93230c;
            objB6 = Result.b(kotlin.d.a(th7));
        }
        Throwable thG6 = Result.g(objB6);
        if (thG6 != null) {
            f79581a.a("alog", thG6);
        }
        try {
            io.bidmachine.analytics.internal.q.f fVar = new io.bidmachine.analytics.internal.q.f(f79584d.c(), b11 == true ? 1 : 0, i10, b10 == true ? 1 : 0);
            fVar.a(context);
            linkedHashMap.put(fVar.a(), fVar);
            objB7 = Result.b(Unit.f93236a);
        } catch (Throwable th8) {
            Result.Companion companion8 = Result.f93230c;
            objB7 = Result.b(kotlin.d.a(th8));
        }
        Throwable thG7 = Result.g(objB7);
        if (thG7 != null) {
            f79581a.a("apur", thG7);
        }
        try {
            io.bidmachine.analytics.internal.o.a aVar6 = new io.bidmachine.analytics.internal.o.a(f79584d.a());
            aVar6.a(context);
            linkedHashMap.put(aVar6.a(), aVar6);
            objB8 = Result.b(Unit.f93236a);
        } catch (Throwable th9) {
            Result.Companion companion9 = Result.f93230c;
            objB8 = Result.b(kotlin.d.a(th9));
        }
        Throwable thG8 = Result.g(objB8);
        if (thG8 != null) {
            f79581a.a("aapp", thG8);
        }
        return linkedHashMap;
    }

    private static final class a implements io.bidmachine.analytics.internal.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f79585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79586b;

        public a(String str, String str2) {
            this.f79585a = str;
            this.f79586b = str2;
        }

        @Override // io.bidmachine.analytics.internal.h.b
        public void a(Map map) {
            io.bidmachine.analytics.internal.v.a.f79897a.a(new io.bidmachine.analytics.internal.g.b(null, this.f79585a, this.f79586b, 0L, map, null, 41, null));
        }

        @Override // io.bidmachine.analytics.internal.h.b
        public void a(io.bidmachine.analytics.internal.g.e eVar) {
            io.bidmachine.analytics.internal.v.a.f79897a.a(new io.bidmachine.analytics.internal.g.b(null, this.f79585a, this.f79586b, 0L, null, eVar, 25, null));
        }
    }

    public final void a(Context context, AnalyticsConfig analyticsConfig) {
        a(context, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), f79583c.keySet());
        HashSet hashSet = new HashSet();
        a(analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getMonitorConfigList(), hashSet);
        a(analyticsConfig.getReaderConfigList(), hashSet);
        b(context, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), hashSet);
    }

    public final Map a(a.EnumC0951a enumC0951a) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f79583c.entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            if (dVar instanceof io.bidmachine.analytics.internal.j.a) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                io.bidmachine.analytics.internal.j.a aVar = (io.bidmachine.analytics.internal.j.a) dVar;
                a.b bVarB = aVar.b();
                if (bVarB != null) {
                    linkedHashMap2.put("imd", Integer.valueOf(bVarB.b()));
                    Float fC = bVarB.c();
                    if (fC != null) {
                        linkedHashMap2.put("wp", Float.valueOf(fC.floatValue()));
                    }
                    String strE = bVarB.e();
                    if (strE != null) {
                        if (!StringsKt.y0(strE)) {
                            linkedHashMap2.put("agency", strE);
                        }
                        List listEmptyList = CollectionsKt.emptyList();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listEmptyList) {
                            if (obj instanceof g) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    String strA = bVarB.a();
                    if (strA != null) {
                        if (!StringsKt.y0(strA)) {
                            linkedHashMap2.put("imcurl", strA);
                            if (bVarB.f()) {
                                linkedHashMap2.put("clcurl", strA);
                            }
                        }
                        List listEmptyList2 = CollectionsKt.emptyList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listEmptyList2) {
                            if (obj2 instanceof g) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                }
                a.b bVarA = aVar.a(enumC0951a);
                if (bVarA != null) {
                    linkedHashMap2.put("imimd", Integer.valueOf(bVarA.b()));
                    Float fC2 = bVarA.c();
                    if (fC2 != null) {
                        linkedHashMap2.put("imwp", Float.valueOf(fC2.floatValue()));
                    }
                    String strE2 = bVarA.e();
                    if (strE2 != null) {
                        if (!StringsKt.y0(strE2)) {
                            linkedHashMap2.put("imagency", strE2);
                        }
                        List listEmptyList3 = CollectionsKt.emptyList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listEmptyList3) {
                            if (obj3 instanceof g) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                }
                linkedHashMap.put(str, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final Object a(String str) {
        return k.I(k.R(k.w(CollectionsKt.asSequence(f79583c.values()), io.bidmachine.analytics.internal.h.a.class), new c(str)));
    }

    private final void a(String str, List list, Set set) {
        Object objB;
        Unit unit;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String name = ((MonitorConfig) it.next()).getName();
            try {
                Result.Companion companion = Result.f93230c;
                d dVar = (d) f79583c.get(name);
                if (dVar != null) {
                    if (dVar instanceof io.bidmachine.analytics.internal.i.a) {
                        ((io.bidmachine.analytics.internal.i.a) dVar).a(new a.C0950a(new a(name, str)));
                    }
                    unit = Unit.f93236a;
                } else {
                    unit = null;
                }
                objB = Result.b(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.j(objB)) {
                set.add(name);
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                f79581a.a(name, str, thG);
            }
        }
    }

    private final void a(List list, Set set) {
        Object objB;
        Unit unit;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReaderConfig readerConfig = (ReaderConfig) it.next();
            String name = readerConfig.getName();
            try {
                Result.Companion companion = Result.f93230c;
                d dVar = (d) f79583c.get(name);
                if (dVar != null) {
                    if (dVar instanceof io.bidmachine.analytics.internal.n.a) {
                        ((io.bidmachine.analytics.internal.n.a) dVar).a((Object) new a.C0956a(readerConfig.getInterval(), readerConfig.getRules(), new b(name)));
                    }
                    unit = Unit.f93236a;
                } else {
                    unit = null;
                }
                objB = Result.b(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.j(objB)) {
                set.add(name);
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                f79581a.a(name, thG);
            }
        }
    }

    private final void a(Context context, String str, Set set) {
        Object objB;
        Context applicationContext = context.getApplicationContext();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar = (d) f79583c.get((String) it.next());
            if (dVar != null) {
                try {
                    Result.Companion companion = Result.f93230c;
                    dVar.b(applicationContext);
                    objB = Result.b(Unit.f93236a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                Throwable thG = Result.g(objB);
                if (thG != null) {
                    f79581a.a(dVar, str, thG);
                }
            }
        }
    }

    private final void a(d dVar, String str, Throwable th2) {
        if (dVar instanceof io.bidmachine.analytics.internal.i.a) {
            a(dVar.a(), str, th2);
        } else if (dVar instanceof io.bidmachine.analytics.internal.n.a) {
            a(dVar.a(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, Throwable th2) {
        io.bidmachine.analytics.internal.v.a.f79897a.a(new io.bidmachine.analytics.internal.g.b(null, str, str2, 0L, null, new io.bidmachine.analytics.internal.g.e(str, e.a.MONITOR_INVALID, io.bidmachine.analytics.internal.a.e.a(th2)), 25, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Throwable th2) {
        io.bidmachine.analytics.internal.v.a.f79897a.a(new io.bidmachine.analytics.internal.g.c(null, str, 0L, "", new c.a.C0949a("", ""), new io.bidmachine.analytics.internal.g.e(str, e.a.READER_INVALID, io.bidmachine.analytics.internal.a.e.a(th2)), false, 69, null));
    }
}
