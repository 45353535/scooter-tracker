package yg;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f119064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f119066c;

    public s2(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f119064a = original;
        this.f119065b = original.h() + '?';
        this.f119066c = d2.a(original);
    }

    @Override // yg.n
    public Set a() {
        return this.f119066c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f119064a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        return this.f119064a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f119064a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && Intrinsics.areEqual(this.f119064a, ((s2) obj).f119064a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i10) {
        return this.f119064a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        return this.f119064a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.f119064a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public wg.l getKind() {
        return this.f119064a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f119065b;
    }

    public int hashCode() {
        return this.f119064a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f119064a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f119064a.isInline();
    }

    public final SerialDescriptor j() {
        return this.f119064a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119064a);
        sb2.append('?');
        return sb2.toString();
    }
}
