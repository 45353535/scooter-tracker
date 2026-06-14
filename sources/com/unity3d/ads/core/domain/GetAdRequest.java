package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH¦Bø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdRequest;", "", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetAdRequest {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 4) != 0) {
                bannerSize = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, continuation);
        }
    }

    @Nullable
    Object invoke(@NotNull String str, @NotNull ByteString byteString, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull Continuation continuation);
}
