package yg;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements KSerializer {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(a aVar, xg.d dVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(dVar, i10, obj, z10);
    }

    private final int j(xg.d dVar, Object obj) {
        int iW = dVar.w(getDescriptor());
        c(obj, iW);
        return iW;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i10);

    protected abstract Iterator d(Object obj);

    @Override // ug.c
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Object obj);

    public final Object f(Decoder decoder, Object obj) {
        Object objA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (obj == null || (objA = k(obj)) == null) {
            objA = a();
        }
        Object obj2 = objA;
        int iB = b(obj2);
        xg.d dVarB = decoder.b(getDescriptor());
        if (!dVarB.j()) {
            while (true) {
                int iX = dVarB.x(getDescriptor());
                if (iX == -1) {
                    break;
                }
                i(this, dVarB, iB + iX, obj2, false, 8, null);
            }
        } else {
            g(dVarB, obj2, iB, j(dVarB, obj2));
        }
        dVarB.c(getDescriptor());
        return l(obj2);
    }

    protected abstract void g(xg.d dVar, Object obj, int i10, int i11);

    protected abstract void h(xg.d dVar, int i10, Object obj, boolean z10);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private a() {
    }
}
