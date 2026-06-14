package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ib f75644a = new Ib(C5186j4.l().d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb f75645b = new Jb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lb f75646c = new Lb();

    public final void a(final String str, final String str2, final String str3) {
        Ib ib2 = this.f75644a;
        if (ib2.f75931c.a((Void) null).f78248a && ib2.f75932d.a(str).f78248a && ib2.f75933e.a(str2).f78248a && ib2.f75934f.a(str3).f78248a) {
            this.f75645b.getClass();
            ((G9) C5186j4.l().f77467c.a()).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.fp
                @Override // java.lang.Runnable
                public final void run() {
                    D0.a(this.f77189b, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }

    public static final void a(D0 d02, String str, String str2, String str3) {
        List list;
        Context contextA;
        Lb lb2 = d02.f75646c;
        lb2.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = TuplesKt.to("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = TuplesKt.to("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("payload", str3));
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (lb2) {
            try {
                if (lb2.f76067a == null && (contextA = C5186j4.l().f77471g.a()) != null) {
                    lb2.f76067a = CollectionsKt.listOf((Object[]) new InterfaceC5432t[]{new Wd(), new C5179in(contextA), new Ko()});
                }
                list = lb2.f76067a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC5432t) it.next()).a(mapMutableMapOf);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(mapMutableMapOf).build());
    }
}
