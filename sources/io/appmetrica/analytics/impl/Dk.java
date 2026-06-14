package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Dk implements ServiceStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5579yl f75680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f75681c;

    public Dk(@NotNull Context context, @NotNull InterfaceC5579yl interfaceC5579yl, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.f75679a = context;
        this.f75680b = interfaceC5579yl;
        this.f75681c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(@NotNull String str, @NotNull ProtobufStateSerializer<P> protobufStateSerializer, @NotNull ProtobufConverter<T, P> protobufConverter) {
        Sm.f76464a.getClass();
        return new Rm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f75679a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f75679a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.f75681c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f75679a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        C5506vn c5506vn;
        C5112g7 c5112g7A = C5112g7.a(this.f75679a);
        synchronized (c5112g7A) {
            try {
                if (c5112g7A.f77229l == null) {
                    Context context = c5112g7A.f77222e;
                    Wm wm = Wm.SERVICE;
                    if (c5112g7A.f77228k == null) {
                        c5112g7A.f77228k = new C5481un(new C5479ul(c5112g7A.h()), "temp_cache");
                    }
                    c5112g7A.f77229l = new C5506vn(context, wm, c5112g7A.f77228k);
                }
                c5506vn = c5112g7A.f77229l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5506vn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new Gb(this.f75680b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C5066ed(str, this.f75680b);
    }
}
