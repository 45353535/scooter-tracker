package com.mobilefuse.sdk.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/exception/BaseError;", "", PglCryptUtils.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface BaseError {
    @Nullable
    String getMessage();
}
