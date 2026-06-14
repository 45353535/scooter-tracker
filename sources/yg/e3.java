package yg;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KSerializer f118956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KSerializer f118957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KSerializer f118958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SerialDescriptor f118959d;

    public e3(KSerializer aSerializer, KSerializer bSerializer, KSerializer cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f118956a = aSerializer;
        this.f118957b = bSerializer;
        this.f118958c = cSerializer;
        this.f118959d = wg.k.c("kotlin.Triple", new SerialDescriptor[0], new Function1() { // from class: yg.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e3.d(this.f118948b, (wg.a) obj);
            }
        });
    }

    private final Triple b(xg.d dVar) {
        Object objC = xg.c.c(dVar, getDescriptor(), 0, this.f118956a, null, 8, null);
        Object objC2 = xg.c.c(dVar, getDescriptor(), 1, this.f118957b, null, 8, null);
        Object objC3 = xg.c.c(dVar, getDescriptor(), 2, this.f118958c, null, 8, null);
        dVar.c(getDescriptor());
        return new Triple(objC, objC2, objC3);
    }

    private final Triple c(xg.d dVar) {
        xg.d dVar2;
        Object objC = f3.f118967a;
        Object objC2 = f3.f118967a;
        Object objC3 = f3.f118967a;
        while (true) {
            int iX = dVar.x(getDescriptor());
            if (iX == -1) {
                dVar.c(getDescriptor());
                if (objC == f3.f118967a) {
                    throw new ug.m("Element 'first' is missing");
                }
                if (objC2 == f3.f118967a) {
                    throw new ug.m("Element 'second' is missing");
                }
                if (objC3 != f3.f118967a) {
                    return new Triple(objC, objC2, objC3);
                }
                throw new ug.m("Element 'third' is missing");
            }
            if (iX == 0) {
                dVar2 = dVar;
                objC = xg.c.c(dVar2, getDescriptor(), 0, this.f118956a, null, 8, null);
            } else if (iX == 1) {
                dVar2 = dVar;
                objC2 = xg.c.c(dVar2, getDescriptor(), 1, this.f118957b, null, 8, null);
            } else {
                if (iX != 2) {
                    throw new ug.m("Unexpected index " + iX);
                }
                objC3 = xg.c.c(dVar, getDescriptor(), 2, this.f118958c, null, 8, null);
            }
            dVar = dVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(e3 e3Var, wg.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        wg.a.b(buildClassSerialDescriptor, "first", e3Var.f118956a.getDescriptor(), null, false, 12, null);
        wg.a.b(buildClassSerialDescriptor, "second", e3Var.f118957b.getDescriptor(), null, false, 12, null);
        wg.a.b(buildClassSerialDescriptor, "third", e3Var.f118958c.getDescriptor(), null, false, 12, null);
        return Unit.f93236a;
    }

    @Override // ug.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        xg.d dVarB = decoder.b(getDescriptor());
        return dVarB.j() ? b(dVarB) : c(dVarB);
    }

    @Override // ug.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Triple value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        xg.f fVarB = encoder.b(getDescriptor());
        fVarB.F(getDescriptor(), 0, this.f118956a, value.i());
        fVarB.F(getDescriptor(), 1, this.f118957b, value.j());
        fVarB.F(getDescriptor(), 2, this.f118958c, value.k());
        fVarB.c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f118959d;
    }
}
