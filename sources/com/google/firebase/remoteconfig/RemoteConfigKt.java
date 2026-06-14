package com.google.firebase.remoteconfig;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", C4240b4.i.W, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "", "init", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "Lcom/google/firebase/remoteconfig/CustomSignals$Builder;", "builder", "Lcom/google/firebase/remoteconfig/CustomSignals;", RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/CustomSignals;", "getRemoteConfig", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Lkotlinx/coroutines/flow/Flow;", "configUpdates", "com.google.firebase-firebase-config"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigKt {
    @NotNull
    public static final CustomSignals customSignals(@NotNull Function1<? super CustomSignals.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CustomSignals.Builder builder2 = new CustomSignals.Builder();
        builder.invoke(builder2);
        CustomSignals customSignalsBuild = builder2.build();
        Intrinsics.checkNotNullExpressionValue(customSignalsBuild, "build(...)");
        return customSignalsBuild;
    }

    @NotNull
    public static final FirebaseRemoteConfigValue get(@NotNull FirebaseRemoteConfig firebaseRemoteConfig, @NotNull String key) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return value;
    }

    @NotNull
    public static final Flow getConfigUpdates(@NotNull FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        return hg.i.f(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    @NotNull
    public static final FirebaseRemoteConfig getRemoteConfig(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfig remoteConfig(@NotNull Firebase firebase, @NotNull FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfigSettings remoteConfigSettings(@NotNull Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "build(...)");
        return firebaseRemoteConfigSettingsBuild;
    }
}
