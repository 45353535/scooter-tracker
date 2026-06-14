package yg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg.e f119045b;

    public p2(String serialName, wg.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f119044a = serialName;
        this.f119045b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor " + h() + " does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean b() {
        return wg.f.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a();
        throw new lf.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        a();
        throw new lf.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Intrinsics.areEqual(h(), p2Var.h()) && Intrinsics.areEqual(getKind(), p2Var.getKind());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i10) {
        a();
        throw new lf.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        a();
        throw new lf.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ List getAnnotations() {
        return wg.f.a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f119044a;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        a();
        throw new lf.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return wg.f.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public wg.e getKind() {
        return this.f119045b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
