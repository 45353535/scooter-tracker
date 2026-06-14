package vh;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f106878e;

    public m(l delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f106878e = delegate;
    }

    @Override // vh.l
    public j0 b(c0 file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f106878e.b(t(file, "appendingSink", C4240b4.i.f42616b), z10);
    }

    @Override // vh.l
    public void c(c0 source, c0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f106878e.c(t(source, "atomicMove", "source"), t(target, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // vh.l
    public void g(c0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.f106878e.g(t(dir, "createDirectory", "dir"), z10);
    }

    @Override // vh.l
    public void i(c0 path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f106878e.i(t(path, "delete", "path"), z10);
    }

    @Override // vh.l
    public List k(c0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List listK = this.f106878e.k(t(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(u((c0) it.next(), "list"));
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // vh.l
    public k m(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        k kVarM = this.f106878e.m(t(path, "metadataOrNull", "path"));
        if (kVarM == null) {
            return null;
        }
        return kVarM.e() == null ? kVarM : k.b(kVarM, false, false, u(kVarM.e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // vh.l
    public j n(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f106878e.n(t(file, "openReadOnly", C4240b4.i.f42616b));
    }

    @Override // vh.l
    public j p(c0 file, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f106878e.p(t(file, "openReadWrite", C4240b4.i.f42616b), z10, z11);
    }

    @Override // vh.l
    public j0 r(c0 file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f106878e.r(t(file, "sink", C4240b4.i.f42616b), z10);
    }

    @Override // vh.l
    public l0 s(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f106878e.s(t(file, "source", C4240b4.i.f42616b));
    }

    public c0 t(c0 path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public String toString() {
        return v0.b(getClass()).getSimpleName() + '(' + this.f106878e + ')';
    }

    public c0 u(c0 path, String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }
}
