package wh;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;
import vh.h;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vh.h f108014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vh.h f108015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final vh.h f108016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final vh.h f108017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final vh.h f108018e;

    static {
        h.a aVar = vh.h.f106840e;
        f108014a = aVar.d("/");
        f108015b = aVar.d("\\");
        f108016c = aVar.d("/\\");
        f108017d = aVar.d(".");
        f108018e = aVar.d("..");
    }

    public static final c0 j(c0 c0Var, c0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.f() || child.q() != null) {
            return child;
        }
        vh.h hVarM = m(c0Var);
        if (hVarM == null && (hVarM = m(child)) == null) {
            hVarM = s(c0.f106806d);
        }
        vh.e eVar = new vh.e();
        eVar.r(c0Var.c());
        if (eVar.e0() > 0) {
            eVar.r(hVarM);
        }
        eVar.r(child.c());
        return q(eVar, z10);
    }

    public static final c0 k(String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new vh.e().writeUtf8(str), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(c0 c0Var) {
        int iC = vh.h.C(c0Var.c(), f108014a, 0, 2, null);
        return iC != -1 ? iC : vh.h.C(c0Var.c(), f108015b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh.h m(c0 c0Var) {
        vh.h hVarC = c0Var.c();
        vh.h hVar = f108014a;
        if (vh.h.u(hVarC, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        vh.h hVarC2 = c0Var.c();
        vh.h hVar2 = f108015b;
        if (vh.h.u(hVarC2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(c0 c0Var) {
        return c0Var.c().k(f108018e) && (c0Var.c().K() == 2 || c0Var.c().F(c0Var.c().K() + (-3), f108014a, 0, 1) || c0Var.c().F(c0Var.c().K() + (-3), f108015b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(c0 c0Var) {
        if (c0Var.c().K() == 0) {
            return -1;
        }
        if (c0Var.c().l(0) == 47) {
            return 1;
        }
        if (c0Var.c().l(0) == 92) {
            if (c0Var.c().K() <= 2 || c0Var.c().l(1) != 92) {
                return 1;
            }
            int iS = c0Var.c().s(f108015b, 2);
            return iS == -1 ? c0Var.c().K() : iS;
        }
        if (c0Var.c().K() > 2 && c0Var.c().l(1) == 58 && c0Var.c().l(2) == 92) {
            char cL = (char) c0Var.c().l(0);
            if ('a' <= cL && cL < '{') {
                return 3;
            }
            if ('A' <= cL && cL < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(vh.e eVar, vh.h hVar) {
        if (!Intrinsics.areEqual(hVar, f108015b) || eVar.e0() < 2 || eVar.z(1L) != 58) {
            return false;
        }
        char cZ = (char) eVar.z(0L);
        if ('a' > cZ || cZ >= '{') {
            return 'A' <= cZ && cZ < '[';
        }
        return true;
    }

    public static final c0 q(vh.e eVar, boolean z10) throws EOFException {
        vh.h hVar;
        vh.h byteString;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        vh.e eVar2 = new vh.e();
        vh.h hVarR = null;
        int i10 = 0;
        while (true) {
            if (!eVar.t(0L, f108014a)) {
                hVar = f108015b;
                if (!eVar.t(0L, hVar)) {
                    break;
                }
            }
            byte b10 = eVar.readByte();
            if (hVarR == null) {
                hVarR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.areEqual(hVarR, hVar);
        if (z11) {
            Intrinsics.checkNotNull(hVarR);
            eVar2.r(hVarR);
            eVar2.r(hVarR);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(hVarR);
            eVar2.r(hVarR);
        } else {
            long jA0 = eVar.a0(f108016c);
            if (hVarR == null) {
                hVarR = jA0 == -1 ? s(c0.f106806d) : r(eVar.z(jA0));
            }
            if (p(eVar, hVarR)) {
                if (jA0 == 2) {
                    eVar2.H(eVar, 3L);
                } else {
                    eVar2.H(eVar, 2L);
                }
            }
        }
        boolean z12 = eVar2.e0() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.exhausted()) {
            long jA02 = eVar.a0(f108016c);
            if (jA02 == -1) {
                byteString = eVar.readByteString();
            } else {
                byteString = eVar.readByteString(jA02);
                eVar.readByte();
            }
            vh.h hVar2 = f108018e;
            if (Intrinsics.areEqual(byteString, hVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), hVar2)))) {
                        arrayList.add(byteString);
                    } else if (!z11 || arrayList.size() != 1) {
                        CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteString, f108017d) && !Intrinsics.areEqual(byteString, vh.h.f106841f)) {
                arrayList.add(byteString);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.r(hVarR);
            }
            eVar2.r((vh.h) arrayList.get(i11));
        }
        if (eVar2.e0() == 0) {
            eVar2.r(f108017d);
        }
        return new c0(eVar2.readByteString());
    }

    private static final vh.h r(byte b10) {
        if (b10 == 47) {
            return f108014a;
        }
        if (b10 == 92) {
            return f108015b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh.h s(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f108014a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f108015b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
