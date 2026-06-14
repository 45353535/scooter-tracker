package com.yandex.div.storage.rawjson;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/rawjson/RawJson;", "", "data", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "id", "", "getId", "()Ljava/lang/String;", y.f66058y, "Ready", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RawJson {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/rawjson/RawJson$Companion;", "", "()V", "invoke", "Lcom/yandex/div/storage/rawjson/RawJson;", "id", "", "data", "Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final RawJson invoke(@NotNull String id2, @NotNull JSONObject data) {
            return new Ready(id2, data);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/storage/rawjson/RawJson$Ready;", "Lcom/yandex/div/storage/rawjson/RawJson;", "", "id", "Lorg/json/JSONObject;", "data", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ready implements RawJson {

        @NotNull
        private final JSONObject data;

        @NotNull
        private final String id;

        public Ready(@NotNull String str, @NotNull JSONObject jSONObject) {
            this.id = str;
            this.data = jSONObject;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.id, ready.id) && Intrinsics.areEqual(this.data, ready.data);
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(id=" + this.id + ", data=" + this.data + ')';
        }
    }

    @NotNull
    JSONObject getData();

    @NotNull
    String getId();
}
