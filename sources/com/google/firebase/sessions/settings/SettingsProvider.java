package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/b;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/b;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingsProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isSettingsStale(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object updateSettings(@NotNull SettingsProvider settingsProvider, @NotNull Continuation continuation) {
            return Unit.f93236a;
        }
    }

    @Nullable
    Double getSamplingRate();

    @Nullable
    Boolean getSessionEnabled();

    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    b mo4498getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @Nullable
    Object updateSettings(@NotNull Continuation continuation);
}
