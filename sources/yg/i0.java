package yg;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Enum[] f118985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SerialDescriptor f118986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f118987c;

    public i0(final String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f118985a = values;
        this.f118987c = lf.i.a(new Function0() { // from class: yg.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.c(this.f118978b, serialName);
            }
        });
    }

    private final SerialDescriptor b(String str) {
        g0 g0Var = new g0(str, this.f118985a.length);
        for (Enum r02 : this.f118985a) {
            i2.o(g0Var, r02.name(), false, 2, null);
        }
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor c(i0 i0Var, String str) {
        SerialDescriptor serialDescriptor = i0Var.f118986b;
        return serialDescriptor == null ? i0Var.b(str) : serialDescriptor;
    }

    @Override // ug.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iT = decoder.t(getDescriptor());
        if (iT >= 0) {
            Enum[] enumArr = this.f118985a;
            if (iT < enumArr.length) {
                return enumArr[iT];
            }
        }
        throw new ug.m(iT + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.f118985a.length);
    }

    @Override // ug.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf = ArraysKt.indexOf(this.f118985a, value);
        if (iIndexOf != -1) {
            encoder.f(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f118985a);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new ug.m(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f118987c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(String serialName, Enum[] values, SerialDescriptor descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f118986b = descriptor;
    }
}
