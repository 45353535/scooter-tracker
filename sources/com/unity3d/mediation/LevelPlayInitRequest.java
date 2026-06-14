package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayInitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f67884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<LevelPlay.AdFormat> f67885c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f67887b;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f67886a = appKey;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f67886a, this.f67887b, null, 4, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f67886a;
        }

        @NotNull
        public final Builder withUserId(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f67887b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f67883a = str;
        this.f67884b = str2;
        this.f67885c = list;
    }

    @NotNull
    public final String getAppKey() {
        return this.f67883a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f67885c;
    }

    @Nullable
    public final String getUserId() {
        return this.f67884b;
    }

    /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
