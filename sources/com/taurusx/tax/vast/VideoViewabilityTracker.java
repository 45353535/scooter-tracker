package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import com.taurusx.tax.vast.VastTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/taurusx/tax/vast/VideoViewabilityTracker;", "Lcom/taurusx/tax/vast/VastTracker;", "viewablePlaytimeMS", "", VideoViewabilityTrackerXmlManager.PERCENT_VIEWABLE, "content", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "isRepeatable", "", "(IILjava/lang/String;Lcom/taurusx/tax/vast/VastTracker$MessageType;Z)V", "getPercentViewable", "()I", "getViewablePlaytimeMS", "Builder", y.f66058y, "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class VideoViewabilityTracker extends VastTracker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f67055n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(n.f66177u)
    @Expose
    public final int f67056a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName(n.f66167k)
    @Expose
    public final int f67057s;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/taurusx/tax/vast/VideoViewabilityTracker$Builder;", "", "content", "", "viewablePlaytimeMS", "", VideoViewabilityTrackerXmlManager.PERCENT_VIEWABLE, "(Ljava/lang/String;II)V", "isRepeatable", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "getPercentViewable", "()I", "getViewablePlaytimeMS", "build", "Lcom/taurusx/tax/vast/VideoViewabilityTracker;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "hashCode", "toString", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public VastTracker.MessageType f67058c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f67059o;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from toString */
        public final int viewablePlaytimeMS;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from toString */
        public final int percentViewable;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
        @NotNull
        public final String content;

        public Builder(@NotNull String content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.viewablePlaytimeMS = i10;
            this.percentViewable = i11;
            this.f67058c = VastTracker.MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = builder.content;
            }
            if ((i12 & 2) != 0) {
                i10 = builder.viewablePlaytimeMS;
            }
            if ((i12 & 4) != 0) {
                i11 = builder.percentViewable;
            }
            return builder.copy(str, i10, i11);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        private final String getContent() {
            return this.content;
        }

        @NotNull
        public final VideoViewabilityTracker build() {
            return new VideoViewabilityTracker(this.viewablePlaytimeMS, this.percentViewable, this.content, this.f67058c, this.f67059o);
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getViewablePlaytimeMS() {
            return this.viewablePlaytimeMS;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPercentViewable() {
            return this.percentViewable;
        }

        @NotNull
        public final Builder copy(@NotNull String content, int viewablePlaytimeMS, int percentViewable) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content, viewablePlaytimeMS, percentViewable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.content, builder.content) && this.viewablePlaytimeMS == builder.viewablePlaytimeMS && this.percentViewable == builder.percentViewable;
        }

        public final int getPercentViewable() {
            return this.percentViewable;
        }

        public final int getViewablePlaytimeMS() {
            return this.viewablePlaytimeMS;
        }

        public int hashCode() {
            return (((this.content.hashCode() * 31) + this.viewablePlaytimeMS) * 31) + this.percentViewable;
        }

        @NotNull
        public final Builder isRepeatable(boolean isRepeatable) {
            this.f67059o = isRepeatable;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull VastTracker.MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f67058c = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.content + ", viewablePlaytimeMS=" + this.viewablePlaytimeMS + ", percentViewable=" + this.percentViewable + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewabilityTracker(int i10, int i11, @NotNull String content, @NotNull VastTracker.MessageType messageType, boolean z10) {
        super(content, messageType, z10);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.f67057s = i10;
        this.f67056a = i11;
    }

    /* JADX INFO: renamed from: getPercentViewable, reason: from getter */
    public final int getF67056a() {
        return this.f67056a;
    }

    /* JADX INFO: renamed from: getViewablePlaytimeMS, reason: from getter */
    public final int getF67057s() {
        return this.f67057s;
    }
}
