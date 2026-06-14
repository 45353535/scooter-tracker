package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.service_locator.b;

/* JADX INFO: loaded from: classes10.dex */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55468a = a.f55469a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55469a = new a();

        public final s a() {
            b.e eVar = b.e.f55808a;
            return new t(eVar.l(), eVar.m());
        }
    }

    BidToken$ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, i iVar);

    byte[] a(byte[] bArr, byte[] bArr2);
}
