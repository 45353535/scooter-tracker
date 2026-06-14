package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.DataMigration;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0019\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/FetchGLInfoDataMigration;", "Landroidx/datastore/core/DataMigration;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "getOpenGLRendererInfo", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "(Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;)V", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gatherOpenGLRendererInfo", "Lcom/google/protobuf/ByteString;", "migrate", "currentData", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FetchGLInfoDataMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {

    @NotNull
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(@NotNull GetOpenGLRendererInfo getOpenGLRendererInfo) {
        Intrinsics.checkNotNullParameter(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation continuation) {
        return Unit.f93236a;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull Continuation continuation) {
        ByteString byteStringGatherOpenGLRendererInfo;
        try {
            byteStringGatherOpenGLRendererInfo = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteStringGatherOpenGLRendererInfo = ByteString.EMPTY;
            Intrinsics.checkNotNullExpressionValue(byteStringGatherOpenGLRendererInfo, "{\n            ByteString.EMPTY\n        }");
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteStringGatherOpenGLRendererInfo).build();
        Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder()\n           …rer)\n            .build()");
        return byteStringStoreBuild;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object shouldMigrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull Continuation continuation) {
        return kotlin.coroutines.jvm.internal.b.a(byteStringStore.getData().isEmpty());
    }
}
