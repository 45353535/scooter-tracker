package io.appmetrica.analytics.coreutils.internal;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class StringUtils {
    public static final String COMMA = ",";
    public static final String EMPTY = "";
    public static final String PROCESS_POSTFIX_DELIMITER = ":";
    public static final String UNDEFINED = "undefined";

    public static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static int compare(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    @NonNull
    public static String contentValuesToString(@Nullable ContentValues contentValues) {
        return contentValues == null ? "null" : contentValues.toString();
    }

    @NonNull
    public static String correctIllFormedString(@NonNull String str) {
        return new String(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String emptyIfNull(String str) {
        return ifIsNullToDef(str, "");
    }

    public static boolean equalsNullSafety(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static String formatSha1(@NonNull byte[] bArr) {
        return toHexString(bArr).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    public static byte[] getUTF8Bytes(@Nullable String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getUtf8BytesLength(@Nullable String str) {
        return getUTF8Bytes(str).length;
    }

    public static byte[] hexToBytes(@NonNull String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Input string must contain an even number of characters");
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static String ifIsEmptyToDef(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String ifIsNullToDef(String str, String str2) {
        return str == null ? str2 : str;
    }

    @NonNull
    public static byte[] stringToBytesForProtobuf(@Nullable String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    @NonNull
    public static String throwableToString(@NonNull Throwable th2) {
        return th2.getClass().getName() + ": " + th2.getMessage() + IOUtils.LINE_SEPARATOR_UNIX + ArraysKt.joinToString(th2.getStackTrace(), IOUtils.LINE_SEPARATOR_UNIX, "", "", -1, APSSharedUtil.TRUNCATE_SEPARATOR, (Function1) null);
    }

    public static String toHexString(@NonNull byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 240) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & Ascii.SI));
        }
        return sb2.toString();
    }

    public static final String wrapFeatures(String... strArr) {
        return TextUtils.join(COMMA, strArr);
    }

    public static byte[][] getUTF8Bytes(@Nullable List<String> list) {
        byte[][] bArr = new byte[0][];
        if (list != null) {
            bArr = new byte[list.size()][];
            for (int i10 = 0; i10 < list.size(); i10++) {
                bArr[i10] = getUTF8Bytes(list.get(i10));
            }
        }
        return bArr;
    }
}
