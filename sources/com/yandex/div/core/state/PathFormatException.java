package com.yandex.div.core.state;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/state/PathFormatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathFormatException extends Exception {
    public PathFormatException(@NotNull String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ PathFormatException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
