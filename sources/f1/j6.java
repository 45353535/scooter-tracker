package f1;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6 f70151a = new j6();

    public static final String a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        j6 j6Var = f70151a;
        return j6Var.b(j6Var.c(bytes));
    }

    public final String b(byte[] bArr) {
        String str = String.format("%0" + (bArr.length << 1) + "x", Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final byte[] c(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }
}
