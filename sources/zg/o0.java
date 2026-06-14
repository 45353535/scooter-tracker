package zg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.l;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements ah.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f119461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119462c;

    public o0(kotlinx.serialization.json.g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f119460a = configuration.e();
        this.f119461b = configuration.p();
        this.f119462c = configuration.f() != kotlinx.serialization.json.a.f93651b;
    }

    private final void d(SerialDescriptor serialDescriptor, KClass kClass) {
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = serialDescriptor.f(i10);
            if (Intrinsics.areEqual(strF, this.f119460a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(SerialDescriptor serialDescriptor, KClass kClass) {
        wg.l kind = serialDescriptor.getKind();
        if ((kind instanceof wg.d) || Intrinsics.areEqual(kind, l.a.f108006a)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f119461b && this.f119462c) {
            if (Intrinsics.areEqual(kind, m.b.f108009a) || Intrinsics.areEqual(kind, m.c.f108010a) || (kind instanceof wg.e) || (kind instanceof l.b)) {
                throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // ah.d
    public void a(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // ah.d
    public void b(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // ah.d
    public void c(KClass baseClass, KClass actualClass, KSerializer actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        e(descriptor, actualClass);
        if (this.f119461b || !this.f119462c) {
            return;
        }
        d(descriptor, actualClass);
    }
}
