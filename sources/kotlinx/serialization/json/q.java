package kotlinx.serialization.json;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.d;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f93710a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93711b = wg.k.d("kotlinx.serialization.json.JsonElement", d.b.f107977a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.json.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q.g((wg.a) obj);
        }
    });

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(wg.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        wg.a.b(buildSerialDescriptor, "JsonPrimitive", r.f(new Function0() { // from class: kotlinx.serialization.json.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.h();
            }
        }), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "JsonNull", r.f(new Function0() { // from class: kotlinx.serialization.json.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.i();
            }
        }), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "JsonLiteral", r.f(new Function0() { // from class: kotlinx.serialization.json.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.j();
            }
        }), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "JsonObject", r.f(new Function0() { // from class: kotlinx.serialization.json.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.k();
            }
        }), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "JsonArray", r.f(new Function0() { // from class: kotlinx.serialization.json.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.l();
            }
        }), null, false, 12, null);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor h() {
        return e0.f93691a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor i() {
        return a0.f93656a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor j() {
        return x.f93716a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor k() {
        return d0.f93669a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor l() {
        return d.f93664a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93711b;
    }

    @Override // ug.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return r.d(decoder).u();
    }

    @Override // ug.n
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.j(e0.f93691a, value);
        } else if (value instanceof JsonObject) {
            encoder.j(d0.f93669a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new lf.m();
            }
            encoder.j(d.f93664a, value);
        }
    }
}
