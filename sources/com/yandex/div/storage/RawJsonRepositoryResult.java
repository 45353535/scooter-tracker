package com.yandex.div.storage;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepositoryResult;", "", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "resultData", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "errors", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "data", "addData", "(Ljava/util/Collection;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", MenuActionType.COPY, "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getResultData", "()Ljava/util/List;", "getErrors", y.f66058y, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RawJsonRepositoryResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RawJsonRepositoryResult EMPTY = new RawJsonRepositoryResult(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final List<RawJson> resultData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepositoryResult$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/storage/RawJsonRepositoryResult;", "getEMPTY", "()Lcom/yandex/div/storage/RawJsonRepositoryResult;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RawJsonRepositoryResult getEMPTY() {
            return RawJsonRepositoryResult.EMPTY;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawJsonRepositoryResult(@NotNull List<? extends RawJson> list, @NotNull List<RawJsonRepositoryException> list2) {
        this.resultData = list;
        this.errors = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryResult copy$default(RawJsonRepositoryResult rawJsonRepositoryResult, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rawJsonRepositoryResult.resultData;
        }
        if ((i10 & 2) != 0) {
            list2 = rawJsonRepositoryResult.errors;
        }
        return rawJsonRepositoryResult.copy(list, list2);
    }

    @NotNull
    public final RawJsonRepositoryResult addData(@NotNull Collection<? extends RawJson> data) {
        return copy$default(this, CollectionsKt.plus((Collection) this.resultData, (Iterable) data), null, 2, null);
    }

    @NotNull
    public final RawJsonRepositoryResult copy(@NotNull List<? extends RawJson> resultData, @NotNull List<RawJsonRepositoryException> errors) {
        return new RawJsonRepositoryResult(resultData, errors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) other;
        return Intrinsics.areEqual(this.resultData, rawJsonRepositoryResult.resultData) && Intrinsics.areEqual(this.errors, rawJsonRepositoryResult.errors);
    }

    @NotNull
    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    @NotNull
    public final List<RawJson> getResultData() {
        return this.resultData;
    }

    public int hashCode() {
        return (this.resultData.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.resultData + ", errors=" + this.errors + ')';
    }
}
