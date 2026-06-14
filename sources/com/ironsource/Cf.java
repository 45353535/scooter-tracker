package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4625xf f40502a;

    public static final class c implements Da {
        c() {
        }

        @Override // com.ironsource.Da
        public void b(@Nullable IronSourceError ironSourceError) {
            Cf.this.a(Df.f40641b, LevelPlay.AdFormat.BANNER, Gf.f41012a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Da
        public void d(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40645f, LevelPlay.AdFormat.BANNER, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.Da
        public void e(@Nullable AdInfo adInfo) {
            Cf.this.a("onAdLoaded", LevelPlay.AdFormat.BANNER, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.Da
        public void f(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40652m, LevelPlay.AdFormat.BANNER, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.Da
        public void g(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40650k, LevelPlay.AdFormat.BANNER, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.Da
        public void h(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40651l, LevelPlay.AdFormat.BANNER, Gf.f41012a.a(adInfo));
        }
    }

    public Cf(@NotNull InterfaceC4625xf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f40502a = javaScriptEvaluator;
    }

    private final void b() {
        Bf bf2 = Bf.f40456a;
        bf2.a((InterfaceC4298eb) null);
        bf2.a((InterfaceC4486pb) null);
        bf2.a((Da) null);
    }

    private final void c() {
        Bf.f40456a.e();
    }

    public final void d() {
        Bf bf2 = Bf.f40456a;
        bf2.a(new a());
        bf2.a(new b());
        bf2.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements InterfaceC4298eb {
        a() {
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void a(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40640a, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void b(@Nullable IronSourceError ironSourceError) {
            Cf.this.a(Df.f40641b, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void c(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40642c, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void d(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40645f, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void e(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40643d, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40644e, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4298eb
        public void b(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40646g, LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC4519rb, InterfaceC4503qb {
        b() {
        }

        @Override // com.ironsource.InterfaceC4519rb
        public void a(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40640a, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4519rb
        public void b(@Nullable IronSourceError ironSourceError) {
            Cf.this.a(Df.f40641b, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4486pb
        public void c(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40642c, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4503qb
        public void d(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40647h, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4503qb
        public void a() {
            Cf.this.a(Df.f40653n, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4486pb
        public void b(@Nullable C4283dd c4283dd, @Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40648i, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(Bf.f40456a.a(c4283dd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4486pb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40644e, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4486pb
        public void a(@Nullable C4283dd c4283dd, @Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40645f, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(Bf.f40456a.a(c4283dd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4486pb
        public void b(@Nullable AdInfo adInfo) {
            Cf.this.a(Df.f40646g, LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f40502a.a(str, adFormat, list);
    }
}
