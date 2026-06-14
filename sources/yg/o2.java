package yg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o2 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f119039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(KSerializer primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f119039b = new n2(primitiveSerializer.getDescriptor());
    }

    @Override // yg.a
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // yg.a, ug.c
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // yg.w, kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return this.f119039b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final m2 a() {
        return (m2) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        return m2Var.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(m2 m2Var, int i10) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        m2Var.b(i10);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(m2 m2Var, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // yg.w, ug.n
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor serialDescriptor = this.f119039b;
        xg.f fVarZ = encoder.z(serialDescriptor, iE);
        u(fVarZ, obj, iE);
        fVarZ.c(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        return m2Var.a();
    }

    protected abstract void u(xg.f fVar, Object obj, int i10);
}
