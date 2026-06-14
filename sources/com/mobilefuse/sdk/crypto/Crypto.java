package com.mobilefuse.sdk.crypto;

import com.mobilefuse.sdk.StabilityHelper;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0007"}, d2 = {"hashString", "", "input", "algorithm", "md5", "sha1", "sha256", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class Crypto {
    private static final String hashString(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "MessageDigest\n          …gest(input.toByteArray())");
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
                sb2.append(str3);
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.append(\"%02x\".format(it))");
            }
            return sb2.toString();
        } catch (Throwable th2) {
            StabilityHelper.logException("Hash " + str2, th2);
            return null;
        }
    }

    @Nullable
    public static final String md5(@NotNull String md5) {
        Intrinsics.checkNotNullParameter(md5, "$this$md5");
        return hashString(md5, "MD5");
    }

    @Nullable
    public static final String sha1(@NotNull String sha1) {
        Intrinsics.checkNotNullParameter(sha1, "$this$sha1");
        return hashString(sha1, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    @Nullable
    public static final String sha256(@NotNull String sha256) {
        Intrinsics.checkNotNullParameter(sha256, "$this$sha256");
        return hashString(sha256, "SHA-256");
    }
}
