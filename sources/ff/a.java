package ff;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KClass f72022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KType f72023b;

    public a(KClass type, KType kType) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f72022a = type;
        this.f72023b = kType;
    }

    public final KClass a() {
        return this.f72022a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        KType kType = this.f72023b;
        if (kType == null) {
            a aVar = (a) obj;
            if (aVar.f72023b == null) {
                return Intrinsics.areEqual(this.f72022a, aVar.f72022a);
            }
        }
        return Intrinsics.areEqual(kType, ((a) obj).f72023b);
    }

    public int hashCode() {
        KType kType = this.f72023b;
        return kType != null ? kType.hashCode() : this.f72022a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeInfo(");
        Object obj = this.f72023b;
        if (obj == null) {
            obj = this.f72022a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
