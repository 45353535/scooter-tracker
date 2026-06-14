package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "", "", "", "ids", "", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "errors", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getIds", "()Ljava/util/Set;", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RawJsonRepositoryRemoveResult {

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final Set<String> ids;

    public RawJsonRepositoryRemoveResult(@NotNull Set<String> set, @NotNull List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) other;
        return Intrinsics.areEqual(this.ids, rawJsonRepositoryRemoveResult.ids) && Intrinsics.areEqual(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    public int hashCode() {
        return (this.ids.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }
}
