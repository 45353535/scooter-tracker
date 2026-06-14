package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5251lh implements InterfaceC5276mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final DataSendingRestrictionController f77708a;

    public AbstractC5251lh(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f77708a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5276mh
    public boolean a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
