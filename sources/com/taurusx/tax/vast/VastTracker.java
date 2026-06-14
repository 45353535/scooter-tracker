package com.taurusx.tax.vast;

import androidx.compose.foundation.c;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0003\u0018\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/taurusx/tax/vast/VastTracker;", "Ljava/io/Serializable;", "content", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "isRepeatable", "", "(Ljava/lang/String;Lcom/taurusx/tax/vast/VastTracker$MessageType;Z)V", "getContent", "()Ljava/lang/String;", "()Z", "<set-?>", "isTracked", "getMessageType", "()Lcom/taurusx/tax/vast/VastTracker$MessageType;", "equals", "other", "", "hashCode", "", "setTracked", "", "toString", "Builder", y.f66058y, "MessageType", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class VastTracker implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f67023o = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    public boolean isTracked;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from toString */
    @SerializedName(n.f66165i)
    @Expose
    @NotNull
    public final MessageType messageType;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from toString */
    @SerializedName(n.f66178v)
    @Expose
    public final boolean isRepeatable;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
    @SerializedName("content")
    @Expose
    @NotNull
    public final String content;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taurusx/tax/vast/VastTracker$Builder;", "", "content", "", "(Ljava/lang/String;)V", "isRepeatable", "", "messageType", "Lcom/taurusx/tax/vast/VastTracker$MessageType;", "build", "Lcom/taurusx/tax/vast/VastTracker;", "component1", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public MessageType f67028w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f67029y;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
        @NotNull
        public final String content;

        public Builder(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.f67028w = MessageType.TRACKING_URL;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = builder.content;
            }
            return builder.copy(str);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        private final String getContent() {
            return this.content;
        }

        @NotNull
        public final VastTracker build() {
            return new VastTracker(this.content, this.f67028w, this.f67029y);
        }

        @NotNull
        public final Builder copy(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Builder(content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Builder) && Intrinsics.areEqual(this.content, ((Builder) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public final Builder isRepeatable(boolean isRepeatable) {
            this.f67029y = isRepeatable;
            return this;
        }

        @NotNull
        public final Builder messageType(@NotNull MessageType messageType) {
            Intrinsics.checkNotNullParameter(messageType, "messageType");
            this.f67028w = messageType;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(content=" + this.content + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taurusx/tax/vast/VastTracker$MessageType;", "", "(Ljava/lang/String;I)V", "TRACKING_URL", "QUARTILE_EVENT", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum MessageType {
        TRACKING_URL,
        QUARTILE_EVENT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MessageType[] valuesCustom() {
            MessageType[] messageTypeArrValuesCustom = values();
            return (MessageType[]) Arrays.copyOf(messageTypeArrValuesCustom, messageTypeArrValuesCustom.length);
        }
    }

    public VastTracker(@NotNull String content, @NotNull MessageType messageType, boolean z10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.content = content;
        this.messageType = messageType;
        this.isRepeatable = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastTracker)) {
            return false;
        }
        VastTracker vastTracker = (VastTracker) other;
        return Intrinsics.areEqual(this.content, vastTracker.content) && this.messageType == vastTracker.messageType && this.isRepeatable == vastTracker.isRepeatable && this.isTracked == vastTracker.isTracked;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final MessageType getMessageType() {
        return this.messageType;
    }

    public int hashCode() {
        return (((((this.content.hashCode() * 31) + this.messageType.hashCode()) * 31) + c.a(this.isRepeatable)) * 31) + c.a(this.isTracked);
    }

    /* JADX INFO: renamed from: isRepeatable, reason: from getter */
    public final boolean getIsRepeatable() {
        return this.isRepeatable;
    }

    /* JADX INFO: renamed from: isTracked, reason: from getter */
    public final boolean getIsTracked() {
        return this.isTracked;
    }

    public final void setTracked() {
        this.isTracked = true;
    }

    @NotNull
    public String toString() {
        return "VastTracker(content='" + this.content + "', messageType=" + this.messageType + ", isRepeatable=" + this.isRepeatable + ", isTracked=" + this.isTracked + ')';
    }
}
