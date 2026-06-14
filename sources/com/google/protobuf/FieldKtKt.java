package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/FieldKt$Dsl;", "", "block", "Lcom/google/protobuf/Field;", "-initializefield", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Field;", "field", MenuActionType.COPY, "(Lcom/google/protobuf/Field;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Field;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FieldKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializefield, reason: not valid java name */
    public static final Field m4510initializefield(@NotNull Function1<? super FieldKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.INSTANCE;
        Field.Builder builderNewBuilder = Field.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Field copy(@NotNull Field field, @NotNull Function1<? super FieldKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(field, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.INSTANCE;
        Field.Builder builder = field.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
