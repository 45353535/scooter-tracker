package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f58194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f58195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f58196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f58198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f58199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f58200g;

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, File localMediaResource, Integer num, String networkMediaResource, String str, h tracking, e eVar) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        this.f58194a = tVar;
        this.f58195b = localMediaResource;
        this.f58196c = num;
        this.f58197d = networkMediaResource;
        this.f58198e = str;
        this.f58199f = tracking;
        this.f58200g = eVar;
    }

    public static /* synthetic */ f b(f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, File file, Integer num, String str, String str2, h hVar, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tVar = fVar.f58194a;
        }
        if ((i10 & 2) != 0) {
            file = fVar.f58195b;
        }
        if ((i10 & 4) != 0) {
            num = fVar.f58196c;
        }
        if ((i10 & 8) != 0) {
            str = fVar.f58197d;
        }
        if ((i10 & 16) != 0) {
            str2 = fVar.f58198e;
        }
        if ((i10 & 32) != 0) {
            hVar = fVar.f58199f;
        }
        if ((i10 & 64) != 0) {
            eVar = fVar.f58200g;
        }
        h hVar2 = hVar;
        e eVar2 = eVar;
        String str3 = str2;
        Integer num2 = num;
        return fVar.a(tVar, file, num2, str, str3, hVar2, eVar2);
    }

    public final f a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, File localMediaResource, Integer num, String networkMediaResource, String str, h tracking, e eVar) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        return new f(tVar, localMediaResource, num, networkMediaResource, str, tracking, eVar);
    }

    public final String c() {
        return this.f58198e;
    }

    public final e d() {
        return this.f58200g;
    }

    public final File e() {
        return this.f58195b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f58194a, fVar.f58194a) && Intrinsics.areEqual(this.f58195b, fVar.f58195b) && Intrinsics.areEqual(this.f58196c, fVar.f58196c) && Intrinsics.areEqual(this.f58197d, fVar.f58197d) && Intrinsics.areEqual(this.f58198e, fVar.f58198e) && Intrinsics.areEqual(this.f58199f, fVar.f58199f) && Intrinsics.areEqual(this.f58200g, fVar.f58200g);
    }

    public final Integer f() {
        return this.f58196c;
    }

    public final String g() {
        return this.f58197d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t h() {
        return this.f58194a;
    }

    public int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar = this.f58194a;
        int iHashCode = (((tVar == null ? 0 : tVar.hashCode()) * 31) + this.f58195b.hashCode()) * 31;
        Integer num = this.f58196c;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f58197d.hashCode()) * 31;
        String str = this.f58198e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f58199f.hashCode()) * 31;
        e eVar = this.f58200g;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final h i() {
        return this.f58199f;
    }

    public String toString() {
        return "Linear(skipOffset=" + this.f58194a + ", localMediaResource=" + this.f58195b + ", localMediaResourceBitrate=" + this.f58196c + ", networkMediaResource=" + this.f58197d + ", clickThroughUrl=" + this.f58198e + ", tracking=" + this.f58199f + ", icon=" + this.f58200g + ')';
    }
}
