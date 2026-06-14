package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Oe implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.h f37491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ie f37492c;

    public Oe(String resolvedUrl, int i10, vh.h bodyBytes, Ie responseMetaData) {
        Intrinsics.checkNotNullParameter(resolvedUrl, "resolvedUrl");
        Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
        Intrinsics.checkNotNullParameter(responseMetaData, "responseMetaData");
        this.f37490a = i10;
        this.f37491b = bodyBytes;
        this.f37492c = responseMetaData;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        Intrinsics.checkNotNullParameter(C3898n4.class, "clazz");
        Intrinsics.checkNotNullParameter(C3898n4.class, "type");
        JSONObject jsonObject = new JSONObject(this.f37491b.M(Charsets.UTF_8));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(C3898n4.class, "type");
        return C3898n4.class.cast(AbstractC3879ma.a(jsonObject, C3898n4.class, null, null));
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return this.f37492c;
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f37490a;
    }

    @Override // com.inmobi.media.Ne
    public final vh.h d() {
        return this.f37491b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return null;
    }
}
