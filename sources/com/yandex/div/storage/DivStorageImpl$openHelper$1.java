package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import lf.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class DivStorageImpl$openHelper$1 implements DatabaseOpenHelper.CreateCallback, v {
    final /* synthetic */ DivStorageImpl $tmp0;

    DivStorageImpl$openHelper$1(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.CreateCallback) && (obj instanceof v)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.v
    @NotNull
    public final e getFunctionDelegate() {
        return new y(1, this.$tmp0, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.CreateCallback
    public final void onCreate(@NotNull DatabaseOpenHelper.Database database) {
        this.$tmp0.onCreate(database);
    }
}
