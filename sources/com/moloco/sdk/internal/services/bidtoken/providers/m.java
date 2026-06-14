package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.bidtoken.providers.m;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettingsImpl;
import com.moloco.sdk.service_locator.b;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public interface m extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55422a = a.f55423a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55423a = new a();

        public static final com.moloco.sdk.internal.ilrd.g b() {
            return b.C0685b.f55795a.g().c();
        }

        public final m a() {
            x xVar = new x();
            com.moloco.sdk.service_locator.b bVar = com.moloco.sdk.service_locator.b.f55791a;
            w wVar = new w(new com.moloco.sdk.internal.services.bidtoken.w(new InternalMolocoPrivacySettingsImpl(bVar.a())));
            b.h hVar = b.h.f55827a;
            t tVar = new t(hVar.c());
            e eVar = new e(bVar.a());
            v vVar = new v(b.i.f55834a.b());
            b.e eVar2 = b.e.f55808a;
            return new n(CollectionsKt.listOf((Object[]) new j[]{xVar, wVar, tVar, eVar, vVar, new i(eVar2.j()), new c(hVar.d()), new p(eVar2.l(), eVar2.m()), new g(eVar2.i()), new b(eVar2.g()), new r(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.providers.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.a.b();
                }
            })}));
        }
    }
}
