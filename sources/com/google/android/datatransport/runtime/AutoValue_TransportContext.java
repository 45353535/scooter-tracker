package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Priority f24337c;

    static final class Builder extends TransportContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f24339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Priority f24340c;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String str = "";
            if (this.f24338a == null) {
                str = " backendName";
            }
            if (this.f24340c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.f24338a, this.f24339b, this.f24340c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f24338a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(@Nullable byte[] bArr) {
            this.f24339b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f24340c = priority;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransportContext) {
            TransportContext transportContext = (TransportContext) obj;
            if (this.f24335a.equals(transportContext.getBackendName())) {
                if (Arrays.equals(this.f24336b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f24336b : transportContext.getExtras()) && this.f24337c.equals(transportContext.getPriority())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.f24335a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    public byte[] getExtras() {
        return this.f24336b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Priority getPriority() {
        return this.f24337c;
    }

    public int hashCode() {
        return ((((this.f24335a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24336b)) * 1000003) ^ this.f24337c.hashCode();
    }

    private AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.f24335a = str;
        this.f24336b = bArr;
        this.f24337c = priority;
    }
}
