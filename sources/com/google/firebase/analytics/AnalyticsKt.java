package com.google.firebase.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\f\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ParametersBuilder;", "", "block", "logEvent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/firebase/analytics/ConsentBuilder;", "setConsent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lkotlin/jvm/functions/Function1;)V", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "", "LOCK", "Ljava/lang/Object;", "getLOCK", "()Ljava/lang/Object;", "Lcom/google/firebase/Firebase;", "getAnalytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile FirebaseAnalytics f31725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31726b = new Object();

    @Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return f31725a;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NonNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        if (f31725a == null) {
            synchronized (f31726b) {
                try {
                    if (f31725a == null) {
                        f31725a = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f31725a;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object getLOCK() {
        return f31726b;
    }

    public static final void logEvent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String name, @NonNull Function1<? super ParametersBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        block.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(name, parametersBuilder.getF31736a());
    }

    public static final void setANALYTICS(@org.jetbrains.annotations.Nullable FirebaseAnalytics firebaseAnalytics) {
        f31725a = firebaseAnalytics;
    }

    public static final void setConsent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull Function1<? super ConsentBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        block.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
