package com.yandex.div.storage;

import androidx.annotation.UiThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepository;", "", "Lcom/yandex/div/storage/RawJsonRepository$Payload;", "payload", "Lcom/yandex/div/storage/RawJsonRepositoryResult;", "put", "(Lcom/yandex/div/storage/RawJsonRepository$Payload;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "", "", "ids", "get", "(Ljava/util/List;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "Lkotlin/Function1;", "Lcom/yandex/div/storage/rawjson/RawJson;", "", "predicate", "Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "remove", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "Payload", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RawJsonRepository {
    @UiThread
    @NotNull
    RawJsonRepositoryResult get(@NotNull List<String> ids);

    @UiThread
    @NotNull
    RawJsonRepositoryResult put(@NotNull Payload payload);

    @UiThread
    @NotNull
    RawJsonRepositoryRemoveResult remove(@NotNull Function1<? super RawJson, Boolean> predicate);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepository$Payload;", "", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "jsons", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "<init>", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getJsons", "()Ljava/util/List;", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "getActionOnError", "()Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Payload {

        @NotNull
        private final DivDataRepository.ActionOnError actionOnError;

        @NotNull
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        @NotNull
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        @NotNull
        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public int hashCode() {
            return (this.jsons.hashCode() * 31) + this.actionOnError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }
    }
}
