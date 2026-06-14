package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.taurusx.tax.f.y;
import k8.ei;
import k8.jd;
import k8.jp;
import k8.vs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b-\b\u0080\b\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\\BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010/R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010/R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b9\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bF\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\bM\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\bT\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010=\u001a\u0004\bX\u0010?R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010=\u001a\u0004\bY\u0010?R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\bZ\u0010?R\u0019\u0010 \u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\b[\u0010S¨\u0006]"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpanData;", "", "", "start", "end", "Lk8/vs;", "alignmentVertical", "baselineOffset", "", "fontFamily", "fontFeatureSettings", "fontSize", "Lk8/jp;", "fontSizeUnit", "Lk8/jd;", "fontWeight", "fontWeightValue", "Lorg/json/JSONObject;", "fontVariationSettings", "", "letterSpacing", "lineHeight", "Lcom/yandex/div/core/view2/spannable/MaskData;", "mask", "Lk8/ei;", "strike", "textColor", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "textShadow", "topOffset", "topOffsetStart", "topOffsetEnd", "underline", "<init>", "(IILk8/vs;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lk8/jp;Lk8/jd;Ljava/lang/Integer;Lorg/json/JSONObject;Ljava/lang/Double;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/MaskData;Lk8/ei;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/ShadowData;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lk8/ei;)V", "span", "mergeWith", "(Lcom/yandex/div/core/view2/spannable/SpanData;II)Lcom/yandex/div/core/view2/spannable/SpanData;", "", "isEmpty", "()Z", "other", "compareTo", "(Lcom/yandex/div/core/view2/spannable/SpanData;)I", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStart", "getEnd", "Lk8/vs;", "getAlignmentVertical", "()Lk8/vs;", "getBaselineOffset", "Ljava/lang/String;", "getFontFamily", "getFontFeatureSettings", "Ljava/lang/Integer;", "getFontSize", "()Ljava/lang/Integer;", "Lk8/jp;", "getFontSizeUnit", "()Lk8/jp;", "Lk8/jd;", "getFontWeight", "()Lk8/jd;", "getFontWeightValue", "Lorg/json/JSONObject;", "getFontVariationSettings", "()Lorg/json/JSONObject;", "Ljava/lang/Double;", "getLetterSpacing", "()Ljava/lang/Double;", "getLineHeight", "Lcom/yandex/div/core/view2/spannable/MaskData;", "getMask", "()Lcom/yandex/div/core/view2/spannable/MaskData;", "Lk8/ei;", "getStrike", "()Lk8/ei;", "getTextColor", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "getTextShadow", "()Lcom/yandex/div/core/view2/spannable/ShadowData;", "getTopOffset", "getTopOffsetStart", "getTopOffsetEnd", "getUnderline", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SpanData implements Comparable<SpanData> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final jp DEFAULT_FONT_SIZE_UNIT = jp.SP;

    @Nullable
    private final vs alignmentVertical;
    private final int baselineOffset;
    private final int end;

    @Nullable
    private final String fontFamily;

    @Nullable
    private final String fontFeatureSettings;

    @Nullable
    private final Integer fontSize;

    @NotNull
    private final jp fontSizeUnit;

    @Nullable
    private final JSONObject fontVariationSettings;

    @Nullable
    private final jd fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Double letterSpacing;

    @Nullable
    private final Integer lineHeight;

    @Nullable
    private final MaskData mask;
    private final int start;

    @Nullable
    private final ei strike;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final ShadowData textShadow;

    @Nullable
    private final Integer topOffset;

    @Nullable
    private final Integer topOffsetEnd;

    @Nullable
    private final Integer topOffsetStart;

    @Nullable
    private final ei underline;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpanData$Companion;", "", "<init>", "()V", "", "start", "end", "Lcom/yandex/div/core/view2/spannable/SpanData;", "empty$div_release", "(II)Lcom/yandex/div/core/view2/spannable/SpanData;", "empty", "lineHeight", "lineHeight$div_release", "(III)Lcom/yandex/div/core/view2/spannable/SpanData;", "DEFAULT_BASELINE_OFFSET", "I", "Lk8/jp;", "DEFAULT_FONT_SIZE_UNIT", "Lk8/jp;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpanData empty$div_release(int start, int end) {
            return new SpanData(start, end, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        @NotNull
        public final SpanData lineHeight$div_release(int start, int end, int lineHeight) {
            return new SpanData(start, end, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, Integer.valueOf(lineHeight), null, null, null, null, null, null, null, null);
        }

        private Companion() {
        }
    }

    public SpanData(int i10, int i11, @Nullable vs vsVar, @Px int i12, @Nullable String str, @Nullable String str2, @Px @Nullable Integer num, @NotNull jp jpVar, @Nullable jd jdVar, @Nullable Integer num2, @Nullable JSONObject jSONObject, @Nullable Double d10, @Px @Nullable Integer num3, @Nullable MaskData maskData, @Nullable ei eiVar, @ColorInt @Nullable Integer num4, @Nullable ShadowData shadowData, @Px @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable ei eiVar2) {
        this.start = i10;
        this.end = i11;
        this.alignmentVertical = vsVar;
        this.baselineOffset = i12;
        this.fontFamily = str;
        this.fontFeatureSettings = str2;
        this.fontSize = num;
        this.fontSizeUnit = jpVar;
        this.fontWeight = jdVar;
        this.fontWeightValue = num2;
        this.fontVariationSettings = jSONObject;
        this.letterSpacing = d10;
        this.lineHeight = num3;
        this.mask = maskData;
        this.strike = eiVar;
        this.textColor = num4;
        this.textShadow = shadowData;
        this.topOffset = num5;
        this.topOffsetStart = num6;
        this.topOffsetEnd = num7;
        this.underline = eiVar2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) other;
        return this.start == spanData.start && this.end == spanData.end && this.alignmentVertical == spanData.alignmentVertical && this.baselineOffset == spanData.baselineOffset && Intrinsics.areEqual(this.fontFamily, spanData.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, spanData.fontFeatureSettings) && Intrinsics.areEqual(this.fontSize, spanData.fontSize) && this.fontSizeUnit == spanData.fontSizeUnit && this.fontWeight == spanData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, spanData.fontWeightValue) && Intrinsics.areEqual(this.fontVariationSettings, spanData.fontVariationSettings) && Intrinsics.areEqual((Object) this.letterSpacing, (Object) spanData.letterSpacing) && Intrinsics.areEqual(this.lineHeight, spanData.lineHeight) && Intrinsics.areEqual(this.mask, spanData.mask) && this.strike == spanData.strike && Intrinsics.areEqual(this.textColor, spanData.textColor) && Intrinsics.areEqual(this.textShadow, spanData.textShadow) && Intrinsics.areEqual(this.topOffset, spanData.topOffset) && Intrinsics.areEqual(this.topOffsetStart, spanData.topOffsetStart) && Intrinsics.areEqual(this.topOffsetEnd, spanData.topOffsetEnd) && this.underline == spanData.underline;
    }

    @Nullable
    public final vs getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    public final int getEnd() {
        return this.end;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Nullable
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
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
    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final MaskData getMask() {
        return this.mask;
    }

    public final int getStart() {
        return this.start;
    }

    @Nullable
    public final ei getStrike() {
        return this.strike;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    @Nullable
    public final Integer getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    @Nullable
    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    @Nullable
    public final ei getUnderline() {
        return this.underline;
    }

    public int hashCode() {
        int i10 = ((this.start * 31) + this.end) * 31;
        vs vsVar = this.alignmentVertical;
        int iHashCode = (((i10 + (vsVar == null ? 0 : vsVar.hashCode())) * 31) + this.baselineOffset) * 31;
        String str = this.fontFamily;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fontFeatureSettings;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fontSize;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.fontSizeUnit.hashCode()) * 31;
        jd jdVar = this.fontWeight;
        int iHashCode5 = (iHashCode4 + (jdVar == null ? 0 : jdVar.hashCode())) * 31;
        Integer num2 = this.fontWeightValue;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.fontVariationSettings;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d10 = this.letterSpacing;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num3 = this.lineHeight;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MaskData maskData = this.mask;
        int iHashCode10 = (iHashCode9 + (maskData == null ? 0 : maskData.hashCode())) * 31;
        ei eiVar = this.strike;
        int iHashCode11 = (iHashCode10 + (eiVar == null ? 0 : eiVar.hashCode())) * 31;
        Integer num4 = this.textColor;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShadowData shadowData = this.textShadow;
        int iHashCode13 = (iHashCode12 + (shadowData == null ? 0 : shadowData.hashCode())) * 31;
        Integer num5 = this.topOffset;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.topOffsetStart;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.topOffsetEnd;
        int iHashCode16 = (iHashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        ei eiVar2 = this.underline;
        return iHashCode16 + (eiVar2 != null ? eiVar2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.alignmentVertical == null && this.baselineOffset == 0 && this.fontFamily == null && this.fontFeatureSettings == null && this.fontSize == null && this.fontSizeUnit == DEFAULT_FONT_SIZE_UNIT && this.fontWeight == null && this.fontWeightValue == null && this.letterSpacing == null && this.lineHeight == null && this.mask == null && this.strike == null && this.textColor == null && this.textShadow == null && this.topOffset == null && this.topOffsetStart == null && this.topOffsetEnd == null && this.underline == null;
    }

    @NotNull
    public final SpanData mergeWith(@NotNull SpanData span, int start, int end) {
        vs vsVar = span.alignmentVertical;
        if (vsVar == null) {
            vsVar = this.alignmentVertical;
        }
        vs vsVar2 = vsVar;
        int i10 = span.baselineOffset;
        if (i10 == 0) {
            i10 = this.baselineOffset;
        }
        int i11 = i10;
        String str = span.fontFamily;
        if (str == null) {
            str = this.fontFamily;
        }
        String str2 = str;
        String str3 = span.fontFeatureSettings;
        if (str3 == null) {
            str3 = this.fontFeatureSettings;
        }
        String str4 = str3;
        Integer num = span.fontSize;
        if (num == null) {
            num = this.fontSize;
        }
        Integer num2 = num;
        jp jpVar = span.fontSizeUnit;
        if (jpVar == DEFAULT_FONT_SIZE_UNIT) {
            jpVar = this.fontSizeUnit;
        }
        jp jpVar2 = jpVar;
        jd jdVar = span.fontWeight;
        if (jdVar == null) {
            jdVar = this.fontWeight;
        }
        jd jdVar2 = jdVar;
        Integer num3 = span.fontWeightValue;
        if (num3 == null) {
            num3 = this.fontWeightValue;
        }
        Integer num4 = num3;
        JSONObject jSONObject = span.fontVariationSettings;
        if (jSONObject == null) {
            jSONObject = this.fontVariationSettings;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d10 = span.letterSpacing;
        if (d10 == null) {
            d10 = this.letterSpacing;
        }
        Double d11 = d10;
        Integer num5 = span.lineHeight;
        if (num5 == null) {
            num5 = this.lineHeight;
        }
        Integer num6 = num5;
        MaskData maskData = span.mask;
        if (maskData == null) {
            maskData = this.mask;
        }
        MaskData maskData2 = maskData;
        ei eiVar = span.strike;
        if (eiVar == null) {
            eiVar = this.strike;
        }
        ei eiVar2 = eiVar;
        Integer num7 = span.textColor;
        if (num7 == null) {
            num7 = this.textColor;
        }
        Integer num8 = num7;
        ShadowData shadowData = span.textShadow;
        if (shadowData == null) {
            shadowData = this.textShadow;
        }
        ShadowData shadowData2 = shadowData;
        Integer num9 = span.topOffset;
        Integer num10 = num9 == null ? this.topOffset : num9;
        Integer num11 = num9 != null ? span.topOffsetStart : this.topOffsetStart;
        Integer num12 = num9 != null ? span.topOffsetEnd : this.topOffsetEnd;
        ei eiVar3 = span.underline;
        if (eiVar3 == null) {
            eiVar3 = this.underline;
        }
        return new SpanData(start, end, vsVar2, i11, str2, str4, num2, jpVar2, jdVar2, num4, jSONObject2, d11, num6, maskData2, eiVar2, num8, shadowData2, num10, num11, num12, eiVar3);
    }

    @NotNull
    public String toString() {
        return "SpanData(start=" + this.start + ", end=" + this.end + ", alignmentVertical=" + this.alignmentVertical + ", baselineOffset=" + this.baselineOffset + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", fontVariationSettings=" + this.fontVariationSettings + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", mask=" + this.mask + ", strike=" + this.strike + ", textColor=" + this.textColor + ", textShadow=" + this.textShadow + ", topOffset=" + this.topOffset + ", topOffsetStart=" + this.topOffsetStart + ", topOffsetEnd=" + this.topOffsetEnd + ", underline=" + this.underline + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SpanData other) {
        return this.start - other.start;
    }
}
