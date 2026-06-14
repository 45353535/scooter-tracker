package com.inmobi.media;

import com.inmobi.media.Se;
import com.ironsource.C4240b4;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f37724a = kotlin.ranges.g.v(408, 600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntRange f37725b = kotlin.ranges.g.v(300, 500);

    public static final String a(String url, Map map) {
        StringBuilder sb2;
        Intrinsics.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(map.entrySet(), C4240b4.j.f42670c, null, null, 0, null, new Function1() { // from class: w3.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Se.a((Map.Entry) obj);
            }
        }, 30, null);
        if (StringsKt.g0(url, "?", false, 2, null)) {
            sb2 = new StringBuilder();
            sb2.append(C4240b4.j.f42670c);
        } else {
            sb2 = new StringBuilder();
            sb2.append("?");
        }
        sb2.append(strJoinToString$default);
        return url + sb2.toString();
    }

    public static final CharSequence a(Map.Entry entry) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = Charsets.UTF_8;
        return URLEncoder.encode(str, charset.name()) + C4240b4.j.f42668b + URLEncoder.encode(str2, charset.name());
    }
}
