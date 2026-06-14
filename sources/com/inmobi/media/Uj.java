package com.inmobi.media;

import j$.util.Objects;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Uj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f37859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC3585ak f37860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj(String str, Map map, EnumC3585ak enumC3585ak, Continuation continuation) {
        super(2, continuation);
        this.f37858b = str;
        this.f37859c = map;
        this.f37860d = enumC3585ak;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Uj(this.f37858b, this.f37859c, this.f37860d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Uj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int iA;
        String str;
        Object objG = pf.b.g();
        int i10 = this.f37857a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                Wj wj = Wj.f37959a;
                Map map = this.f37859c;
                EnumC3585ak enumC3585ak = this.f37860d;
                Objects.toString(map);
                Objects.toString(enumC3585ak);
                if (Wj.f37965g == null) {
                    return Unit.f93236a;
                }
                if (Wj.a(this.f37858b, this.f37859c, this.f37860d)) {
                    return Unit.f93236a;
                }
                C3814jk c3814jk = Wj.f37965g;
                if (c3814jk == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
                    c3814jk = null;
                }
                EnumC3585ak telemetryEventType = this.f37860d;
                String eventType = this.f37858b;
                c3814jk.getClass();
                Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                int iOrdinal = telemetryEventType.ordinal();
                if (iOrdinal == 0) {
                    iA = c3814jk.f38834b.a(eventType);
                } else {
                    if (iOrdinal != 1) {
                        throw new lf.m();
                    }
                    iA = c3814jk.f38835c.a(eventType);
                }
                if (iA != 0) {
                    if (iA != 1) {
                        return Unit.f93236a;
                    }
                    if (this.f37859c.get("samplingRate") == null) {
                        this.f37859c.put("samplingRate", kotlin.coroutines.jvm.internal.b.d(100));
                    }
                } else if (this.f37859c.get("samplingRate") == null) {
                    this.f37859c.put("samplingRate", kotlin.coroutines.jvm.internal.b.d(zf.a.c((((double) 1) - Wj.b().getSamplingFactor()) * ((double) 100))));
                }
                String str2 = this.f37858b;
                int iOrdinal2 = this.f37860d.ordinal();
                if (iOrdinal2 == 0) {
                    str = "sdk";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new lf.m();
                    }
                    str = "template";
                }
                C3688ek c3688ek = new C3688ek(str2, null, str);
                this.f37859c.put("eventType", c3688ek.f38734a);
                Map map2 = this.f37859c;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                map2.put("eventId", string);
                this.f37859c.put("isTemplateEvent", kotlin.coroutines.jvm.internal.b.a(this.f37860d == EnumC3585ak.f38216b));
                Map map3 = this.f37859c;
                Intrinsics.checkNotNull(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                String payload = new JSONObject(map3).toString();
                Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
                Intrinsics.checkNotNullParameter(payload, "payload");
                c3688ek.f38735b = payload;
                this.f37857a = 1;
                if (wj.a(c3688ek, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Wj.f37959a.a();
        } catch (Exception e10) {
            Wj wj2 = Wj.f37959a;
            e10.getMessage();
        }
        return Unit.f93236a;
    }
}
