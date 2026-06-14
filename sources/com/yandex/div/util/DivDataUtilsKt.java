package com.yandex.div.util;

import k8.ea;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lk8/ea;", "", "getInitialStateId", "(Lk8/ea;)J", "Lk8/ea$b;", "getINVALID_STATE_ID", "(Lk8/ea$b;)J", "INVALID_STATE_ID", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(@NotNull ea.b bVar) {
        return -1L;
    }

    public static final long getInitialStateId(@NotNull ea eaVar) {
        return eaVar.f87205c.isEmpty() ? getINVALID_STATE_ID(ea.f87200j) : ((ea.c) eaVar.f87205c.get(0)).f87216b;
    }
}
