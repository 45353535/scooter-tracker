package yg;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KSerializer f119031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KSerializer f119032b;

    public /* synthetic */ m1(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public abstract SerialDescriptor getDescriptor();

    public final KSerializer m() {
        return this.f119031a;
    }

    public final KSerializer n() {
        return this.f119032b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(xg.d decoder, Map builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, i11 * 2), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            h(decoder, i10 + iE, builder, false);
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(xg.d decoder, int i10, Map builder, boolean z10) {
        int iX;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objC = xg.c.c(decoder, getDescriptor(), i10, this.f119031a, null, 8, null);
        if (z10) {
            iX = decoder.x(getDescriptor());
            if (iX != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iX).toString());
            }
        } else {
            iX = i10 + 1;
        }
        int i11 = iX;
        builder.put(objC, (!builder.containsKey(objC) || (this.f119032b.getDescriptor().getKind() instanceof wg.e)) ? xg.c.c(decoder, getDescriptor(), i11, this.f119032b, null, 8, null) : decoder.s(getDescriptor(), i11, this.f119032b, MapsKt.getValue(builder, objC)));
    }

    @Override // ug.n
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        xg.f fVarZ = encoder.z(descriptor, iE);
        Iterator itD = d(obj);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            fVarZ.F(getDescriptor(), i10, m(), key);
            i10 += 2;
            fVarZ.F(getDescriptor(), i11, n(), value);
        }
        fVarZ.c(descriptor);
    }

    private m1(KSerializer kSerializer, KSerializer kSerializer2) {
        super(null);
        this.f119031a = kSerializer;
        this.f119032b = kSerializer2;
    }
}
