package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {
    public static final Object a(kotlinx.serialization.json.b json, ug.c deserializer, a0 reader) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        a1 a1VarB = b1.b(json, reader, null, 4, null);
        try {
            Object objK = new d1(json, n1.f119451d, a1VarB, deserializer.getDescriptor(), null).k(deserializer);
            a1VarB.x();
            return objK;
        } finally {
            a1VarB.V();
        }
    }

    public static final void b(kotlinx.serialization.json.b json, b0 writer, ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new e1(writer, json, n1.f119451d, new kotlinx.serialization.json.s[n1.g().size()]).j(serializer, obj);
    }
}
