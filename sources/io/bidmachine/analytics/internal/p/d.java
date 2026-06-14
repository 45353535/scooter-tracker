package io.bidmachine.analytics.internal.p;

import eg.w0;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.n.a;
import io.bidmachine.analytics.internal.p.b;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f79714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.a f79715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f79716c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f79717a;

        public a(e eVar) {
            this.f79717a = eVar;
        }

        @Override // io.bidmachine.analytics.internal.p.b.a
        public b a() {
            return new b(this.f79717a, new f(), kotlinx.coroutines.i.a(w0.c(Executors.newSingleThreadExecutor())));
        }
    }

    public d(e eVar, b.a aVar) {
        this.f79714a = eVar;
        this.f79715b = aVar;
    }

    public final void a(a.C0956a c0956a) {
        List<ReaderConfig.Rule> listC = c0956a.c();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig.Rule rule : listC) {
            ReaderConfig.Rule.GeneralRule generalRule = rule instanceof ReaderConfig.Rule.GeneralRule ? (ReaderConfig.Rule.GeneralRule) rule : null;
            if (generalRule != null) {
                arrayList.add(generalRule);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ReaderConfig.Rule.GeneralRule) it.next()).getPath());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, this.f79715b.a());
        }
        this.f79716c = MapsKt.toMutableMap(linkedHashMap);
    }

    public final void b() {
        Map map = this.f79716c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((b) entry.getValue()).a((String) entry.getKey());
            }
        }
    }

    public /* synthetic */ d(e eVar, b.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? new a(eVar) : aVar);
    }

    public final void a() {
        Map map = this.f79716c;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((b) ((Map.Entry) it.next()).getValue()).a();
            }
        }
    }

    public final String a(ReaderConfig.Rule rule) throws FileNotFoundException {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            String strB = this.f79714a.b(((ReaderConfig.Rule.GeneralRule) rule).getPath());
            if (strB != null) {
                return strB;
            }
            throw new FileNotFoundException();
        }
        throw new IllegalStateException("Check failed.");
    }
}
