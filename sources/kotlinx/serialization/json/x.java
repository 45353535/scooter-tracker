package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;
import zg.i0;

/* JADX INFO: loaded from: classes3.dex */
final class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f93716a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93717b = wg.k.b("kotlinx.serialization.json.JsonLiteral", e.i.f107986a);

    private x() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementU = r.d(decoder).u();
        if (jsonElementU instanceof w) {
            return (w) jsonElementU;
        }
        throw i0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + v0.b(jsonElementU.getClass()), jsonElementU.toString());
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, w value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value.g()) {
            encoder.w(value.e());
            return;
        }
        if (value.f() != null) {
            encoder.g(value.f()).w(value.e());
            return;
        }
        Long lX = StringsKt.x(value.e());
        if (lX != null) {
            encoder.A(lX.longValue());
            return;
        }
        lf.v vVarH = kotlin.text.c0.h(value.e());
        if (vVarH != null) {
            encoder.g(vg.a.I(lf.v.f94232c).getDescriptor()).A(vVarH.g());
            return;
        }
        Double dT = StringsKt.t(value.e());
        if (dT != null) {
            encoder.y(dT.doubleValue());
            return;
        }
        Boolean boolU1 = StringsKt.u1(value.e());
        if (boolU1 != null) {
            encoder.m(boolU1.booleanValue());
        } else {
            encoder.w(value.e());
        }
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93717b;
    }
}
