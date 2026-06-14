package com.unity3d.ads.core.data.model;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "()V", "CancelTimeout", LogConstants.EVENT_CLICKED, "Completed", "Error", "LeftApplication", LogConstants.EVENT_STARTED, "Lcom/unity3d/ads/core/data/model/ShowEvent$CancelTimeout;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Clicked;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Completed;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Error;", "Lcom/unity3d/ads/core/data/model/ShowEvent$LeftApplication;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Started;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ShowEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$CancelTimeout;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelTimeout extends ShowEvent {

        @NotNull
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Clicked;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Clicked extends ShowEvent {

        @NotNull
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Completed;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "status", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "reason", "", "reasonDebug", "(Lcom/unity3d/ads/adplayer/model/ShowStatus;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getReasonDebug", "getStatus", "()Lcom/unity3d/ads/adplayer/model/ShowStatus;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Completed extends ShowEvent {

        @Nullable
        private final String reason;

        @Nullable
        private final String reasonDebug;

        @NotNull
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull ShowStatus status, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i10 & 2) != 0) {
                str = completed.reason;
            }
            if ((i10 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ShowStatus getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @NotNull
        public final Completed copy(@NotNull ShowStatus status, @Nullable String reason, @Nullable String reasonDebug) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Completed(status, reason, reasonDebug);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return this.status == completed.status && Intrinsics.areEqual(this.reason, completed.reason) && Intrinsics.areEqual(this.reasonDebug, completed.reasonDebug);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @NotNull
        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Completed(status=" + this.status + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(showStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Error;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", PglCryptUtils.KEY_MESSAGE, "", "errorCode", "", "reason", "(Ljava/lang/String;ILjava/lang/String;)V", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "getReason", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends ShowEvent {
        private final int errorCode;

        @NotNull
        private final String message;

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String message, int i10, @NotNull String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i10;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final Error copy(@NotNull String message, int errorCode, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(message, errorCode, reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.message, error.message) && this.errorCode == error.errorCode && Intrinsics.areEqual(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.errorCode) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$LeftApplication;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LeftApplication extends ShowEvent {

        @NotNull
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Started;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Started extends ShowEvent {

        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShowEvent() {
    }
}
