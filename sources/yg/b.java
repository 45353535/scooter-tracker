package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements KSerializer {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(xg.d dVar) {
        return xg.c.c(dVar, getDescriptor(), 1, ug.i.a(this, dVar, dVar.i(getDescriptor(), 0)), null, 8, null);
    }

    public ug.c c(xg.d decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.a().e(e(), str);
    }

    public ug.n d(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.a().f(e(), value);
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        Object objB;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        xg.d dVarB = decoder.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (dVarB.j()) {
            objB = b(dVarB);
        } else {
            Object objC = null;
            while (true) {
                int iX = dVarB.x(getDescriptor());
                if (iX != -1) {
                    if (iX == 0) {
                        ref$ObjectRef.f93280b = dVarB.i(getDescriptor(), iX);
                    } else {
                        if (iX != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.f93280b;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iX);
                            throw new ug.m(sb2.toString());
                        }
                        Object obj = ref$ObjectRef.f93280b;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.f93280b = obj;
                        objC = xg.c.c(dVarB, getDescriptor(), iX, ug.i.a(this, dVarB, (String) obj), null, 8, null);
                    }
                } else {
                    if (objC == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f93280b)).toString());
                    }
                    Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objB = objC;
                }
            }
        }
        dVarB.c(descriptor);
        return objB;
    }

    public abstract KClass e();

    @Override // ug.n
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        ug.n nVarB = ug.i.b(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        xg.f fVarB = encoder.b(descriptor);
        fVarB.q(getDescriptor(), 0, nVarB.getDescriptor().h());
        SerialDescriptor descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(nVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        fVarB.F(descriptor2, 1, nVarB, value);
        fVarB.c(descriptor);
    }
}
