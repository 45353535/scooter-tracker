package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLegacyConfigStoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "(Lcom/unity3d/ads/core/data/manager/StorageManager;)V", "get", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {

    @NotNull
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";

    @NotNull
    private final StorageManager storageManager;

    public AndroidLegacyConfigStoreDataSource(@NotNull StorageManager storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object get(@NotNull Continuation continuation) {
        Object objB;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        ByteString EMPTY = (ByteString) (Result.i(objB) ? null : objB);
        ByteStringStoreKt.Dsl.Companion companion3 = ByteStringStoreKt.Dsl.INSTANCE;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion3._create(builderNewBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        dsl_create.setData(EMPTY);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object set(@NotNull ByteString byteString, @NotNull Continuation continuation) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return Unit.f93236a;
    }
}
