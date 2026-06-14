package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class U7 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37830a;

    public U7(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f37830a = content;
    }

    @Override // com.inmobi.media.Gg
    public final Object a(Continuation continuation) {
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.Gg
    public final Object b() {
        return this.f37830a;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f37830a.length() != 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2162);
        throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }
}
