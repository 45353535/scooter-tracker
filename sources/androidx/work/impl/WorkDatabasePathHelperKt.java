package androidx.work.impl;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "TAG", "Ljava/lang/String;", "WORK_DATABASE_NAME", "", "DATABASE_EXTRA_FILES", "[Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabasePathHelperKt {

    @NotNull
    private static final String[] DATABASE_EXTRA_FILES;

    @NotNull
    private static final String TAG;

    @NotNull
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
        DATABASE_EXTRA_FILES = new String[]{"-journal", "-shm", "-wal"};
    }
}
