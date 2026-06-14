package com.appodeal.ads.modules.common.internal.domain;

import com.appodeal.ads.ext.LogExtKt;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/domain/ParsePriceUseCase;", "", "<init>", "()V", "", "price", "currency", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParsePriceUseCase {
    public final Double invoke(String price, String currency) {
        String str;
        if (price == null) {
            return null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (currency != null) {
            try {
            } catch (Throwable th3) {
                th = th3;
                str = price;
                LogExtKt.logInternal("ParsePriceUseCase", "Error while parsing price", th);
            }
            if (currency.length() != 0) {
                DecimalFormat decimalFormat = new DecimalFormat();
                Currency currency2 = Currency.getInstance(currency);
                decimalFormat.setCurrency(currency2);
                str = price;
                int iU0 = StringsKt.u0(str, '.', 0, false, 6, null);
                int iU02 = StringsKt.u0(str, ',', 0, false, 6, null);
                boolean z10 = iU0 > -1;
                boolean z11 = iU02 > -1;
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                if (z10 && !z11) {
                    decimalFormatSymbols.setDecimalSeparator('.');
                    decimalFormatSymbols.setGroupingSeparator(',');
                } else if (!z10 && z11) {
                    decimalFormatSymbols.setDecimalSeparator(',');
                    decimalFormatSymbols.setGroupingSeparator('.');
                } else if (z10 && z11) {
                    if (iU0 > iU02) {
                        decimalFormatSymbols.setDecimalSeparator('.');
                        decimalFormatSymbols.setGroupingSeparator(',');
                    } else {
                        decimalFormatSymbols.setDecimalSeparator(',');
                        decimalFormatSymbols.setGroupingSeparator('.');
                    }
                }
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                String symbol = currency2.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                Number number = decimalFormat.parse(StringsKt.W(str, symbol, "", false, 4, null));
                if (number != null) {
                    return Double.valueOf(number.doubleValue());
                }
                return StringsKt.t(str);
            }
        }
        return StringsKt.t(price);
    }
}
