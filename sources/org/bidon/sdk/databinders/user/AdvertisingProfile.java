package org.bidon.sdk.databinders.user;

import androidx.compose.foundation.c;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "", "Denied", "Google", "Huawei", "Amazon", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Amazon;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Denied;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Google;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Huawei;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdvertisingProfile {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Amazon;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "advertisingId", "", C4240b4.j.M, "", "<init>", "(Ljava/lang/String;Z)V", "getAdvertisingId", "()Ljava/lang/String;", "()Z", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Amazon implements AdvertisingProfile {

        @NotNull
        private final String advertisingId;
        private final boolean isLimitAdTrackingEnabled;

        public Amazon(@NotNull String advertisingId, boolean z10) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            this.advertisingId = advertisingId;
            this.isLimitAdTrackingEnabled = z10;
        }

        public static /* synthetic */ Amazon copy$default(Amazon amazon, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = amazon.advertisingId;
            }
            if ((i10 & 2) != 0) {
                z10 = amazon.isLimitAdTrackingEnabled;
            }
            return amazon.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final Amazon copy(@NotNull String advertisingId, boolean isLimitAdTrackingEnabled) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            return new Amazon(advertisingId, isLimitAdTrackingEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Amazon)) {
                return false;
            }
            Amazon amazon = (Amazon) other;
            return Intrinsics.areEqual(this.advertisingId, amazon.advertisingId) && this.isLimitAdTrackingEnabled == amazon.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public int hashCode() {
            return (this.advertisingId.hashCode() * 31) + c.a(this.isLimitAdTrackingEnabled);
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public String toString() {
            return "Amazon(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Denied;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Denied implements AdvertisingProfile {

        @NotNull
        public static final Denied INSTANCE = new Denied();

        private Denied() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Google;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "advertisingId", "", C4240b4.j.M, "", "<init>", "(Ljava/lang/String;Z)V", "getAdvertisingId", "()Ljava/lang/String;", "()Z", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Google implements AdvertisingProfile {

        @NotNull
        private final String advertisingId;
        private final boolean isLimitAdTrackingEnabled;

        public Google(@NotNull String advertisingId, boolean z10) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            this.advertisingId = advertisingId;
            this.isLimitAdTrackingEnabled = z10;
        }

        public static /* synthetic */ Google copy$default(Google google, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = google.advertisingId;
            }
            if ((i10 & 2) != 0) {
                z10 = google.isLimitAdTrackingEnabled;
            }
            return google.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final Google copy(@NotNull String advertisingId, boolean isLimitAdTrackingEnabled) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            return new Google(advertisingId, isLimitAdTrackingEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Google)) {
                return false;
            }
            Google google = (Google) other;
            return Intrinsics.areEqual(this.advertisingId, google.advertisingId) && this.isLimitAdTrackingEnabled == google.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public int hashCode() {
            return (this.advertisingId.hashCode() * 31) + c.a(this.isLimitAdTrackingEnabled);
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public String toString() {
            return "Google(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/databinders/user/AdvertisingProfile$Huawei;", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "advertisingId", "", C4240b4.j.M, "", "<init>", "(Ljava/lang/String;Z)V", "getAdvertisingId", "()Ljava/lang/String;", "()Z", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Huawei implements AdvertisingProfile {

        @NotNull
        private final String advertisingId;
        private final boolean isLimitAdTrackingEnabled;

        public Huawei(@NotNull String advertisingId, boolean z10) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            this.advertisingId = advertisingId;
            this.isLimitAdTrackingEnabled = z10;
        }

        public static /* synthetic */ Huawei copy$default(Huawei huawei, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = huawei.advertisingId;
            }
            if ((i10 & 2) != 0) {
                z10 = huawei.isLimitAdTrackingEnabled;
            }
            return huawei.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final Huawei copy(@NotNull String advertisingId, boolean isLimitAdTrackingEnabled) {
            Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
            return new Huawei(advertisingId, isLimitAdTrackingEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Huawei)) {
                return false;
            }
            Huawei huawei = (Huawei) other;
            return Intrinsics.areEqual(this.advertisingId, huawei.advertisingId) && this.isLimitAdTrackingEnabled == huawei.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public int hashCode() {
            return (this.advertisingId.hashCode() * 31) + c.a(this.isLimitAdTrackingEnabled);
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public String toString() {
            return "Huawei(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ")";
        }
    }
}
