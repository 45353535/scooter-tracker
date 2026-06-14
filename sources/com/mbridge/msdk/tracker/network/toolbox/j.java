package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f51975d;

    public j(String str, String str2, p pVar) {
        this.f51973b = str;
        this.f51974c = str2;
        this.f51975d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f51595a.a(str);
            return (listA.isEmpty() && i.b().c(this.f51973b, this.f51974c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f51973b, this.f51974c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f51975d;
        if (pVar != null) {
            pVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }
}
