package yg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KSerializer f118932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KSerializer f118933b;

    public /* synthetic */ a1(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract Object a(Object obj);

    protected final KSerializer b() {
        return this.f118932a;
    }

    protected abstract Object c(Object obj);

    protected final KSerializer d() {
        return this.f118933b;
    }

    @Override // ug.c
    public Object deserialize(Decoder decoder) {
        Object objE;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        xg.d dVarB = decoder.b(descriptor);
        if (dVarB.j()) {
            objE = e(xg.c.c(dVarB, getDescriptor(), 0, b(), null, 8, null), xg.c.c(dVarB, getDescriptor(), 1, d(), null, 8, null));
        } else {
            Object objC = f3.f118967a;
            Object objC2 = f3.f118967a;
            while (true) {
                int iX = dVarB.x(getDescriptor());
                if (iX != -1) {
                    if (iX == 0) {
                        objC = xg.c.c(dVarB, getDescriptor(), 0, b(), null, 8, null);
                    } else {
                        if (iX != 1) {
                            throw new ug.m("Invalid index: " + iX);
                        }
                        objC2 = xg.c.c(dVarB, getDescriptor(), 1, d(), null, 8, null);
                    }
                } else {
                    if (objC == f3.f118967a) {
                        throw new ug.m("Element 'key' is missing");
                    }
                    if (objC2 == f3.f118967a) {
                        throw new ug.m("Element 'value' is missing");
                    }
                    objE = e(objC, objC2);
                }
            }
        }
        dVarB.c(descriptor);
        return objE;
    }

    protected abstract Object e(Object obj, Object obj2);

    @Override // ug.n
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        xg.f fVarB = encoder.b(getDescriptor());
        fVarB.F(getDescriptor(), 0, this.f118932a, a(obj));
        fVarB.F(getDescriptor(), 1, this.f118933b, c(obj));
        fVarB.c(getDescriptor());
    }

    private a1(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f118932a = kSerializer;
        this.f118933b = kSerializer2;
    }
}
