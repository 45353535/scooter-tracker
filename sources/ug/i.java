package ug;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final c a(yg.b bVar, xg.d decoder, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        c cVarC = bVar.c(decoder, str);
        if (cVarC != null) {
            return cVarC;
        }
        yg.c.a(str, bVar.e());
        throw new lf.g();
    }

    public static final n b(yg.b bVar, Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        n nVarD = bVar.d(encoder, value);
        if (nVarD != null) {
            return nVarD;
        }
        yg.c.b(v0.b(value.getClass()), bVar.e());
        throw new lf.g();
    }
}
