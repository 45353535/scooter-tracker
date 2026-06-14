package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = "";
        for (byte b10 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    @Nullable
    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultD = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").d(str);
        if (matchResultD != null) {
            MatchGroup matchGroup = matchResultD.b().get(1);
            Integer intOrNull = (matchGroup == null || (value6 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value6);
            MatchGroup matchGroup2 = matchResultD.b().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (value5 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value5);
            MatchGroup matchGroup3 = matchResultD.b().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (value4 = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value4);
            MatchGroup matchGroup4 = matchResultD.b().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (value3 = matchGroup4.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup5 = matchResultD.b().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (value2 = matchGroup5.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup6 = matchResultD.b().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (value = matchGroup6.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (getMonetizationNetwork(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.checkNotNull(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                Intrinsics.checkNotNull(intOrNull3);
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                Intrinsics.checkNotNull(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.checkNotNull(intOrNull6);
                return TuplesKt.to(numValueOf, Integer.valueOf(iIntValue4 + intOrNull6.intValue()));
            }
        }
        return null;
    }

    @Nullable
    public static final Pair<Integer, Integer> getMonetizationNetwork(@NotNull String str) {
        String value;
        String value2;
        String value3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultD = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").d(str);
        if (matchResultD != null) {
            MatchGroup matchGroup = matchResultD.b().get(1);
            Integer intOrNull = (matchGroup == null || (value3 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup2 = matchResultD.b().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (value2 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup3 = matchResultD.b().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (value = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (intOrNull != null) {
                return TuplesKt.to(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return TuplesKt.to(Integer.valueOf((intOrNull2.intValue() * 1000000) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * 1000000) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    @NotNull
    public static final String getRevenue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    private static boolean getMonetizationNetwork(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !ArraysKt.contains(objArr, (Object) null);
    }
}
