package yg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f119061a = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wg.l f119062b = m.d.f108011a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f119063c = "kotlin.Nothing";

    private s1() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
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
    public wg.l getKind() {
        return f119062b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return f119063c;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
