package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24216a;

    AutoValue_BatchedLogRequest(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f24216a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f24216a.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @NonNull
    @Encodable.Field(name = "logRequest")
    public List<LogRequest> getLogRequests() {
        return this.f24216a;
    }

    public int hashCode() {
        return this.f24216a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f24216a + "}";
    }
}
