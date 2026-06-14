package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$BidTokenResponseV3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f55344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f55345b;

    static {
        i iVar = new i(false);
        f55344a = iVar;
        f55345b = new n("", "", iVar);
    }

    public static final i a() {
        return f55344a;
    }

    public static final i b(BidToken$BidTokenResponseV3 bidToken$BidTokenResponseV3) {
        Intrinsics.checkNotNullParameter(bidToken$BidTokenResponseV3, "<this>");
        return bidToken$BidTokenResponseV3.hasClientTokenConfigs() ? new i(bidToken$BidTokenResponseV3.getClientTokenConfigs().getEnableDbt()) : f55344a;
    }

    public static final n c() {
        return f55345b;
    }
}
