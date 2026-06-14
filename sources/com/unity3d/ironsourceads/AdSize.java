package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f67785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f67786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f67787c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(320, 50, "BANNER", null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(320, 90, l.f44062b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f44064d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, l.f44067g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str);
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f67786b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.f67787c;
    }

    public final int getWidth() {
        return this.f67785a;
    }

    private AdSize(int i10, int i11, String str) {
        this.f67785a = i10;
        this.f67786b = i11;
        this.f67787c = str;
    }
}
