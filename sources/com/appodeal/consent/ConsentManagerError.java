package com.appodeal.consent;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\t\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError;", "", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", PglCryptUtils.KEY_MESSAGE, "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "TimeoutError", "RequestError", "ServerError", "FormCacheError", "FormNotReadyError", "ActivityIsDestroyedError", "FormAlreadyShown", "FormPresentationNotRequired", "InternalError", "Lcom/appodeal/consent/ConsentManagerError$ActivityIsDestroyedError;", "Lcom/appodeal/consent/ConsentManagerError$FormAlreadyShown;", "Lcom/appodeal/consent/ConsentManagerError$FormCacheError;", "Lcom/appodeal/consent/ConsentManagerError$FormNotReadyError;", "Lcom/appodeal/consent/ConsentManagerError$FormPresentationNotRequired;", "Lcom/appodeal/consent/ConsentManagerError$InternalError;", "Lcom/appodeal/consent/ConsentManagerError$RequestError;", "Lcom/appodeal/consent/ConsentManagerError$ServerError;", "Lcom/appodeal/consent/ConsentManagerError$TimeoutError;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConsentManagerError extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Throwable cause;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$ActivityIsDestroyedError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityIsDestroyedError extends ConsentManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityIsDestroyedError(@NotNull String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$FormAlreadyShown;", "Lcom/appodeal/consent/ConsentManagerError;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormAlreadyShown extends ConsentManagerError {

        @NotNull
        public static final FormAlreadyShown INSTANCE = new FormAlreadyShown();

        public FormAlreadyShown() {
            super("Form is already shown", null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$FormCacheError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormCacheError extends ConsentManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormCacheError(@NotNull String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$FormNotReadyError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormNotReadyError extends ConsentManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormNotReadyError(@NotNull String message) {
            super("Form not ready error: " + message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$FormPresentationNotRequired;", "Lcom/appodeal/consent/ConsentManagerError;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormPresentationNotRequired extends ConsentManagerError {

        @NotNull
        public static final FormPresentationNotRequired INSTANCE = new FormPresentationNotRequired();

        public FormPresentationNotRequired() {
            super("Presentation not required", null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$InternalError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalError extends ConsentManagerError {
        public InternalError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ InternalError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
        }

        public InternalError(@Nullable String str, @Nullable Throwable th2) {
            super("Internal error: " + (str == null ? th2 != null ? th2.getMessage() : null : str), th2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$RequestError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestError extends ConsentManagerError {
        public RequestError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RequestError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
        }

        public RequestError(@Nullable String str, @Nullable Throwable th2) {
            super("Request error: " + (str == null ? th2 != null ? th2.getMessage() : null : str), th2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$ServerError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends ConsentManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(@NotNull String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$TimeoutError;", "Lcom/appodeal/consent/ConsentManagerError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TimeoutError extends ConsentManagerError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutError(@NotNull String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public /* synthetic */ ConsentManagerError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2, null);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public ConsentManagerError(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, th2);
        this.message = str;
        this.cause = th2;
    }
}
