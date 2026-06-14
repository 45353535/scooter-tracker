package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3785ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3935og f38764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f38765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f38766c;

    public AbstractC3785ig(C3935og dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.f38764a = dao;
        this.f38765b = new ConcurrentHashMap();
        this.f38766c = new Cif(a());
    }

    public static void a(Rf rf2, short s10) {
        C3738gi c3738gi = rf2.f37668k;
        if (c3738gi == null) {
            Gi gi = AbstractC3810jg.f38820a;
            AbstractC3810jg.a("PingFailed", MapsKt.mutableMapOf(TuplesKt.to("trigger", rf2.f37662e), TuplesKt.to("errorCode", Short.valueOf(s10)), TuplesKt.to("retryCount", Integer.valueOf(rf2.f37664g))));
            return;
        }
        C3887mi c3887mi = new C3887mi(c3738gi);
        String priority = rf2.f37662e;
        int i10 = rf2.f37664g;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Map mapA = c3887mi.a();
        mapA.put("errorCode", Short.valueOf(s10));
        mapA.put("trigger", priority);
        mapA.put("retryCount", String.valueOf(i10));
        AbstractC3810jg.a("PingFailed", mapA);
    }

    public static AdConfig.PingsV2Config a() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f38021a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.d r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3785ig.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(int i10, String str, short s10, Rf ping, long j10, InterfaceC3710fg interfaceC3710fg) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        Intrinsics.checkNotNullExpressionValue(AbstractC3785ig.class.getSimpleName(), "getSimpleName(...)");
        String str2 = ping.f37658a;
        Intrinsics.checkNotNullExpressionValue(AbstractC3785ig.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC3710fg);
        if (interfaceC3710fg != null) {
            ((C3684eg) interfaceC3710fg).a(ping, i10, str, ping.f37664g, j10);
        } else {
            a(ping, s10);
        }
    }

    public static void a(Xf xf2, InterfaceC3710fg interfaceC3710fg) {
        Intrinsics.checkNotNullExpressionValue(AbstractC3785ig.class.getSimpleName(), "getSimpleName(...)");
        String str = xf2.f38005a.f37658a;
        Objects.toString(interfaceC3710fg);
        if (interfaceC3710fg != null) {
            ((C3684eg) interfaceC3710fg).a(xf2.f38005a, xf2.f38006b, xf2.f38008d);
            return;
        }
        Rf rf2 = xf2.f38005a;
        C3738gi c3738gi = rf2.f37668k;
        if (c3738gi != null) {
            C3887mi c3887mi = new C3887mi(c3738gi);
            String priority = rf2.f37662e;
            long j10 = rf2.f37666i;
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map mapA = c3887mi.a();
            mapA.put("trigger", priority);
            mapA.put("latency", Long.valueOf(j10));
            AbstractC3810jg.a("PingSuccess", mapA);
            return;
        }
        Gi gi = AbstractC3810jg.f38820a;
        AbstractC3810jg.a("PingSuccess", MapsKt.mutableMapOf(TuplesKt.to("trigger", rf2.f37662e), TuplesKt.to("retryCount", Integer.valueOf(rf2.f37664g))));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Xf r26, com.inmobi.media.InterfaceC3710fg r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3785ig.a(com.inmobi.media.Xf, com.inmobi.media.fg, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
