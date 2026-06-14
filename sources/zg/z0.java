package zg;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.a.values().length];
            try {
                iArr[kotlinx.serialization.json.a.f93651b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.a.f93653d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.a.f93652c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(wg.l kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof l.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof wg.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof wg.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.f) {
                return ((kotlinx.serialization.json.f) annotation).discriminator();
            }
        }
        return json.e().e();
    }

    public static final Void d(String str, JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new g0("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.v0.b(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ug.n nVar, ug.n nVar2, String str) {
        if ((nVar instanceof ug.j) && yg.y0.a(nVar2.getDescriptor()).contains(str)) {
            androidx.privacysandbox.ads.adservices.topics.a.a(nVar);
            throw null;
        }
    }
}
