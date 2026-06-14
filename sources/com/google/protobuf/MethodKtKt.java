package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MethodKt$Dsl;", "", "block", "Lcom/google/protobuf/Method;", "-initializemethod", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Method;", "method", MenuActionType.COPY, "(Lcom/google/protobuf/Method;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Method;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MethodKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemethod, reason: not valid java name */
    public static final Method m4517initializemethod(@NotNull Function1<? super MethodKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.INSTANCE;
        Method.Builder builderNewBuilder = Method.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Method copy(@NotNull Method method, @NotNull Function1<? super MethodKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.INSTANCE;
        Method.Builder builder = method.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
