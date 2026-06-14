package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f51597c = u.a(ShareTarget.ENCODING_TYPE_URL_ENCODED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f51598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f51599b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f51600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f51601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f51602c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f51600a.add(s.a(str, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.f51602c));
            this.f51601b.add(s.a(str2, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.f51602c));
            return this;
        }

        public a(Charset charset) {
            this.f51600a = new ArrayList();
            this.f51601b = new ArrayList();
            this.f51602c = charset;
        }

        public p a() {
            return new p(this.f51600a, this.f51601b);
        }
    }

    p(List<String> list, List<String> list2) {
        this.f51598a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f51599b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f51597c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f51598a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f51598a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f51599b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
