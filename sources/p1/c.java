package p1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public enum c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map f98049j = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f98051b;

    static {
        for (c cVar : values()) {
            f98049j.put(cVar.f98051b, cVar);
        }
    }

    c(String str) {
        this.f98051b = str;
    }

    public final String d() {
        return this.f98051b;
    }
}
