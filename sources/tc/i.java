package tc;

import id.e1;
import id.f1;
import id.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final f1 a(z zVar) {
        e1 e1VarI;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar.d() != null) {
            e1 e1VarD = zVar.d();
            if (e1VarD != null) {
                return e1VarD.b();
            }
            return null;
        }
        if (zVar.i() == null || (e1VarI = zVar.i()) == null) {
            return null;
        }
        return e1VarI.b();
    }

    public static final f1 b(z zVar) {
        e1 e1VarA;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar.j() != null) {
            e1 e1VarJ = zVar.j();
            if (e1VarJ != null) {
                return e1VarJ.b();
            }
            return null;
        }
        if (zVar.a() == null || (e1VarA = zVar.a()) == null) {
            return null;
        }
        return e1VarA.b();
    }
}
