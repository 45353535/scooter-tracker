package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u001b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002$#B-\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "", "component3", "component4", "name", "value", "valueBytes", "type", MenuActionType.COPY, "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getValue", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "[B", "getValueBytes", "()[B", "d", "I", "getType", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BI)V", y.f66058y, "Builder", "core-api_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ServiceModuleCounterReport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] valueBytes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Builder;", "", "", "name", "withName", "value", "withValue", "", "valueBytes", "withValueBytes", "", "type", "withType", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport;", "build", "<init>", "()V", "core-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f75199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f75200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f75201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f75202d;

        @NotNull
        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f75199a, this.f75200b, this.f75201c, this.f75202d);
        }

        @NotNull
        public final Builder withName(@Nullable String name) {
            this.f75199a = name;
            return this;
        }

        @NotNull
        public final Builder withType(int type) {
            this.f75202d = type;
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String value) {
            this.f75200b = value;
            return this;
        }

        @NotNull
        public final Builder withValueBytes(@Nullable byte[] valueBytes) {
            this.f75201c = valueBytes;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Companion;", "", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Builder;", "newBuilder", "core-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(@Nullable String str, @Nullable String str2, @Nullable byte[] bArr, int i10) {
        this.name = str;
        this.value = str2;
        this.valueBytes = bArr;
        this.type = i10;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serviceModuleCounterReport.name;
        }
        if ((i11 & 2) != 0) {
            str2 = serviceModuleCounterReport.value;
        }
        if ((i11 & 4) != 0) {
            bArr = serviceModuleCounterReport.valueBytes;
        }
        if ((i11 & 8) != 0) {
            i10 = serviceModuleCounterReport.type;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getValueBytes() {
        return this.valueBytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ServiceModuleCounterReport copy(@Nullable String name, @Nullable String value, @Nullable byte[] valueBytes, int type) {
        return new ServiceModuleCounterReport(name, value, valueBytes, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) other;
        return this.type == serviceModuleCounterReport.type && Intrinsics.areEqual(this.name, serviceModuleCounterReport.name) && Intrinsics.areEqual(this.value, serviceModuleCounterReport.value) && Arrays.equals(this.valueBytes, serviceModuleCounterReport.valueBytes);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final byte[] getValueBytes() {
        return this.valueBytes;
    }

    public int hashCode() {
        int i10 = this.type * 31;
        String str = this.name;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.valueBytes;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.name + ", value=" + this.value + ", valueBytes=" + Arrays.toString(this.valueBytes) + ", type=" + this.type + ')';
    }
}
