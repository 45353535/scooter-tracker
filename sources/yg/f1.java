package yg;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f118964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118965b;

    public /* synthetic */ f1(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
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
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        if (i10 >= 0) {
            return this.f118964a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f118965b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.areEqual(this.f118964a, f1Var.f118964a) && Intrinsics.areEqual(h(), f1Var.h());
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
        return m.b.f108009a;
    }

    public int hashCode() {
        return (this.f118964a.hashCode() * 31) + h().hashCode();
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
        return h() + '(' + this.f118964a + ')';
    }

    private f1(SerialDescriptor serialDescriptor) {
        this.f118964a = serialDescriptor;
        this.f118965b = 1;
    }
}
