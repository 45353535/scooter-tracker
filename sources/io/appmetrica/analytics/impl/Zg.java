package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class Zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5074el f76755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5469ub f76756c = new C5469ub();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5512w4 f76757d = new C5512w4(new C5050dm(), new C5487v4(), null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f76758e;

    public Zg(Context context, final InterfaceC5214k6 interfaceC5214k6, final EnumC5168ib enumC5168ib, InterfaceC5074el interfaceC5074el) {
        this.f76754a = context;
        this.f76755b = interfaceC5074el;
        this.f76758e = new Consumer() { // from class: io.appmetrica.analytics.impl.aq
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Zg.a(enumC5168ib, interfaceC5214k6, this, (C5370qb) obj);
            }
        };
    }

    public static final void a(EnumC5168ib enumC5168ib, InterfaceC5214k6 interfaceC5214k6, Zg zg2, C5370qb c5370qb) {
        String str = c5370qb.f78066h;
        X3 x32 = new X3(str, c5370qb.f78063e, c5370qb.f78064f, c5370qb.f78065g, c5370qb.f78067i);
        String str2 = c5370qb.f78060b;
        byte[] bArr = c5370qb.f78059a;
        int i10 = c5370qb.f78061c;
        HashMap map = c5370qb.f78062d;
        String str3 = c5370qb.f78068j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = D9.f75657a;
        U3 u32 = new U3(bArr, str2, enumC5168ib.f77427a, orCreatePublicLogger);
        u32.f76547q = map;
        u32.f76620g = i10;
        u32.f76616c = str3;
        ((Xg) interfaceC5214k6).a(x32, u32, zg2.f76757d);
    }
}
