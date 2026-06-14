package com.yandex.div.storage;

import androidx.annotation.AnyThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u0016\u0017J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorage;", "", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsons", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lcom/yandex/div/storage/database/ExecutionResult;", "saveRawJsons", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "", "", "rawJsonIds", "Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "readRawJsons", "(Ljava/util/Set;)Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "Lkotlin/Function1;", "", "predicate", "Lcom/yandex/div/storage/DivStorage$RemoveResult;", "removeRawJsons", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/DivStorage$RemoveResult;", "LoadDataResult", "RemoveResult", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivStorage {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0096\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "T", "", "", "restoredData", "Lcom/yandex/div/storage/database/StorageException;", "errors", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRestoredData", "getErrors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static /* data */ class LoadDataResult<T> {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final List<T> restoredData;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(@NotNull List<? extends T> list, @NotNull List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }

        @NotNull
        public final List<T> component1() {
            return getRestoredData();
        }

        @NotNull
        public final List<StorageException> component2() {
            return getErrors();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) other;
            return Intrinsics.areEqual(getRestoredData(), loadDataResult.getRestoredData()) && Intrinsics.areEqual(getErrors(), loadDataResult.getErrors());
        }

        @NotNull
        public List<StorageException> getErrors() {
            return this.errors;
        }

        @NotNull
        public List<T> getRestoredData() {
            return this.restoredData;
        }

        public int hashCode() {
            return (getRestoredData().hashCode() * 31) + getErrors().hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/storage/DivStorage$RemoveResult;", "", "", "", "ids", "", "Lcom/yandex/div/storage/database/StorageException;", "errors", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "component1", "()Ljava/util/Set;", "component2", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getIds", "Ljava/util/List;", "getErrors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RemoveResult {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final Set<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(@NotNull Set<String> set, @NotNull List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }

        @NotNull
        public final Set<String> component1() {
            return this.ids;
        }

        @NotNull
        public final List<StorageException> component2() {
            return this.errors;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) other;
            return Intrinsics.areEqual(this.ids, removeResult.ids) && Intrinsics.areEqual(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return (this.ids.hashCode() * 31) + this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
        }
    }

    @AnyThread
    @NotNull
    LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> rawJsonIds);

    @AnyThread
    @NotNull
    RemoveResult removeRawJsons(@NotNull Function1<? super RawJson, Boolean> predicate);

    @AnyThread
    @NotNull
    ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError);
}
