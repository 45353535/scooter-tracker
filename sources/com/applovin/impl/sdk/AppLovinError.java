package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10454b;

    public AppLovinError(int i10, @Nullable String str) {
        this.f10453a = i10;
        this.f10454b = str;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public int getCode() {
        return this.f10453a;
    }

    @Nullable
    public String getMessage() {
        return this.f10454b;
    }

    public int hashCode() {
        int code = getCode() + 59;
        String message = getMessage();
        return (code * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
