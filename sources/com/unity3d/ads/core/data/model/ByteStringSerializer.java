package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/ByteStringSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "()V", "defaultValue", "getDefaultValue", "()Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "output", "Ljava/io/OutputStream;", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ByteStringSerializer implements Serializer<ByteStringStoreOuterClass.ByteStringStore> {

    @NotNull
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) throws IOException {
        try {
            ByteStringStoreOuterClass.ByteStringStore from = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Cannot read proto.", e10);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object writeTo(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull OutputStream outputStream, @NotNull Continuation continuation) throws IOException {
        byteStringStore.writeTo(outputStream);
        return Unit.f93236a;
    }
}
