package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "init", "setCustomKeys", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Lkotlin/jvm/functions/Function1;)V", "", "throwable", "recordException", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        return firebaseCrashlytics;
    }

    public static final void recordException(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Throwable throwable, @NotNull Function1<? super KeyValueBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(throwable, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super KeyValueBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
