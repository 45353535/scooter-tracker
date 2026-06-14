package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    public static final r a(b0 sb2, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.e().m() ? new w(sb2, json) : new r(sb2);
    }
}
