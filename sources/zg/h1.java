package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 {
    public static final g1 a(kotlinx.serialization.json.b json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        return !json.e().a() ? new g1(source) : new i1(source);
    }
}
