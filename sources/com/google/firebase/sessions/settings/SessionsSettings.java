package com.google.firebase.sessions.settings;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.LocalOverrideSettingsProvider;
import com.google.firebase.sessions.RemoteSettingsProvider;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "localOverrideSettings", "remoteSettings", "<init>", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "", "samplingRate", "", "a", "(D)Z", "Lkotlin/time/b;", "sessionRestartTimeout", "b", "(J)Z", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "getSessionsEnabled", "()Z", "sessionsEnabled", "getSamplingRate", "()D", "getSessionRestartTimeout-UwyO8pc", "()J", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionsSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SettingsProvider localOverrideSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SettingsProvider remoteSettings;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", C4424m2.f43617p, "Lcom/google/firebase/sessions/settings/SessionsSettings;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SessionsSettings getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionsSettings();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, 99}, m = "updateSettings")
    static final class AnonymousClass1 extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f33490r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f33491s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f33493u;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33491s = obj;
            this.f33493u |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    public SessionsSettings(@LocalOverrideSettingsProvider @NotNull SettingsProvider localOverrideSettings, @RemoteSettingsProvider @NotNull SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean a(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    private final boolean b(long sessionRestartTimeout) {
        return b.E(sessionRestartTimeout) && b.z(sessionRestartTimeout);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (a(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (a(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m4499getSessionRestartTimeoutUwyO8pc() {
        b bVarMo4498getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo4498getSessionRestartTimeoutFghU774();
        if (bVarMo4498getSessionRestartTimeoutFghU774 != null) {
            long jN = bVarMo4498getSessionRestartTimeoutFghU774.N();
            if (b(jN)) {
                return jN;
            }
        }
        b bVarMo4498getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo4498getSessionRestartTimeoutFghU774();
        if (bVarMo4498getSessionRestartTimeoutFghU7742 != null) {
            long jN2 = bVarMo4498getSessionRestartTimeoutFghU7742.N();
            if (b(jN2)) {
                return jN2;
            }
        }
        b.a aVar = b.f93560c;
        return c.s(30, cg.b.f6840g);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) r0
            int r1 = r0.f33493u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33493u = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f33491s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f33493u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f33490r
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.d.b(r6)
            goto L4d
        L3c:
            kotlin.d.b(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.f33490r = r5
            r0.f33493u = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.f33490r = r2
            r0.f33493u = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
