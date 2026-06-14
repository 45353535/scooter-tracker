package org.bidon.sdk.utils.networking.encoders.ext;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.networking.encoders.RequestDataDecoder;
import org.bidon.sdk.utils.networking.encoders.RequestDataEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0000¨\u0006\n"}, d2 = {"decodeWith", "", "contentEncoding", "", "decoders", "", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataDecoder;", "encodeWith", "encoders", "Lorg/bidon/sdk/utils/networking/encoders/RequestDataEncoder;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RequestDataDecoderExtKt {
    @NotNull
    public static final byte[] decodeWith(@NotNull byte[] bArr, @Nullable String str, @NotNull List<? extends RequestDataDecoder> decoders) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(decoders, "decoders");
        Iterator<T> it = decoders.iterator();
        while (it.hasNext()) {
            bArr = ((RequestDataDecoder) it.next()).decode(str, bArr);
        }
        return bArr;
    }

    @NotNull
    public static final byte[] encodeWith(@NotNull byte[] bArr, @NotNull List<? extends RequestDataEncoder> encoders) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(encoders, "encoders");
        Iterator<T> it = encoders.iterator();
        while (it.hasNext()) {
            bArr = ((RequestDataEncoder) it.next()).encode(bArr);
        }
        return bArr;
    }
}
