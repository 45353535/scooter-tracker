package yg;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f119022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f119023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f119024d;

    public /* synthetic */ l1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean b() {
        return wg.f.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f119022b;
            }
            if (i11 == 1) {
                return this.f119023c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f119024d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.areEqual(h(), l1Var.h()) && Intrinsics.areEqual(this.f119022b, l1Var.f119022b) && Intrinsics.areEqual(this.f119023c, l1Var.f119023c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        if (i10 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ List getAnnotations() {
        return wg.f.a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public wg.l getKind() {
        return m.c.f108010a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f119021a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f119022b.hashCode()) * 31) + this.f119023c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return wg.f.b(this);
    }

    public String toString() {
        return h() + '(' + this.f119022b + ", " + this.f119023c + ')';
    }

    private l1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f119021a = str;
        this.f119022b = serialDescriptor;
        this.f119023c = serialDescriptor2;
        this.f119024d = 2;
    }
}
