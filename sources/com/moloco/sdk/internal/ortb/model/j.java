package com.moloco.sdk.internal.ortb.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    public static final String a(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String mtid = eVar.getExt().getMtid();
        return mtid == null ? "UNKNOWN_MTID" : mtid;
    }
}
