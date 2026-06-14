package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/services/store/core/StoreWebViewError;", "Lcom/unity3d/scar/adapter/common/m;", "", "errorCategory", "", "description", "", "", "errorArguments", "<init>", "(Ljava/lang/Enum;Ljava/lang/String;[Ljava/lang/Object;)V", "getDomain", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreWebViewError extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(@Nullable Enum<?> r22, @Nullable String str, @NotNull Object... errorArguments) {
        super(r22, str, Arrays.copyOf(errorArguments, errorArguments.length));
        Intrinsics.checkNotNullParameter(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.m
    @NotNull
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
