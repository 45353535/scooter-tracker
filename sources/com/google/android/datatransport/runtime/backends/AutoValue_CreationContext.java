package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f24387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f24388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24389d;

    AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f24386a = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f24387b = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f24388c = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f24389d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreationContext) {
            CreationContext creationContext = (CreationContext) obj;
            if (this.f24386a.equals(creationContext.getApplicationContext()) && this.f24387b.equals(creationContext.getWallClock()) && this.f24388c.equals(creationContext.getMonotonicClock()) && this.f24389d.equals(creationContext.getBackendName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.f24386a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    public String getBackendName() {
        return this.f24389d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.f24388c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.f24387b;
    }

    public int hashCode() {
        return ((((((this.f24386a.hashCode() ^ 1000003) * 1000003) ^ this.f24387b.hashCode()) * 1000003) ^ this.f24388c.hashCode()) * 1000003) ^ this.f24389d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f24386a + ", wallClock=" + this.f24387b + ", monotonicClock=" + this.f24388c + ", backendName=" + this.f24389d + "}";
    }
}
