package org.bidon.sdk.config.models;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0013HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J«\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:¨\u0006T"}, d2 = {"Lorg/bidon/sdk/config/models/Session;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "id", "", "launchTs", "", "launchMonotonicTs", "startTs", "monotonicStartTs", "ts", "monotonicTs", "memoryWarningsTs", "", "memoryWarningsMonotonicTs", "ramUsed", "ramSize", "storageFree", "storageUsed", "battery", "", "cpuUsage", "<init>", "(Ljava/lang/String;JJJJJJLjava/util/List;Ljava/util/List;JJJJFF)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLaunchTs", "()J", "setLaunchTs", "(J)V", "getLaunchMonotonicTs", "setLaunchMonotonicTs", "getStartTs", "setStartTs", "getMonotonicStartTs", "setMonotonicStartTs", "getTs", "setTs", "getMonotonicTs", "setMonotonicTs", "getMemoryWarningsTs", "()Ljava/util/List;", "setMemoryWarningsTs", "(Ljava/util/List;)V", "getMemoryWarningsMonotonicTs", "setMemoryWarningsMonotonicTs", "getRamUsed", "setRamUsed", "getRamSize", "setRamSize", "getStorageFree", "setStorageFree", "getStorageUsed", "setStorageUsed", "getBattery", "()F", "setBattery", "(F)V", "getCpuUsage", "setCpuUsage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Session implements Serializable {

    @JsonName(key = "battery")
    private float battery;

    @JsonName(key = "cpu_usage")
    private float cpuUsage;

    @JsonName(key = "id")
    @NotNull
    private String id;

    @JsonName(key = "launch_monotonic_ts")
    private long launchMonotonicTs;

    @JsonName(key = "launch_ts")
    private long launchTs;

    @JsonName(key = "memory_warnings_monotonic_ts")
    @NotNull
    private List<Long> memoryWarningsMonotonicTs;

    @JsonName(key = "memory_warnings_ts")
    @NotNull
    private List<Long> memoryWarningsTs;

    @JsonName(key = "start_monotonic_ts")
    private long monotonicStartTs;

    @JsonName(key = "monotonic_ts")
    private long monotonicTs;

    @JsonName(key = "ram_size")
    private long ramSize;

    @JsonName(key = "ram_used")
    private long ramUsed;

    @JsonName(key = "start_ts")
    private long startTs;

    @JsonName(key = "storage_free")
    private long storageFree;

    @JsonName(key = "storage_used")
    private long storageUsed;

    @JsonName(key = "ts")
    private long ts;

    public Session(@NotNull String id2, long j10, long j11, long j12, long j13, long j14, long j15, @NotNull List<Long> memoryWarningsTs, @NotNull List<Long> memoryWarningsMonotonicTs, long j16, long j17, long j18, long j19, float f10, float f11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(memoryWarningsTs, "memoryWarningsTs");
        Intrinsics.checkNotNullParameter(memoryWarningsMonotonicTs, "memoryWarningsMonotonicTs");
        this.id = id2;
        this.launchTs = j10;
        this.launchMonotonicTs = j11;
        this.startTs = j12;
        this.monotonicStartTs = j13;
        this.ts = j14;
        this.monotonicTs = j15;
        this.memoryWarningsTs = memoryWarningsTs;
        this.memoryWarningsMonotonicTs = memoryWarningsMonotonicTs;
        this.ramUsed = j16;
        this.ramSize = j17;
        this.storageFree = j18;
        this.storageUsed = j19;
        this.battery = f10;
        this.cpuUsage = f11;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getRamUsed() {
        return this.ramUsed;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getRamSize() {
        return this.ramSize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getStorageFree() {
        return this.storageFree;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getStorageUsed() {
        return this.storageUsed;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getBattery() {
        return this.battery;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getCpuUsage() {
        return this.cpuUsage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLaunchTs() {
        return this.launchTs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLaunchMonotonicTs() {
        return this.launchMonotonicTs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTs() {
        return this.startTs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMonotonicStartTs() {
        return this.monotonicStartTs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getMonotonicTs() {
        return this.monotonicTs;
    }

    @NotNull
    public final List<Long> component8() {
        return this.memoryWarningsTs;
    }

    @NotNull
    public final List<Long> component9() {
        return this.memoryWarningsMonotonicTs;
    }

    @NotNull
    public final Session copy(@NotNull String id2, long launchTs, long launchMonotonicTs, long startTs, long monotonicStartTs, long ts, long monotonicTs, @NotNull List<Long> memoryWarningsTs, @NotNull List<Long> memoryWarningsMonotonicTs, long ramUsed, long ramSize, long storageFree, long storageUsed, float battery, float cpuUsage) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(memoryWarningsTs, "memoryWarningsTs");
        Intrinsics.checkNotNullParameter(memoryWarningsMonotonicTs, "memoryWarningsMonotonicTs");
        return new Session(id2, launchTs, launchMonotonicTs, startTs, monotonicStartTs, ts, monotonicTs, memoryWarningsTs, memoryWarningsMonotonicTs, ramUsed, ramSize, storageFree, storageUsed, battery, cpuUsage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(this.id, session.id) && this.launchTs == session.launchTs && this.launchMonotonicTs == session.launchMonotonicTs && this.startTs == session.startTs && this.monotonicStartTs == session.monotonicStartTs && this.ts == session.ts && this.monotonicTs == session.monotonicTs && Intrinsics.areEqual(this.memoryWarningsTs, session.memoryWarningsTs) && Intrinsics.areEqual(this.memoryWarningsMonotonicTs, session.memoryWarningsMonotonicTs) && this.ramUsed == session.ramUsed && this.ramSize == session.ramSize && this.storageFree == session.storageFree && this.storageUsed == session.storageUsed && Float.compare(this.battery, session.battery) == 0 && Float.compare(this.cpuUsage, session.cpuUsage) == 0;
    }

    public final float getBattery() {
        return this.battery;
    }

    public final float getCpuUsage() {
        return this.cpuUsage;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getLaunchMonotonicTs() {
        return this.launchMonotonicTs;
    }

    public final long getLaunchTs() {
        return this.launchTs;
    }

    @NotNull
    public final List<Long> getMemoryWarningsMonotonicTs() {
        return this.memoryWarningsMonotonicTs;
    }

    @NotNull
    public final List<Long> getMemoryWarningsTs() {
        return this.memoryWarningsTs;
    }

    public final long getMonotonicStartTs() {
        return this.monotonicStartTs;
    }

    public final long getMonotonicTs() {
        return this.monotonicTs;
    }

    public final long getRamSize() {
        return this.ramSize;
    }

    public final long getRamUsed() {
        return this.ramUsed;
    }

    public final long getStartTs() {
        return this.startTs;
    }

    public final long getStorageFree() {
        return this.storageFree;
    }

    public final long getStorageUsed() {
        return this.storageUsed;
    }

    public final long getTs() {
        return this.ts;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.id.hashCode() * 31) + b.a(this.launchTs)) * 31) + b.a(this.launchMonotonicTs)) * 31) + b.a(this.startTs)) * 31) + b.a(this.monotonicStartTs)) * 31) + b.a(this.ts)) * 31) + b.a(this.monotonicTs)) * 31) + this.memoryWarningsTs.hashCode()) * 31) + this.memoryWarningsMonotonicTs.hashCode()) * 31) + b.a(this.ramUsed)) * 31) + b.a(this.ramSize)) * 31) + b.a(this.storageFree)) * 31) + b.a(this.storageUsed)) * 31) + Float.floatToIntBits(this.battery)) * 31) + Float.floatToIntBits(this.cpuUsage);
    }

    public final void setBattery(float f10) {
        this.battery = f10;
    }

    public final void setCpuUsage(float f10) {
        this.cpuUsage = f10;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setLaunchMonotonicTs(long j10) {
        this.launchMonotonicTs = j10;
    }

    public final void setLaunchTs(long j10) {
        this.launchTs = j10;
    }

    public final void setMemoryWarningsMonotonicTs(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.memoryWarningsMonotonicTs = list;
    }

    public final void setMemoryWarningsTs(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.memoryWarningsTs = list;
    }

    public final void setMonotonicStartTs(long j10) {
        this.monotonicStartTs = j10;
    }

    public final void setMonotonicTs(long j10) {
        this.monotonicTs = j10;
    }

    public final void setRamSize(long j10) {
        this.ramSize = j10;
    }

    public final void setRamUsed(long j10) {
        this.ramUsed = j10;
    }

    public final void setStartTs(long j10) {
        this.startTs = j10;
    }

    public final void setStorageFree(long j10) {
        this.storageFree = j10;
    }

    public final void setStorageUsed(long j10) {
        this.storageUsed = j10;
    }

    public final void setTs(long j10) {
        this.ts = j10;
    }

    @NotNull
    public String toString() {
        return "Session(id=" + this.id + ", launchTs=" + this.launchTs + ", launchMonotonicTs=" + this.launchMonotonicTs + ", startTs=" + this.startTs + ", monotonicStartTs=" + this.monotonicStartTs + ", ts=" + this.ts + ", monotonicTs=" + this.monotonicTs + ", memoryWarningsTs=" + this.memoryWarningsTs + ", memoryWarningsMonotonicTs=" + this.memoryWarningsMonotonicTs + ", ramUsed=" + this.ramUsed + ", ramSize=" + this.ramSize + ", storageFree=" + this.storageFree + ", storageUsed=" + this.storageUsed + ", battery=" + this.battery + ", cpuUsage=" + this.cpuUsage + ")";
    }
}
