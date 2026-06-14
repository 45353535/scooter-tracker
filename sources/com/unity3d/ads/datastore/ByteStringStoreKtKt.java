package com.unity3d.ads.datastore;

import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "", "block", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "-initializebyteStringStore", "(Lkotlin/jvm/functions/Function1;)Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "byteStringStore", MenuActionType.COPY, "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lkotlin/jvm/functions/Function1;)Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ByteStringStoreKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializebyteStringStore, reason: not valid java name */
    public static final ByteStringStoreOuterClass.ByteStringStore m7463initializebyteStringStore(@NotNull Function1<? super ByteStringStoreKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.INSTANCE;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final ByteStringStoreOuterClass.ByteStringStore copy(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull Function1<? super ByteStringStoreKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(byteStringStore, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.INSTANCE;
        ByteStringStoreOuterClass.ByteStringStore.Builder builder = byteStringStore.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
