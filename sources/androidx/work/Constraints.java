package androidx.work;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Ignore;
import androidx.work.impl.utils.DurationApi26Impl;
import androidx.work.impl.utils.NetworkRequest30;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.taurusx.tax.f.y;
import j$.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0003+,-B1\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010%\u001a\u00020\u0005H\u0007J\u0013\u0010&\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002J\b\u0010'\u001a\u00020(H\u0017J\b\u0010)\u001a\u00020*H\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\r8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Landroidx/work/Constraints;", "", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresCharging", "", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "contentTriggerUpdateDelayMillis", "", "contentTriggerMaxDelayMillis", "contentUriTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "requiredNetworkRequestCompat", "Landroidx/work/impl/utils/NetworkRequestCompat;", "(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/Constraints;)V", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "requiredNetworkRequest", "Landroid/net/NetworkRequest;", "getRequiredNetworkRequest", "()Landroid/net/NetworkRequest;", "getRequiredNetworkRequestCompat$work_runtime_release", "()Landroidx/work/impl/utils/NetworkRequestCompat;", "getContentTriggerUpdateDelayMillis", "()J", "getContentTriggerMaxDelayMillis", "getContentUriTriggers", "()Ljava/util/Set;", "hasContentUriTriggers", "equals", "hashCode", "", "toString", "", "Builder", "ContentUriTrigger", y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Constraints {

    @NotNull
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);

    @ColumnInfo(name = "trigger_max_content_delay")
    private final long contentTriggerMaxDelayMillis;

    @ColumnInfo(name = "trigger_content_update_delay")
    private final long contentTriggerUpdateDelayMillis;

    @ColumnInfo(name = "content_uri_triggers")
    @NotNull
    private final Set<ContentUriTrigger> contentUriTriggers;

    @ColumnInfo(defaultValue = "x''", name = "required_network_request")
    @NotNull
    private final NetworkRequestCompat requiredNetworkRequestCompat;

    @ColumnInfo(name = "required_network_type")
    @NotNull
    private final NetworkType requiredNetworkType;

    @ColumnInfo(name = "requires_battery_not_low")
    private final boolean requiresBatteryNotLow;

    @ColumnInfo(name = "requires_charging")
    private final boolean requiresCharging;

    @ColumnInfo(name = "requires_device_idle")
    private final boolean requiresDeviceIdle;

    @ColumnInfo(name = "requires_storage_not_low")
    private final boolean requiresStorageNotLow;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$H\u0007¢\u0006\u0004\b\"\u0010%J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b&\u0010#J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0016\u0010/\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "<init>", "()V", "Landroidx/work/Constraints;", "constraints", "(Landroidx/work/Constraints;)V", "", "requiresCharging", "setRequiresCharging", "(Z)Landroidx/work/Constraints$Builder;", "requiresDeviceIdle", "setRequiresDeviceIdle", "Landroidx/work/NetworkType;", "networkType", "setRequiredNetworkType", "(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "Landroid/net/NetworkRequest;", "networkRequest", "setRequiredNetworkRequest", "(Landroid/net/NetworkRequest;Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "requiresBatteryNotLow", "setRequiresBatteryNotLow", "requiresStorageNotLow", "setRequiresStorageNotLow", "Landroid/net/Uri;", com.taurusx.tax.o.g.f66428y, "triggerForDescendants", "addContentUriTrigger", "(Landroid/net/Uri;Z)Landroidx/work/Constraints$Builder;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setTriggerContentUpdateDelay", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/Constraints$Builder;", "j$/time/Duration", "(Lj$/time/Duration;)Landroidx/work/Constraints$Builder;", "setTriggerContentMaxDelay", "build", "()Landroidx/work/Constraints;", "Z", "Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkRequest", "Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkType", "Landroidx/work/NetworkType;", "triggerContentUpdateDelay", "J", "triggerContentMaxDelay", "", "Landroidx/work/Constraints$ContentUriTrigger;", "contentUriTriggers", "Ljava/util/Set;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Set<ContentUriTrigger> contentUriTriggers;

        @NotNull
        private NetworkRequestCompat requiredNetworkRequest;

        @NotNull
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        @RequiresApi(24)
        @NotNull
        public final Builder addContentUriTrigger(@NotNull Uri uri, boolean triggerForDescendants) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, triggerForDescendants));
            return this;
        }

        @NotNull
        public final Constraints build() {
            Set setEmptySet;
            long j10;
            long j11;
            if (Build.VERSION.SDK_INT >= 24) {
                setEmptySet = CollectionsKt.toSet(this.contentUriTriggers);
                j10 = this.triggerContentUpdateDelay;
                j11 = this.triggerContentMaxDelay;
            } else {
                setEmptySet = SetsKt.emptySet();
                j10 = -1;
                j11 = -1;
            }
            return new Constraints(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j10, j11, setEmptySet);
        }

        @NotNull
        public final Builder setRequiredNetworkRequest(@NotNull NetworkRequest networkRequest, @NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                this.requiredNetworkType = networkType;
                return this;
            }
            if (i10 >= 31 && NetworkRequest30.INSTANCE.getNetworkSpecifier(networkRequest) != null) {
                throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
            }
            this.requiredNetworkRequest = new NetworkRequestCompat(networkRequest);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            return this;
        }

        @NotNull
        public final Builder setRequiredNetworkType(@NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        @NotNull
        public final Builder setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        @NotNull
        public final Builder setRequiresCharging(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        @NotNull
        public final Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        @NotNull
        public final Builder setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentMaxDelay(long duration, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(long duration, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentMaxDelay(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NotNull Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.getRequiresCharging();
            this.requiresDeviceIdle = constraints.getRequiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.getRequiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.getRequiresStorageNotLow();
            if (Build.VERSION.SDK_INT >= 24) {
                this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
                this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
                this.contentUriTriggers = CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", com.taurusx.tax.o.g.f66428y, "Landroid/net/Uri;", "isTriggeredForDescendants", "", "<init>", "(Landroid/net/Uri;Z)V", "getUri", "()Landroid/net/Uri;", "()Z", "equals", "other", "hashCode", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;

        @NotNull
        private final Uri uri;

        public ContentUriTrigger(@NotNull Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(ContentUriTrigger.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) other;
            return Intrinsics.areEqual(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + androidx.compose.foundation.c.a(this.isTriggeredForDescendants);
        }

        /* JADX INFO: renamed from: isTriggeredForDescendants, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    @SuppressLint({"NewApi"})
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Constraints.class, other.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) other;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && Intrinsics.areEqual(getRequiredNetworkRequest(), constraints.getRequiredNetworkRequest()) && this.requiredNetworkType == constraints.requiredNetworkType) {
            return Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    @RequiresApi(24)
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    @RequiresApi(24)
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    @RequiresApi(24)
    @NotNull
    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    @Nullable
    public final NetworkRequest getRequiredNetworkRequest() {
        return this.requiredNetworkRequestCompat.getNetworkRequest();
    }

    @NotNull
    /* JADX INFO: renamed from: getRequiredNetworkRequestCompat$work_runtime_release, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @NotNull
    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasContentUriTriggers() {
        return Build.VERSION.SDK_INT < 24 || !this.contentUriTriggers.isEmpty();
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j10 = this.contentTriggerUpdateDelayMillis;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return iHashCode2 + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    /* JADX INFO: renamed from: requiresBatteryNotLow, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* JADX INFO: renamed from: requiresCharging, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: requiresDeviceIdle, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: requiresStorageNotLow, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Constraints(androidx.work.NetworkType r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            androidx.work.NetworkType r2 = androidx.work.NetworkType.NOT_REQUIRED
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Constraints.<init>(androidx.work.NetworkType, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ignore
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? SetsKt.emptySet() : set);
    }

    @RequiresApi(24)
    @Ignore
    public Constraints(@NotNull NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @NotNull Set<ContentUriTrigger> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    public /* synthetic */ Constraints(NetworkRequestCompat networkRequestCompat, NetworkType networkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkRequestCompat, (i10 & 2) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) == 0 ? z13 : false, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) == 0 ? j11 : -1L, (i10 & 256) != 0 ? SetsKt.emptySet() : set);
    }

    public Constraints(@NotNull NetworkRequestCompat requiredNetworkRequestCompat, @NotNull NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @NotNull Set<ContentUriTrigger> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = requiredNetworkRequestCompat;
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public Constraints(@NotNull Constraints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = other.requiredNetworkRequestCompat;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
