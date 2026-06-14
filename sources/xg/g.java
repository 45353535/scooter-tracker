package xg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static Object a(Decoder decoder, ug.c deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(decoder);
    }
}
