package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56914d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56915e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f56916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f56918c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(Set eventHandlers, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56916a = eventHandlers;
        this.f56917b = metricsRecorder;
        this.f56918c = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.b(this.f56913b);
            }
        });
    }

    public static final Map b(e eVar) {
        Set set = eVar.f56916a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            Set set2 = eVar.f56916a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList2);
        }
        return linkedHashMap;
    }

    public final Map a() {
        return (Map) this.f56918c.getValue();
    }

    public final void c(String event) throws JSONException {
        com.moloco.sdk.acm.f fVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        com.moloco.sdk.acm.f fVarC = this.f56917b.c(com.moloco.sdk.internal.client_metrics_data.d.f54200t.g());
        JSONObject jSONObject = new JSONObject(event);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", "Event received: " + string, false, 4, null);
        List list = (List) a().get(string);
        if (list == null || list.isEmpty()) {
            MolocoLogger.error$default(molocoLogger, "CompositeEventHandler", "Event not handled: " + string, null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar2 = this.f56917b;
            com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.M.g());
            com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
            com.moloco.sdk.acm.c cVarE = cVar.e(cVar2.g(), "failure");
            com.moloco.sdk.internal.client_metrics_data.c cVar3 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
            com.moloco.sdk.acm.c cVarE2 = cVarE.e(cVar3.g(), "no_handler");
            Intrinsics.checkNotNull(string);
            aVar2.b(cVarE2.e("event", string));
            this.f56917b.a(fVarC.f(cVar2.g(), "failure").f(cVar3.g(), "no_handler").f("event", string));
            return;
        }
        if (list.size() > 1) {
            MolocoLogger.warn$default(molocoLogger, "CompositeEventHandler", "Found multiple event handlers for event: " + string + ", using first one", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar3 = this.f56917b;
            com.moloco.sdk.acm.c cVarE3 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.N.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure");
            Intrinsics.checkNotNull(string);
            aVar3.b(cVarE3.e("event", string));
        }
        com.moloco.sdk.acm.f fVarC2 = this.f56917b.c(com.moloco.sdk.internal.client_metrics_data.d.f54201u.g());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) CollectionsKt.first(list);
        try {
            aVar4.a(jSONObject);
            fVar = fVarC2;
        } catch (Exception e10) {
            e = e10;
            fVar = fVarC2;
        }
        try {
            aVar = aVar4;
            try {
                MolocoLogger.info$default(molocoLogger, "CompositeEventHandler", "Event handled: " + string, null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar5 = this.f56917b;
                Intrinsics.checkNotNull(string);
                com.moloco.sdk.acm.f fVarF = fVar.f("event", string).f("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.c cVar4 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                aVar5.a(fVarF.f(cVar4.g(), "success"));
                this.f56917b.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.M.g()).e(cVar4.g(), "success").e("handler", aVar.b()).e("event", string));
                this.f56917b.a(fVarC.f(cVar4.g(), "success").f("handler", aVar.b()).f("event", string));
            } catch (Exception e11) {
                e = e11;
                Exception exc = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", "Event handling failed: " + string, exc, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar6 = this.f56917b;
                Intrinsics.checkNotNull(string);
                com.moloco.sdk.acm.f fVarF2 = fVar.f("event", string).f("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.c cVar5 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                String strG = cVar5.g();
                String simpleName = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                com.moloco.sdk.acm.f fVarF3 = fVarF2.f(strG, simpleName);
                com.moloco.sdk.internal.client_metrics_data.c cVar6 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                aVar6.a(fVarF3.f(cVar6.g(), "failure"));
                com.moloco.sdk.acm.recorder.a aVar7 = this.f56917b;
                com.moloco.sdk.acm.c cVarE4 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.M.g()).e(cVar6.g(), "failure");
                String strG2 = cVar5.g();
                String simpleName2 = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                aVar7.b(cVarE4.e(strG2, simpleName2).e("handler", aVar.b()).e("event", string));
                com.moloco.sdk.acm.recorder.a aVar8 = this.f56917b;
                com.moloco.sdk.acm.f fVarF4 = fVarC.f(cVar6.g(), "failure");
                String strG3 = cVar5.g();
                String simpleName3 = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                aVar8.a(fVarF4.f(strG3, simpleName3).f("handler", aVar.b()).f("event", string));
            }
        } catch (Exception e12) {
            e = e12;
            aVar = aVar4;
            Exception exc2 = e;
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", "Event handling failed: " + string, exc2, false, 8, null);
            com.moloco.sdk.acm.recorder.a aVar62 = this.f56917b;
            Intrinsics.checkNotNull(string);
            com.moloco.sdk.acm.f fVarF22 = fVar.f("event", string).f("handler", aVar.b());
            com.moloco.sdk.internal.client_metrics_data.c cVar52 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
            String strG4 = cVar52.g();
            String simpleName4 = exc2.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
            com.moloco.sdk.acm.f fVarF32 = fVarF22.f(strG4, simpleName4);
            com.moloco.sdk.internal.client_metrics_data.c cVar62 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
            aVar62.a(fVarF32.f(cVar62.g(), "failure"));
            com.moloco.sdk.acm.recorder.a aVar72 = this.f56917b;
            com.moloco.sdk.acm.c cVarE42 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.M.g()).e(cVar62.g(), "failure");
            String strG22 = cVar52.g();
            String simpleName22 = exc2.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName22, "getSimpleName(...)");
            aVar72.b(cVarE42.e(strG22, simpleName22).e("handler", aVar.b()).e("event", string));
            com.moloco.sdk.acm.recorder.a aVar82 = this.f56917b;
            com.moloco.sdk.acm.f fVarF42 = fVarC.f(cVar62.g(), "failure");
            String strG32 = cVar52.g();
            String simpleName32 = exc2.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName32, "getSimpleName(...)");
            aVar82.a(fVarF42.f(strG32, simpleName32).f("handler", aVar.b()).f("event", string));
        }
    }
}
