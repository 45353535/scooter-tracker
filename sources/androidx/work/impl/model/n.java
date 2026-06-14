package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class n {
    public static SystemIdInfo a(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return systemIdInfoDao.getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    public static void b(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        systemIdInfoDao.removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }
}
