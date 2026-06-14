package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f24380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24381b;

    static final class Builder extends BackendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f24382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f24383b;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String str = "";
            if (this.f24382a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f24382a, this.f24383b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable<EventInternal> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f24382a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(@Nullable byte[] bArr) {
            this.f24383b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendRequest) {
            BackendRequest backendRequest = (BackendRequest) obj;
            if (this.f24380a.equals(backendRequest.getEvents())) {
                if (Arrays.equals(this.f24381b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f24381b : backendRequest.getExtras())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public Iterable<EventInternal> getEvents() {
        return this.f24380a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    @Nullable
    public byte[] getExtras() {
        return this.f24381b;
    }

    public int hashCode() {
        return ((this.f24380a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24381b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f24380a + ", extras=" + Arrays.toString(this.f24381b) + "}";
    }

    private AutoValue_BackendRequest(Iterable iterable, byte[] bArr) {
        this.f24380a = iterable;
        this.f24381b = bArr;
    }
}
