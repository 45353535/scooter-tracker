package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import com.taurusx.tax.vast.VastTracker;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0012\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/taurusx/tax/vast/VastFractionalProgressTracker;", "Lcom/taurusx/tax/vast/VastTracker;", "", "trackingFraction", "", "content", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "isRepeatable", "", "(FLjava/lang/String;Lcom/taurusx/tax/vast/VastTracker$MessageType;Z)V", "getTrackingFraction", "()F", "compareTo", "", "other", "toString", "Builder", y.f66058y, "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VastFractionalProgressTracker extends VastTracker implements Comparable<VastFractionalProgressTracker> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f66983a = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName(n.f66161e)
    @Expose
    public final float f66985s;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f66984n = Pattern.compile("((\\d{1,2})|(100))%");

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taurusx/tax/vast/VastFractionalProgressTracker$Builder;", "", "content", "", "trackingFraction", "", "(Ljava/lang/String;F)V", "isRepeatable", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "build", "Lcom/taurusx/tax/vast/VastFractionalProgressTracker;", "component1", "component2", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f66986c;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from toString */
        public final float trackingFraction;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        public VastTracker.MessageType f66988y;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
        @NotNull
        public final String content;

        public Builder(@NotNull String content, float f10) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.trackingFraction = f10;
            this.f66988y = VastTracker.MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = builder.content;
            }
            if ((i10 & 2) != 0) {
                f10 = builder.trackingFraction;
            }
            return builder.copy(str, f10);
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        private final float getTrackingFraction() {
            return this.trackingFraction;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        private final String getContent() {
            return this.content;
        }

        @NotNull
        public final VastFractionalProgressTracker build() {
            return new VastFractionalProgressTracker(this.trackingFraction, this.content, this.f66988y, this.f66986c);
        }

        @NotNull
        public final Builder copy(@NotNull String content, float trackingFraction) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content, trackingFraction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.content, builder.content) && Intrinsics.areEqual((Object) Float.valueOf(this.trackingFraction), (Object) Float.valueOf(builder.trackingFraction));
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Float.floatToIntBits(this.trackingFraction);
        }

        @NotNull
        public final Builder isRepeatable(boolean isRepeatable) {
            this.f66986c = isRepeatable;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull VastTracker.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f66988y = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.content + ", trackingFraction=" + this.trackingFraction + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taurusx/tax/vast/VastFractionalProgressTracker$Companion;", "", "()V", "percentagePattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "serialVersionUID", "", "isPercentageTracker", "", "progressValue", "", "parsePercentageOffset", "", "videoDuration", "(Ljava/lang/String;I)Ljava/lang/Integer;", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPercentageTracker(@Nullable String progressValue) {
            return (progressValue == null || progressValue.length() == 0 || !VastFractionalProgressTracker.f66984n.matcher(progressValue).matches()) ? false : true;
        }

        @Nullable
        public final Integer parsePercentageOffset(@Nullable String progressValue, int videoDuration) {
            String strW;
            if (progressValue == null || (strW = StringsKt.W(progressValue, "%", "", false, 4, null)) == null) {
                return null;
            }
            return Integer.valueOf((int) Math.rint((videoDuration * Float.parseFloat(strW)) / 100.0f));
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VastFractionalProgressTracker(float f10, @NotNull String content, @NotNull VastTracker.MessageType messageType, boolean z10) {
        super(content, messageType, z10);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f66985s = f10;
    }

    /* JADX INFO: renamed from: getTrackingFraction, reason: from getter */
    public final float getF66985s() {
        return this.f66985s;
    }

    @Override // com.taurusx.tax.vast.VastTracker
    @NotNull
    public String toString() {
        return this.f66985s + ": " + getContent();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull VastFractionalProgressTracker other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Float.compare(this.f66985s, other.f66985s);
    }
}
