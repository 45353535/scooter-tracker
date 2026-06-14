package io.appmetrica.analytics.ndkcrashesapi.internal;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f¨\u0006\u001e"}, d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "a", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "getSource", "()Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "source", "", "b", "Ljava/lang/String;", "getHandlerVersion", "()Ljava/lang/String;", "handlerVersion", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getUuid", CommonUrlParts.UUID, "d", "getDumpFile", "dumpFile", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "J", "getCreationTime", "()J", "creationTime", InneractiveMediationDefs.GENDER_FEMALE, "getMetadata", "metadata", "Builder", "ndkcrashes-api_release"}, k = 1, mv = {1, 6, 0})
public final class NativeCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeCrashSource source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String handlerVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String uuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String dumpFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long creationTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String metadata;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash$Builder;", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "build", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "source", "", "handlerVersion", CommonUrlParts.UUID, "dumpFile", "", "creationTime", "metadata", "<init>", "(Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "ndkcrashes-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f78791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f78792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f78793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f78794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f78795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f78796f;

        public Builder(@NotNull NativeCrashSource nativeCrashSource, @NotNull String str, @NotNull String str2, @NotNull String str3, long j10, @NotNull String str4) {
            this.f78791a = nativeCrashSource;
            this.f78792b = str;
            this.f78793c = str2;
            this.f78794d = str3;
            this.f78795e = j10;
            this.f78796f = str4;
        }

        @NotNull
        public final NativeCrash build() {
            return new NativeCrash(this.f78791a, this.f78792b, this.f78793c, this.f78794d, this.f78795e, this.f78796f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCrashSource, str, str2, str3, j10, str4);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    @NotNull
    public final String getDumpFile() {
        return this.dumpFile;
    }

    @NotNull
    public final String getHandlerVersion() {
        return this.handlerVersion;
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NativeCrashSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4) {
        this.source = nativeCrashSource;
        this.handlerVersion = str;
        this.uuid = str2;
        this.dumpFile = str3;
        this.creationTime = j10;
        this.metadata = str4;
    }
}
