package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f74933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74934c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f74932a = str;
        this.f74933b = startupParamsItemStatus;
        this.f74934c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f74932a, startupParamsItem.f74932a) && this.f74933b == startupParamsItem.f74933b && Objects.equals(this.f74934c, startupParamsItem.f74934c)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getErrorDetails() {
        return this.f74934c;
    }

    @Nullable
    public String getId() {
        return this.f74932a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f74933b;
    }

    public int hashCode() {
        return Objects.hash(this.f74932a, this.f74933b, this.f74934c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f74932a + "', status=" + this.f74933b + ", errorDetails='" + this.f74934c + "'}";
    }
}
