package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4582v6 {

    /* JADX INFO: renamed from: com.ironsource.v6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f45621a;

        public a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f45621a = strategyType;
        }

        @NotNull
        public final c a() {
            return this.f45621a;
        }

        @NotNull
        public final c b() {
            return this.f45621a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f45621a == ((a) obj).f45621a;
        }

        public int hashCode() {
            return this.f45621a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.f45621a + ")";
        }

        @NotNull
        public final a a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f45621a;
            }
            return aVar.a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.v6$b */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.v6$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45622a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f45622a = iArr;
            }
        }

        @NotNull
        public final InterfaceC4582v6 a(@NotNull C4441n0 adTools, @NotNull a config, @NotNull InterfaceC4514r6 fullscreenAdUnitFactory, @NotNull InterfaceC4548t6 fullscreenAdUnitListener, @NotNull InterfaceC4565u6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i10 = a.f45622a[config.b().ordinal()];
            if (i10 == 1) {
                return new J6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 2) {
                return new C6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 3) {
                return new C4599w6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new lf.m();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.v6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f45627a;

        c(String str) {
            this.f45627a = str;
        }

        @NotNull
        public final String b() {
            return this.f45627a;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();
}
