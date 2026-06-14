package wg;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;
import yg.q2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final SerialDescriptor b(String serialName, e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return q2.a(serialName, kind);
    }

    public static final SerialDescriptor c(String serialName, SerialDescriptor[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new h(serialName, m.a.f108008a, aVar.f().size(), ArraysKt.toList(typeParameters), aVar);
    }

    public static final SerialDescriptor d(String serialName, l kind, SerialDescriptor[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, m.a.f108008a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new h(serialName, kind, aVar.f().size(), ArraysKt.toList(typeParameters), aVar);
    }

    public static /* synthetic */ SerialDescriptor e(String str, l lVar, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: wg.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k.f((a) obj2);
                }
            };
        }
        return d(str, lVar, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Unit.f93236a;
    }
}
