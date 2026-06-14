package com.appodeal.ads.network.httpclients;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Map;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f13970a = lf.i.a(new Function0() { // from class: com.appodeal.ads.network.httpclients.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f13971b = lf.i.a(new Function0() { // from class: com.appodeal.ads.network.httpclients.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f13972c = lf.i.a(new Function0() { // from class: com.appodeal.ads.network.httpclients.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.b();
        }
    });

    public static final b a() {
        return new b(MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("application/json; charset=UTF-8"))), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }

    public static final b b() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf(CommonGatewayClient.HEADER_PROTOBUF)));
        com.appodeal.ads.network.encoders.b bVar = com.appodeal.ads.network.encoders.b.f13951a;
        return new b(mapMapOf, CollectionsKt.listOf(bVar), CollectionsKt.listOf(bVar));
    }

    public static final b c() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("text/plain; charset=UTF-8")));
        com.appodeal.ads.network.encoders.b bVar = com.appodeal.ads.network.encoders.b.f13951a;
        return new b(mapMapOf, CollectionsKt.listOf(bVar, com.appodeal.ads.network.encoders.a.f13950a), CollectionsKt.listOf(bVar));
    }
}
