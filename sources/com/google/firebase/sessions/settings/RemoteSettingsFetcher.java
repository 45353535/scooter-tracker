package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.sessions.ApplicationInfo;
import com.taurusx.tax.f.y;
import eg.g;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJl\u0010\u0015\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "<init>", "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/net/URL;", "a", "()Ljava/net/URL;", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/ApplicationInfo;", "b", "Lkotlin/coroutines/CoroutineContext;", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext blockingDispatcher;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33470r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f33472t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2 f33473u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function2 f33474v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Map map, Function2 function2, Function2 function22, Continuation continuation) {
            super(2, continuation);
            this.f33472t = map;
            this.f33473u = function2;
            this.f33474v = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return RemoteSettingsFetcher.this.new AnonymousClass2(this.f33472t, this.f33473u, this.f33474v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettingsFetcher.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo appInfo, @Blocking @NotNull CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL a() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super Continuation, ? extends Object> function2, @NotNull Function2<? super String, ? super Continuation, ? extends Object> function22, @NotNull Continuation continuation) {
        Object objG = g.g(this.blockingDispatcher, new AnonymousClass2(map, function2, function22, null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }
}
