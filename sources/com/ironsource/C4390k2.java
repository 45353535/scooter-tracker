package com.ironsource;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4390k2 implements InterfaceC4407l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4521rd f43436b;

    public C4390k2(@NotNull String encryptedAuctionResponse, @NotNull InterfaceC4521rd providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f43435a = encryptedAuctionResponse;
        this.f43436b = providerName;
    }

    @Override // com.ironsource.InterfaceC4407l2
    @NotNull
    public Object a() {
        Object objB;
        String strC = C4427m5.b().c();
        Intrinsics.checkNotNullExpressionValue(strC, "getInstance().mediationKey");
        C4502qa c4502qa = new C4502qa(new G4(this.f43435a, strC));
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(c4502qa.a());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG == null) {
            return C4357i2.f43336h.a((JSONObject) objB, this.f43436b.value());
        }
        C4462o4.d().a(thG);
        return thG instanceof IllegalArgumentException ? Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.d()))) : Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.h())));
    }
}
