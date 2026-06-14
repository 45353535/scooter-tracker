package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0010¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0013¢\u0006\u0004\b\f\u0010\u0014J\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0015¢\u0006\u0004\b\f\u0010\u0016J\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0018J\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "builder", "<init>", "(Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;)V", "()V", "Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "build$com_google_firebase_firebase_crashlytics", "()Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "build", "", C4240b4.i.W, "", "value", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;F)V", "", "(Ljava/lang/String;I)V", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyValueBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CustomKeysAndValues.Builder builder;

    private KeyValueBuilder(CustomKeysAndValues.Builder builder) {
        this.builder = builder;
    }

    @NotNull
    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues customKeysAndValuesBuild = this.builder.build();
        Intrinsics.checkNotNullExpressionValue(customKeysAndValuesBuild, "build(...)");
        return customKeysAndValuesBuild;
    }

    public final void key(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.builder.putBoolean(key, value);
    }

    public final void key(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.builder.putDouble(key, value);
    }

    public KeyValueBuilder() {
        this(new CustomKeysAndValues.Builder());
    }

    public final void key(@NotNull String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.builder.putFloat(key, value);
    }

    public final void key(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.builder.putInt(key, value);
    }

    public final void key(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.builder.putLong(key, value);
    }

    public final void key(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.builder.putString(key, value);
    }
}
