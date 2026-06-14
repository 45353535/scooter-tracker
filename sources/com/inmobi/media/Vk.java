package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.adjust.sdk.purchase.ADJPConstants;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public final class Vk extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f37918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Context context, Continuation continuation) {
        super(1, continuation);
        this.f37918b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Vk(this.f37918b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Vk(this.f37918b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        ?? EmptyList;
        Object objG = pf.b.g();
        int i10 = this.f37917a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Lazy lazy = AbstractC3754h9.f38694a;
            Context context = Ji.f37157a;
            if (context != null) {
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    EmptyList = new ArrayList();
                    for (String str : strArrDatabaseList) {
                        Intrinsics.checkNotNull(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").g(str) && !Intrinsics.areEqual(str, "com.im_11.1.0.db")) {
                            EmptyList.add(str);
                        }
                    }
                } else {
                    EmptyList = CollectionsKt.emptyList();
                }
                for (String str2 : EmptyList) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            K4 k42 = K4.f37202a;
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            eg.h.b(null, new F4(null), 1, null);
            if (E0.f36763b == null) {
                E0.f36763b = new A0();
            }
            C3774i4 c3774i4 = Y3.f38021a;
            Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, E0.f36765d);
            A0 a02 = E0.f36763b;
            if (a02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                a02 = null;
            }
            if (!a02.f36535a.get()) {
                A0 a03 = E0.f36763b;
                if (a03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    a03 = null;
                }
                if (!a03.f36535a.get()) {
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    if (((AdConfig) Y3.f38021a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        a03.a();
                    }
                }
            }
            F9.b();
            F9.a();
            L5 l52 = J5.f37099a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f38021a.a(AdConfig.class);
            N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean zA = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            J5.f37103e = zA;
            if (!zA && J5.f37101c == null) {
                Context context2 = Ji.f37157a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    Ea eaA = Da.a(context2, "display_info_store");
                    Intrinsics.checkNotNullParameter("gesture_margin", C4240b4.i.W);
                    string = eaA.f36783a.getString("gesture_margin", null);
                }
                J5.f37101c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                J5.j();
                J5.i();
            }
            Vg.b();
            Yk yk = Yk.f38071a;
            this.f37917a = 1;
            if (yk.b(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        Context context3 = this.f37918b;
        Intrinsics.checkNotNullParameter(context3, "context");
        try {
            kotlin.jvm.internal.v0.b(ActivityFilter.class).getSimpleName();
            kotlin.jvm.internal.v0.b(ActivityRule.class).getSimpleName();
            kotlin.jvm.internal.v0.b(RuleController.class).getSimpleName();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(SetsKt.setOf(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), (String) null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.f37918b;
        Intrinsics.checkNotNullParameter(context4, "context");
        ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
        Da.a(context4, "sdk_version_store").a(ADJPConstants.KEY_SDK_VERSION, "11.1.0", false);
        Yk.f38072b = true;
        return Unit.f93236a;
    }
}
