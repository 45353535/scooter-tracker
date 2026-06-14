package com.yandex.div.core.util.mask;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.util.mask.BaseInputMask;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u00020\b2\n\u0010(\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0015H\u0016J\u000e\u0010+\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003J\f\u0010,\u001a\u00020\u000b*\u00020\u000bH\u0002J\u0014\u0010-\u001a\u00020\u0015*\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/yandex/div/core/util/mask/CurrencyInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", CommonUrlParts.LOCALE, "Ljava/util/Locale;", "onError", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Ljava/util/Locale;Lkotlin/jvm/functions/Function1;)V", "currencyFormatter", "Ljava/text/NumberFormat;", "currencyKey", "", "decimalFormatSymbols", "Ljava/text/DecimalFormatSymbols;", "getDecimalFormatSymbols", "()Ljava/text/DecimalFormatSymbols;", "separators", "", "withNbsp", "", "getWithNbsp", "(Ljava/lang/String;)Ljava/lang/String;", "applyChangeFrom", "newValue", C4240b4.i.L, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "formatPattern", "pattern", "inDiff", "", "diff", "Lcom/yandex/div/core/util/mask/TextDiff;", FirebaseAnalytics.Param.INDEX, "invalidateMaskDataForFormatted", "forValue", "", "onException", "exception", "overrideRawValue", "newRawValue", "updateCurrencyParams", "clearFormatter", "toValidFormat", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CurrencyInputMask extends BaseInputMask {

    @NotNull
    private NumberFormat currencyFormatter;
    private final char currencyKey;

    @NotNull
    private final Function1<Exception, Unit> onError;

    @NotNull
    private final List<Character> separators;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(@NotNull Locale locale, @NotNull Function1<? super Exception, Unit> function1) {
        super(new BaseInputMask.MaskData("", CollectionsKt.emptyList(), false));
        this.onError = function1;
        this.currencyKey = (char) 164;
        this.separators = CollectionsKt.listOf((Object[]) new Character[]{'.', ','});
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) throws IOException {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb2 = new StringBuilder();
            int length = pattern.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != this.currencyKey) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            decimalFormat.applyPattern(StringsKt.v1(string).toString());
        }
        return numberFormat;
    }

    private final String formatPattern(String pattern) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < pattern.length(); i10++) {
            char cCharAt = pattern.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append('#');
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        NumberFormat numberFormat = this.currencyFormatter;
        Intrinsics.checkNotNull(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
    }

    private final String getWithNbsp(String str) {
        return StringsKt.V(str, ' ', (char) 160, false, 4, null);
    }

    private final boolean inDiff(TextDiff diff, int index) {
        return diff.getStart() <= index && index < diff.getStart() + diff.getAdded();
    }

    private final void invalidateMaskDataForFormatted(Number forValue) {
        String pattern = formatPattern(this.currencyFormatter.format(forValue));
        BaseInputMask.MaskKey maskKey = new BaseInputMask.MaskKey('#', "\\d", '0');
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(getDecimalFormatSymbols().getDecimalSeparator());
        sb2.append(']');
        updateMaskData(new BaseInputMask.MaskData(pattern, CollectionsKt.listOf((Object[]) new BaseInputMask.MaskKey[]{maskKey, new BaseInputMask.MaskKey(decimalSeparator, sb2.toString(), getDecimalFormatSymbols().getDecimalSeparator())}), getMaskData().getAlwaysVisible()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String toValidFormat(java.lang.String r18, com.yandex.div.core.util.mask.TextDiff r19) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.mask.CurrencyInputMask.toValidFormat(java.lang.String, com.yandex.div.core.util.mask.TextDiff):java.lang.String");
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) throws ParseException {
        String strValueOf;
        int iAbs;
        TextDiff textDiffBuild = TextDiff.INSTANCE.build(getValue(), getWithNbsp(newValue));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length = value.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (value.charAt(length) == decimalSeparator) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
            length = -1;
        } else {
            length = -1;
        }
        int length2 = newValue.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (newValue.charAt(length2) == decimalSeparator) {
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length2 = i11;
                }
            }
        } else {
            length2 = -1;
        }
        boolean z10 = length != length2 || (length == -1 && length2 == -1);
        String validFormat = toValidFormat(newValue, textDiffBuild);
        NumberFormat numberFormat = this.currencyFormatter;
        if (StringsKt.b1(validFormat, decimalSeparator, false, 2, null)) {
            strValueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
        } else {
            strValueOf = StringsKt.y0(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
        }
        Number number = numberFormat.parse(strValueOf);
        if (number == null) {
            number = 0;
        }
        cleanup(textDiffBuild);
        if (z10) {
            invalidateMaskDataForFormatted(number);
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() <= textDiffBuild.getStart() || getValue().charAt(textDiffBuild.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
            iAbs = Math.abs(getValue().length() - (newValue.length() - (position != null ? position.intValue() : getCursorPosition())));
        } else {
            iAbs = position != null ? position.intValue() : getCursorPosition();
        }
        setCursorPosition(g.j(iAbs, getValue().length()));
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        this.onError.invoke(exception);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) throws ParseException {
        Number number = this.currencyFormatter.parse(newRawValue);
        if (number == null) {
            number = 0;
        }
        invalidateMaskDataForFormatted(number);
        super.overrideRawValue(newRawValue);
    }

    public final void updateCurrencyParams(@NotNull Locale locale) {
        String strV = StringsKt.V(getRawValue(), getDecimalFormatSymbols().getDecimalSeparator(), '.', false, 4, null);
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
        BaseInputMask.applyChangeFrom$default(this, StringsKt.V(strV, '.', getDecimalFormatSymbols().getDecimalSeparator(), false, 4, null), null, 2, null);
    }
}
