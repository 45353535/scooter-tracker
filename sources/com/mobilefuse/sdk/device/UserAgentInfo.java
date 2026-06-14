package com.mobilefuse.sdk.device;

import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebSettings;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.taurusx.tax.f.y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R2\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/mobilefuse/sdk/device/UserAgentInfo;", "", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "sharedPrefs", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "", "completeAction", "requestUserAgent", "(Lkotlin/jvm/functions/Function1;)V", "getUserAgentFromPrefs$mobilefuse_sdk_common_release", "()Ljava/lang/String;", "getUserAgentFromPrefs", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, "storeUserAgentInPrefs$mobilefuse_sdk_common_release", "(Ljava/lang/String;)V", "storeUserAgentInPrefs", "getUserAgentFromBrowser$mobilefuse_sdk_common_release", "getUserAgentFromBrowser", "", "getAndroidApiVersion$mobilefuse_sdk_common_release", "()I", "getAndroidApiVersion", "<set-?>", "Ljava/lang/String;", "getUserAgent", "Lcom/mobilefuse/sdk/device/UserAgentInfo$Source;", "userAgentSource", "Lcom/mobilefuse/sdk/device/UserAgentInfo$Source;", "", "requestInProgress", "Z", "", "awaitingCompleteActions", "Ljava/util/Set;", "getAwaitingCompleteActions$mobilefuse_sdk_common_release", "()Ljava/util/Set;", "getAwaitingCompleteActions$mobilefuse_sdk_common_release$annotations", "()V", "Lkotlin/jvm/functions/Function0;", "getSharedPrefs", "()Lkotlin/jvm/functions/Function0;", y.f66058y, "Source", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class UserAgentInfo {

    @NotNull
    public static final String CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY = "userAgentLastUpdateAndroidApi";

    @NotNull
    public static final String CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY = "userAgentLastUpdateTimestamp";

    @NotNull
    public static final String CACHE_USER_AGENT_VALUE_KEY = "userAgent";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long USER_AGENT_MAX_VALIDITY_TIME_MILLIS = 2592000000L;
    private boolean requestInProgress;

    @Nullable
    private final Function0<SharedPreferences> sharedPrefs;

    @NotNull
    private String userAgent = "";
    private Source userAgentSource = Source.NONE;

    @NotNull
    private final Set<Function1<String, Unit>> awaitingCompleteActions = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/device/UserAgentInfo$Companion;", "", "()V", "CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY", "", "getCACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY$mobilefuse_sdk_common_release$annotations", "CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY", "getCACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY$mobilefuse_sdk_common_release$annotations", "CACHE_USER_AGENT_VALUE_KEY", "getCACHE_USER_AGENT_VALUE_KEY$mobilefuse_sdk_common_release$annotations", "USER_AGENT_MAX_VALIDITY_TIME_MILLIS", "", "getUSER_AGENT_MAX_VALIDITY_TIME_MILLIS$mobilefuse_sdk_common_release$annotations", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY$mobilefuse_sdk_common_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY$mobilefuse_sdk_common_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCACHE_USER_AGENT_VALUE_KEY$mobilefuse_sdk_common_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getUSER_AGENT_MAX_VALIDITY_TIME_MILLIS$mobilefuse_sdk_common_release$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/device/UserAgentInfo$Source;", "", "(Ljava/lang/String;I)V", "NONE", "BROWSER", "CACHE", "ERROR", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public enum Source {
        NONE,
        BROWSER,
        CACHE,
        ERROR
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAgentInfo(@Nullable Function0<? extends SharedPreferences> function0) {
        this.sharedPrefs = function0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getAwaitingCompleteActions$mobilefuse_sdk_common_release$annotations() {
    }

    @VisibleForTesting
    public final int getAndroidApiVersion$mobilefuse_sdk_common_release() {
        return Build.VERSION.SDK_INT;
    }

    @NotNull
    public final Set<Function1<String, Unit>> getAwaitingCompleteActions$mobilefuse_sdk_common_release() {
        return this.awaitingCompleteActions;
    }

    @Nullable
    public final Function0<SharedPreferences> getSharedPrefs() {
        return this.sharedPrefs;
    }

    @NotNull
    public final String getUserAgent() {
        return this.userAgent;
    }

    @VisibleForTesting
    @NotNull
    public final String getUserAgentFromBrowser$mobilefuse_sdk_common_release() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return WebSettings.getDefaultUserAgent(AppLifecycleHelper.getGlobalContext());
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return "";
        }
    }

    @VisibleForTesting
    @Nullable
    public final String getUserAgentFromPrefs$mobilefuse_sdk_common_release() {
        Either errorResult;
        Function0<SharedPreferences> function0;
        SharedPreferences sharedPreferencesInvoke;
        String string;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            function0 = this.sharedPrefs;
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (function0 == null || (sharedPreferencesInvoke = function0.invoke()) == null || (string = sharedPreferencesInvoke.getString(CACHE_USER_AGENT_VALUE_KEY, null)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(string, "sharedPrefs.getString(CA…KEY, null) ?: return null");
        long j10 = sharedPreferencesInvoke.getLong(CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY, 0L);
        if (System.currentTimeMillis() - j10 > USER_AGENT_MAX_VALIDITY_TIME_MILLIS) {
            DebuggingKt.logDebug$default(this, "(-) Cached user agent has expired with timestamp " + j10 + ", so it will not be used.", null, 2, null);
            return null;
        }
        int i10 = sharedPreferencesInvoke.getInt(CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY, 0);
        if (i10 != 0 && i10 == getAndroidApiVersion$mobilefuse_sdk_common_release()) {
            errorResult = new SuccessResult(string);
            if (errorResult instanceof ErrorResult) {
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new m();
                }
                value = ((SuccessResult) errorResult).getValue();
            }
            return (String) value;
        }
        DebuggingKt.logDebug$default(this, "(-) Cached user agent was stored for different Android API version, version " + i10 + ", so it will not be used.", null, 2, null);
        return null;
    }

    public final void requestUserAgent(@NotNull final Function1<? super String, Unit> completeAction) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.userAgentSource != Source.NONE) {
                completeAction.invoke(this.userAgent);
            } else {
                this.awaitingCompleteActions.add(completeAction);
                if (this.requestInProgress) {
                    DebuggingKt.logDebug$default(this, "(+) User agent has been already requested but not completed yet. For this request a completion callback will be registered and called for prior request result.", null, 2, null);
                } else {
                    DebuggingKt.logDebug$default(this, "(+) Request user agent", null, 2, null);
                    this.requestInProgress = true;
                    final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super Pair<? extends String, ? extends Source>>, Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>> flowCollector) {
                            invoke2((FlowCollector<? super Pair<String, ? extends UserAgentInfo.Source>>) flowCollector);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull FlowCollector<? super Pair<String, ? extends UserAgentInfo.Source>> receiver) {
                            Intrinsics.checkNotNullParameter(receiver, "$receiver");
                            receiver.emit(new SuccessResult(TuplesKt.to(this.this$0.getUserAgentFromPrefs$mobilefuse_sdk_common_release(), UserAgentInfo.Source.CACHE)));
                        }
                    });
                    final Schedulers schedulers = Schedulers.IO;
                    final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$emitOn$$inlined$transformOnThread$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke((FlowCollector) obj);
                            return Unit.f93236a;
                        }

                        public final void invoke(@NotNull final FlowCollector<? super T> flow3) {
                            Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                            SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$emitOn$$inlined$transformOnThread$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$emitOn$.inlined.transformOnThread.1.1.1
                                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                            Intrinsics.checkNotNullParameter(value, "value");
                                            flow3.emit(value);
                                        }

                                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                                        public void emitError(@NotNull Throwable error) {
                                            Intrinsics.checkNotNullParameter(error, "error");
                                            FlowCollector.DefaultImpls.emitError(this, error);
                                        }

                                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                                        public void emitSuccess(T t10) {
                                            FlowCollector.DefaultImpls.emitSuccess(this, t10);
                                        }
                                    });
                                }
                            });
                        }
                    });
                    final Schedulers schedulers2 = Schedulers.MAIN;
                    final Flow flow3 = FlowKt.flow(new UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$2(FlowKt.flow(new Function1<FlowCollector<? super T>, Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$runOn$$inlined$transformForConcurrency$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke((FlowCollector) obj);
                            return Unit.f93236a;
                        }

                        public final void invoke(@NotNull final FlowCollector<? super T> flow4) {
                            Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                            flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$runOn$$inlined$transformForConcurrency$1.1
                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    final FlowCollector flowCollector = flow4;
                                    SchedulersKt.runOnScheduler(schedulers2, new Function0<Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$runOn$$inlined$transformForConcurrency$1$1$lambda$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.f93236a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            flowCollector.emit(value);
                                        }
                                    });
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitError(@NotNull Throwable error) {
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    FlowCollector.DefaultImpls.emitError(this, error);
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitSuccess(T t10) {
                                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                                }
                            });
                        }
                    }), this, completeAction));
                    FlowKt.flow(new Function1<FlowCollector<? super Pair<? extends String, ? extends Source>>, Unit>() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$$special$$inlined$catchElse$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>> flowCollector) {
                            invoke2(flowCollector);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final FlowCollector<? super Pair<? extends String, ? extends UserAgentInfo.Source>> flow4) {
                            Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                            flow3.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$$special$$inlined$catchElse$1.1
                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    FlowCollector flowCollector = flow4;
                                    if (value instanceof ErrorResult) {
                                        StabilityHelper.logException(flowCollector, (Throwable) ((ErrorResult) value).getValue());
                                        flowCollector.emit(new SuccessResult(TuplesKt.to("", UserAgentInfo.Source.ERROR)));
                                    } else if (value instanceof SuccessResult) {
                                        flowCollector.emit(value);
                                    }
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitError(@NotNull Throwable error) {
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    FlowCollector.DefaultImpls.emitError(this, error);
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitSuccess(T t10) {
                                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                                }
                            });
                        }
                    }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.device.UserAgentInfo$requestUserAgent$$inlined$gracefullyHandleException$lambda$3
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof SuccessResult) {
                                Pair pair = (Pair) ((SuccessResult) result).getValue();
                                String str = (String) pair.component1();
                                UserAgentInfo.Source source = (UserAgentInfo.Source) pair.component2();
                                UserAgentInfo userAgentInfo = this.this$0;
                                if (str == null) {
                                    str = "";
                                }
                                userAgentInfo.userAgent = str;
                                this.this$0.userAgentSource = source;
                                DebuggingKt.logDebug$default(this.this$0, "(+) User agent loaded from source: " + this.this$0.userAgentSource + " with value: " + this.this$0.getUserAgent(), null, 2, null);
                                Set set = CollectionsKt.toSet(this.this$0.getAwaitingCompleteActions$mobilefuse_sdk_common_release());
                                this.this$0.getAwaitingCompleteActions$mobilefuse_sdk_common_release().clear();
                                this.this$0.requestInProgress = false;
                                Iterator<T> it = set.iterator();
                                while (it.hasNext()) {
                                    ((Function1) it.next()).invoke(this.this$0.getUserAgent());
                                }
                            }
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t10) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t10);
                        }
                    });
                }
            }
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            completeAction.invoke(this.userAgent);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }

    @VisibleForTesting
    public final void storeUserAgentInPrefs$mobilefuse_sdk_common_release(@NotNull String userAgent) {
        SharedPreferences sharedPreferencesInvoke;
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Function0<SharedPreferences> function0 = this.sharedPrefs;
            if (function0 != null && (sharedPreferencesInvoke = function0.invoke()) != null) {
                DebuggingKt.logDebug$default(this, "(+) Store user agent in cache: " + userAgent, null, 2, null);
                SharedPreferences.Editor editorEdit = sharedPreferencesInvoke.edit();
                editorEdit.putString(CACHE_USER_AGENT_VALUE_KEY, userAgent);
                editorEdit.putLong(CACHE_USER_AGENT_LAST_UPDATE_TIMESTAMP_KEY, System.currentTimeMillis());
                editorEdit.putInt(CACHE_USER_AGENT_LAST_UPDATE_ANDROID_API_KEY, getAndroidApiVersion$mobilefuse_sdk_common_release());
                editorEdit.commit();
            }
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }
}
