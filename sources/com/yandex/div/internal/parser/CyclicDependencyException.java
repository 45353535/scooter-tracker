package com.yandex.div.internal.parser;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/parser/CyclicDependencyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CyclicDependencyException extends Exception {
    public CyclicDependencyException(@NotNull String str) {
        super(str);
    }
}
