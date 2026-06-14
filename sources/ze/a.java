package ze;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ff.a f119348b;

    public a(String name, ff.a type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f119347a = name;
        this.f119348b = type;
        if (StringsKt.y0(name)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f119347a, aVar.f119347a) && Intrinsics.areEqual(this.f119348b, aVar.f119348b);
    }

    public int hashCode() {
        return (this.f119347a.hashCode() * 31) + this.f119348b.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f119347a;
    }
}
