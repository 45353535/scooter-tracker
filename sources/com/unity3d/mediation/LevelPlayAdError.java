package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayAdError {

    @NotNull
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final IronSourceError f67857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f67859c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(@Nullable IronSourceError ironSourceError, @NotNull String adId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f67857a = ironSourceError;
        this.f67858b = adId;
        this.f67859c = str;
    }

    @NotNull
    public final String getAdId() {
        return this.f67858b;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f67859c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f67857a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @NotNull
    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f67857a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    @NotNull
    public String toString() {
        String str = this.f67859c;
        IronSourceError ironSourceError = this.f67857a;
        return "adUnitId: " + str + " " + (ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@NotNull String adId, @NotNull String adUnitId, int i10, @NotNull String errorMessage) {
        this(new IronSourceError(i10, errorMessage), adId, adUnitId);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
