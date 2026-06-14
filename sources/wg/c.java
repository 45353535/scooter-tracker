package wg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
final class c implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f107973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f107974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f107975c;

    public c(SerialDescriptor original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f107973a = original;
        this.f107974b = kClass;
        this.f107975c = original.h() + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return this.f107973a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f107973a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        return this.f107973a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f107973a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && Intrinsics.areEqual(this.f107973a, cVar.f107973a) && Intrinsics.areEqual(cVar.f107974b, this.f107974b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i10) {
        return this.f107973a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        return this.f107973a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.f107973a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public l getKind() {
        return this.f107973a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f107975c;
    }

    public int hashCode() {
        return (this.f107974b.hashCode() * 31) + h().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f107973a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f107973a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f107974b + ", original: " + this.f107973a + ')';
    }
}
