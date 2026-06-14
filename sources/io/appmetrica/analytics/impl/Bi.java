package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public final class Bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M4 f75592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Un f75593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Di f75594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5334p0 f75595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Tl f75596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5048dk f75597f;

    public Bi(C5334p0 c5334p0, Un un, M4 m42, C5048dk c5048dk) {
        this(c5334p0, un, m42, c5048dk, new Di(c5334p0, c5048dk));
    }

    public final void a(Ah ah2) {
        Kh kh2 = ah2.f75527e;
        Tl tl = this.f75596e;
        if (tl != null) {
            kh2.f76218b.setUuid(((Sl) tl).g());
        } else {
            kh2.getClass();
        }
        this.f75594c.a(ah2);
    }

    public final void b(String str) {
        Gf gf2 = this.f75592a.f76217a;
        synchronized (gf2) {
            gf2.f75824a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Bi(C5334p0 c5334p0, Un un, M4 m42, C5048dk c5048dk, Di di) {
        this.f75595d = c5334p0;
        this.f75592a = m42;
        this.f75593b = un;
        this.f75597f = c5048dk;
        this.f75594c = di;
    }

    public final void a(Sl sl) {
        this.f75596e = sl;
        this.f75592a.f76218b.setUuid(sl.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (no.a(bool)) {
            this.f75592a.f76218b.setLocationTracking(bool.booleanValue());
        }
        if (no.a(bool2)) {
            this.f75592a.f76218b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (no.a(bool3)) {
            this.f75592a.f76218b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        W5 w5A = W5.a();
        M4 m42 = this.f75592a;
        a(a(w5A, m42), m42, 1, (Map) null);
    }

    public final void a(W5 w52, Kh kh2, int i10, Map map) {
        String str;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        this.f75595d.b();
        if (!no.a(map)) {
            w52.setValue(AbstractC5295nb.b(map));
            a(w52, kh2);
        }
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        a(new Ah(w52, false, i10, null, new Kh(gf2, counterConfiguration, i82, str)));
    }

    public static W5 a(W5 w52, Kh kh2) {
        if (D9.f75657a.contains(Integer.valueOf(w52.f76617d))) {
            w52.f76616c = kh2.d();
        }
        return w52;
    }

    public final void a(List list) {
        Gf gf2 = this.f75592a.f76217a;
        synchronized (gf2) {
            gf2.f75824a.put("PROCESS_CFG_CUSTOM_HOSTS", no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Gf gf2 = this.f75592a.f76217a;
        synchronized (gf2) {
            gf2.f75824a.put("PROCESS_CFG_CLIDS", AbstractC5295nb.b(map));
        }
    }

    public final void a(String str) {
        Gf gf2 = this.f75592a.f76217a;
        synchronized (gf2) {
            gf2.f75824a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ah a(Sn sn, Kh kh2) {
        String str;
        String str2;
        this.f75595d.b();
        Un un = this.f75593b;
        un.getClass();
        In in = sn.f76465a;
        if (in == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(in.f75964a, "");
        }
        byte[] bArrFromModel = un.f76573a.fromModel(sn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey());
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(bArrFromModel, str, 5891, orCreatePublicLogger);
        u32.f76616c = kh2.d();
        HashMap map = u32.f76547q;
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str2 = kh2.f76027f;
        }
        return new Ah(u32, true, 1, map, new Kh(gf2, counterConfiguration, i82, str2));
    }
}
