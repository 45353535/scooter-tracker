package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28810b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f28809a = i10;
        this.f28810b = str;
    }

    public int getErrorCode() {
        return this.f28809a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f28810b;
    }
}
