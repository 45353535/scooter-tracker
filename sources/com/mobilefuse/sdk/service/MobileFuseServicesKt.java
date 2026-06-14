package com.mobilefuse.sdk.service;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"allInitialized", "", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "getAllInitialized", "(Ljava/util/Set;)Z", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MobileFuseServicesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAllInitialized(Set<? extends MobileFuseService> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((MobileFuseService) it.next()).getState() != ServiceInitState.INITIALIZED) {
                return false;
            }
        }
        return true;
    }
}
