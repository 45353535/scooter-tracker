package org.bidon.sdk.utils.networking.encoders;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/utils/networking/encoders/RequestDataDecoder;", "", "decode", "", "contentEncoding", "", "data", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RequestDataDecoder {
    @NotNull
    byte[] decode(@Nullable String contentEncoding, @NotNull byte[] data);
}
