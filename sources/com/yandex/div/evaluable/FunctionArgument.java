package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/evaluable/FunctionArgument;", "", "Lcom/yandex/div/evaluable/EvaluableType;", "type", "", "isVariadic", "<init>", "(Lcom/yandex/div/evaluable/EvaluableType;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/EvaluableType;", "getType", "()Lcom/yandex/div/evaluable/EvaluableType;", "Z", "()Z", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FunctionArgument {
    private final boolean isVariadic;

    @NotNull
    private final EvaluableType type;

    public FunctionArgument(@NotNull EvaluableType type, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.isVariadic = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) other;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    @NotNull
    public final EvaluableType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z10 = this.isVariadic;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    /* JADX INFO: renamed from: isVariadic, reason: from getter */
    public final boolean getIsVariadic() {
        return this.isVariadic;
    }

    @NotNull
    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluableType, (i10 & 2) != 0 ? false : z10);
    }
}
