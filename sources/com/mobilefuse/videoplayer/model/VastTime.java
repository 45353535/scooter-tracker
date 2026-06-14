package com.mobilefuse.videoplayer.model;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormattingKt;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastTime;", "", "formattedValue", "", "(Ljava/lang/String;)V", "getFormattedValue", "()Ljava/lang/String;", "isPercentageMode", "", "()Z", "percentageValue", "", "getPercentageValue", "()F", "valueInFloatSeconds", "getValueInFloatSeconds", "valueInMillis", "", "getValueInMillis", "()J", "valueInSeconds", "", "getValueInSeconds", "()I", "getValueInMillisForDuration", "duration", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VastTime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String formattedValue;
    private final boolean isPercentageMode;
    private final float percentageValue;
    private final float valueInFloatSeconds;
    private final long valueInMillis;
    private final int valueInSeconds;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastTime$Companion;", "", "()V", "create", "Lcom/mobilefuse/videoplayer/model/VastTime;", "formattedValue", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final VastTime create(@Nullable String formattedValue) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (formattedValue == null || formattedValue.length() == 0) {
                return null;
            }
            try {
                return new VastTime(formattedValue, defaultConstructorMarker);
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private VastTime(String str) {
        this.formattedValue = str;
        if (StringsKt.M(str, "%", false, 2, null)) {
            this.isPercentageMode = true;
            this.valueInFloatSeconds = 0.0f;
            this.valueInSeconds = 0;
            this.valueInMillis = 0L;
            this.percentageValue = Float.parseFloat(StringsKt.W(str, "%", "", false, 4, null)) / 100.0f;
            return;
        }
        this.isPercentageMode = false;
        this.percentageValue = 0.0f;
        Long l10 = StringEncodingAndFormattingKt.formattedTimeToMillis(str);
        if (l10 == null) {
            throw new NumberFormatException("Can't format " + str + " to milliseconds");
        }
        long jLongValue = l10.longValue();
        this.valueInMillis = jLongValue;
        float f10 = jLongValue / 1000.0f;
        this.valueInFloatSeconds = f10;
        this.valueInSeconds = a.d(f10);
    }

    @NotNull
    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final float getPercentageValue() {
        return this.percentageValue;
    }

    public final float getValueInFloatSeconds() {
        return this.valueInFloatSeconds;
    }

    public final long getValueInMillis() {
        return this.valueInMillis;
    }

    public final long getValueInMillisForDuration(long duration) {
        return !this.isPercentageMode ? this.valueInMillis : (long) (this.percentageValue * duration);
    }

    public final int getValueInSeconds() {
        return this.valueInSeconds;
    }

    /* JADX INFO: renamed from: isPercentageMode, reason: from getter */
    public final boolean getIsPercentageMode() {
        return this.isPercentageMode;
    }

    public /* synthetic */ VastTime(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
