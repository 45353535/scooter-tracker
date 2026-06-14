package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4608wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4507qf f45797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4625xf f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final S8 f45799c;

    public C4608wf(@NotNull C4507qf adsManager, @NotNull S8 uiLifeCycleListener, @NotNull InterfaceC4625xf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f45797a = adsManager;
        this.f45798b = javaScriptEvaluator;
        this.f45799c = uiLifeCycleListener;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f45798b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f45797a.a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f45799c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f45797a.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Gf.f41012a.a(Boolean.valueOf(this.f45797a.c())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Gf.f41012a.a(Boolean.valueOf(this.f45797a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(@NotNull String adNetwork, boolean z10, boolean z11, @NotNull String description, int i10, int i11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z10, z11, description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@NotNull String adNetwork, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@NotNull String adNetwork, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f45799c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f45797a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f45797a.f();
    }

    @JavascriptInterface
    public final void loadBannerAd(@Nullable String str, @NotNull String adNetwork, boolean z10, boolean z11, @NotNull String description, int i10, int i11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f45797a.a(new C4642yf(adNetwork, z10, Boolean.valueOf(z11), str), description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@Nullable String str, @NotNull String adNetwork, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f45797a.a(new C4642yf(adNetwork, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@Nullable String str, @NotNull String adNetwork, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f45797a.b(new C4642yf(adNetwork, z10, Boolean.valueOf(z11), str));
    }
}
