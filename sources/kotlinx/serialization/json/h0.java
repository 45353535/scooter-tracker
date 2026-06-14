package kotlinx.serialization.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import zg.p0;
import zg.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static final Object a(b bVar, ug.c deserializer, InputStream stream) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        zg.c0 c0Var = new zg.c0(stream);
        try {
            return p0.a(bVar, deserializer, c0Var);
        } finally {
            c0Var.b();
        }
    }

    public static final void b(b bVar, ug.n serializer, Object obj, OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        q0 q0Var = new q0(stream);
        try {
            p0.b(bVar, q0Var, serializer, obj);
        } finally {
            q0Var.g();
        }
    }
}
