package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import k8.jd;
import k8.jp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b)\u0010\u0014R\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u0014¨\u0006,"}, d2 = {"Lcom/yandex/div/core/view2/spannable/TextData;", "", "", "text", "", "fontSize", "fontSizeValue", "Lk8/jp;", "fontSizeUnit", "fontFamily", "Lk8/jd;", "fontWeight", "fontWeightValue", "lineHeight", "textColor", "<init>", "(Ljava/lang/String;IILk8/jp;Ljava/lang/String;Lk8/jd;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getFontSize", "getFontSizeValue", "Lk8/jp;", "getFontSizeUnit", "()Lk8/jp;", "getFontFamily", "Lk8/jd;", "getFontWeight", "()Lk8/jd;", "Ljava/lang/Integer;", "getFontWeightValue", "()Ljava/lang/Integer;", "getLineHeight", "getTextColor", "textLength", "getTextLength", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TextData {

    @Nullable
    private final String fontFamily;
    private final int fontSize;

    @NotNull
    private final jp fontSizeUnit;
    private final int fontSizeValue;

    @Nullable
    private final jd fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Integer lineHeight;

    @NotNull
    private final String text;
    private final int textColor;
    private final int textLength;

    public TextData(@NotNull String str, @Px int i10, int i11, @NotNull jp jpVar, @Nullable String str2, @Nullable jd jdVar, @Nullable Integer num, @Px @Nullable Integer num2, @ColorInt int i12) {
        this.text = str;
        this.fontSize = i10;
        this.fontSizeValue = i11;
        this.fontSizeUnit = jpVar;
        this.fontFamily = str2;
        this.fontWeight = jdVar;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i12;
        this.textLength = str.length();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) other;
        return Intrinsics.areEqual(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && Intrinsics.areEqual(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, textData.fontWeightValue) && Intrinsics.areEqual(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @Nullable
    public final jd getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        int iHashCode = ((((((this.text.hashCode() * 31) + this.fontSize) * 31) + this.fontSizeValue) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jd jdVar = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (jdVar == null ? 0 : jdVar.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.textColor;
    }

    @NotNull
    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }
}
