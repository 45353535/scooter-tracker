package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements k {
    i() {
    }

    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final ApiException a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new IntegrityServiceException(i10, null);
    }
}
