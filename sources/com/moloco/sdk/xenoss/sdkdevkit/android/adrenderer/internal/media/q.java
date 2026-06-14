package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q {
    public static final m.a.AbstractC0696a a(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return e10 instanceof UnknownHostException ? m.a.AbstractC0696a.q.f56284a : e10 instanceof SocketException ? m.a.AbstractC0696a.i.f56276a : e10 instanceof SSLHandshakeException ? m.a.AbstractC0696a.j.f56277a : e10 instanceof IOException ? m.a.AbstractC0696a.f.f56273a : e10 instanceof SecurityException ? m.a.AbstractC0696a.g.f56274a : e10 instanceof r ? m.a.AbstractC0696a.C0698m.f56280a : e10 instanceof NumberFormatException ? m.a.AbstractC0696a.l.f56279a : m.a.AbstractC0696a.r.f56285a;
    }
}
