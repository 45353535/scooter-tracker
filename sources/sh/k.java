package sh;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes11.dex */
public interface k {
    void configureTlsExtensions(SSLSocket sSLSocket, String str, List list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);
}
