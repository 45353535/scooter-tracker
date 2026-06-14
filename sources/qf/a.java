package qf;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final EnumEntries a(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new b(entries);
    }
}
