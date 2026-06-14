package com.yandex.div.core.view2;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u001b\u0010\u0019\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/CompositeLogId;", "", "", "dataTag", "scopeLogId", "actionLogId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "formatCompositeLogId", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDataTag", "getScopeLogId", "getActionLogId", "compositeLogId$delegate", "Lkotlin/Lazy;", "getCompositeLogId", "compositeLogId", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CompositeLogId {

    @NotNull
    private final String actionLogId;

    /* JADX INFO: renamed from: compositeLogId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeLogId = i.a(new Function0<String>() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return this.this$0.formatCompositeLogId();
        }
    });

    @NotNull
    private final String dataTag;

    @NotNull
    private final String scopeLogId;

    public CompositeLogId(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.dataTag = str;
        this.scopeLogId = str2;
        this.actionLogId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = '#' + this.scopeLogId;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.actionLogId);
        return sb2.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId.getValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) other;
        return Intrinsics.areEqual(this.dataTag, compositeLogId.dataTag) && Intrinsics.areEqual(this.scopeLogId, compositeLogId.scopeLogId) && Intrinsics.areEqual(this.actionLogId, compositeLogId.actionLogId);
    }

    public int hashCode() {
        return (((this.dataTag.hashCode() * 31) + this.scopeLogId.hashCode()) * 31) + this.actionLogId.hashCode();
    }

    @NotNull
    public String toString() {
        return getCompositeLogId();
    }
}
