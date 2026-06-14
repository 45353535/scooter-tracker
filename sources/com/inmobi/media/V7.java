package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class V7 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37898a;

    public V7(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f37898a = content;
    }

    @Override // com.inmobi.media.Gg
    public final Object a(Continuation continuation) {
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.Gg
    public final Object b() {
        return StringsKt.v1(this.f37898a).toString();
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (URLUtil.isValidUrl(StringsKt.v1(this.f37898a).toString())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2162);
        throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }
}
