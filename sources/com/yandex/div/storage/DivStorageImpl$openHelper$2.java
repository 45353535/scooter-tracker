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
/* synthetic */ class DivStorageImpl$openHelper$2 implements DatabaseOpenHelper.UpgradeCallback, v {
    final /* synthetic */ DivStorageImpl $tmp0;

    DivStorageImpl$openHelper$2(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.UpgradeCallback) && (obj instanceof v)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.v
    @NotNull
    public final e getFunctionDelegate() {
        return new y(3, this.$tmp0, DivStorageImpl.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.UpgradeCallback
    public final void onUpgrade(@NotNull DatabaseOpenHelper.Database database, int i10, int i11) {
        this.$tmp0.onUpgrade(database, i10, i11);
    }
}
