package kotlin.jvm.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f93310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f93311c;

    public j0(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f93310b = jClass;
        this.f93311c = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && Intrinsics.areEqual(getJClass(), ((j0) obj).getJClass());
    }

    @Override // kotlin.jvm.internal.q
    public Class getJClass() {
        return this.f93310b;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public Collection getMembers() {
        throw new xf.b();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        return getJClass() + " (Kotlin reflection is not available)";
    }
}
