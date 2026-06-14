package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumValueKt$Dsl;", "", "block", "Lcom/google/protobuf/EnumValue;", "-initializeenumValue", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/EnumValue;", "enumValue", MenuActionType.COPY, "(Lcom/google/protobuf/EnumValue;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/EnumValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EnumValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m4509initializeenumValue(@NotNull Function1<? super EnumValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.INSTANCE;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final EnumValue copy(@NotNull EnumValue enumValue, @NotNull Function1<? super EnumValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(enumValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.INSTANCE;
        EnumValue.Builder builder = enumValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
