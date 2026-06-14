package zg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof wg.e) || serialDescriptor.getKind() == l.b.f108007a;
    }

    public static final JsonElement d(kotlinx.serialization.json.b json, Object obj, ug.n serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new t0(json, new Function1() { // from class: zg.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return m1.e(ref$ObjectRef, (JsonElement) obj2);
            }
        }).j(serializer, obj);
        Object obj2 = ref$ObjectRef.f93280b;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Ref$ObjectRef ref$ObjectRef, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ref$ObjectRef.f93280b = it;
        return Unit.f93236a;
    }
}
