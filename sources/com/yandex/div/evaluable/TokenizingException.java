package com.yandex.div.evaluable;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/evaluable/TokenizingException;", "Lcom/yandex/div/evaluable/EvaluableException;", PglCryptUtils.KEY_MESSAGE, "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TokenizingException extends EvaluableException {
    public /* synthetic */ TokenizingException(String str, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizingException(@NotNull String message, @Nullable Exception exc) {
        super(message, exc);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
