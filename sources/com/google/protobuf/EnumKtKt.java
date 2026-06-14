package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumKt$Dsl;", "", "block", "Lcom/google/protobuf/Enum;", "-initializeenum", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Enum;", "enum", MenuActionType.COPY, "(Lcom/google/protobuf/Enum;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Enum;", "Lcom/google/protobuf/EnumOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/EnumOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EnumKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m4508initializeenum(@NotNull Function1<? super EnumKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.INSTANCE;
        Enum.Builder builderNewBuilder = Enum.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Enum copy(@NotNull Enum r22, @NotNull Function1<? super EnumKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(r22, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.INSTANCE;
        Enum.Builder builder = r22.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull EnumOrBuilder enumOrBuilder) {
        Intrinsics.checkNotNullParameter(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
