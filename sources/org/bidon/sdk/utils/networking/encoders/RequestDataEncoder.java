package org.bidon.sdk.utils.networking.encoders;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/utils/networking/encoders/RequestDataEncoder;", "", "getHeaders", "", "", "", "encode", "", "data", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RequestDataEncoder {
    @NotNull
    byte[] encode(@NotNull byte[] data);

    @NotNull
    Map<String, List<String>> getHeaders();
}
