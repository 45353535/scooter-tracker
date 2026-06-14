package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MixinKt$Dsl;", "", "block", "Lcom/google/protobuf/Mixin;", "-initializemixin", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Mixin;", "mixin", MenuActionType.COPY, "(Lcom/google/protobuf/Mixin;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Mixin;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MixinKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m4518initializemixin(@NotNull Function1<? super MixinKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.INSTANCE;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Mixin copy(@NotNull Mixin mixin, @NotNull Function1<? super MixinKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(mixin, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.INSTANCE;
        Mixin.Builder builder = mixin.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
