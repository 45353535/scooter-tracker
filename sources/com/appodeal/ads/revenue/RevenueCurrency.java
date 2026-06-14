package com.appodeal.ads.revenue;

import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/revenue/RevenueCurrency;", "", "stringValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "USD", "asCurrency", "Ljava/util/Currency;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RevenueCurrency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevenueCurrency[] $VALUES;
    public static final RevenueCurrency USD = new RevenueCurrency("USD", 0, "USD");
    private final String stringValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RevenueCurrency.values().length];
            try {
                iArr[RevenueCurrency.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ RevenueCurrency[] $values() {
        return new RevenueCurrency[]{USD};
    }

    static {
        RevenueCurrency[] revenueCurrencyArr$values = $values();
        $VALUES = revenueCurrencyArr$values;
        $ENTRIES = a.a(revenueCurrencyArr$values);
    }

    private RevenueCurrency(String str, int i10, String str2) {
        this.stringValue = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RevenueCurrency valueOf(String str) {
        return (RevenueCurrency) Enum.valueOf(RevenueCurrency.class, str);
    }

    public static RevenueCurrency[] values() {
        return (RevenueCurrency[]) $VALUES.clone();
    }

    public final Currency asCurrency() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] != 1) {
            throw new m();
        }
        Currency currency = Currency.getInstance(Locale.US);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return currency;
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
