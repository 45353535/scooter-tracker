package com.mobilefuse.sdk.network.model;

import com.google.common.net.HttpHeaders;
import com.mobilefuse.sdk.MobileFuseSetting;
import com.mobilefuse.sdk.MobileFuseSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"headers", "", "", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "getHeaders", "(Lcom/mobilefuse/sdk/network/model/MfxBidRequest;)Ljava/util/Map;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidRequestGetHeadersKt {
    @NotNull
    public static final Map<String, String> getHeaders(@NotNull MfxBidRequest headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String override = MobileFuseSettings.getOverride(MobileFuseSetting.IP_ADDRESS);
        if (override != null && override.length() > 0) {
            Pair pair = TuplesKt.to(HttpHeaders.X_FORWARDED_FOR, override);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
