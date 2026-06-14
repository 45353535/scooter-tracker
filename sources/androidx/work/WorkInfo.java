package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.shadow.okio.Utf8;
import com.taurusx.tax.f.y;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u0003234B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u00020\rH\u0016J\b\u00101\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\f\u001a\u00020\r8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u0016\u001a\u00020\r8G¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#¨\u00065"}, d2 = {"Landroidx/work/WorkInfo;", "", "id", "Ljava/util/UUID;", "state", "Landroidx/work/WorkInfo$State;", "tags", "", "", "outputData", "Landroidx/work/Data;", "progress", "runAttemptCount", "", "generation", "constraints", "Landroidx/work/Constraints;", "initialDelayMillis", "", "periodicityInfo", "Landroidx/work/WorkInfo$PeriodicityInfo;", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "getId", "()Ljava/util/UUID;", "getState", "()Landroidx/work/WorkInfo$State;", "getTags", "()Ljava/util/Set;", "getOutputData", "()Landroidx/work/Data;", "getProgress", "getRunAttemptCount", "()I", "getGeneration", "getConstraints", "()Landroidx/work/Constraints;", "getInitialDelayMillis", "()J", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "getNextScheduleTimeMillis", "getStopReason", "equals", "", "other", "hashCode", "toString", "State", "PeriodicityInfo", y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkInfo {
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;

    @NotNull
    private final Constraints constraints;
    private final int generation;

    @NotNull
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;

    @NotNull
    private final Data outputData;

    @Nullable
    private final PeriodicityInfo periodicityInfo;

    @NotNull
    private final Data progress;
    private final int runAttemptCount;

    @NotNull
    private final State state;
    private final int stopReason;

    @NotNull
    private final Set<String> tags;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "repeatIntervalMillis", "", "flexIntervalMillis", "<init>", "(JJ)V", "getRepeatIntervalMillis", "()J", "getFlexIntervalMillis", "equals", "", "other", "hashCode", "", "toString", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j10, long j11) {
            this.repeatIntervalMillis = j10;
            this.flexIntervalMillis = j11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && Intrinsics.areEqual(PeriodicityInfo.class, other.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) other;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.repeatIntervalMillis) * 31) + androidx.collection.b.a(this.flexIntervalMillis);
        }

        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\r"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "<init>", "(Ljava/lang/String;I)V", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "isFinished", "", "()Z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ENQUEUED = new State("ENQUEUED", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State SUCCEEDED = new State("SUCCEEDED", 2);
        public static final State FAILED = new State("FAILED", 3);
        public static final State BLOCKED = new State("BLOCKED", 4);
        public static final State CANCELLED = new State("CANCELLED", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = qf.a.a(stateArr$values);
        }

        private State(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags) {
        this(id2, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(WorkInfo.class, other.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) other;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.areEqual(this.outputData, workInfo.outputData) && Intrinsics.areEqual(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && Intrinsics.areEqual(this.tags, workInfo.tags)) {
            return Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    @NotNull
    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    @NotNull
    public final Data getOutputData() {
        return this.outputData;
    }

    @Nullable
    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    @NotNull
    public final Data getProgress() {
        return this.progress;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.stopReason;
    }

    @NotNull
    public final Set<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + androidx.collection.b.a(this.initialDelayMillis)) * 31;
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return ((((iHashCode + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31) + androidx.collection.b.a(this.nextScheduleTimeMillis)) * 31) + this.stopReason;
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData) {
        this(id2, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress) {
        this(id2, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10) {
        this(id2, state, tags, outputData, progress, i10, 0, null, 0L, null, 0L, 0, 4032, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11) {
        this(id2, state, tags, outputData, progress, i10, i11, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11, @NotNull Constraints constraints) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, 0L, null, 0L, 0, 3840, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11, @NotNull Constraints constraints, long j10) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, null, 0L, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11, @NotNull Constraints constraints, long j10, @Nullable PeriodicityInfo periodicityInfo) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, periodicityInfo, 0L, 0, 3072, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11, @NotNull Constraints constraints, long j10, @Nullable PeriodicityInfo periodicityInfo, long j11) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, periodicityInfo, j11, 0, 2048, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i10, int i11, @NotNull Constraints constraints, long j10, @Nullable PeriodicityInfo periodicityInfo, long j11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.id = id2;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i10;
        this.generation = i11;
        this.constraints = constraints;
        this.initialDelayMillis = j10;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j11;
        this.stopReason = i12;
    }

    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i10, int i11, Constraints constraints, long j10, PeriodicityInfo periodicityInfo, long j11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, state, set, (i13 & 8) != 0 ? Data.EMPTY : data, (i13 & 16) != 0 ? Data.EMPTY : data2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? Constraints.NONE : constraints, (i13 & 256) != 0 ? 0L : j10, (i13 & 512) != 0 ? null : periodicityInfo, (i13 & 1024) != 0 ? Long.MAX_VALUE : j11, (i13 & 2048) != 0 ? -256 : i12);
    }
}
