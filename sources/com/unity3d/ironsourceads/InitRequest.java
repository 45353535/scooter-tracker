package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class InitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<IronSourceAds.AdFormat> f67789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LogLevel f67790c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private List<? extends IronSourceAds.AdFormat> f67792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private LogLevel f67793c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f67791a = appKey;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.f67791a;
            List<? extends IronSourceAds.AdFormat> listEmptyList = this.f67792b;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            LogLevel logLevel = this.f67793c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, listEmptyList, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f67791a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f67792b = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.f67793c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    @NotNull
    public final String getAppKey() {
        return this.f67788a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f67789b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.f67790c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f67788a = str;
        this.f67789b = list;
        this.f67790c = logLevel;
    }
}
