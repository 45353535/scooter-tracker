package com.facebook;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20049d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FacebookRequestError f20050c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(FacebookRequestError requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f20050c = requestError;
    }

    @Override // com.facebook.i, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f20050c.getRequestStatusCode() + ", facebookErrorCode: " + this.f20050c.getErrorCode() + ", facebookErrorType: " + this.f20050c.getErrorType() + ", message: " + this.f20050c.e() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
