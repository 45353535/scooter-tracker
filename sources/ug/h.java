package ug;

import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.d;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends yg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KClass f105658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f105659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f105660c;

    public h(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f105658a = baseClass;
        this.f105659b = CollectionsKt.emptyList();
        this.f105660c = lf.i.b(lf.l.f94210c, new Function0() { // from class: ug.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.h(this.f105656b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor h(final h hVar) {
        return wg.b.c(wg.k.d("kotlinx.serialization.Polymorphic", d.a.f107976a, new SerialDescriptor[0], new Function1() { // from class: ug.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.i(this.f105657b, (wg.a) obj);
            }
        }), hVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(h hVar, wg.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        wg.a.b(buildSerialDescriptor, "type", vg.a.E(a1.f93282a).getDescriptor(), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "value", wg.k.e("kotlinx.serialization.Polymorphic<" + hVar.e().getSimpleName() + '>', l.a.f108006a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(hVar.f105659b);
        return Unit.f93236a;
    }

    @Override // yg.b
    public KClass e() {
        return this.f105658a;
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f105660c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
