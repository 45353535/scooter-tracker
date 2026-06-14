package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3909nf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f39105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3909nf(Context context, Continuation continuation) {
        super(2, continuation);
        this.f39105a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3909nf(this.f39105a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3909nf(this.f39105a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3959pf c3959pf = C3959pf.f39284a;
        Context context = this.f39105a;
        C4033sf c4033sf = C3959pf.f39286c;
        if (c4033sf == null) {
            c4033sf = new C4033sf(context);
            C3959pf.f39286c = c4033sf;
        }
        String strA = c4033sf.f39531a.a("omid_js_string");
        if (strA != null) {
            return strA;
        }
        Context context2 = this.f39105a;
        int i10 = R.raw.inmobi_omid_js;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        try {
            InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i10);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strI = uf.r.i(bufferedReader);
                uf.c.a(bufferedReader, null);
                return strI;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
