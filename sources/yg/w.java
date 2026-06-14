package yg;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KSerializer f119089a;

    public /* synthetic */ w(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // yg.a
    protected final void g(xg.d decoder, Object obj, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public abstract SerialDescriptor getDescriptor();

    @Override // yg.a
    protected void h(xg.d decoder, int i10, Object obj, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n(obj, i10, xg.c.c(decoder, getDescriptor(), i10, this.f119089a, null, 8, null));
    }

    protected abstract void n(Object obj, int i10, Object obj2);

    @Override // ug.n
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        xg.f fVarZ = encoder.z(descriptor, iE);
        Iterator itD = d(obj);
        for (int i10 = 0; i10 < iE; i10++) {
            fVarZ.F(getDescriptor(), i10, this.f119089a, itD.next());
        }
        fVarZ.c(descriptor);
    }

    private w(KSerializer kSerializer) {
        super(null);
        this.f119089a = kSerializer;
    }
}
