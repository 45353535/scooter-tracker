package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f21201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f21202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f21204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21207g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f21209i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21208h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f21210j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f21206f) && TextUtils.isEmpty(this.f21205e) && this.f21204d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f21201a);
        sb2.append(" h:");
        sb2.append(this.f21202b);
        sb2.append(" ctr:");
        sb2.append(this.f21207g);
        sb2.append(" clt:");
        sb2.append(this.f21208h);
        if (!TextUtils.isEmpty(this.f21206f)) {
            sb2.append(" html:");
            sb2.append(this.f21206f);
        }
        if (this.f21204d != null) {
            sb2.append(" static:");
            sb2.append(this.f21204d.f21213b);
            sb2.append("creative:");
            sb2.append(this.f21204d.f21212a);
        }
        if (!TextUtils.isEmpty(this.f21205e)) {
            sb2.append(" iframe:");
            sb2.append(this.f21205e);
        }
        sb2.append(" events:");
        sb2.append(this.f21210j);
        if (this.f21209i != null) {
            sb2.append(" reason:");
            sb2.append(this.f21209i.f20996a);
            sb2.append(" exception:");
            sb2.append(this.f21209i.getMessage());
        }
        return sb2.toString();
    }
}
