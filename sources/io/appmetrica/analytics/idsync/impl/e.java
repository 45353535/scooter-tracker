package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f75400a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(@NotNull IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f75431a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f75426a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = this.f75400a.fromModel(idSyncConfig.getRequests().get(i10));
        }
        nVar.f75427b = mVarArr;
        oVar.f75432b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull o oVar) {
        n nVar = oVar.f75432b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z10 = oVar.f75431a;
        long j10 = nVar.f75426a;
        m[] mVarArr = nVar.f75427b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f75400a.toModel(mVar));
        }
        return new IdSyncConfig(z10, j10, arrayList);
    }
}
