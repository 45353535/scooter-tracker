package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f28620b;

    IntegrityServiceException(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), com.google.android.play.core.integrity.model.a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f28620b = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f28620b;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
